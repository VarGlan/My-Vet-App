package com.mycompany.veterinariajpa.logica;

import com.mycompany.veterinariajpa.logica.Pacientes;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-18T22:39:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Vacunacion.class)
public class Vacunacion_ { 

    public static volatile SingularAttribute<Vacunacion, Integer> vacunacionId;
    public static volatile SingularAttribute<Vacunacion, Pacientes> mascota;
    public static volatile SingularAttribute<Vacunacion, String> enfermedadVacuna;
    public static volatile SingularAttribute<Vacunacion, String> fechaVacunacion;

}