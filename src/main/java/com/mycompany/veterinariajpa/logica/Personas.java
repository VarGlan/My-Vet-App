/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinariajpa.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Personas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idPersona;
    private String NombrePersona;
    private String CedulaPersona;

    //clase dueña de la relacion
    @ManyToMany
    @JoinTable(
            name = "Clientes_Personas",
            joinColumns = @JoinColumn(name = "idPersona"), // Esto debe coincidir con el nombre del campo en la clase Clientes
            inverseJoinColumns = @JoinColumn(name = "codigoCliente") // Esto debe coincidir con el nombre del campo en la clase Personas
    )
    private List <Clientes> cliente;

    public Personas() {
        this.cliente = new ArrayList<>();
    }

    public Personas(int idPersona, String NombrePersona, String CedulaPersona, List<Clientes> cliente) {
        this.idPersona = idPersona;
        this.NombrePersona = NombrePersona;
        this.CedulaPersona = CedulaPersona;
        this.cliente = cliente;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return NombrePersona;
    }

    public void setNombrePersona(String NombrePersona) {
        this.NombrePersona = NombrePersona;
    }

    public String getCedulaPersona() {
        return CedulaPersona;
    }

    public void setCedulaPersona(String CedulaPersona) {
        this.CedulaPersona = CedulaPersona;
    }

    public List<Clientes> getCliente() {
        return cliente;
    }

    public void setCliente(List<Clientes> cliente) {
        this.cliente = cliente;
    }

    

}
