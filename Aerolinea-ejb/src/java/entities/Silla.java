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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Juan Felipe Zuluaga Gómez <juan.zuluagag@udea.edu.co
 */
@Entity
@Table(name = "silla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Silla.findAll", query = "SELECT s FROM Silla s"),
    @NamedQuery(name = "Silla.findByCodSilla", query = "SELECT s FROM Silla s WHERE s.codSilla = :codSilla"),
    @NamedQuery(name = "Silla.findByFila", query = "SELECT s FROM Silla s WHERE s.fila = :fila"),
    @NamedQuery(name = "Silla.findByColumna", query = "SELECT s FROM Silla s WHERE s.columna = :columna"),
    @NamedQuery(name = "Silla.findByClase", query = "SELECT s FROM Silla s WHERE s.clase = :clase")})
public class Silla implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_silla")
    private Integer codSilla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fila")
    private int fila;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "columna")
    private String columna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "clase")
    private String clase;
    @JoinColumn(name = "matricula_avion", referencedColumnName = "matricula_avion")
    @ManyToOne(optional = false)
    private Avion matriculaAvion;

    public Silla() {
    }

    public Silla(Integer codSilla) {
        this.codSilla = codSilla;
    }

    public Silla(Integer codSilla, int fila, String columna, String clase) {
        this.codSilla = codSilla;
        this.fila = fila;
        this.columna = columna;
        this.clase = clase;
    }

    public Integer getCodSilla() {
        return codSilla;
    }

    public void setCodSilla(Integer codSilla) {
        this.codSilla = codSilla;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Avion getMatriculaAvion() {
        return matriculaAvion;
    }

    public void setMatriculaAvion(Avion matriculaAvion) {
        this.matriculaAvion = matriculaAvion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSilla != null ? codSilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Silla)) {
            return false;
        }
        Silla other = (Silla) object;
        if ((this.codSilla == null && other.codSilla != null) || (this.codSilla != null && !this.codSilla.equals(other.codSilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Silla[ codSilla=" + codSilla + " ]";
    }

}
