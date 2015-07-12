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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 
 * @author Juan Felipe Zuluaga Gómez <juan.zuluagag@udea.edu.co
 */
@Entity
@Table(name = " ciudad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ciudad.findAll", query = "SELECT c FROM Ciudad c"),
    @NamedQuery(name = "Ciudad.findByCodigoCiudad", query = "SELECT c FROM Ciudad c WHERE c.codigoCiudad = :codigoCiudad"),
    @NamedQuery(name = "Ciudad.findByNombre", query = "SELECT c FROM Ciudad c WHERE c.nombre = :nombre")})
public class Ciudad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_ciudad")
    private Integer codigoCiudad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoCiudad")
    private List<Aeropuerto> aeropuertoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudadOrigen")
    private List<Itinerario> itinerarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciudadDestino")
    private List<Itinerario> itinerarioList1;
    @JoinColumn(name = "codigo_Pais", referencedColumnName = "codigo_Pais")
    @ManyToOne(optional = false)
    private Pais codigoPais;

    public Ciudad() {
    }

    public Ciudad(Integer codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public Ciudad(Integer codigoCiudad, String nombre) {
        this.codigoCiudad = codigoCiudad;
        this.nombre = nombre;
    }

    public Integer getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(Integer codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Aeropuerto> getAeropuertoList() {
        return aeropuertoList;
    }

    public void setAeropuertoList(List<Aeropuerto> aeropuertoList) {
        this.aeropuertoList = aeropuertoList;
    }

    @XmlTransient
    public List<Itinerario> getItinerarioList() {
        return itinerarioList;
    }

    public void setItinerarioList(List<Itinerario> itinerarioList) {
        this.itinerarioList = itinerarioList;
    }

    @XmlTransient
    public List<Itinerario> getItinerarioList1() {
        return itinerarioList1;
    }

    public void setItinerarioList1(List<Itinerario> itinerarioList1) {
        this.itinerarioList1 = itinerarioList1;
    }

    public Pais getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Pais codigoPais) {
        this.codigoPais = codigoPais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoCiudad != null ? codigoCiudad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        if ((this.codigoCiudad == null && other.codigoCiudad != null) || (this.codigoCiudad != null && !this.codigoCiudad.equals(other.codigoCiudad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Ciudad[ codigoCiudad=" + codigoCiudad + " ]";
    }

}
