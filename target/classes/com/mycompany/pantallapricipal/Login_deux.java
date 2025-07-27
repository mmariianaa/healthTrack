
package com.mycompany.pantallapricipal;

import javax.swing.JOptionPane;


public class Login_deux extends javax.swing.JFrame {
   
   int xMouse, yMouse;
   
    public Login_deux() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        user3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        barra = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        contrasena = new javax.swing.JLabel();
        contrasenainicio = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        Night_City = new javax.swing.JLabel();
        barraSuperior = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Xbutton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        inicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        registro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto1 = new javax.swing.JTextArea();

        jScrollPane1.setViewportView(jTextPane1);

        user3.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(222, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setFont(new java.awt.Font("Calisto MT", 3, 14)); // NOI18N
        usuario.setText("USER");
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 50, -1));
        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 340, 0));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 290, -1));

        contrasena.setFont(new java.awt.Font("Calisto MT", 3, 12)); // NOI18N
        contrasena.setText("PASSWORD");
        jPanel1.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 296, 90, 20));

        contrasenainicio.setBackground(new java.awt.Color(222, 255, 255));
        contrasenainicio.setBorder(null);
        contrasenainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenainicioActionPerformed(evt);
            }
        });
        jPanel1.add(contrasenainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 240, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 373, 290, 10));

        Night_City.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/animated_heart.gif"))); // NOI18N
        Night_City.setText("jLabel7");
        jPanel1.add(Night_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 460, 620));

        barraSuperior.setBackground(new java.awt.Color(13, 70, 113));
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(13, 70, 113));

        Xbutton.setBackground(new java.awt.Color(213, 222, 239));
        Xbutton.setText("X");
        Xbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Xbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Xbutton)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 591, Short.MAX_VALUE))
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 40));
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 210, 180));

        inicio.setBackground(new java.awt.Color(110, 161, 182));
        inicio.setFont(new java.awt.Font("Calisto MT", 3, 14)); // NOI18N
        inicio.setText("START");
        inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioMouseClicked(evt);
            }
        });
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        jPanel1.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/logosinfondo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 180, 170));

        registro.setBackground(new java.awt.Color(222, 255, 255));
        registro.setFont(new java.awt.Font("Calisto MT", 3, 18)); // NOI18N
        registro.setText("REGISTER");
        registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroMouseClicked(evt);
            }
        });
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });
        jPanel1.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 130, -1));

        jScrollPane2.setBackground(new java.awt.Color(204, 255, 204));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(204, 255, 204));

        texto1.setBackground(new java.awt.Color(222, 255, 255));
        texto1.setColumns(20);
        texto1.setLineWrap(true);
        texto1.setRows(5);
        texto1.setBorder(null);
        jScrollPane2.setViewportView(texto1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 290, 20));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged
        this.setLocation(xMouse, yMouse);
    }//GEN-LAST:event_barraSuperiorMouseDragged

    private void contrasenainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenainicioActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_contrasenainicioActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_inicioActionPerformed

    private void inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioMouseClicked
        // TODO add your handling code here:
       // este espacio es para verificar la contrasena
       // Mostrar mensaje de carga
    JOptionPane loading = new JOptionPane("Validando datos, por favor espere...",
                                          JOptionPane.INFORMATION_MESSAGE,
                                          JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
    final javax.swing.JDialog dialog = loading.createDialog("Cargando...");
    dialog.setModal(false); // que no bloquee la ventana
    dialog.setDefaultCloseOperation(javax.swing.JDialog.DO_NOTHING_ON_CLOSE);
    dialog.setVisible(true);

    // Hilo en segundo plano
    new Thread(() -> {
        String correo = texto1.getText();
        String password = new String(contrasenainicio.getPassword());

        boolean exito = peticiones.login(correo, password);

        // Cerrar el mensaje de carga
        dialog.dispose();

        if (exito) {
            // Cambiar pantalla en el hilo de Swing
            javax.swing.SwingUtilities.invokeLater(() -> {
                heart principal = new heart();
                principal.setVisible(true);
                dispose();
            });
        } else {
            javax.swing.SwingUtilities.invokeLater(() -> {
                JOptionPane.showMessageDialog(null, "Tus datos son incorrectos por favor verificar");
            });
        }
    }).start();
       String correo=texto1.getText();
       String password=new String(contrasenainicio.getPassword());
  
       boolean exito=peticiones.login(correo, password);
        if(exito){
            heart principal=new heart();//se crea un nuevo 
            principal.setVisible(true);//se crea desde arriba para que sea visible//
            dispose();//cerrar la ventana es necesario para hacer que la pantalla se minimice//
        }else{
            JOptionPane.showMessageDialog(null, "Tus datos son incorrectos por favor verificar");
        }                                 
    }//GEN-LAST:event_inicioMouseClicked

    private void XbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XbuttonMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_XbuttonMouseClicked

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        // TODO add your handling code here:
        
        //REGISTRO
    }//GEN-LAST:event_registroActionPerformed

    private void registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroMouseClicked
        // TODO add your handling code here:
        registro deu = new registro();
        deu.setVisible(true);
        dispose();
        //REGISTRARSE 
    }//GEN-LAST:event_registroMouseClicked

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Night_City;
    private javax.swing.JButton Xbutton;
    private javax.swing.JSeparator barra;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JLabel contrasena;
    private javax.swing.JPasswordField contrasenainicio;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton registro;
    private javax.swing.JTextArea texto1;
    private javax.swing.JLabel user3;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
