package com.mycompany.veterinariajpa.logica;

import com.mycompany.veterinariajpa.logica.Pacientes;
import com.mycompany.veterinariajpa.logica.Personas;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-18T22:39:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> numeroCuentaBancaria;
    public static volatile ListAttribute<Clientes, Pacientes> paciente;
    public static volatile SingularAttribute<Clientes, Integer> codigoCliente;
    public static volatile SingularAttribute<Clientes, String> direccion;
    public static volatile SingularAttribute<Clientes, String> apellidoFamilia;
    public static volatile SingularAttribute<Clientes, String> telefono;
    public static volatile ListAttribute<Clientes, Personas> personas;

}