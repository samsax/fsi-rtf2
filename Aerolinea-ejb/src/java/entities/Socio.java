/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @author Juan Felipe Zuluaga Gómez <juan.zuluagag@udea.edu.co
 */
@Entity
@Table(name = "socio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Socio.findAll", query = "SELECT s FROM Socio s"),
    @NamedQuery(name = "Socio.findByCodSocio", query = "SELECT s FROM Socio s WHERE s.codSocio = :codSocio"),
    @NamedQuery(name = "Socio.findByMillasAcumuladas", query = "SELECT s FROM Socio s WHERE s.millasAcumuladas = :millasAcumuladas"),
    @NamedQuery(name = "Socio.findByNombreUsuario", query = "SELECT s FROM Socio s WHERE s.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Socio.findByContrasenaUsuario", query = "SELECT s FROM Socio s WHERE s.contrasenaUsuario = :contrasenaUsuario")})
public class Socio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_socio")
    private Integer codSocio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "millas_acumuladas")
    private String millasAcumuladas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "contrasena_usuario")
    private String contrasenaUsuario;
    @OneToMany(mappedBy = "socio")
    private List<Tipocliente> tipoclienteList;

    public Socio() {
    }

    public Socio(Integer codSocio) {
        this.codSocio = codSocio;
    }

    public Socio(Integer codSocio, String millasAcumuladas, String nombreUsuario, String contrasenaUsuario) {
        this.codSocio = codSocio;
        this.millasAcumuladas = millasAcumuladas;
        this.nombreUsuario = nombreUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public Integer getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(Integer codSocio) {
        this.codSocio = codSocio;
    }

    public String getMillasAcumuladas() {
        return millasAcumuladas;
    }

    public void setMillasAcumuladas(String millasAcumuladas) {
        this.millasAcumuladas = millasAcumuladas;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    @XmlTransient
    public List<Tipocliente> getTipoclienteList() {
        return tipoclienteList;
    }

    public void setTipoclienteList(List<Tipocliente> tipoclienteList) {
        this.tipoclienteList = tipoclienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSocio != null ? codSocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Socio)) {
            return false;
        }
        Socio other = (Socio) object;
        if ((this.codSocio == null && other.codSocio != null) || (this.codSocio != null && !this.codSocio.equals(other.codSocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Socio[ codSocio=" + codSocio + " ]";
    }

}
