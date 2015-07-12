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
@Table(name = "detallecompra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallecompra.findAll", query = "SELECT d FROM Detallecompra d"),
    @NamedQuery(name = "Detallecompra.findByCodDetalleCompra", query = "SELECT d FROM Detallecompra d WHERE d.codDetalleCompra = :codDetalleCompra"),
    @NamedQuery(name = "Detallecompra.findByTipoPago", query = "SELECT d FROM Detallecompra d WHERE d.tipoPago = :tipoPago"),
    @NamedQuery(name = "Detallecompra.findByValorPasaje", query = "SELECT d FROM Detallecompra d WHERE d.valorPasaje = :valorPasaje")})
public class Detallecompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_detalle_compra")
    private Integer codDetalleCompra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipo_pago")
    private String tipoPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_pasaje")
    private int valorPasaje;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detalleCompra")
    private List<Pasaje> pasajeList;

    public Detallecompra() {
    }

    public Detallecompra(Integer codDetalleCompra) {
        this.codDetalleCompra = codDetalleCompra;
    }

    public Detallecompra(Integer codDetalleCompra, String tipoPago, int valorPasaje) {
        this.codDetalleCompra = codDetalleCompra;
        this.tipoPago = tipoPago;
        this.valorPasaje = valorPasaje;
    }

    public Integer getCodDetalleCompra() {
        return codDetalleCompra;
    }

    public void setCodDetalleCompra(Integer codDetalleCompra) {
        this.codDetalleCompra = codDetalleCompra;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
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
        hash += (codDetalleCompra != null ? codDetalleCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallecompra)) {
            return false;
        }
        Detallecompra other = (Detallecompra) object;
        if ((this.codDetalleCompra == null && other.codDetalleCompra != null) || (this.codDetalleCompra != null && !this.codDetalleCompra.equals(other.codDetalleCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Detallecompra[ codDetalleCompra=" + codDetalleCompra + " ]";
    }

}
