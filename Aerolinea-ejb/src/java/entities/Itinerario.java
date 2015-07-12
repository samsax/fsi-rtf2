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
@Table(name = "itinerario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itinerario.findAll", query = "SELECT i FROM Itinerario i"),
    @NamedQuery(name = "Itinerario.findByCodItinerario", query = "SELECT i FROM Itinerario i WHERE i.codItinerario = :codItinerario")})
public class Itinerario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_itinerario")
    private Integer codItinerario;
    @JoinColumn(name = "ciudad_origen", referencedColumnName = "codigo_ciudad")
    @ManyToOne(optional = false)
    private Ciudad ciudadOrigen;
    @JoinColumn(name = "ciudad_destino", referencedColumnName = "codigo_ciudad")
    @ManyToOne(optional = false)
    private Ciudad ciudadDestino;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codItinerario")
    private List<Vuelo> vueloList;

    public Itinerario() {
    }

    public Itinerario(Integer codItinerario) {
        this.codItinerario = codItinerario;
    }

    public Integer getCodItinerario() {
        return codItinerario;
    }

    public void setCodItinerario(Integer codItinerario) {
        this.codItinerario = codItinerario;
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    @XmlTransient
    public List<Vuelo> getVueloList() {
        return vueloList;
    }

    public void setVueloList(List<Vuelo> vueloList) {
        this.vueloList = vueloList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codItinerario != null ? codItinerario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itinerario)) {
            return false;
        }
        Itinerario other = (Itinerario) object;
        if ((this.codItinerario == null && other.codItinerario != null) || (this.codItinerario != null && !this.codItinerario.equals(other.codItinerario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Itinerario[ codItinerario=" + codItinerario + " ]";
    }

}
