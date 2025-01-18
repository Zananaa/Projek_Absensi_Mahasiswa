package dao;

import entities.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class StudentDAO {

    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        List<Student> students = null;

        try {
            transaction = session.beginTransaction();
            students = session.createQuery("from Student", Student.class).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return students;
    }
}
