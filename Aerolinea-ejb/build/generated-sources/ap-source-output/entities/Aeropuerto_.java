package entities;

import entities.Ciudad;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T22:31:39")
@StaticMetamodel(Aeropuerto.class)
public class Aeropuerto_ { 

    public static volatile SingularAttribute<Aeropuerto, String> identificacion;
    public static volatile SingularAttribute<Aeropuerto, Ciudad> codigoCiudad;
    public static volatile SingularAttribute<Aeropuerto, String> nombre;

}