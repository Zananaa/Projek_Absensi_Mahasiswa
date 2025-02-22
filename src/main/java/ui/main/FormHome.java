/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.main;

import config.GlobalConfig;
import dao.MahasiswaDAO;
import utils.GradeUtils;
import utils.NumberOnlyDocument;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author asus
 */
public class FormHome extends javax.swing.JPanel {
    private MahasiswaDAO mahasiswaDAO;

    /**
     * Creates new form FormHome1
     */
    public FormHome() {
        initComponents();

        mahasiswaDAO = new MahasiswaDAO();
        //
        loadDefaultConfig();
        //addDocumentListeners();
        displayTotalMahasiswa();
    }

    private void displayTotalMahasiswa() {
        int totalMahasiswa = mahasiswaDAO.getTotalMahasiswa();
        jLabel2.setText("Total Mahasiswa: " + totalMahasiswa);
    }

    private void loadDefaultConfig() {
        GlobalConfig config = GlobalConfig.getInstance();
        textC16.setText(config.getConfig("defaultAbsen"));
        textC46.setText(config.getConfig("defaultTugas"));
        textC45.setText(config.getConfig("defaultUTS"));
        textC47.setText(config.getConfig("defaultUAS"));

        int[] rangeA = config.getGradeRange("A");
        textC48.setText(String.valueOf(rangeA[0]));
        textC24.setText(String.valueOf(rangeA[1]));



        int[] rangeBPlus = config.getGradeRange("B+");
        textC49.setText(String.valueOf(rangeBPlus[0]));
        textC31.setText(String.valueOf(rangeBPlus[1]));



        int[] rangeB = config.getGradeRange("B");
        textC50.setText(String.valueOf(rangeB[0]));
        textC38.setText(String.valueOf(rangeB[1]));



        int[] rangeCPlus = config.getGradeRange("C+");
        textC51.setText(String.valueOf(rangeCPlus[0]));
        textC39.setText(String.valueOf(rangeCPlus[1]));




        int[] rangeC = config.getGradeRange("C");
        textC52.setText(String.valueOf(rangeC[0]));
        textC40.setText(String.valueOf(rangeC[1]));




        int[] rangeD = config.getGradeRange("D");
        textC53.setText(String.valueOf(rangeD[0]));
        textC41.setText(String.valueOf(rangeD[1]));


        int[] rangeE = config.getGradeRange("E");
        textC54.setText(String.valueOf(rangeE[0]));
        textC42.setText(String.valueOf(rangeE[1]));

    }

