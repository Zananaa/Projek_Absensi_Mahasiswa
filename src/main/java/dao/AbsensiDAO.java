package dao;

import entities.Absensi;
import entities.Mahasiswa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.List;

public class AbsensiDAO {

    public void saveAbsensi(Absensi absensi) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(absensi);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Absensi> getAbsensiByMahasiswa(Mahasiswa mahasiswa) {
        Transaction transaction = null;
        List<Absensi> absensiList = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            absensiList = session.createQuery("from Absensi where mahasiswa = :mahasiswa", Absensi.class)
                    .setParameter("mahasiswa", mahasiswa)
                    .list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return absensiList;
    }

    public Absensi getAbsensiByMahasiswaAndDate(Mahasiswa mahasiswa, String date) {
        Transaction transaction = null;
        Absensi absensi = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            absensi = session.createQuery("from Absensi where mahasiswa = :mahasiswa and tanggal = :date", Absensi.class)
                    .setParameter("mahasiswa", mahasiswa)
                    .setParameter("date", date)
                    .uniqueResult();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return absensi;
    }

    public void saveOrUpdateAbsensi(Absensi absensi) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(absensi);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}