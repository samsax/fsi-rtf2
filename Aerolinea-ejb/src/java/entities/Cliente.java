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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByTipoDocumento", query = "SELECT c FROM Cliente c WHERE c.clientePK.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Cliente.findByNroDocumento", query = "SELECT c FROM Cliente c WHERE c.clientePK.nroDocumento = :nroDocumento"),
    @NamedQuery(name = "Cliente.findByNombre", query = "SELECT c FROM Cliente c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Cliente.findByApellido", query = "SELECT c FROM Cliente c WHERE c.apellido = :apellido"),
    @NamedQuery(name = "Cliente.findByNroTelefono", query = "SELECT c FROM Cliente c WHERE c.nroTelefono = :nroTelefono"),
    @NamedQuery(name = "Cliente.findByNroCelular", query = "SELECT c FROM Cliente c WHERE c.nroCelular = :nroCelular"),
    @NamedQuery(name = "Cliente.findByCorreoElectronico", query = "SELECT c FROM Cliente c WHERE c.correoElectronico = :correoElectronico")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClientePK clientePK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 20)
    @Column(name = "nro_telefono")
    private String nroTelefono;
    @Size(max = 20)
    @Column(name = "nro_celular")
    private String nroCelular;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @JoinColumn(name = "cod_tipo_cliente", referencedColumnName = "cod_tipo_cliente")
    @ManyToOne(optional = false)
    private Tipocliente codTipoCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Pasaje> pasajeList;

    public Cliente() {
    }

    public Cliente(ClientePK clientePK) {
        this.clientePK = clientePK;
    }

    public Cliente(ClientePK clientePK, String nombre, String apellido, String correoElectronico) {
        this.clientePK = clientePK;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
    }

    public Cliente(String tipoDocumento, String nroDocumento) {
        this.clientePK = new ClientePK(tipoDocumento, nroDocumento);
    }

    public ClientePK getClientePK() {
        return clientePK;
    }

    public void setClientePK(ClientePK clientePK) {
        this.clientePK = clientePK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(String nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public String getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(String nroCelular) {
        this.nroCelular = nroCelular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Tipocliente getCodTipoCliente() {
        return codTipoCliente;
    }

    public void setCodTipoCliente(Tipocliente codTipoCliente) {
        this.codTipoCliente = codTipoCliente;
    }

    @XmlTransient
    public List<Pasaje> getPasajeList() {
        return pasajeList;
    }

    public void setPasajeList(List<Pasaje> pasajeList) {
        this.pasajeList = pasajeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientePK != null ? clientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clientePK == null && other.clientePK != null) || (this.clientePK != null && !this.clientePK.equals(other.clientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cliente[ clientePK=" + clientePK + " ]";
    }

}