    private void addDocumentListeners() {
        addDocumentListener(textC16, "defaultAbsen");
        addDocumentListener(textC46, "defaultTugas");
        addDocumentListener(textC45, "defaultUTS");
        addDocumentListener(textC47, "defaultUAS");

        addGradeRangeListener(textC24, textC31, "A");
        addGradeRangeListener(textC48, textC49, "B+");
        addGradeRangeListener(textC38, textC39, "B");
        addGradeRangeListener(textC40, textC41, "C+");
        addGradeRangeListener(textC42, textC52, "C");
        addGradeRangeListener(textC53, textC54, "D");
        addGradeRangeListener(textC50, textC51, "E");
    }
    private void addGradeRangeListener(javax.swing.JTextField minField, javax.swing.JTextField maxField, String grade) {
        minField.setDocument(new NumberOnlyDocument());
        maxField.setDocument(new NumberOnlyDocument());

        DocumentListener listener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                saveGradeRange(grade, minField, maxField);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                saveGradeRange(grade, minField, maxField);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                saveGradeRange(grade, minField, maxField);
            }
        };

        minField.getDocument().addDocumentListener(listener);
        maxField.getDocument().addDocumentListener(listener);
    }

    private void addDocumentListener(javax.swing.JTextField textField, String configKey) {
        textField.setDocument(new NumberOnlyDocument());
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                saveConfig(configKey, textField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                saveConfig(configKey, textField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                saveConfig(configKey, textField.getText());
            }
        });
    }

    private void saveConfig(String key, String value) {
        GlobalConfig config = GlobalConfig.getInstance();
        config.setConfig(key, value);
    }
    private void saveGradeRange(String grade, javax.swing.JTextField minField, javax.swing.JTextField maxField) {
        GlobalConfig config = GlobalConfig.getInstance();
        int min = Integer.parseInt(minField.getText());
        int max = Integer.parseInt(maxField.getText());
        config.setGradeRange(grade, new int[]{min, max});
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuUtamaHome = new javax.swing.JPanel();
        panelC1 = new ui.customJar.PanelC();
        textC1 = new ui.customJar.TextC();
        jLabel1 = new javax.swing.JLabel();
        panelC5 = new ui.customJar.PanelC();
        textC2 = new ui.customJar.TextC();
        jLabel2 = new javax.swing.JLabel();
        panelC2 = new ui.customJar.PanelC();
        textC16 = new ui.customJar.TextC();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textC45 = new ui.customJar.TextC();
        textC46 = new ui.customJar.TextC();
        textC47 = new ui.customJar.TextC();
        panelC3 = new ui.customJar.PanelC();
        textC24 = new ui.customJar.TextC();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textC48 = new ui.customJar.TextC();
        textC49 = new ui.customJar.TextC();
        textC31 = new ui.customJar.TextC();
        jLabel11 = new javax.swing.JLabel();
        textC50 = new ui.customJar.TextC();
        textC38 = new ui.customJar.TextC();
        jLabel12 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        textC51 = new ui.customJar.TextC();
        textC39 = new ui.customJar.TextC();
        jLabel46 = new javax.swing.JLabel();
        textC52 = new ui.customJar.TextC();
        jLabel47 = new javax.swing.JLabel();
        textC40 = new ui.customJar.TextC();
        textC53 = new ui.customJar.TextC();
        jLabel48 = new javax.swing.JLabel();
        textC41 = new ui.customJar.TextC();
        textC54 = new ui.customJar.TextC();
        jLabel49 = new javax.swing.JLabel();
        textC42 = new ui.customJar.TextC();

        panelC1.setBackground(new java.awt.Color(198, 215, 231));
        panelC1.setRoundBottomLeft(20);
        panelC1.setRoundBottomRight(20);
        panelC1.setRoundTopLeft(20);
        panelC1.setRoundTopRight(20);

        textC1.setText("100");
        textC1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        textC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Total Kelas");

        javax.swing.GroupLayout panelC1Layout = new javax.swing.GroupLayout(panelC1);
        panelC1.setLayout(panelC1Layout);
        panelC1Layout.setHorizontalGroup(
            panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelC1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelC1Layout.setVerticalGroup(
            panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(textC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelC5.setBackground(new java.awt.Color(198, 215, 231));
        panelC5.setRoundBottomLeft(20);
        panelC5.setRoundBottomRight(20);
        panelC5.setRoundTopLeft(20);
        panelC5.setRoundTopRight(20);

        textC2.setText("100");
        textC2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        textC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Total Mahasiswa");

        javax.swing.GroupLayout panelC5Layout = new javax.swing.GroupLayout(panelC5);
        panelC5.setLayout(panelC5Layout);
        panelC5Layout.setHorizontalGroup(
            panelC5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC5Layout.createSequentialGroup()
                .addGroup(panelC5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelC5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(textC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelC5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelC5Layout.setVerticalGroup(
            panelC5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(textC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelC2.setBackground(new java.awt.Color(198, 215, 231));
        panelC2.setRoundBottomLeft(20);
        panelC2.setRoundBottomRight(20);
        panelC2.setRoundTopLeft(20);
        panelC2.setRoundTopRight(20);

        textC16.setText("20%");
        textC16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textC16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC16ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Absen:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Tugas:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("UTS:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("UTS:");

        textC45.setText("20%");
        textC45.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        textC46.setText("20%");
        textC46.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        textC47.setText("20%");
        textC47.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textC47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC47ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelC2Layout = new javax.swing.GroupLayout(panelC2);
        panelC2.setLayout(panelC2Layout);
        panelC2Layout.setHorizontalGroup(
            panelC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textC16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textC45, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textC46, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textC47, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelC2Layout.setVerticalGroup(
            panelC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(textC16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelC2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panelC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textC46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textC45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelC2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(panelC2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textC47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelC3.setBackground(new java.awt.Color(198, 215, 231));
        panelC3.setRoundBottomLeft(20);
        panelC3.setRoundBottomRight(20);
        panelC3.setRoundTopLeft(20);
        panelC3.setRoundTopRight(20);

        textC24.setText("100");
        textC24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("A :");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("B :");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("B+:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("-");

        textC48.setText("80");
        textC48.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textC48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC48ActionPerformed(evt);
            }
        });

        textC49.setText("80");
        textC49.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textC49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC49ActionPerformed(evt);
            }
        });

        textC31.setText("100");
        textC31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setText("-");

        textC50.setText("80");
        textC50.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textC50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC50ActionPerformed(evt);
            }
        });

        textC38.setText("100");
        textC38.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("-");

        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel42.setText("C+:");

        jLabel43.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel43.setText("C:");

        jLabel44.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel44.setText("D:");

        jLabel45.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel45.setText("E:");

        textC51.setText("80");
        textC51.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textC51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC51ActionPerformed(evt);
            }
        });

        textC39.setText("100");
        textC39.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel46.setText("-");

        textC52.setText("80");
        textC52.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textC52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC52ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel47.setText("-");

        textC40.setText("100");
        textC40.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        textC53.setText("80");
        textC53.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textC53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC53ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel48.setText("-");

        textC41.setText("100");
        textC41.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        textC54.setText("80");
        textC54.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textC54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC54ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel49.setText("-");

        textC42.setText("100");
        textC42.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelC3Layout = new javax.swing.GroupLayout(panelC3);
        panelC3.setLayout(panelC3Layout);
        panelC3Layout.setHorizontalGroup(
            panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelC3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelC3Layout.createSequentialGroup()
                        .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelC3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(textC48, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(panelC3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textC49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textC50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textC51, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelC3Layout.createSequentialGroup()
                                        .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel12))
                                        .addGap(1, 1, 1)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelC3Layout.createSequentialGroup()
                        .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelC3Layout.createSequentialGroup()
                                .addComponent(textC53, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel48))
                            .addGroup(panelC3Layout.createSequentialGroup()
                                .addComponent(textC54, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel49))
                            .addGroup(panelC3Layout.createSequentialGroup()
                                .addComponent(textC52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel47)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textC24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textC31, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textC38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textC39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textC40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textC41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textC42, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
            .addGroup(panelC3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelC3Layout.setVerticalGroup(
            panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC3Layout.createSequentialGroup()
                .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelC3Layout.createSequentialGroup()
                        .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelC3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(textC48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textC49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textC50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8))
                                .addGap(38, 38, 38))
                            .addGroup(panelC3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textC51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel42))))
                        .addGap(114, 114, 114))
                    .addGroup(panelC3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textC54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)))
                    .addGroup(panelC3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(textC24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textC31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textC38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textC39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textC40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)
                            .addComponent(textC52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textC41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48)
                            .addComponent(textC53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addGap(14, 14, 14)
                        .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textC42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49))))
                .addContainerGap())
        );

        javax.swing.GroupLayout menuUtamaHomeLayout = new javax.swing.GroupLayout(menuUtamaHome);
        menuUtamaHome.setLayout(menuUtamaHomeLayout);
        menuUtamaHomeLayout.setHorizontalGroup(
            menuUtamaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaHomeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(menuUtamaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelC5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(menuUtamaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelC3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        menuUtamaHomeLayout.setVerticalGroup(
            menuUtamaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaHomeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(menuUtamaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuUtamaHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuUtamaHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuUtamaHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC1ActionPerformed

    private void textC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC2ActionPerformed

    private void textC16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC16ActionPerformed

    private void textC47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC47ActionPerformed

    private void textC48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC48ActionPerformed

    private void textC49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC49ActionPerformed

    private void textC50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC50ActionPerformed

    private void textC51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC51ActionPerformed

    private void textC52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC52ActionPerformed

    private void textC53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC53ActionPerformed

    private void textC54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC54ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menuUtamaHome;
    private ui.customJar.PanelC panelC1;
    private ui.customJar.PanelC panelC2;
    private ui.customJar.PanelC panelC3;
    private ui.customJar.PanelC panelC5;
    private ui.customJar.TextC textC1;
    private ui.customJar.TextC textC16;
    private ui.customJar.TextC textC2;
    private ui.customJar.TextC textC24;
    private ui.customJar.TextC textC31;
    private ui.customJar.TextC textC38;
    private ui.customJar.TextC textC39;
    private ui.customJar.TextC textC40;
    private ui.customJar.TextC textC41;
    private ui.customJar.TextC textC42;
    private ui.customJar.TextC textC45;
    private ui.customJar.TextC textC46;
    private ui.customJar.TextC textC47;
    private ui.customJar.TextC textC48;
    private ui.customJar.TextC textC49;
    private ui.customJar.TextC textC50;
    private ui.customJar.TextC textC51;
    private ui.customJar.TextC textC52;
    private ui.customJar.TextC textC53;
    private ui.customJar.TextC textC54;
    // End of variables declaration//GEN-END:variables
}
