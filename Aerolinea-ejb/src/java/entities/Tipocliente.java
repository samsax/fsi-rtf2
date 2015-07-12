/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @author Juan Felipe Zuluaga Gómez <juan.zuluagag@udea.edu.co
 */
@Entity
@Table(name = "tipocliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocliente.findAll", query = "SELECT t FROM Tipocliente t"),
    @NamedQuery(name = "Tipocliente.findByCodTipoCliente", query = "SELECT t FROM Tipocliente t WHERE t.codTipoCliente = :codTipoCliente"),
    @NamedQuery(name = "Tipocliente.findByEstadoCliente", query = "SELECT t FROM Tipocliente t WHERE t.estadoCliente = :estadoCliente")})
public class Tipocliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_tipo_cliente")
    private Integer codTipoCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_cliente")
    private int estadoCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codTipoCliente")
    private List<Cliente> clienteList;
    @JoinColumn(name = "usuario", referencedColumnName = "cod_usuario")
    @ManyToOne
    private Usuario usuario;
    @JoinColumn(name = "socio", referencedColumnName = "cod_socio")
    @ManyToOne
    private Socio socio;

    public Tipocliente() {
    }

    public Tipocliente(Integer codTipoCliente) {
        this.codTipoCliente = codTipoCliente;
    }

    public Tipocliente(Integer codTipoCliente, int estadoCliente) {
        this.codTipoCliente = codTipoCliente;
        this.estadoCliente = estadoCliente;
    }

    public Integer getCodTipoCliente() {
        return codTipoCliente;
    }

    public void setCodTipoCliente(Integer codTipoCliente) {
        this.codTipoCliente = codTipoCliente;
    }

    public int getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(int estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    @XmlTransient
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipoCliente != null ? codTipoCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocliente)) {
            return false;
        }
        Tipocliente other = (Tipocliente) object;
        if ((this.codTipoCliente == null && other.codTipoCliente != null) || (this.codTipoCliente != null && !this.codTipoCliente.equals(other.codTipoCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tipocliente[ codTipoCliente=" + codTipoCliente + " ]";
    }

}
