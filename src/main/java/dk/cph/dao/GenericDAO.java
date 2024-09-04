package dk.cph.dao;

import dk.cph.entities.Student;

import java.util.Set;

public interface GenericDAO<T, D> {

    Set<T> findAll();
    Student persistEntity(T entity);
    void removeEntity(D id);
    T findEntity(D id);
    T updateEntity(T entity, D id);

}