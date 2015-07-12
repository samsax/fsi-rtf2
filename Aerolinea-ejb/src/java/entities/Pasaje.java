/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Juan Felipe Zuluaga Gómez <juan.zuluagag@udea.edu.co
 */
@Entity
@Table(name = "pasaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pasaje.findAll", query = "SELECT p FROM Pasaje p"),
    @NamedQuery(name = "Pasaje.findByCodPasaje", query = "SELECT p FROM Pasaje p WHERE p.codPasaje = :codPasaje"),
    @NamedQuery(name = "Pasaje.findByEstadoPago", query = "SELECT p FROM Pasaje p WHERE p.estadoPago = :estadoPago")})
public class Pasaje implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_pasaje")
    private Integer codPasaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_pago")
    private boolean estadoPago;
    @JoinColumns({
        @JoinColumn(name = "nro_documento", referencedColumnName = "nro_documento"),
        @JoinColumn(name = "tipo_documento", referencedColumnName = "tipo_documento")})
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(name = "detalle_compra", referencedColumnName = "cod_detalle_compra")
    @ManyToOne(optional = false)
    private Detallecompra detalleCompra;
    @JoinColumn(name = "vuelo", referencedColumnName = "cod_vuelo")
    @ManyToOne(optional = false)
    private Vuelo vuelo;

    public Pasaje() {
    }

    public Pasaje(Integer codPasaje) {
        this.codPasaje = codPasaje;
    }

    public Pasaje(Integer codPasaje, boolean estadoPago) {
        this.codPasaje = codPasaje;
        this.estadoPago = estadoPago;
    }

    public Integer getCodPasaje() {
        return codPasaje;
    }

    public void setCodPasaje(Integer codPasaje) {
        this.codPasaje = codPasaje;
    }

    public boolean getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Detallecompra getDetalleCompra() {
        return detalleCompra;
    }

    public void setDetalleCompra(Detallecompra detalleCompra) {
        this.detalleCompra = detalleCompra;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPasaje != null ? codPasaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pasaje)) {
            return false;
        }
        Pasaje other = (Pasaje) object;
        if ((this.codPasaje == null && other.codPasaje != null) || (this.codPasaje != null && !this.codPasaje.equals(other.codPasaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pasaje[ codPasaje=" + codPasaje + " ]";
    }

}
