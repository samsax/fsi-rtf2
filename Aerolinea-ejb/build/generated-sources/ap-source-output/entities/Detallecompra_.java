package entities;

import entities.Pasaje;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T22:31:39")
@StaticMetamodel(Detallecompra.class)
public class Detallecompra_ { 

    public static volatile ListAttribute<Detallecompra, Pasaje> pasajeList;
    public static volatile SingularAttribute<Detallecompra, Integer> codDetalleCompra;
    public static volatile SingularAttribute<Detallecompra, Integer> valorPasaje;
    public static volatile SingularAttribute<Detallecompra, String> tipoPago;

}