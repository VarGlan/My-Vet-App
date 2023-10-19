package com.mycompany.veterinariajpa.logica;

import com.mycompany.veterinariajpa.logica.Pacientes;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-18T22:39:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Historial.class)
public class Historial_ { 

    public static volatile SingularAttribute<Historial, String> fechaEnfermedad;
    public static volatile SingularAttribute<Historial, String> enfermedad;
    public static volatile SingularAttribute<Historial, Integer> historialId;
    public static volatile SingularAttribute<Historial, Pacientes> mascota;

}