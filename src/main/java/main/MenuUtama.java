
package main;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import javax.swing.JFrame;

public class MenuUtama extends javax.swing.JFrame {

    public MenuUtama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        FlatSVGIcon pdfIcon = new FlatSVGIcon("svg/profil.svg");
        
        btnProfil.setIcon(pdfIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGradient1 = new customJar.JPanelGradient();
        jPanelGradient2 = new customJar.JPanelGradient();
        btnProfil = new customJar.buttonRoundC1();
        jLabel3 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pn_main = new javax.swing.JPanel();
        pn_line = new javax.swing.JPanel();
        lbl_Icon = new javax.swing.JLabel();
        lb_MenuHome = new javax.swing.JLabel();
        pn_main1 = new javax.swing.JPanel();
        pn_line1 = new javax.swing.JPanel();
        lbl_Icon1 = new javax.swing.JLabel();
        lb_MenuMhs1 = new javax.swing.JLabel();
        pn_main2 = new javax.swing.JPanel();
        pn_line2 = new javax.swing.JPanel();
        lbl_Icon2 = new javax.swing.JLabel();
        lb_MenuAbsen = new javax.swing.JLabel();
        pn_main3 = new javax.swing.JPanel();
        pn_line3 = new javax.swing.JPanel();
        lbl_Icon3 = new javax.swing.JLabel();
        lb_MenuKelas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pn_main4 = new javax.swing.JPanel();
        pn_line4 = new javax.swing.JPanel();
        lbl_Icon4 = new javax.swing.JLabel();
        lb_MenuNilai = new javax.swing.JLabel();
        pn_content = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanelGradient1Layout = new javax.swing.GroupLayout(jPanelGradient1);
        jPanelGradient1.setLayout(jPanelGradient1Layout);
        jPanelGradient1Layout.setHorizontalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelGradient1Layout.setVerticalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(136, 768));

