package entities;

import entities.enums.AcademicStatus;
import entities.enums.Gender;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentGettersAndSetters() {
        Student student = new Student();
        student.setId(1L);
        student.setNpm("2210010466");
        student.setName("Muhammad Rizki Firdaus");
        student.setPhone("081349923422");
        student.setGender(Gender.MALE);
        student.setAcademicStatus(AcademicStatus.ACTIVE);
        student.setRegistrationDate(new Date());

        assertEquals(1L, student.getId());
        assertEquals("2210010466", student.getNpm());
        assertEquals("Muhammad Rizki Firdaus", student.getName());
        assertEquals("081349923422", student.getPhone());
        assertEquals(Gender.MALE, student.getGender());
        assertEquals(AcademicStatus.ACTIVE, student.getAcademicStatus());
        assertNotNull(student.getRegistrationDate());
    }

    @Test
    public void testStudentConstructor() {
        Date registrationDate = new Date();
        Student student = new Student(1L, "2210010466", "Muhammad Rizki Firdaus", "081349923422", Gender.MALE, AcademicStatus.ACTIVE, registrationDate);

        assertEquals(1L, student.getId());
        assertEquals("2210010466", student.getNpm());
        assertEquals("Muhammad Rizki Firdaus", student.getName());
        assertEquals("081349923422", student.getPhone());
        assertEquals(Gender.MALE, student.getGender());
        assertEquals(AcademicStatus.ACTIVE, student.getAcademicStatus());
        assertEquals(registrationDate, student.getRegistrationDate());
    }

    @Test
    public void testStudentEqualsAndHashCode() {
        Date registrationDate = new Date();
        Student student1 = new Student(1L, "123456789", "John Doe", "1234567890", Gender.MALE, AcademicStatus.ACTIVE, registrationDate);
        Student student2 = new Student(1L, "123456789", "John Doe", "1234567890", Gender.MALE, AcademicStatus.ACTIVE, registrationDate);

        assertEquals(student1, student2);
        assertEquals(student1.hashCode(), student2.hashCode());
    }

    @Test
    public void testStudentToString() {
        Date registrationDate = new Date();
        Student student = new Student(1L, "123456789", "John Doe", "1234567890", Gender.MALE, AcademicStatus.ACTIVE, registrationDate);
        String expected = "Student(id=1, npm=123456789, name=John Doe, phone=1234567890, gender=MALE, academicStatus=ACTIVE, registrationDate=" + registrationDate + ")";

        assertEquals(expected, student.toString());
    }
}