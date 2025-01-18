package ui.main;

import entities.Mahasiswa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import javax.swing.*;

public class FormTest {
    private JPanel panel1;
    private JCheckBox checkBox1;

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            // Create a new Mahasiswa object
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNama("Muhammad Rizki Fir");
            mahasiswa.setNim("123456789");
            mahasiswa.setJurusan("Informatika");

            // Save the Mahasiswa object
            session.save(mahasiswa);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        HibernateUtil.shutdown();
    }
}
