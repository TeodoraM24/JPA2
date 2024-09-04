package dk.cph;

import dk.cph.config.HibernateConfig;
import dk.cph.dao.CourseDaoImpl;
import dk.cph.dao.StudentDaoImpl;
import dk.cph.dao.TeacherDaoImpl;
import dk.cph.entities.Course;
import dk.cph.entities.Student;
import dk.cph.entities.Teacher;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        // Create a Student
//        Student student = new Student();
//        student.setName("John");
//        student.setEmail("john@example.com");
//
//        // Persist Student
//        StudentDaoImpl studentDao = StudentDaoImpl.getInstance(HibernateConfig.getEntityManagerFactory());
//        studentDao.persistEntity(student);
//
//        // Create a Teacher
//        Teacher teacher = new Teacher();
//        teacher.setName("Jane");
//        teacher.setEmail("jane@example.com");
//        teacher.setZoom("zoomLinkHere");
//
//        // Persist Teacher
//        TeacherDaoImpl teacherDao = TeacherDaoImpl.getInstance(HibernateConfig.getEntityManagerFactory());
//        teacherDao.persistEntity(teacher);
//
//        // Create a Course
//        Course course = new Course();
//        course.setDescription("Math");
//        course.setStartDate(LocalDate.now());
//        course.setEndDate(LocalDate.now().plusDays(30)); // Example end date after start date
//        course.setCourseName(Course.CourseName.MATH);
//
//        // Persist Course
//        CourseDaoImpl courseDao = CourseDaoImpl.getInstance(HibernateConfig.getEntityManagerFactory());
//        courseDao.persistEntity(course);
//        teacher.addCourse(course); // Add course to teacher
//        student.addCourse(course); // Add course to student


    }
}
