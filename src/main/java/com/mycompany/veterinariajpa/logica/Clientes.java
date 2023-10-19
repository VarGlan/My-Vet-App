package com.mycompany.veterinariajpa.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Clientes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigoCliente;
    private String apellidoFamilia;
    private String numeroCuentaBancaria;
    private String direccion;
    private String telefono;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pacientes> paciente;
    
    @ManyToMany(mappedBy = "cliente")
    private List <Personas> persona;

    public Clientes() {
    }

    public Clientes(int codigoCliente, String apellidoFamilia, String numeroCuentaBancaria, String direccion, String telefono, List<Pacientes> paciente, List<Personas> persona) {
        this.codigoCliente = codigoCliente;
        this.apellidoFamilia = apellidoFamilia;
        this.numeroCuentaBancaria = numeroCuentaBancaria;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paciente = paciente;
        this.persona = persona;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getApellidoFamilia() {
        return apellidoFamilia;
    }

    public void setApellidoFamilia(String apellidoFamilia) {
        this.apellidoFamilia = apellidoFamilia;
    }

    public String getNumeroCuentaBancaria() {
        return numeroCuentaBancaria;
    }

    public void setNumeroCuentaBancaria(String numeroCuentaBancaria) {
        this.numeroCuentaBancaria = numeroCuentaBancaria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Pacientes> getPaciente() {
        return paciente;
    }

    public void setPaciente(List<Pacientes> paciente) {
        this.paciente = paciente;
    }

    public List<Personas> getPersona() {
        return persona;
    }

    public void setPersona(List<Personas> persona) {
        this.persona = persona;
    }

    
}
