/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinariajpa.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Historial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int historialId;
    private String enfermedad;
    private String fechaEnfermedad;
    
    @ManyToOne
    private Pacientes mascota;

    public Historial() {
    }

    public Historial(int historialId, String enfermedad, String fechaEnfermedad, Pacientes mascota) {
        this.historialId = historialId;
        this.enfermedad = enfermedad;
        this.fechaEnfermedad = fechaEnfermedad;
        this.mascota = mascota;
    }

    public int getHistorialId() {
        return historialId;
    }

    public void setHistorialId(int historialId) {
        this.historialId = historialId;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getFechaEnfermedad() {
        return fechaEnfermedad;
    }

    public void setFechaEnfermedad(String fechaEnfermedad) {
        this.fechaEnfermedad = fechaEnfermedad;
    }

    public Pacientes getMascota() {
        return mascota;
    }

    public void setMascota(Pacientes mascota) {
        this.mascota = mascota;
    }
    
    

    
    

    
    
}