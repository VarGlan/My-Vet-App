/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.veterinariajpa.igu.historial;

import com.mycompany.veterinariajpa.logica.Controladora;
import com.mycompany.veterinariajpa.logica.Pacientes;
import com.mycompany.veterinariajpa.logica.utilidades.DialogUtils;
import java.beans.PropertyChangeEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VarGl
 */
public class AgregarHistorial extends javax.swing.JFrame {

    Controladora control = null;
    public AgregarHistorial() {
        control = new Controladora();
        initComponents();
        cargarPacientes();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSeleccionar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblAgendarVacuna5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de pacientes para agregar un nuevo historial");

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        btnSeleccionar.setBackground(new java.awt.Color(0, 153, 204));
        btnSeleccionar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionar.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\seleccione.png")); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setBorder(null);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 153, 204));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\salida3.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSeleccionar)
                .addComponent(btnSalir))
        );

        lblAgendarVacuna5.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblAgendarVacuna5.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAgendarVacuna5.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\atencion.png")); // NOI18N
        lblAgendarVacuna5.setText("Seleccione el paciente para agregarlo");

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tablaPacientes.setBackground(java.awt.Color.lightGray);
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPacientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgendarVacuna5, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAgendarVacuna5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
       if (tablaPacientes.getRowCount() > 0){
           if(tablaPacientes.getSelectedRow() != -1){
               int codigoMascota = Integer.parseInt(String.valueOf(tablaPacientes.getValueAt(tablaPacientes.getSelectedRow(), 0)));
               
               NuevoHistorial historial = new NuevoHistorial(codigoMascota);
               historial.setVisible(true);
               historial.setLocationRelativeTo(null);
               
               this.dispose();
           } else{
               DialogUtils.mostrarMensaje("No se ha seleccionado ningun registro", "Error", "Error al seleccionar");
           }
       } else {
           DialogUtils.mostrarMensaje("No hay nada para seleccionar en la tabla", "Error", "Error al seleccionar");
       }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void cargarPacientes() {
    // Creamos un modelo de tabla personalizado donde las celdas no son editables
    DefaultTableModel mdTablaPctes = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    // Definimos los títulos de las columnas de la tabla
    String titulos[] = {"Codigo", "Alias (Nombre)", "Especie", "Raza"};
    mdTablaPctes.setColumnIdentifiers(titulos);

    // Obtenemos una lista de objetos Pacientes a través del método traerPacientes de la clase controladora
    List<Pacientes> listaPacientes = control.traerPacientes();

    // Verificamos que la lista de pacientes no sea nula antes de continuar
    if (listaPacientes != null) {
        for (Pacientes paciente : listaPacientes) {
            // En cada iteración, creamos un arreglo de objetos para almacenar los datos de un paciente
            Object objeto [] = {
                paciente.getCodMascota(),
                paciente.getAliasMascota(),
                paciente.getEspecie(),
                paciente.getRaza()
            };
            // El orden de los elementos en el arreglo coincide o debe coincidir con las columnas de la tabla

            // Agregamos la fila con los datos del paciente al modelo de la tabla
            mdTablaPctes.addRow(objeto);

            // Asignamos el modelo de la tabla a la variable de la tabla
            tablaPacientes.setModel(mdTablaPctes);
        }
    }
}
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgendarVacuna5;
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables

    
}
