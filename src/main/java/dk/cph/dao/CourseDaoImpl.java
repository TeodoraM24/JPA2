package dk.cph.dao;

import dk.cph.config.HibernateConfig;
import dk.cph.entities.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CourseDaoImpl implements GenericDAO <Course, Integer>{

    private static CourseDaoImpl instance;
    private static EntityManagerFactory emf;

    public static CourseDaoImpl getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new CourseDaoImpl();
        }
        return instance;
    }


    @Override
    public Set<Course> findAll() {
        return Set.of();
    }

    @Override
    public void persistEntity(Course entity) {

    }

    @Override
    public void removeEntity(Integer id) {

    }

    @Override
    public Course findEntity(Integer id) {
        return null;
    }

    @Override
    public Course updateEntity(Course course, Integer id) {
        /*
        try(EntityManager em = emf.createEntityManager())
        {
            em.getTransaction().begin();
            em.find(Course.class, course.getId());
            em.merge(course);
            em.getTransaction().commit();
        }*/
        return course;
    }
}
