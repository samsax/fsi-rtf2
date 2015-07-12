package entities;

import entities.Ciudad;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T22:31:39")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile ListAttribute<Pais, Ciudad> ciudadList;
    public static volatile SingularAttribute<Pais, String> nombre;
    public static volatile SingularAttribute<Pais, Integer> codigoPais;

}