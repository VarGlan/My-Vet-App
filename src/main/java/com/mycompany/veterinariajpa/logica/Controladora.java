/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinariajpa.logica;

//import static com.mycompany.veterinariajpa.logica.Vacunacion_.mascota;
import com.mycompany.veterinariajpa.logica.utilidades.DialogUtils;
import com.mycompany.veterinariajpa.persistencia.ControladoraPersistencia;
import java.util.HashSet;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Metodos para crud de clientes 
    public void guardarClientes(String apellidoFamVp, String numCtaBancaVp, String direccionVp, String numTelVp) {
        Clientes cliente = new Clientes();
        cliente.setApellidoFamilia(apellidoFamVp);
        cliente.setNumeroCuentaBancaria(numCtaBancaVp);
        cliente.setDireccion(direccionVp);
        cliente.setTelefono(numTelVp);

        controlPersis.guardarClientes(cliente);
    }

    public List<Clientes> traerClientes() {
        //recibe un metodo que tiene una lista y lo retorna a vista datos y lo guarda en lista clientes
        return controlPersis.traerClientes();
    }

    public void borrarCliente(int codigoCliente) {
        controlPersis.borrarCliente(codigoCliente);
    }

    public Clientes traerCliente(int codigoCliente) {
        return controlPersis.traerCliente(codigoCliente);
    }
    
    public void modificarCliente(Clientes cliente, String apFamilia, String cuenta, String direccion, String telefono) {
        cliente.setApellidoFamilia(apFamilia);
        cliente.setNumeroCuentaBancaria(cuenta);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        
        controlPersis.modificarCliente(cliente);

    }
    

    //Metodos para crud de pacientes
    public void guardarPaciente(String nombreMascota, String especie,
            String raza, String colorPelo, String fechaNac, int codCliente) {
        Clientes cliente = traerCliente(codCliente);

        if (cliente != null) {
            Pacientes paciente = new Pacientes();
            paciente.setAliasMascota(nombreMascota);
            paciente.setEspecie(especie);
            paciente.setRaza(raza);
            paciente.setColorPelo(colorPelo);
            paciente.setFechaNacimiento(fechaNac);
            paciente.setCliente(cliente);

            controlPersis.guardarPaciente(paciente);

            DialogUtils.mostrarMensaje("Guardado Exitoso", "Info", "Exito");
        } else {
            DialogUtils.mostrarMensaje("El cliente no existe", "Error", "Error");
        }
    }

    public List<Pacientes> traerPacientes() {
        return controlPersis.traerPacientes();
    }

    public void borrarPaciente(int codigoMascota) {
        controlPersis.borrarPacientes(codigoMascota);
    }

    //llama la fucion de la controladora de la persistencia
    public Pacientes traerPaciente(int codigoMascota) {
        return controlPersis.traerPaciente(codigoMascota);
    }

    public void modificarPaciente(Pacientes paciente, String nombre, String especie, String raza, String color, String fechaNac) {
        paciente.setAliasMascota(nombre);
        paciente.setEspecie(especie);
        paciente.setRaza(raza);
        paciente.setColorPelo(color);
        paciente.setFechaNacimiento(fechaNac);
        
        controlPersis.modificarPaciente(paciente);
        
       // Clientes cliente = this.buscarCliente(paciente.getCliente().getCodigoCliente());
    }

    /*
    //metodo para buscar dueño, hay que retornarlo en la persistencia
    private Clientes buscarCliente(int codigoCliente) {
        return controlPersis.traerCliente(codigoCliente);
    } */
    

    public void guardarVacunas(String nombre, int codigo, String enfermedad, String fechaVacuna) {
        Pacientes mascota = traerPaciente(codigo);

           Vacunacion vacuna = new Vacunacion();
           vacuna.setMascota(mascota);
           vacuna.setEnfermedadVacuna(enfermedad);
           vacuna.setFechaVacunacion(fechaVacuna);
           
           controlPersis.guardarVacuna(vacuna);
    }

    public void borrarVacuna(int vacunacionId) {
        controlPersis.borrarVacuna(vacunacionId);
    }
    
    public List<Vacunacion> traerVacunaciones() {
      return controlPersis.traerVacunas();
    }

    public Vacunacion traerVacunacion(int vacunacionId) {
        return controlPersis.traerVacuna(vacunacionId);
    }

    public void modificarVacuna(Vacunacion vacuna, String codigo, String nombre, String enfermedad, String fecha) {
        vacuna.setEnfermedadVacuna(enfermedad);
        vacuna.setFechaVacunacion(fecha);
        
        controlPersis.modificarVacuna(vacuna);
    }
    
    
    //---------------------------------Historial---------------------------------

    public void guardarHistorial(String nombre, int codigo, String enfermedad, String fechaEnfermedad) {
        Pacientes mascota = traerPaciente(codigo);
        
        Historial historial = new Historial();
        historial.setMascota(mascota);
        historial.setEnfermedad(enfermedad);
        historial.setFechaEnfermedad(fechaEnfermedad);
        
        controlPersis.guardarHistorial(historial);
    }

    public List<Historial> traerHistorialAll() {
        return controlPersis.getAllHistories();
    }

    public void borrarHistorial(int codigo) {
        controlPersis.borrarHistorial(codigo);
    }

    public void guardarPersonas(String nombrePersona, String cedulaPersona, int codigoCliente, String apellidoCliente) {
        Clientes cliente = traerCliente(codigoCliente);
        
        Personas persona = new Personas();
        persona.getCliente().add(cliente);
        persona.setNombrePersona(nombrePersona);
        persona.setCedulaPersona(nombrePersona);
        
        controlPersis.guardarPersonas(persona);
    }

    public List<Personas> traerPersonas() {
        return controlPersis.traerPersonas();
    }
    
    

    
    
    
    

    
}
//