/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.veterinariajpa.igu.historial;

import com.mycompany.veterinariajpa.igu.vacunacion.AgregarVacunas;
import com.mycompany.veterinariajpa.igu.vacunacion.ModificarVacuna;
import com.mycompany.veterinariajpa.logica.Controladora;
import com.mycompany.veterinariajpa.logica.Historial;
import com.mycompany.veterinariajpa.logica.Pacientes;
import com.mycompany.veterinariajpa.logica.utilidades.DialogUtils;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VarGl
 */
public class VerDatosHistorial extends javax.swing.JFrame {

    Controladora control = null;

    public VerDatosHistorial() {
        control = new Controladora();
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblAgendarVacuna = new javax.swing.JLabel();
        lblAgendarVacuna1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnNuevaVacuna = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblAgendarVacuna3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        lblAgendarVacuna.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblAgendarVacuna.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna.setText("Historial de cada paciente");

        lblAgendarVacuna1.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lblAgendarVacuna1.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna1.setText("Agregar historial, edición, modificación y eliminación");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgendarVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAgendarVacuna1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblAgendarVacuna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAgendarVacuna1)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));

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

        btnNuevaVacuna.setBackground(new java.awt.Color(0, 153, 204));
        btnNuevaVacuna.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevaVacuna.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaVacuna.setText("Nuevo registro");
        btnNuevaVacuna.setBorder(null);
        btnNuevaVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVacunaActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 153, 204));
        btnEditar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 153, 204));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnNuevaVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevaVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        lblAgendarVacuna3.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblAgendarVacuna3.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna3.setText("Para editar o eliminar una registro, seleccione un item");

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tablaHistorial.setBackground(java.awt.Color.lightGray);
        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaHistorial);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblAgendarVacuna3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAgendarVacuna3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnNuevaVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVacunaActionPerformed
        AgregarHistorial pantallaAh = new AgregarHistorial();
        pantallaAh.setVisible(true);
        pantallaAh.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btnNuevaVacunaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tablaHistorial.getRowCount() > 0){
            if(tablaHistorial.getSelectedRow() != -1){
                int codigo = Integer.parseInt(String.valueOf(tablaHistorial.getValueAt(tablaHistorial.getSelectedRow(), 0)));
                
                control.borrarHistorial(codigo);
                cargarTabla();
                
                DialogUtils.mostrarMensaje("Registro eliminado", "Info", "Exito");
            } else{
                DialogUtils.mostrarMensaje("No se ha seleccionado nigun registro", "Error", "Error");
            }
        } else{
            DialogUtils.mostrarMensaje("No hay nada para seleccionar", "Error", "Error");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cargarTabla() {
        DefaultTableModel mdtHistory = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"Id de historial", "Nombre paciente", "Codigo", "Enfermedad", "Fecha enfermó"};
        mdtHistory.setColumnIdentifiers(titulos);

        List<Historial> listaHistorial = control.traerHistorialAll();

        if (listaHistorial != null) {
            for (Historial historial : listaHistorial) {
                Object objeto[] = {
                    historial.getHistorialId(),
                    historial.getMascota().getCodMascota(),
                    historial.getMascota().getAliasMascota(),
                    historial.getEnfermedad(),
                    historial.getFechaEnfermedad()
                };
                
                mdtHistory.addRow(objeto);
                
                tablaHistorial.setModel(mdtHistory);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevaVacuna;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgendarVacuna;
    private javax.swing.JLabel lblAgendarVacuna1;
    private javax.swing.JLabel lblAgendarVacuna3;
    private javax.swing.JTable tablaHistorial;
    // End of variables declaration//GEN-END:variables
}
