package com.mycompany.veterinariajpa.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pacientes implements Serializable {

    //mapeo de clase mascota como entidad
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //generar de forma automatica el valor y una estrategia de generacion secuencial.
    private int codMascota;
    private String aliasMascota;
    private String especie;
    private String raza;
    private String colorPelo;
    private String fechaNacimiento;

    //las anotations van arriba de lo que se quiere mapear
    //anotation relacion uno a uno
    @ManyToOne
    private Clientes cliente;
    
    @OneToMany (mappedBy = "mascota", cascade = CascadeType.ALL)
    private List <Historial> historial;
    
    @OneToMany(mappedBy="mascota", cascade = CascadeType.ALL)   
    private List<Vacunacion> vacunaciones;

    public Pacientes() {
    }

    public Pacientes(int codMascota, String aliasMascota, String especie, String raza, String colorPelo, String fechaNacimiento, Clientes cliente, List<Historial> historial, List<Vacunacion> vacunaciones) {
        this.codMascota = codMascota;
        this.aliasMascota = aliasMascota;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.cliente = cliente;
        this.historial = historial;
        this.vacunaciones = vacunaciones;
    }

    public int getCodMascota() {
        return codMascota;
    }

    public void setCodMascota(int codMascota) {
        this.codMascota = codMascota;
    }

    public String getAliasMascota() {
        return aliasMascota;
    }

    public void setAliasMascota(String aliasMascota) {
        this.aliasMascota = aliasMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<Historial> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Historial> historial) {
        this.historial = historial;
    }

    public List<Vacunacion> getVacunaciones() {
        return vacunaciones;
    }

    public void setVacunaciones(List<Vacunacion> vacunaciones) {
        this.vacunaciones = vacunaciones;
    }
    
    
    
    
    

}
