package entities;

import entities.ClientePK;
import entities.Pasaje;
import entities.Tipocliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T22:31:39")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile ListAttribute<Cliente, Pasaje> pasajeList;
    public static volatile SingularAttribute<Cliente, ClientePK> clientePK;
    public static volatile SingularAttribute<Cliente, Tipocliente> codTipoCliente;
    public static volatile SingularAttribute<Cliente, String> apellido;
    public static volatile SingularAttribute<Cliente, String> nroTelefono;
    public static volatile SingularAttribute<Cliente, String> nroCelular;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> correoElectronico;

}