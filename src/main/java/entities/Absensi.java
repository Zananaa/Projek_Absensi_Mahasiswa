// src/main/java/entities/Absensi.java

package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Absensi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mahasiswa_id", nullable = false)
    private Mahasiswa mahasiswa;

    @Column(name = "tanggal", nullable = false, length = 10)
    private String tanggal;

    @Column(name = "hadir", nullable = false)
    private boolean hadir;

    @Column(name = "izin", nullable = false)
    private boolean izin;

    @Column(name = "sakit", nullable = false)
    private boolean sakit;

    @Column(name = "alpha", nullable = false)
    private boolean alpha;

    public Absensi(Mahasiswa mahasiswa, String tanggal, boolean hadir, boolean izin, boolean sakit, boolean alpha) {
        this.mahasiswa = mahasiswa;
        this.tanggal = tanggal;
        this.hadir = hadir;
        this.izin = izin;
        this.sakit = sakit;
        this.alpha = alpha;
    }
}