package com.mycompany.veterinariajpa.logica;

import com.mycompany.veterinariajpa.logica.Clientes;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-18T22:39:43", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> CedulaPersona;
    public static volatile SingularAttribute<Persona, String> NombrePersona;
    public static volatile ListAttribute<Persona, Clientes> clientes;
    public static volatile SingularAttribute<Persona, Integer> idPersona;

}