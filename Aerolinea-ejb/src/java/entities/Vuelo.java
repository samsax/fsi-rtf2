/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @author Juan Felipe Zuluaga Gómez <juan.zuluagag@udea.edu.co
 */
@Entity
@Table(name = "vuelo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vuelo.findAll", query = "SELECT v FROM Vuelo v"),
    @NamedQuery(name = "Vuelo.findByCodVuelo", query = "SELECT v FROM Vuelo v WHERE v.codVuelo = :codVuelo"),
    @NamedQuery(name = "Vuelo.findByFechaHora", query = "SELECT v FROM Vuelo v WHERE v.fechaHora = :fechaHora")})
public class Vuelo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_vuelo")
    private Integer codVuelo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vuelo")
    private List<Pasaje> pasajeList;
    @JoinColumn(name = "cod_avion", referencedColumnName = "matricula_avion")
    @ManyToOne(optional = false)
    private Avion codAvion;
    @JoinColumn(name = "cod_itinerario", referencedColumnName = "cod_itinerario")
    @ManyToOne(optional = false)
    private Itinerario codItinerario;

    public Vuelo() {
    }

    public Vuelo(Integer codVuelo) {
        this.codVuelo = codVuelo;
    }

    public Vuelo(Integer codVuelo, Date fechaHora) {
        this.codVuelo = codVuelo;
        this.fechaHora = fechaHora;
    }

    public Integer getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(Integer codVuelo) {
        this.codVuelo = codVuelo;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    @XmlTransient
    public List<Pasaje> getPasajeList() {
        return pasajeList;
    }

    public void setPasajeList(List<Pasaje> pasajeList) {
        this.pasajeList = pasajeList;
    }

    public Avion getCodAvion() {
        return codAvion;
    }

    public void setCodAvion(Avion codAvion) {
        this.codAvion = codAvion;
    }

    public Itinerario getCodItinerario() {
        return codItinerario;
    }

    public void setCodItinerario(Itinerario codItinerario) {
        this.codItinerario = codItinerario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVuelo != null ? codVuelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vuelo)) {
            return false;
        }
        Vuelo other = (Vuelo) object;
        if ((this.codVuelo == null && other.codVuelo != null) || (this.codVuelo != null && !this.codVuelo.equals(other.codVuelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Vuelo[ codVuelo=" + codVuelo + " ]";
    }

}
