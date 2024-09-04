package dk.cph.dao;

import dk.cph.entities.Course;
import dk.cph.entities.Student;
import dk.cph.entities.Teacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TeacherDaoImpl implements GenericDAO <Teacher, Integer> {

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
        return Set.of();
    }

    @Override
    public void persistEntity(Teacher entity) {
        try (EntityManager em = emf.createEntityManager())
        {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        }
    }

    @Override
    public void removeEntity(Integer id) {

    }

    @Override
    public Teacher findEntity(Integer id) {
        return null;
    }

    @Override
    public Teacher updateEntity(Teacher entity, Integer id) {
        return null;
    }
}
