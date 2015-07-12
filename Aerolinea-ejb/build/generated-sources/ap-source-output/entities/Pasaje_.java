package entities;

import entities.Cliente;
import entities.Detallecompra;
import entities.Vuelo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T22:31:39")
@StaticMetamodel(Pasaje.class)
public class Pasaje_ { 

    public static volatile SingularAttribute<Pasaje, Cliente> cliente;
    public static volatile SingularAttribute<Pasaje, Detallecompra> detalleCompra;
    public static volatile SingularAttribute<Pasaje, Integer> codPasaje;
    public static volatile SingularAttribute<Pasaje, Vuelo> vuelo;
    public static volatile SingularAttribute<Pasaje, Boolean> estadoPago;

}