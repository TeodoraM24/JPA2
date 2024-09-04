package dk.cph.dao;

import dk.cph.entities.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StudentDaoImplTest {
StudentDaoImpl dao;
    @Test
    void getInstance() {
    }

    @Test
    void findAll() {
    }

    @Test
    void persistEntity() {
        Student student = new Student();
        student.setName("Anna");
        student.setEmail("anna@gmail.com");


        dao.persistEntity(student);
Student expected = dao.persistEntity(student);

        assertNotNull(student);
        assertEquals(student.getName(), expected.getName() );
    }

    @Test
    void removeEntity() {
    }

    @Test
    void findEntity() {
    }

    @Test
    void updateEntity() {
    }
}