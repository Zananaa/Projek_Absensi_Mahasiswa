package databases;

import entities.Student;
import entities.enums.AcademicStatus;
import entities.enums.Gender;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.*;

import utils.HibernateUtil;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentCRUDTest {

    private static Long studentId;

    @Test
    @Order(1)
    public void testCreateStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Student student = new Student(null, "2210010466", "Muhammad Rizki Firdaus", "081349923422", Gender.FEMALE, AcademicStatus.ACTIVE, new Date());
            studentId = (Long) session.save(student);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        assertNotNull(studentId);
    }

    @Test
    @Order(2)
    public void testReadStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student student = session.get(Student.class, studentId);
        session.close();

        assertNotNull(student);
        assertEquals("2210010466", student.getNpm());
        assertEquals("Muhammad Rizki Firdaus", student.getName());
    }

    @Test
    @Order(3)
    public void testUpdateStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Student student = session.get(Student.class, studentId);
            student.setName("Rizki Updated");
            session.update(student);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        session = HibernateUtil.getSessionFactory().openSession();
        Student updatedStudent = session.get(Student.class, studentId);
        session.close();

        assertEquals("Rizki Updated", updatedStudent.getName());
    }

    @Test
    @Order(4)
    public void testDeleteStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Student student = session.get(Student.class, studentId);
            session.delete(student);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        session = HibernateUtil.getSessionFactory().openSession();
        Student deletedStudent = session.get(Student.class, studentId);
        session.close();

        assertNull(deletedStudent);
    }
}