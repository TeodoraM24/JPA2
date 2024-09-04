package dk.cph.dao;

import dk.cph.entities.Course;
import dk.cph.entities.Student;
import jakarta.persistence.CascadeType;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;


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
    public Course updateEntity(Course entity, Integer id) {
        return null;
    }
}
