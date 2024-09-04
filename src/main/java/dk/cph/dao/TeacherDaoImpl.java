package dk.cph.dao;

import dk.cph.entities.Student;
import dk.cph.entities.Teacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TeacherDaoImpl implements GenericDAO<Teacher, Integer> {

    private static TeacherDaoImpl instance;
    private static EntityManagerFactory emf;

    public static TeacherDaoImpl getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new TeacherDaoImpl();
        }
        return instance;
    }

    @Override
    public Set<Teacher> findAll() {
        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Teacher> query = em.createQuery("SELECT t FROM Teacher t", Teacher.class);
            return new HashSet<>(query.getResultList());
        }
    }

    @Override
    public Student persistEntity(Teacher teacher) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(teacher);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return null;
    }

    @Override
    public void removeEntity(Integer id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Teacher teacher = em.find(Teacher.class, id);
            if (teacher != null) {
                em.remove(teacher);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public Teacher findEntity(Integer id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Teacher.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public Teacher updateEntity(Teacher entity, Integer id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Teacher teacher = em.find(Teacher.class, id);
            if (teacher != null) {
                teacher.setName(entity.getName());
                teacher.setCourses(entity.getCourses());
                // Update other fields as necessary
                em.merge(teacher);
            }
            em.getTransaction().commit();
            return teacher;
        } finally {
            em.close();
        }
    }
}