        jPanelGradient2.setColorEnd(new java.awt.Color(51, 197, 215));
        jPanelGradient2.setColorStart(new java.awt.Color(7, 40, 133));
        jPanelGradient2.setPreferredSize(new java.awt.Dimension(872, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MyProfil");

        lbl_logo.setIcon(new javax.swing.ImageIcon("D:\\bahan_projek2\\src\\main\\java\\img\\logo uniska_11zon.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Universitas Islam Kalimantan ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Muhammad Arsyad Al Banjari");

        javax.swing.GroupLayout jPanelGradient2Layout = new javax.swing.GroupLayout(jPanelGradient2);
        jPanelGradient2.setLayout(jPanelGradient2Layout);
        jPanelGradient2Layout.setHorizontalGroup(
            jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 884, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanelGradient2Layout.setVerticalGroup(
            jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelGradient2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient2Layout.createSequentialGroup()
                            .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)))))
        );

        getContentPane().add(jPanelGradient2, java.awt.BorderLayout.PAGE_START);

        pn_sidebar.setBackground(new java.awt.Color(198, 215, 231));

        pn_menu.setBackground(new java.awt.Color(198, 215, 231));
        pn_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Mahasiswa");
        pn_menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        pn_main.setBackground(new java.awt.Color(198, 215, 231));

        pn_line.setBackground(new java.awt.Color(198, 215, 231));

        javax.swing.GroupLayout pn_lineLayout = new javax.swing.GroupLayout(pn_line);
        pn_line.setLayout(pn_lineLayout);
        pn_lineLayout.setHorizontalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        pn_lineLayout.setVerticalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Icon.setIcon(new javax.swing.ImageIcon("D:\\bahan_projek2\\src\\main\\java\\img\\home.png")); // NOI18N

        lb_MenuHome.setBackground(new java.awt.Color(198, 215, 231));
        lb_MenuHome.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lb_MenuHome.setText("Home");
        lb_MenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_MenuHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_MenuHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_MenuHomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_mainLayout = new javax.swing.GroupLayout(pn_main);
        pn_main.setLayout(pn_mainLayout);
        pn_mainLayout.setHorizontalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_mainLayout.createSequentialGroup()
                .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_MenuHome, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_mainLayout.setVerticalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_mainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_MenuHome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pn_line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        pn_menu.add(pn_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, -1));

        pn_main1.setBackground(new java.awt.Color(198, 215, 231));

        pn_line1.setBackground(new java.awt.Color(198, 215, 231));

        javax.swing.GroupLayout pn_line1Layout = new javax.swing.GroupLayout(pn_line1);
        pn_line1.setLayout(pn_line1Layout);
        pn_line1Layout.setHorizontalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        pn_line1Layout.setVerticalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_Icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Icon1.setIcon(new javax.swing.ImageIcon("D:\\bahan_projek2\\src\\main\\java\\img\\user.png")); // NOI18N

        lb_MenuMhs1.setBackground(new java.awt.Color(198, 215, 231));
        lb_MenuMhs1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lb_MenuMhs1.setText("Data Mahasiswa");
        lb_MenuMhs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_MenuMhs1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_MenuMhs1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_MenuMhs1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_main1Layout = new javax.swing.GroupLayout(pn_main1);
        pn_main1.setLayout(pn_main1Layout);
        pn_main1Layout.setHorizontalGroup(
            pn_main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_main1Layout.createSequentialGroup()
                .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_MenuMhs1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_main1Layout.setVerticalGroup(
            pn_main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_main1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pn_main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_MenuMhs1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_main1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pn_line1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        pn_menu.add(pn_main1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, -1));

        pn_main2.setBackground(new java.awt.Color(198, 215, 231));

        pn_line2.setBackground(new java.awt.Color(198, 215, 231));

        javax.swing.GroupLayout pn_line2Layout = new javax.swing.GroupLayout(pn_line2);
        pn_line2.setLayout(pn_line2Layout);
        pn_line2Layout.setHorizontalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        pn_line2Layout.setVerticalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_Icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Icon2.setIcon(new javax.swing.ImageIcon("D:\\bahan_projek2\\src\\main\\java\\img\\absent.png")); // NOI18N

        lb_MenuAbsen.setBackground(new java.awt.Color(198, 215, 231));
        lb_MenuAbsen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lb_MenuAbsen.setText("Absensi");
        lb_MenuAbsen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_MenuAbsenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_MenuAbsenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_MenuAbsenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_main2Layout = new javax.swing.GroupLayout(pn_main2);
        pn_main2.setLayout(pn_main2Layout);
        pn_main2Layout.setHorizontalGroup(
            pn_main2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_main2Layout.createSequentialGroup()
                .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_MenuAbsen, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_main2Layout.setVerticalGroup(
            pn_main2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_main2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pn_main2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_MenuAbsen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_main2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pn_line2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        pn_menu.add(pn_main2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, -1));

        pn_main3.setBackground(new java.awt.Color(198, 215, 231));

        pn_line3.setBackground(new java.awt.Color(198, 215, 231));

        javax.swing.GroupLayout pn_line3Layout = new javax.swing.GroupLayout(pn_line3);
        pn_line3.setLayout(pn_line3Layout);
        pn_line3Layout.setHorizontalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        pn_line3Layout.setVerticalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_Icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Icon3.setIcon(new javax.swing.ImageIcon("D:\\bahan_projek2\\src\\main\\java\\img\\videocall.png")); // NOI18N

        lb_MenuKelas.setBackground(new java.awt.Color(198, 215, 231));
        lb_MenuKelas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lb_MenuKelas.setText("Daftar Kelas");
        lb_MenuKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_MenuKelasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_MenuKelasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_MenuKelasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_main3Layout = new javax.swing.GroupLayout(pn_main3);
        pn_main3.setLayout(pn_main3Layout);
        pn_main3Layout.setHorizontalGroup(
            pn_main3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_main3Layout.createSequentialGroup()
                .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_MenuKelas, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_main3Layout.setVerticalGroup(
            pn_main3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_main3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pn_main3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_MenuKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_main3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pn_line3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        pn_menu.add(pn_main3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 230, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Penilaian");
        pn_menu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 20));

        pn_main4.setBackground(new java.awt.Color(198, 215, 231));

        pn_line4.setBackground(new java.awt.Color(198, 215, 231));

        javax.swing.GroupLayout pn_line4Layout = new javax.swing.GroupLayout(pn_line4);
        pn_line4.setLayout(pn_line4Layout);
        pn_line4Layout.setHorizontalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        pn_line4Layout.setVerticalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbl_Icon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Icon4.setIcon(new javax.swing.ImageIcon("D:\\bahan_projek2\\src\\main\\java\\img\\exam.png")); // NOI18N

        lb_MenuNilai.setBackground(new java.awt.Color(198, 215, 231));
        lb_MenuNilai.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lb_MenuNilai.setText("Kelola Nilai");
        lb_MenuNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_MenuNilaiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_MenuNilaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_MenuNilaiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_main4Layout = new javax.swing.GroupLayout(pn_main4);
        pn_main4.setLayout(pn_main4Layout);
        pn_main4Layout.setHorizontalGroup(
            pn_main4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_main4Layout.createSequentialGroup()
                .addComponent(pn_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_MenuNilai, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_main4Layout.setVerticalGroup(
            pn_main4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_main4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pn_main4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_MenuNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_main4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pn_line4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_Icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        pn_menu.add(pn_main4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 230, -1));

        jScrollPane1.setViewportView(pn_menu);

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sidebarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.LINE_START);

        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_contentLayout = new javax.swing.GroupLayout(pn_content);
        pn_content.setLayout(pn_contentLayout);
        pn_contentLayout.setHorizontalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE)
        );
        pn_contentLayout.setVerticalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        getContentPane().add(pn_content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1380, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_MenuMhs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuMhs1MouseClicked
        pn_main1.setBackground(new Color(240,240,240));
        pn_line1.setBackground(new Color(0, 102, 153));
        
        pn_utama.removeAll();
        pn_utama.add(new FormDataMhs());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_MenuMhs1MouseClicked

    private void lb_MenuMhs1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuMhs1MouseEntered
        pn_main1.setBackground(new Color(250,250,250));
        pn_line1.setBackground(new Color(34, 61, 156));
    }//GEN-LAST:event_lb_MenuMhs1MouseEntered

    private void lb_MenuMhs1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuMhs1MouseExited
        pn_main1.setBackground(new Color(198,215,231));
        pn_line1.setBackground(new Color(198,215,231));
    }//GEN-LAST:event_lb_MenuMhs1MouseExited

    private void lb_MenuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuHomeMouseClicked
        pn_main.setBackground(new Color(240,240,240));
        pn_line.setBackground(new Color(0, 102, 153));
        
        pn_utama.removeAll();
        pn_utama.add(new FormHome());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_MenuHomeMouseClicked

    private void lb_MenuHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuHomeMouseEntered
        pn_main.setBackground(new Color(250,250,250));
        pn_line.setBackground(new Color(34, 61, 156));
    }//GEN-LAST:event_lb_MenuHomeMouseEntered

    private void lb_MenuHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuHomeMouseExited
        pn_main.setBackground(new Color(198,215,231));
        pn_line.setBackground(new Color(198,215,231));
    }//GEN-LAST:event_lb_MenuHomeMouseExited

    private void lb_MenuAbsenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuAbsenMouseClicked
        pn_main2.setBackground(new Color(240,240,240));
        pn_line2.setBackground(new Color(0, 102, 153));
        
        pn_utama.removeAll();
        pn_utama.add(new FormAbsensi1());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_MenuAbsenMouseClicked

    private void lb_MenuAbsenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuAbsenMouseEntered
        pn_main2.setBackground(new Color(250,250,250));
        pn_line2.setBackground(new Color(34, 61, 156));
    }//GEN-LAST:event_lb_MenuAbsenMouseEntered

    private void lb_MenuAbsenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuAbsenMouseExited
        pn_main2.setBackground(new Color(198,215,231));
        pn_line2.setBackground(new Color(198,215,231));
    }//GEN-LAST:event_lb_MenuAbsenMouseExited

    private void lb_MenuKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuKelasMouseClicked
        pn_main3.setBackground(new Color(240,240,240));
        pn_line3.setBackground(new Color(0, 102, 153));
        
        pn_utama.removeAll();
        pn_utama.add(new FormKelas());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_MenuKelasMouseClicked

    private void lb_MenuKelasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuKelasMouseEntered
        pn_main3.setBackground(new Color(250,250,250));
        pn_line3.setBackground(new Color(34, 61, 156));
    }//GEN-LAST:event_lb_MenuKelasMouseEntered

    private void lb_MenuKelasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuKelasMouseExited
        pn_main3.setBackground(new Color(198,215,231));
        pn_line3.setBackground(new Color(198,215,231));
    }//GEN-LAST:event_lb_MenuKelasMouseExited

    private void lb_MenuNilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuNilaiMouseClicked
        pn_main4.setBackground(new Color(240,240,240));
        pn_line4.setBackground(new Color(0, 102, 153));
        
        pn_utama.removeAll();
        pn_utama.add(new FormNilai());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_lb_MenuNilaiMouseClicked

    private void lb_MenuNilaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuNilaiMouseEntered
        pn_main4.setBackground(new Color(250,250,250));
        pn_line4.setBackground(new Color(34, 61, 156));
    }//GEN-LAST:event_lb_MenuNilaiMouseEntered

    private void lb_MenuNilaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_MenuNilaiMouseExited
        pn_main4.setBackground(new Color(198,215,231));
        pn_line4.setBackground(new Color(198,215,231));
    }//GEN-LAST:event_lb_MenuNilaiMouseExited

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customJar.buttonRoundC1 btnProfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private customJar.JPanelGradient jPanelGradient1;
    private customJar.JPanelGradient jPanelGradient2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_MenuAbsen;
    private javax.swing.JLabel lb_MenuHome;
    private javax.swing.JLabel lb_MenuKelas;
    private javax.swing.JLabel lb_MenuMhs1;
    private javax.swing.JLabel lb_MenuNilai;
    private javax.swing.JLabel lbl_Icon;
    private javax.swing.JLabel lbl_Icon1;
    private javax.swing.JLabel lbl_Icon2;
    private javax.swing.JLabel lbl_Icon3;
    private javax.swing.JLabel lbl_Icon4;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_line;
    private javax.swing.JPanel pn_line1;
    private javax.swing.JPanel pn_line2;
    private javax.swing.JPanel pn_line3;
    private javax.swing.JPanel pn_line4;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_main1;
    private javax.swing.JPanel pn_main2;
    private javax.swing.JPanel pn_main3;
    private javax.swing.JPanel pn_main4;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_sidebar;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables
}
