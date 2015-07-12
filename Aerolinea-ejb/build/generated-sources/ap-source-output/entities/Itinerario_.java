package entities;

import entities.Ciudad;
import entities.Vuelo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T22:31:39")
@StaticMetamodel(Itinerario.class)
public class Itinerario_ { 

    public static volatile ListAttribute<Itinerario, Vuelo> vueloList;
    public static volatile SingularAttribute<Itinerario, Ciudad> ciudadOrigen;
    public static volatile SingularAttribute<Itinerario, Ciudad> ciudadDestino;
    public static volatile SingularAttribute<Itinerario, Integer> codItinerario;

}