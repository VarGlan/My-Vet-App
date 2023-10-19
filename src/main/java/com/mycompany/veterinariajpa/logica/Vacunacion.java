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
public class Vacunacion implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int vacunacionId;
    private String fechaVacunacion;
    private String enfermedadVacuna;
    
    @ManyToOne
    private Pacientes mascota;

    public Pacientes getMascota() {
        return mascota;
    }

    public void setMascota(Pacientes mascota) {
        this.mascota = mascota;
    }

    public Vacunacion() {
    }

    public Vacunacion(int vacunacionId, String fechaVacunacion, String enfermedadVacuna) {
        this.vacunacionId = vacunacionId;
        this.fechaVacunacion = fechaVacunacion;
        this.enfermedadVacuna = enfermedadVacuna;
    }

    public int getVacunacionId() {
        return vacunacionId;
    }

    public void setVacunacionId(int vacunacionId) {
        this.vacunacionId = vacunacionId;
    }

    public String getFechaVacunacion() {
        return fechaVacunacion;
    }

    public void setFechaVacunacion(String fechaVacunacion) {
        this.fechaVacunacion = fechaVacunacion;
    }

    public String getEnfermedadVacuna() {
        return enfermedadVacuna;
    }

    public void setEnfermedadVacuna(String enfermedadVacuna) {
        this.enfermedadVacuna = enfermedadVacuna;
    }
    
    
}
