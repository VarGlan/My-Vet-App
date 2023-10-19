package com.mycompany.veterinariajpa.igu;

import com.mycompany.veterinariajpa.igu.historial.AgregarHistorial;
import com.mycompany.veterinariajpa.igu.historial.VerDatosHistorial;
import com.mycompany.veterinariajpa.igu.personas.VerDatosPersonas;
import com.mycompany.veterinariajpa.igu.vacunacion.VerDatosVacunas;
import com.mycompany.veterinariajpa.igu.views.ClienteAgregarView;
import com.mycompany.veterinariajpa.igu.views.ClienteDatosView;
import com.mycompany.veterinariajpa.igu.views.PacientesAgregarView;
import com.mycompany.veterinariajpa.igu.views.PacientesDatosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;

public class PantallaPrincipal extends javax.swing.JFrame {

    public PantallaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundP = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnMascotas = new javax.swing.JButton();
        btnVacunacion = new javax.swing.JButton();
        btnAtencion = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnPersonas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 0));

        backgroundP.setBackground(new java.awt.Color(0, 153, 204));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        btnClientes.setBackground(new java.awt.Color(0, 153, 204));
        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setBorder(null);
        btnClientes.setFocusPainted(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnMascotas.setBackground(new java.awt.Color(0, 153, 204));
        btnMascotas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMascotas.setForeground(new java.awt.Color(255, 255, 255));
        btnMascotas.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\VeterinariaJPA\\img\\mascota.png")); // NOI18N
        btnMascotas.setBorder(null);
        btnMascotas.setFocusPainted(false);
        btnMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotasActionPerformed(evt);
            }
        });

        btnVacunacion.setBackground(new java.awt.Color(0, 153, 204));
        btnVacunacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVacunacion.setForeground(new java.awt.Color(255, 255, 255));
        btnVacunacion.setBorder(null);
        btnVacunacion.setFocusPainted(false);
        btnVacunacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacunacionActionPerformed(evt);
            }
        });

        btnAtencion.setBackground(new java.awt.Color(0, 153, 204));
        btnAtencion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtencion.setForeground(new java.awt.Color(255, 255, 255));
        btnAtencion.setBorder(null);
        btnAtencion.setFocusPainted(false);
        btnAtencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtencionActionPerformed(evt);
            }
        });

        btnHistorial.setBackground(new java.awt.Color(0, 153, 204));
        btnHistorial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setBorder(null);
        btnHistorial.setFocusPainted(false);
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        jLabel2.setBackground(java.awt.Color.darkGray);
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Atencion");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mascotas");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vacunacion");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clientes");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Historial");

        btnPersonas.setBackground(new java.awt.Color(0, 153, 204));
        btnPersonas.setBorder(null);
        btnPersonas.setPreferredSize(new java.awt.Dimension(200, 150));
        btnPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Personas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel2))
                            .addComponent(btnAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3))
                    .addComponent(btnMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel7)
                        .addGap(72, 72, 72)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel8)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(69, 69, 69)))
                            .addComponent(btnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnMascotas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnVacunacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.Color.darkGray);

        lblLogo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText("Gestión de clinica veterinaria");
        lblLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnSalir.setBackground(new java.awt.Color(0, 153, 204));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnSalir.setIconTextGap(10);
        btnSalir.setMargin(new java.awt.Insets(2, 14, 5, 50));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnSalir)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLogo)
                        .addComponent(jLabel9)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout backgroundPLayout = new javax.swing.GroupLayout(backgroundP);
        backgroundP.setLayout(backgroundPLayout);
        backgroundPLayout.setHorizontalGroup(
            backgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        backgroundPLayout.setVerticalGroup(
            backgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        VerDatosHistorial pantallaVdh = new VerDatosHistorial ();
        pantallaVdh.setVisible(true);
        pantallaVdh.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtencionActionPerformed

    private void btnVacunacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacunacionActionPerformed
        VerDatosVacunas vacuna = new VerDatosVacunas();
        vacuna.setVisible(true);
        vacuna.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVacunacionActionPerformed

    private void btnMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotasActionPerformed
        PacientesDatosView pantalla = new PacientesDatosView();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMascotasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        ClienteDatosView pantaClientes = new ClienteDatosView();
        pantaClientes.setVisible(true);
        pantaClientes.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonasActionPerformed
        VerDatosPersonas pantalla = new VerDatosPersonas();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPersonasActionPerformed

    //BOTONES DE ATENCION A MASCOTAS------------------------------------------------- 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundP;
    private javax.swing.JButton btnAtencion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnMascotas;
    private javax.swing.JButton btnPersonas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVacunacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables

}
