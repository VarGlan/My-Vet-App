/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.veterinariajpa.igu.views;

import com.mycompany.veterinariajpa.logica.Controladora;
import com.mycompany.veterinariajpa.logica.utilidades.DialogUtils;
import java.beans.PropertyChangeEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class PacientesAgregarView extends javax.swing.JFrame {

    Controladora control = null;

    public PacientesAgregarView() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        txtRaza = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtColorPelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtCodCteMasco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnGuardarPaciente = new javax.swing.JButton();
        txtNombreMascota = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        lblAgendarVacuna = new javax.swing.JLabel();
        lblAgendarVacuna3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        dateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooserPropertyChange(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Color de pelo: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo del cliente:");

        txtCodCteMasco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCteMascoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre mascota (alias):");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Especie: ");

        btnLimpiar.setBackground(new java.awt.Color(0, 153, 204));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Raza:");

        btnGuardarPaciente.setBackground(new java.awt.Color(0, 153, 204));
        btnGuardarPaciente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarPaciente.setText("Guardar");
        btnGuardarPaciente.setBorder(null);
        btnGuardarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPacienteActionPerformed(evt);
            }
        });

        txtNombreMascota.setPreferredSize(new java.awt.Dimension(20, 30));
        txtNombreMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMascotaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de nacimiento:");

        btnSalir.setBackground(new java.awt.Color(0, 153, 204));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Volver");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblAgendarVacuna.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAgendarVacuna.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna.setText("Formulario para agregar un nuevo paciente");

        lblAgendarVacuna3.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblAgendarVacuna3.setForeground(new java.awt.Color(204, 204, 204));
        lblAgendarVacuna3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna3.setText("Puede buscar una fecha en el icono de calendario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgendarVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgendarVacuna3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEspecie, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRaza, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtColorPelo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodCteMasco, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblAgendarVacuna)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtColorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodCteMasco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addComponent(lblAgendarVacuna3)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMascotaActionPerformed

    private void btnGuardarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPacienteActionPerformed
        //variables auxiliares
        String nombreMascota = txtNombreMascota.getText();
        String especie = txtEspecie.getText();
        String raza = txtRaza.getText();
        String colorPelo = txtColorPelo.getText();
        String fechaNac = txtFechaNacimiento.getText();
        String codClienteStr = txtCodCteMasco.getText();

        if (nombreMascota.isEmpty() || especie.isEmpty() || raza.isEmpty() || colorPelo.isEmpty() || fechaNac.isEmpty() || codClienteStr.isEmpty()) {
            DialogUtils.mostrarMensaje("Todos los datos son obligatorios", "Error", "Error");
        } else {
            int codCliente = Integer.parseInt(codClienteStr);
            control.guardarPaciente(nombreMascota, especie, raza, colorPelo, fechaNac, codCliente);

            this.dispose();

            PacientesDatosView pctDatos = new PacientesDatosView();
            pctDatos.setVisible(true);
            pctDatos.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnGuardarPacienteActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtColorPelo.setText("");
        txtEspecie.setText("");
        txtFechaNacimiento.setText("");
        txtNombreMascota.setText("");
        txtRaza.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void dateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooserPropertyChange
        dateChooser.addPropertyChangeListener("date", (PropertyChangeEvent evt1) -> {
            if ("date".equals(evt1.getPropertyName())) {
                Date selectedDate = dateChooser.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Formato de fecha deseado
                String formattedDate = dateFormat.format(selectedDate);
                txtFechaNacimiento.setText(formattedDate);
            }
        });
    }//GEN-LAST:event_dateChooserPropertyChange

    private void txtCodCteMascoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCteMascoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodCteMascoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarPaciente;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgendarVacuna;
    private javax.swing.JLabel lblAgendarVacuna3;
    private javax.swing.JTextField txtCodCteMasco;
    private javax.swing.JTextField txtColorPelo;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

}
