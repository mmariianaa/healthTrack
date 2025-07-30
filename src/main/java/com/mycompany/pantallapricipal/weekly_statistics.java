/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pantallapricipal;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.GridLayout;
/**
 *
 * @author Lenovo
 */
public class weekly_statistics extends javax.swing.JFrame {
     
    /**
     * Creates new form weekly_statistics
     */
    public weekly_statistics() {
        initComponents();
    }
    private static final String URL = "jdbc:mysql://localhost:3306/healtrack";
    private static final String USER = "root";
    private static final String PASS = "";

    private void mostrarCaloriasSemanales(Connection conn, int idUsuario) throws SQLException {
    String sqlCalorias = """
        SELECT fecha, calorias_consumidas, calorias_quemadas
        FROM registro_diario_calorias
        WHERE usuario_idusuario = ?
          AND fecha BETWEEN DATE_SUB(CURDATE(), INTERVAL 6 DAY) AND CURDATE()
        ORDER BY fecha
    """;

    try (PreparedStatement ps = conn.prepareStatement(sqlCalorias)) {
        ps.setInt(1, idUsuario);
        System.out.println("Ejecutando consulta para usuario: " + idUsuario);
        System.out.println("Consulta SQL (param simulada): " + sqlCalorias.replace("?", String.valueOf(idUsuario)));

        try (ResultSet rs = ps.executeQuery()) {
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE", Locale.US); // Para obtener el día en inglés

            // Reiniciar todos los labels antes de procesar los datos
            lblMondayConsumed.setText("Consumidas: 0");
            lblMondayBurned.setText("Quemadas: 0");
            lblTuesdayConsumed.setText("Consumidas: 0");
            lblTuesdayBurned.setText("Quemadas: 0");
            lblWednesdayConsumed.setText("Consumidas: 0");
            lblWednesdayBurned.setText("Quemadas: 0");
            lblThursdayConsumed.setText("Consumidas: 0");
            lblThursdayBurned.setText("Quemadas: 0");
            lblFridayConsumed.setText("Consumidas: 0");
            lblFridayBurned.setText("Quemadas: 0");
            lblSaturdayConsumed.setText("Consumidas: 0");
            lblSaturdayBurned.setText("Quemadas: 0");
            lblSundayConsumed.setText("Consumidas: 0");
            lblSundayBurned.setText("Quemadas: 0");

            boolean hasData = false;

            while (rs.next()) {
                hasData = true;
                Date fecha = rs.getDate("fecha");
                String dia = sdf.format(fecha).toLowerCase(); // ejemplo: monday
                int consumidas = rs.getInt("calorias_consumidas");
                int quemadas = rs.getInt("calorias_quemadas");

                System.out.printf("Registro encontrado: %s - Consumidas: %d, Quemadas: %d%n",
                        dia, consumidas, quemadas);

                switch (dia) {
                    case "monday":
                        lblMondayConsumed.setText("Consumidas: " + consumidas);
                        lblMondayBurned.setText("Quemadas: " + quemadas);
                        break;
                    case "tuesday":
                        lblTuesdayConsumed.setText("Consumidas: " + consumidas);
                        lblTuesdayBurned.setText("Quemadas: " + quemadas);
                        break;
                    case "wednesday":
                        lblWednesdayConsumed.setText("Consumidas: " + consumidas);
                        lblWednesdayBurned.setText("Quemadas: " + quemadas);
                        break;
                    case "thursday":
                        lblThursdayConsumed.setText("Consumidas: " + consumidas);
                        lblThursdayBurned.setText("Quemadas: " + quemadas);
                        break;
                    case "friday":
                        lblFridayConsumed.setText("Consumidas: " + consumidas);
                        lblFridayBurned.setText("Quemadas: " + quemadas);
                        break;
                    case "saturday":
                        lblSaturdayConsumed.setText("Consumidas: " + consumidas);
                        lblSaturdayBurned.setText("Quemadas: " + quemadas);
                        break;
                    case "sunday":
                        lblSundayConsumed.setText("Consumidas: " + consumidas);
                        lblSundayBurned.setText("Quemadas: " + quemadas);
                        break;
                    default:
                        System.out.println("Día no reconocido: " + dia);
                        break;
                }
            }

            if (!hasData) {
                System.out.println("No se encontraron registros para esta semana");
                JOptionPane.showMessageDialog(this, "No hay datos de calorías para esta semana");
            }
        }
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel12 = new javax.swing.JPanel();
        panel7 = new javax.swing.JPanel();
        EJERCICIOS = new javax.swing.JLabel();
        panel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelrecomendacion = new javax.swing.JPanel();
        recomndacion = new javax.swing.JLabel();
        panel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panel16 = new java.awt.Panel();
        jPanel15 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel40 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        panel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        panel14 = new javax.swing.JPanel();
        estadisticas = new javax.swing.JLabel();
        panel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        lblThursdayConsumed = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel46 = new javax.swing.JPanel();
        lblWednesdayConsumed = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        lblFridayConsumed = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        lblTuesdayConsumed = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        lblSaturdayConsumed = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        lblSundayConsumed = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        lblMondayConsumed = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        lblSundayBurned = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        lblThursdayBurned = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        lblMondayBurned = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        lblWednesdayBurned = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        lblFridayBurned = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        lblTuesdayBurned = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        lblSaturdayBurned = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(240, 243, 250));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(13, 70, 113));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HEALTH TRACK ");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel1)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        panel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        panel3.setBackground(new java.awt.Color(177, 201, 239));
        panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel2.setText("HEART ");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(82, 82, 82))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 60));

        panel4.setBackground(new java.awt.Color(222, 246, 248));
        panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel4MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(222, 246, 248));
        jLabel3.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel3.setText("STATISTICS");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(0, 72, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 260, 60));

        panel5.setBackground(new java.awt.Color(222, 255, 255));
        panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel5MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel4.setText("YOUR WEEK");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.add(panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 210, 60));

        panel6.setBackground(new java.awt.Color(177, 201, 239));
        panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel5.setText("PACEMARKER");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(492, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 700, -1));

        panel12.setBackground(new java.awt.Color(230, 255, 255));
        panel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );

        panel1.add(panel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 350, 310));

        panel7.setBackground(new java.awt.Color(222, 240, 248));
        panel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EJERCICIOS.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        EJERCICIOS.setText("EXERCISES");
        EJERCICIOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EJERCICIOSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(EJERCICIOS, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EJERCICIOS, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 360, 80));

        panel8.setBackground(new java.awt.Color(222, 240, 248));
        panel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel8MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel7.setText("HEART RATE ");

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 360, 80));

        panel9.setBackground(new java.awt.Color(222, 240, 248));
        panel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel9MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel8.setText("RHYTM");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(panel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 360, 80));

        panelrecomendacion.setBackground(new java.awt.Color(222, 240, 248));
        panelrecomendacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelrecomendacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelrecomendacionMouseClicked(evt);
            }
        });

        recomndacion.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        recomndacion.setText("RECOMMENDATION");

        javax.swing.GroupLayout panelrecomendacionLayout = new javax.swing.GroupLayout(panelrecomendacion);
        panelrecomendacion.setLayout(panelrecomendacionLayout);
        panelrecomendacionLayout.setHorizontalGroup(
            panelrecomendacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelrecomendacionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(recomndacion, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        panelrecomendacionLayout.setVerticalGroup(
            panelrecomendacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelrecomendacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recomndacion)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        panel1.add(panelrecomendacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 360, 70));

        panel11.setBackground(new java.awt.Color(177, 201, 239));
        panel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel11MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel6.setText("BACK");

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(jLabel6)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel11Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(14, 14, 14))
        );

        panel1.add(panel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 700, 60));

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel16Layout = new javax.swing.GroupLayout(panel16);
        panel16.setLayout(panel16Layout);
        panel16Layout.setHorizontalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel16Layout.setVerticalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Calisto MT", 0, 11)); // NOI18N
        jLabel25.setText("Monday");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addGap(0, 92, Short.MAX_VALUE)
                    .addComponent(jLabel25)
                    .addGap(0, 92, Short.MAX_VALUE)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addGap(0, 15, Short.MAX_VALUE)
                    .addComponent(jLabel25)
                    .addGap(0, 15, Short.MAX_VALUE)))
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel50.setBackground(new java.awt.Color(0, 0, 0));
        jLabel50.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel50.setText("Steps:");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel40Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel50)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel40Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel50)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel40.setBackground(new java.awt.Color(0, 0, 0));
        jLabel40.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel40.setText("Steps:");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel30Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel40)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel30Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel40)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel48.setBackground(new java.awt.Color(0, 0, 0));
        jLabel48.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel48.setText("Steps:");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel38Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel48)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel38Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel48)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel51.setBackground(new java.awt.Color(0, 0, 0));
        jLabel51.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel51.setText("Steps:");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel41Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel51)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel41Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel51)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel52.setBackground(new java.awt.Color(0, 0, 0));
        jLabel52.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel52.setText("Steps:");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel52)
                .addContainerGap())
        );

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel53.setBackground(new java.awt.Color(0, 0, 0));
        jLabel53.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel53.setText("Steps:");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel43Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel53)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel43Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel53)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel54.setBackground(new java.awt.Color(0, 0, 0));
        jLabel54.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel54.setText("Steps:");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel44Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel54)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel44Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel54)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel62.setBackground(new java.awt.Color(0, 0, 0));
        jLabel62.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel62.setText("Steps:");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel52Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel62)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel52Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel62)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel63.setBackground(new java.awt.Color(0, 0, 0));
        jLabel63.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel63.setText("Steps:");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel63)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jPanel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel64.setBackground(new java.awt.Color(0, 0, 0));
        jLabel64.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel64.setText("Steps:");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel54Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel64)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel54Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel64)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));
        jPanel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel65.setBackground(new java.awt.Color(0, 0, 0));
        jLabel65.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel65.setText("Steps:");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel55Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel65)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel55Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel65)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));
        jPanel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel66.setBackground(new java.awt.Color(0, 0, 0));
        jLabel66.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel66.setText("Steps:");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel66)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel66)
                .addContainerGap())
        );

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));
        jPanel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel67.setBackground(new java.awt.Color(0, 0, 0));
        jLabel67.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel67.setText("Steps:");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel57Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel67)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel57Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel67)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel68.setBackground(new java.awt.Color(0, 0, 0));
        jLabel68.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel68.setText("Steps:");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel58Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel68)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel58Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel68)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel10.setBackground(new java.awt.Color(13, 70, 113));
        panel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Bernard MT Condensed", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("HEALTH TRACK ");

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel9)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel3.add(panel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 772, -1));

        panel13.setBackground(new java.awt.Color(222, 246, 248));
        panel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel13MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel10.setText("HEART ");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panel13);
        panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        panel13Layout.setVerticalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, -1));

        panel14.setBackground(new java.awt.Color(222, 246, 248));
        panel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel14MouseClicked(evt);
            }
        });

        estadisticas.setBackground(new java.awt.Color(222, 246, 248));
        estadisticas.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        estadisticas.setText("STATISTICS");
        estadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadisticasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel14Layout = new javax.swing.GroupLayout(panel14);
        panel14.setLayout(panel14Layout);
        panel14Layout.setHorizontalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        panel14Layout.setVerticalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addComponent(estadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(panel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 52, 272, -1));

        panel15.setBackground(new java.awt.Color(177, 201, 239));
        panel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel15MouseClicked(evt);
            }
        });
        panel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel12.setText("YOUR WEEK");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        panel15.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 226, 50));

        jPanel3.add(panel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 240, 70));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel34.setText("Monday");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel34)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel34)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 267, -1));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel35.setText("Wednesday:");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel35)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel35)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 265, -1, -1));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel36.setText("Friday");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel36)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel26Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel36)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 355, 267, -1));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel37.setText("Saturday:");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel37)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addContainerGap())
        );

        jPanel3.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel38.setText("Sunday");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel28Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel38)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel28Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel38)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 445, 267, -1));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel41.setBackground(new java.awt.Color(0, 0, 0));
        jLabel41.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel41.setText("Tuesday:");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel31Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel41)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel31Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel41)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 267, -1));

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel49.setBackground(new java.awt.Color(0, 0, 0));
        jLabel49.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel49.setText("Thursday:");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel39Layout.createSequentialGroup()
                    .addGap(0, 96, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addGap(0, 95, Short.MAX_VALUE)))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel39Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 267, -1));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblThursdayConsumed.setBackground(new java.awt.Color(0, 0, 0));
        lblThursdayConsumed.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblThursdayConsumed.setText("Calories Consumed:");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel45Layout.createSequentialGroup()
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addComponent(lblThursdayConsumed)
                    .addGap(0, 53, Short.MAX_VALUE)))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel45Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(lblThursdayConsumed)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 310, 230, -1));

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblWednesdayConsumed.setBackground(new java.awt.Color(0, 0, 0));
        lblWednesdayConsumed.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblWednesdayConsumed.setText("Calories Consumed:");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblWednesdayConsumed)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWednesdayConsumed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 265, 230, 40));

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFridayConsumed.setBackground(new java.awt.Color(0, 0, 0));
        lblFridayConsumed.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblFridayConsumed.setText("Calories Consumed:");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblFridayConsumed)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFridayConsumed)
                .addContainerGap())
        );

        jPanel3.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 355, 230, 40));

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTuesdayConsumed.setBackground(new java.awt.Color(0, 0, 0));
        lblTuesdayConsumed.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblTuesdayConsumed.setText("  Calories Consumed:");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblTuesdayConsumed)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTuesdayConsumed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 220, 230, -1));

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSaturdayConsumed.setBackground(new java.awt.Color(0, 0, 0));
        lblSaturdayConsumed.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblSaturdayConsumed.setText("Calories Consumed:");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblSaturdayConsumed)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSaturdayConsumed)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 400, 230, -1));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSundayConsumed.setBackground(new java.awt.Color(0, 0, 0));
        lblSundayConsumed.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblSundayConsumed.setText("Calories Consumed:");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
            .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel50Layout.createSequentialGroup()
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addComponent(lblSundayConsumed)
                    .addGap(0, 53, Short.MAX_VALUE)))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel50Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(lblSundayConsumed)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 445, 230, -1));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMondayConsumed.setBackground(new java.awt.Color(0, 0, 0));
        lblMondayConsumed.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblMondayConsumed.setText("Calories Consumed :");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(lblMondayConsumed)
                .addGap(47, 47, 47))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMondayConsumed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 175, 230, -1));

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));
        jPanel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSundayBurned.setBackground(new java.awt.Color(0, 0, 0));
        lblSundayBurned.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblSundayBurned.setText("Calories Burned:");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel59Layout.createSequentialGroup()
                    .addGap(0, 74, Short.MAX_VALUE)
                    .addComponent(lblSundayBurned)
                    .addGap(0, 73, Short.MAX_VALUE)))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel59Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(lblSundayBurned)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 445, 250, -1));

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));
        jPanel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblThursdayBurned.setBackground(new java.awt.Color(0, 0, 0));
        lblThursdayBurned.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblThursdayBurned.setText("Calories Burned:");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
            .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel60Layout.createSequentialGroup()
                    .addGap(0, 74, Short.MAX_VALUE)
                    .addComponent(lblThursdayBurned)
                    .addGap(0, 73, Short.MAX_VALUE)))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel60Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(lblThursdayBurned)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 310, 250, -1));

        jPanel61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMondayBurned.setBackground(new java.awt.Color(0, 0, 0));
        lblMondayBurned.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblMondayBurned.setText("Calories Burned:");

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblMondayBurned)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMondayBurned)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 175, 250, -1));

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));
        jPanel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblWednesdayBurned.setBackground(new java.awt.Color(0, 0, 0));
        lblWednesdayBurned.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblWednesdayBurned.setText("Calories Burned :");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(lblWednesdayBurned)
                .addGap(68, 68, 68))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWednesdayBurned)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 265, 250, 40));

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFridayBurned.setBackground(new java.awt.Color(0, 0, 0));
        lblFridayBurned.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblFridayBurned.setText("Calories Burned:");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
            .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel63Layout.createSequentialGroup()
                    .addGap(0, 74, Short.MAX_VALUE)
                    .addComponent(lblFridayBurned)
                    .addGap(0, 73, Short.MAX_VALUE)))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel63Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(lblFridayBurned)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 355, 250, -1));

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTuesdayBurned.setBackground(new java.awt.Color(0, 0, 0));
        lblTuesdayBurned.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblTuesdayBurned.setText("Calories Burned:");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblTuesdayBurned)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTuesdayBurned)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 220, 250, -1));

        jPanel65.setBackground(new java.awt.Color(255, 255, 255));
        jPanel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSaturdayBurned.setBackground(new java.awt.Color(0, 0, 0));
        lblSaturdayBurned.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        lblSaturdayBurned.setText("Calories Burned:");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(lblSaturdayBurned)
                .addGap(71, 71, 71))
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblSaturdayBurned)
                .addContainerGap())
        );

        jPanel3.add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 400, 250, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Calisto MT", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("ver estadisticas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel3MouseClicked
        // TODO add your handling code here:
        //ESTE ESPACIO ES PARA EL PRIMER EVENTO
    }//GEN-LAST:event_panel3MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        // ESTE ESPACIO ES PARA EL SEGUNDO EVENTO
        estadisticas estadis=new estadisticas();//se crea un nuevo
        estadis.setVisible(true);//se crea desde arriba para que sea visible//
        dispose();//cerrar la ventana es necesario para hacer que la pantalla se minimice//
    }//GEN-LAST:event_jLabel3MouseClicked

    private void panel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel4MouseClicked
        // TODO add your handling code here:
        estadisticas estadis=new estadisticas();//se crea un nuevo
        estadis.setVisible(true);//se crea desde arriba para que sea visible//
        dispose();//cerrar la ventana es necesario para hacer que la pantalla se minimice//
    }//GEN-LAST:event_panel4MouseClicked

    private void panel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel5MouseClicked
        // TODO add your handling code here:
        //ESTE APARTADO ES PARA EL TERCER EVENTO
    }//GEN-LAST:event_panel5MouseClicked

    private void EJERCICIOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EJERCICIOSMouseClicked
        // TODO add your handling code here:

        List regreso = new List();
        regreso.setVisible(true);
        dispose();
    }//GEN-LAST:event_EJERCICIOSMouseClicked

    private void panel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel8MouseClicked
        // TODO add your handling code here:
        // ESTE ESPACIO ES PARA HEART RATE
      
    }//GEN-LAST:event_panel8MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void panel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel9MouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_panel9MouseClicked

    private void panelrecomendacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelrecomendacionMouseClicked
      
    }//GEN-LAST:event_panelrecomendacionMouseClicked

    private void panel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel11MouseClicked

    }//GEN-LAST:event_panel11MouseClicked

    private void panel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel15MouseClicked
        // TODO add your handling code here:
        //ESTE APARTADO ES PARA EL TERCER EVENTO
    }//GEN-LAST:event_panel15MouseClicked

    private void panel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel14MouseClicked

        estadisticas esta = new estadisticas();
        esta.setVisible(true);
        dispose ();
    }//GEN-LAST:event_panel14MouseClicked

    private void estadisticasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadisticasMouseClicked
        estadisticas esta = new estadisticas();
        esta.setVisible(true);
        dispose ();
    }//GEN-LAST:event_estadisticasMouseClicked

    private void panel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel13MouseClicked
        // TODO add your handling code here
    }//GEN-LAST:event_panel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        //your week
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        //heart
        heart yuyu = new heart();
        yuyu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          try {
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        // Aquí deberías obtener el ID de usuario real, no 0
        mostrarCaloriasSemanales(conn, 1); // Cambia 1 por el ID de usuario correcto
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + ex.getMessage());
    }       
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(weekly_statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(weekly_statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(weekly_statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(weekly_statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new weekly_statistics().setVisible(true);
            }
        });
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EJERCICIOS;
    private javax.swing.JLabel estadisticas;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblFridayBurned;
    private javax.swing.JLabel lblFridayConsumed;
    private javax.swing.JLabel lblMondayBurned;
    private javax.swing.JLabel lblMondayConsumed;
    private javax.swing.JLabel lblSaturdayBurned;
    private javax.swing.JLabel lblSaturdayConsumed;
    private javax.swing.JLabel lblSundayBurned;
    private javax.swing.JLabel lblSundayConsumed;
    private javax.swing.JLabel lblThursdayBurned;
    private javax.swing.JLabel lblThursdayConsumed;
    private javax.swing.JLabel lblTuesdayBurned;
    private javax.swing.JLabel lblTuesdayConsumed;
    private javax.swing.JLabel lblWednesdayBurned;
    private javax.swing.JLabel lblWednesdayConsumed;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel10;
    private javax.swing.JPanel panel11;
    private javax.swing.JPanel panel12;
    private javax.swing.JPanel panel13;
    private javax.swing.JPanel panel14;
    private javax.swing.JPanel panel15;
    private java.awt.Panel panel16;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel9;
    private javax.swing.JPanel panelrecomendacion;
    private javax.swing.JLabel recomndacion;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JButton btnActualizar;
   
    
}
