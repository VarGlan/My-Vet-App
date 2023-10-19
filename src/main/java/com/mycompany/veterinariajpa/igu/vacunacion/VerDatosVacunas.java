
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.veterinariajpa.igu.vacunacion;

import com.mycompany.veterinariajpa.logica.Controladora;
import com.mycompany.veterinariajpa.logica.utilidades.DialogUtils;
import com.mycompany.veterinariajpa.logica.Vacunacion;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VarGl
 */
public class VerDatosVacunas extends javax.swing.JFrame {
    Controladora control = null;

    public VerDatosVacunas() {
        control = new Controladora();
        initComponents();
        cargarTabla(); //llamo al metodo para que la tabla se actualice cuando la pantalla se invoque
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblAgendarVacuna = new javax.swing.JLabel();
        lblAgendarVacuna1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnNuevaVacuna = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblAgendarVacuna3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVacunas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        lblAgendarVacuna.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblAgendarVacuna.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna.setText("Lista de vacunaciones");

        lblAgendarVacuna1.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna1.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lblAgendarVacuna1.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna1.setText("Nuevas vacunas, edición, modificación y eliminación");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgendarVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAgendarVacuna1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblAgendarVacuna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAgendarVacuna1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));

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

        btnNuevaVacuna.setBackground(new java.awt.Color(0, 153, 204));
        btnNuevaVacuna.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevaVacuna.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaVacuna.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\vacuna (3).png")); // NOI18N
        btnNuevaVacuna.setText("Nueva vacuna");
        btnNuevaVacuna.setBorder(null);
        btnNuevaVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVacunaActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 153, 204));
        btnEditar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\editar-codigo.png")); // NOI18N
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
        btnEliminar.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\boton-eliminar.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnNuevaVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevaVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        lblAgendarVacuna3.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblAgendarVacuna3.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna3.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\atencion.png")); // NOI18N
        lblAgendarVacuna3.setText("Para editar o eliminar una vacuna, seleccione un item");

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        tablaVacunas.setBackground(java.awt.Color.lightGray);
        tablaVacunas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaVacunas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblAgendarVacuna3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAgendarVacuna3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       cargarTabla();
       //se ejecuta cuando la ventana se abre
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //se evalua si hay filas para seleccionar
        if(tablaVacunas.getRowCount() > 0){
            //se evalua si hay una fila seleccionada
            if(tablaVacunas.getSelectedRow() != -1){ 
                //se obtiene el valor de la fila seleccionada en la columna 0 y se le asigna a vacunacion convertido de string a entero.
                int vacunacionId = Integer.parseInt(String.valueOf(tablaVacunas.getValueAt(tablaVacunas.getSelectedRow(), 0)));
                control.borrarVacuna(vacunacionId);
                
                DialogUtils.mostrarMensaje("Registro eliminado", "Info", "Exito");
                cargarTabla();
            } else{
                DialogUtils.mostrarMensaje("No se ha seleccionado ningun registro", "Error", "Error");
            } 
        }else{
            DialogUtils.mostrarMensaje("No hay datos para seleccionar", "Error", "Error");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       if (tablaVacunas.getRowCount() > 0){
           if (tablaVacunas.getSelectedRow() != -1){
               int vacunacionId = Integer.parseInt(String.valueOf(tablaVacunas.getValueAt(tablaVacunas.getSelectedRow(), 0)));
               
               ModificarVacuna vacuna = new ModificarVacuna(vacunacionId);
               vacuna.setVisible(true);
               vacuna.setLocationRelativeTo(null);
               
               this.dispose();
           } else {
               DialogUtils.mostrarMensaje("No se ha seleccionado nigun registro", "Error", "Error");
           }
       } else{
           DialogUtils.mostrarMensaje("No hay datos para seleccionar", "Error", "Error");
       }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevaVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVacunaActionPerformed
        AgregarVacunas vacuna = new AgregarVacunas();
        vacuna.setVisible(true);
        vacuna.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btnNuevaVacunaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevaVacuna;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgendarVacuna;
    private javax.swing.JLabel lblAgendarVacuna1;
    private javax.swing.JLabel lblAgendarVacuna3;
    private javax.swing.JTable tablaVacunas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Definir el modelo de la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            //Metodo para hacer que la las filas y columnas no sean editables
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
         //establecer filas y columnas con un vector
        String titulos [] = {"Id de vacuna", "Paciente", "Codigo", "Enfermedad", "Fecha de vacunación"};
        //al modelo de la tabla se le establece el vector con los titulos
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Se crea una variable tipo lista que almacena objetos tipo vacunas y se llama al metodo de la controladora
        List<Vacunacion> listaVacunas = control.traerVacunaciones();
        
        //recorrer la lista de pacientes y verifica que no sea nula, osea, que haya datos antes de continuar
        if(listaVacunas != null){
            for(Vacunacion vacuna : listaVacunas){
                //en cada iteracion se crea un arreglo de objetos usado para almacenar los datos
                Object [] objeto = {vacuna.getVacunacionId(), vacuna.getMascota().getAliasMascota(), vacuna.getMascota().getCodMascota(), vacuna.getEnfermedadVacuna(), vacuna.getFechaVacunacion(), };
             
                //al modelo de la tabla se le asigna el objeto con las filas
                modeloTabla.addRow(objeto);
                
                //a la tabla(su variable) se le asigna el modelo de la tabla
                tablaVacunas.setModel(modeloTabla);
            }
        }
    }
}
