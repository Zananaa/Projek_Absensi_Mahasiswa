package entities;


import entities.enums.AcademicStatus;
import entities.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, unique = true)
    private Long id;

    @Column(name="npm", nullable = false, length = 20)
    private String npm;

    @Column(name="name", nullable = false, length = 100)
    private String name;

    @Column(name="phone", length = 20)
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name="gender")
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(name="academic_status", nullable = false)
    private AcademicStatus academicStatus;

    @Column(name="registration_date", nullable = false)
    private Date registrationDate;
}

