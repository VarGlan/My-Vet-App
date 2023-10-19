/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinariajpa.persistencia;

import com.mycompany.veterinariajpa.logica.Clientes;
import com.mycompany.veterinariajpa.logica.Historial;
import com.mycompany.veterinariajpa.logica.Pacientes;
import com.mycompany.veterinariajpa.logica.Personas;
import com.mycompany.veterinariajpa.logica.Vacunacion;
import com.mycompany.veterinariajpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PacientesJpaController pactJpa = new PacientesJpaController();
    PersonaJpaController persoJpa = new PersonaJpaController();
    ClientesJpaController clieJpa = new ClientesJpaController();
    VacunacionJpaController vacuJpa = new VacunacionJpaController();
    HistorialJpaController histJpa = new HistorialJpaController();

    public void guardarClientes(Clientes cliente) {
        clieJpa.create(cliente);
    }

    //metodo que retorna una lista de tipo clientes
    public List<Clientes> traerClientes() {
        //metodo que busca todos los registros de la tabla y lo retorna a controladora de la logica
        return clieJpa.findClientesEntities();
    }

    public void borrarCliente(int codigoCliente) {
        //en caso de que no se pueda borrar manda una excepcion
        try {
            clieJpa.destroy(codigoCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Este metodo es diferente a traerClientes, este lo trae en la vista de modificar
    public Clientes traerCliente(int codigoCliente) {
        return clieJpa.findClientes(codigoCliente);
    }
    
    public void modificarCliente(Clientes cliente) {
        try {
            clieJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Metodos de persistencia para pacientes
    public void guardarPaciente(Pacientes paciente) {
        pactJpa.create(paciente);
    }

    public List<Pacientes> traerPacientes() {
        return pactJpa.findPacientesEntities();
    }

    public void borrarPacientes(int codigoMascota) {
        try {
            pactJpa.destroy(codigoMascota);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //retornamos el codigo que haya encontrado
    public Pacientes traerPaciente(int codigoMascota) {
        return pactJpa.findPacientes(codigoMascota);
    }

    public void modificarPaciente(Pacientes paciente) {
        try {
            pactJpa.edit(paciente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Vacunacion> traerVacunas() {
        return vacuJpa.findVacunacionEntities();
    }

    public void guardarVacuna(Vacunacion vacuna) {
      vacuJpa.create(vacuna);
    }

    public void borrarVacuna(int vacunacionId) {
        try {
            vacuJpa.destroy(vacunacionId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void modificarVacuna(Vacunacion vacuna) {
        try {
            vacuJpa.edit(vacuna);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Vacunacion traerVacuna(int vacunacionId) {
        return vacuJpa.findVacunacion(vacunacionId);
    }

    public void guardarHistorial(Historial historial) {
        histJpa.create(historial);
    }

    public List<Historial> getAllHistories() {
        return histJpa.findHistorialEntities();
    }

    public void borrarHistorial(int codigo) {
        try {
            histJpa.destroy(codigo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarPersonas(Personas persona) {
        persoJpa.create(persona);
    }

    public List<Personas> traerPersonas() {
        return persoJpa.findPersonaEntities();
    }




    

}
