/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.veterinariajpa.igu.views;

import com.mycompany.veterinariajpa.logica.Clientes;
import com.mycompany.veterinariajpa.logica.Controladora;
import com.mycompany.veterinariajpa.logica.utilidades.DialogUtils;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VarGl
 */
public class ClienteDatosView extends javax.swing.JFrame {

    Controladora control = new Controladora();

    public ClienteDatosView() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        lblAgendarVacuna = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        lblAgendarVacuna3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        tablaClientes.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        tablaClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaClientes.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lblAgendarVacuna.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAgendarVacuna.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna.setText("Vista, creación, edición y eliminacion de clientes");

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        btnSalir.setBackground(new java.awt.Color(0, 153, 204));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\32\\salida3.png")); // NOI18N
        btnSalir.setText("Volver");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 153, 204));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\24\\boton-eliminar.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 153, 204));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\24\\editar-codigo.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevoCliente.setBackground(new java.awt.Color(0, 153, 204));
        btnNuevoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoCliente.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\24\\agregar-producto.png")); // NOI18N
        btnNuevoCliente.setText("Nuevo cliente");
        btnNuevoCliente.setBorder(null);
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevoCliente)
                    .addComponent(btnEditar))
                .addContainerGap())
        );

        lblAgendarVacuna3.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblAgendarVacuna3.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna3.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\24\\bombilla.png")); // NOI18N
        lblAgendarVacuna3.setText("Para editar o eliminar un cliente, seleccione un item");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgendarVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgendarVacuna3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblAgendarVacuna)
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblAgendarVacuna3)
                .addGap(22, 22, 22))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tablaClientes.getRowCount() > 0) { //usamos el metodo getrowcount para contar las filas que hay
            if (tablaClientes.getSelectedRow() != -1) { //usamos el metodo getselectedrow para conocer la fila seleccionada

                //recupera la fila seleccionada de la columna 0, convierte a String y luego a int para guardarlo en la variable
                int codigoCliente = Integer.parseInt(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0)));
                ClienteModificarView pantallaModif = new ClienteModificarView(codigoCliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                this.dispose();

                
            } else {
                DialogUtils.mostrarMensaje("No se seleccionó ningun cliente", "error", "Error al eliminar");
            }
        } else {
            DialogUtils.mostrarMensaje("No hay nada para eliminar en la tabla", "error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    //cuando hacemos click en eliminar obtiene el valor del id
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //si hay mas de 0 filas hay al menos un registro y si en la seleccion el resultado es distinto a    -1 es porque
        //no hay nada seleccionado (arranca en 0)
        if (tablaClientes.getRowCount() > 0) { //usamos el metodo getrowcount para contar las filas que hay
            if (tablaClientes.getSelectedRow() != -1) { //usamos el metodo getselectedrow para conocer la fila seleccionada

                //recupera la fila seleccionada de la columna 0, convierte a String y luego a int para guardarlo en la variable
                int codigoCliente = Integer.parseInt(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0)));
                control.borrarCliente(codigoCliente);

                DialogUtils.mostrarMensaje("Cliente eliminado correctamente", "Info", "Borrado de cliente");
                cargarTabla();
            } else {
                DialogUtils.mostrarMensaje("No se seleccionó ningun cliente", "error", "Error al eliminar");
            }
        } else {
            DialogUtils.mostrarMensaje("No hay nada para eliminar en la tabla", "error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        ClienteAgregarView pantaCliente = new ClienteAgregarView();
        pantaCliente.setVisible(true);
        pantaCliente.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnNuevoClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgendarVacuna;
    private javax.swing.JLabel lblAgendarVacuna3;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Definir el modelo de la tabla
        //Esta clase permite establecer el modelo de una tabla (agregar campos)
        //se abren llaves para agregar parametros
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            //funcion para que las filas y columnas no sean editables
            // el metodo isCellEditable debe anotarse como sobreescrito porque es un metodo privado de DefaultTableModel
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //establecemos los nombres de las columnas con un vector
        String titulos[] = {"Codigo", "Apellido cabeza familia", "Numero cuenta bancaria", "Direccion", "Telefono"};
        //colocamos los identificadores de las columnas pasandole el vector
        modeloTabla.setColumnIdentifiers(titulos);

        //carga de los datos desde la base de datos
        //llamamos a un metodo para traer datos desde la logica
        //guardamos los clientes dentro de una lista
        List<Clientes> listaClientes = control.traerClientes();

        //recorrer la lista y mostrar cada uno de los elementos de la tabla
        //con un foreach recorremos cada cliente de la lista de los clientes y creamos un arreglo de objetos
        if (listaClientes != null) {
            for (Clientes cliente : listaClientes) {
                Object[] objeto = {cliente.getCodigoCliente(), cliente.getApellidoFamilia(),
                    cliente.getNumeroCuentaBancaria(), cliente.getDireccion(), cliente.getTelefono()};

                //a la tabla que creamos le asignamos las filas con el objeto que creamos
                modeloTabla.addRow(objeto);
            }
        }
        //asignamos el modelo de la tabla a la variable de la tabla 
        tablaClientes.setModel(modeloTabla);

    }

    //Esto permitirá salir del JFrame actual sin cerrar la aplicación por completo.
    private void salir() {
        this.dispose();
    }
}
