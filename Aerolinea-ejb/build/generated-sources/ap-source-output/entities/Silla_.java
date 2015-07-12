package entities;

import entities.Avion;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T22:31:39")
@StaticMetamodel(Silla.class)
public class Silla_ { 

    public static volatile SingularAttribute<Silla, String> columna;
    public static volatile SingularAttribute<Silla, Integer> fila;
    public static volatile SingularAttribute<Silla, Avion> matriculaAvion;
    public static volatile SingularAttribute<Silla, Integer> codSilla;
    public static volatile SingularAttribute<Silla, String> clase;

}