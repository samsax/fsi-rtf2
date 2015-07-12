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
@Table(name = "avion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Avion.findAll", query = "SELECT a FROM Avion a"),
    @NamedQuery(name = "Avion.findByMatriculaAvion", query = "SELECT a FROM Avion a WHERE a.matriculaAvion = :matriculaAvion"),
    @NamedQuery(name = "Avion.findByCapacidad", query = "SELECT a FROM Avion a WHERE a.capacidad = :capacidad"),
    @NamedQuery(name = "Avion.findByMarca", query = "SELECT a FROM Avion a WHERE a.marca = :marca"),
    @NamedQuery(name = "Avion.findByDescripcion", query = "SELECT a FROM Avion a WHERE a.descripcion = :descripcion")})
public class Avion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "matricula_avion")
    private String matriculaAvion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "capacidad")
    private int capacidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "marca")
    private String marca;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matriculaAvion")
    private List<Silla> sillaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codAvion")
    private List<Vuelo> vueloList;

    public Avion() {
    }

    public Avion(String matriculaAvion) {
        this.matriculaAvion = matriculaAvion;
    }

    public Avion(String matriculaAvion, int capacidad, String marca) {
        this.matriculaAvion = matriculaAvion;
        this.capacidad = capacidad;
        this.marca = marca;
    }

    public String getMatriculaAvion() {
        return matriculaAvion;
    }

    public void setMatriculaAvion(String matriculaAvion) {
        this.matriculaAvion = matriculaAvion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Silla> getSillaList() {
        return sillaList;
    }

    public void setSillaList(List<Silla> sillaList) {
        this.sillaList = sillaList;
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
        hash += (matriculaAvion != null ? matriculaAvion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Avion)) {
            return false;
        }
        Avion other = (Avion) object;
        if ((this.matriculaAvion == null && other.matriculaAvion != null) || (this.matriculaAvion != null && !this.matriculaAvion.equals(other.matriculaAvion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Avion[ matriculaAvion=" + matriculaAvion + " ]";
    }

}
