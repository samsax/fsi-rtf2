package entities;

import entities.Avion;
import entities.Itinerario;
import entities.Pasaje;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T22:31:39")
@StaticMetamodel(Vuelo.class)
public class Vuelo_ { 

    public static volatile ListAttribute<Vuelo, Pasaje> pasajeList;
    public static volatile SingularAttribute<Vuelo, Date> fechaHora;
    public static volatile SingularAttribute<Vuelo, Avion> codAvion;
    public static volatile SingularAttribute<Vuelo, Integer> codVuelo;
    public static volatile SingularAttribute<Vuelo, Itinerario> codItinerario;

}