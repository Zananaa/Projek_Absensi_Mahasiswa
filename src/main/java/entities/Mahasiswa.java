package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="no", nullable = false, unique = true)
    private Long id;

    @Column(name="npm", nullable = false, length = 20)
    private String npm;

    @Column(name = "nama", nullable = false, length = 100)
    private String nama;

    @Column(name="kelas", nullable = false, length = 50)
    private String kelas;

    @Column(name="semester", nullable = false)
    private int semester;

    @OneToMany(mappedBy = "mahasiswa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Absensi> absensiList;

}
