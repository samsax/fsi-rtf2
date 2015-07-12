package entities;

import entities.Silla;
import entities.Vuelo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T22:31:39")
@StaticMetamodel(Avion.class)
public class Avion_ { 

    public static volatile SingularAttribute<Avion, String> descripcion;
    public static volatile SingularAttribute<Avion, String> marca;
    public static volatile ListAttribute<Avion, Vuelo> vueloList;
    public static volatile SingularAttribute<Avion, String> matriculaAvion;
    public static volatile ListAttribute<Avion, Silla> sillaList;
    public static volatile SingularAttribute<Avion, Integer> capacidad;

}