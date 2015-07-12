package entities;

import entities.Cliente;
import entities.Socio;
import entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T22:31:39")
@StaticMetamodel(Tipocliente.class)
public class Tipocliente_ { 

    public static volatile ListAttribute<Tipocliente, Cliente> clienteList;
    public static volatile SingularAttribute<Tipocliente, Integer> estadoCliente;
    public static volatile SingularAttribute<Tipocliente, Integer> codTipoCliente;
    public static volatile SingularAttribute<Tipocliente, Socio> socio;
    public static volatile SingularAttribute<Tipocliente, Usuario> usuario;

}