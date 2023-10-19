/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.veterinariajpa.igu.views;

import com.mycompany.veterinariajpa.logica.Controladora;
import com.mycompany.veterinariajpa.logica.utilidades.DialogUtils;
import com.mycompany.veterinariajpa.logica.Pacientes;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PacientesDatosView extends javax.swing.JFrame {

    Controladora control = null;

    public PacientesDatosView() {
        control = new Controladora();
        initComponents();
        cargarTablaPctes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAgendarVacuna = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNuevoPaciente = new javax.swing.JButton();
        lblAgendarVacuna3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        lblAgendarVacuna.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblAgendarVacuna.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna.setText("Vista, edición, creación y eliminación de pacientes");

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        btnSalir.setBackground(new java.awt.Color(0, 153, 204));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\puerta-de-salida.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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

        btnNuevoPaciente.setBackground(new java.awt.Color(0, 153, 204));
        btnNuevoPaciente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevoPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoPaciente.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\agregar-producto.png")); // NOI18N
        btnNuevoPaciente.setText("Nuevo paciente");
        btnNuevoPaciente.setBorder(null);
        btnNuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPacienteActionPerformed(evt);
            }
        });

        lblAgendarVacuna3.setBackground(new java.awt.Color(0, 0, 0));
        lblAgendarVacuna3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblAgendarVacuna3.setForeground(new java.awt.Color(255, 255, 255));
        lblAgendarVacuna3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarVacuna3.setIcon(new javax.swing.ImageIcon("E:\\NetBeansProjects\\icons\\atencion.png")); // NOI18N
        lblAgendarVacuna3.setText("Para editar o eliminar un dato de paciente, seleccione un item");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgendarVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblAgendarVacuna3))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnNuevoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblAgendarVacuna)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnNuevoPaciente)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar))
                .addGap(32, 32, 32)
                .addComponent(lblAgendarVacuna3)
                .addContainerGap(21, Short.MAX_VALUE))
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
        cargarTablaPctes();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         //Ver que la tabla no esté vacia, si hay mas de 0 filas hay registros
        if (tablaPacientes.getRowCount() > 0) {
            //Trae la fila seleccionada, si es igual a -1 no hay niguna seleccionada
            if (tablaPacientes.getSelectedRow() != -1) {
                //recupera y asigna en codigo cliente el valor de la tabla pacientes que este ubicado en la col 0 de la fila seleccionada
                int codigoMascota = Integer.parseInt(String.valueOf(tablaPacientes.getValueAt(tablaPacientes.getSelectedRow(), 0)));

                PacientesModificarView pantallaModif = new PacientesModificarView(codigoMascota);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                this.dispose();
                
            } else {
                DialogUtils.mostrarMensaje("No se seleccionó ningun cliente", "error", "Error al eliminar");
            }
    }//GEN-LAST:event_btnEditarActionPerformed
        else {
            DialogUtils.mostrarMensaje("No hay nada para eliminar en la tabla", "error", "Error al eliminar");
        }
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Ver que la tabla no esté vacia, si hay mas de 0 filas hay registros
        if (tablaPacientes.getRowCount() > 0) {
            //Trae la fila seleccionada, si es igual a -1 no hay niguna seleccionada
            if (tablaPacientes.getSelectedRow() != -1) {
                //recupera y asigna en codigo mascota el valor de la tabla pacientes que este ubicado en la col 0 de la fila seleccionada
                int codigoMascota = Integer.parseInt(String.valueOf(tablaPacientes.getValueAt(tablaPacientes.getSelectedRow(), 0)));
                control.borrarPaciente(codigoMascota);

                DialogUtils.mostrarMensaje("Paciente eliminado correctamente", "Info", "Eliminar");
                cargarTablaPctes();
            } else {
                DialogUtils.mostrarMensaje("No se seleccionó ningun cliente", "error", "Error al eliminar");
            }
        } else {
            DialogUtils.mostrarMensaje("No hay nada para eliminar en la tabla", "error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPacienteActionPerformed
        PacientesAgregarView visPacte = new PacientesAgregarView();
        visPacte.setVisible(true);
        visPacte.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnNuevoPacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevoPaciente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgendarVacuna;
    private javax.swing.JLabel lblAgendarVacuna3;
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaPctes() {
        DefaultTableModel mdTablaPctes = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //establecer filas y columnas con un vector
        String titulos[] = {"Codigo", "Alias(Nombre)", "Color de pelo", "Especie", "Raza", "Fecha de Nacimiento", "Codigo cliente"};
        mdTablaPctes.setColumnIdentifiers(titulos);

        //Se crea una variable tipo lista que almacena objetos tipo pacientes y se llama al metodo de la controladora
        List<Pacientes> listaPacientes = control.traerPacientes();

        //recorrer la lista de pacientes y verifica que no sea nula, osea, que haya datos antes de continuar
        if (listaPacientes != null) {
            for (Pacientes paciente : listaPacientes) {
                //en cada iteracion se crea un arreglo de objetos usado     para almacenar los datos
                Object[] objeto = {paciente.getCodMascota(), paciente.getAliasMascota(),
                    paciente.getColorPelo(), paciente.getEspecie(), paciente.getRaza(),
                    paciente.getFechaNacimiento(), paciente.getCliente().getCodigoCliente()};
                //el orden debe coincidir con los de la tabla
                //paciente.getCliente().getCodigoCliente()}; establece que del cliente asociado al  paciente traemos su codigo

                //a la tabla que creamos le asignamos las filas con el objeto que creamos
                mdTablaPctes.addRow(objeto);

                //asignamos el modelo de la tabla a la variable de la tabla
                tablaPacientes.setModel(mdTablaPctes);
            }
        }

    }
}
