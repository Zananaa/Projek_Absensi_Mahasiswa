package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HibernateUtilTest {

    @Test
    @Order(1)
    public void testSessionFactoryNotNull() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        assertNotNull(sessionFactory, "SessionFactory should not be null");
    }

    @Test
    @Order(2)
    public void testOpenSession() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        assertNotNull(session, "Session should not be null");
        assertTrue(session.isOpen(), "Session should be open");
        session.close();
    }

    @Test
    @Order(3)
    public void testCloseSessionFactory() {
        HibernateUtil.shutdown();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        assertFalse(sessionFactory.isOpen(), "SessionFactory should be closed");
    }
}