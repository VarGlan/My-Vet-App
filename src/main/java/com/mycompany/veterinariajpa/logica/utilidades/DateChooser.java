/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinariajpa.logica.utilidades;

import com.toedter.calendar.JDateChooser;
import java.beans.PropertyChangeEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author VarGl
 */
public class DateChooser {
    public static void seleccionarFecha(JDateChooser dateChooser, JTextField textField) {
        dateChooser.addPropertyChangeListener("date", (PropertyChangeEvent evt) -> {
            if ("date".equals(evt.getPropertyName())) {
                Date selectedDate = dateChooser.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                String formattedDate = dateFormat.format(selectedDate);
                textField.setText(formattedDate);
            }
        });
    }
}
