package dao;

import entities.Mahasiswa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaDAO {

    public void saveMahasiswa(Mahasiswa mahasiswa) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(mahasiswa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateMahasiswa(Mahasiswa mahasiswa) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(mahasiswa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Mahasiswa getMahasiswaById(Long id) {
        Transaction transaction = null;
        Mahasiswa mahasiswa = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            mahasiswa = session.get(Mahasiswa.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return mahasiswa;
    }

    public List<Mahasiswa> getAllMahasiswas() {
        Transaction transaction = null;
        List<Mahasiswa> mahasiswas = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            mahasiswas = session.createQuery("from Mahasiswa", Mahasiswa.class).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return mahasiswas;
    }

    public void deleteMahasiswa(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Mahasiswa mahasiswa = session.get(Mahasiswa.class, id);
            if (mahasiswa != null) {
                session.delete(mahasiswa);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Mahasiswa> searchMahasiswas(String keyword) {
        Transaction transaction = null;
        List<Mahasiswa> mahasiswas = new ArrayList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            mahasiswas = session.createQuery("from Mahasiswa where nama like :keyword or npm like :keyword", Mahasiswa.class)
                    .setParameter("keyword", "%" + keyword + "%")
                    .list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return mahasiswas;
    }
}