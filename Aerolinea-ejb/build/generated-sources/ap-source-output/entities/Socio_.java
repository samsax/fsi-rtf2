package entities;

import entities.Tipocliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-29T22:31:39")
@StaticMetamodel(Socio.class)
public class Socio_ { 

    public static volatile ListAttribute<Socio, Tipocliente> tipoclienteList;
    public static volatile SingularAttribute<Socio, String> contrasenaUsuario;
    public static volatile SingularAttribute<Socio, String> millasAcumuladas;
    public static volatile SingularAttribute<Socio, Integer> codSocio;
    public static volatile SingularAttribute<Socio, String> nombreUsuario;

}