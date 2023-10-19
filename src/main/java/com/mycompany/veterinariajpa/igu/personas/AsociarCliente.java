/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.veterinariajpa.igu.personas;

import com.mycompany.veterinariajpa.logica.Clientes;
import com.mycompany.veterinariajpa.logica.Controladora;
import com.mycompany.veterinariajpa.logica.utilidades.DialogUtils;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class AsociarCliente extends javax.swing.JFrame {

    Controladora control = null;

    public AsociarCliente() {
        control = new Controladora();
        initComponents();
        cargarClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tablaClientes.setBackground(java.awt.Color.lightGray);
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Elige un cliente para asociar a una persona");

        btnSalir.setBackground(new java.awt.Color(0, 153, 204));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnSeleccionar.setBackground(new java.awt.Color(0, 153, 204));
        btnSeleccionar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setBorder(null);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionar)
                    .addComponent(btnSalir))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(141, Short.MAX_VALUE)))
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

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
       if(tablaClientes.getRowCount() > 0){
           if (tablaClientes.getSelectedRow() != -1){
               int codigoCliente = Integer.parseInt(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0)));
               
               NewPersona pantalla = new NewPersona(codigoCliente);
               pantalla.setVisible(true);
               pantalla.setLocationRelativeTo(null);
               
               this.dispose();
           } else{
               DialogUtils.mostrarMensaje("No se seleccionó ningun registro", "error", "Error al eliminar");
           }
       } else{
           DialogUtils.mostrarMensaje("No hay nada para seleccionar", "error", "Error al eliminar");
       }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void cargarClientes(){
        DefaultTableModel mdtablaClientes = new DefaultTableModel(){
          @Override
          public boolean isCellEditable(int row, int column){
              return false;
          } 
        };
        
        String [] titulos = {"Codigo del cliente", "Apellido de cabeza de familia", "Numero de telefono"};
        mdtablaClientes.setColumnIdentifiers(titulos);
        
        List <Clientes> listaClientes = control.traerClientes();
        
        if (listaClientes != null){
            for (Clientes cliente : listaClientes){
                Object [] objeto = {
                    cliente.getCodigoCliente(),
                    cliente.getApellidoFamilia(),
                    cliente.getTelefono()
                };
                
                mdtablaClientes.addRow(objeto);
                
                tablaClientes.setModel(mdtablaClientes);
                
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
