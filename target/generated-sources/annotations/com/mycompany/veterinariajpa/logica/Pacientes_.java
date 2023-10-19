package com.mycompany.veterinariajpa.logica;

import com.mycompany.veterinariajpa.logica.Clientes;
import com.mycompany.veterinariajpa.logica.Historial;
import com.mycompany.veterinariajpa.logica.Vacunacion;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-18T22:39:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pacientes.class)
public class Pacientes_ { 

    public static volatile SingularAttribute<Pacientes, String> aliasMascota;
    public static volatile SingularAttribute<Pacientes, String> especie;
    public static volatile SingularAttribute<Pacientes, Integer> codMascota;
    public static volatile SingularAttribute<Pacientes, Clientes> cliente;
    public static volatile SingularAttribute<Pacientes, String> raza;
    public static volatile ListAttribute<Pacientes, Vacunacion> vacunaciones;
    public static volatile SingularAttribute<Pacientes, String> fechaNacimiento;
    public static volatile ListAttribute<Pacientes, Historial> historial;
    public static volatile SingularAttribute<Pacientes, String> colorPelo;

}