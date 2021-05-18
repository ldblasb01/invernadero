/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author luis
 */
@Entity
@Table(name = "plantaparcela", catalog = "bdinvernadero", schema = "")
@NamedQueries({
    @NamedQuery(name = "Plantaparcela.findAll", query = "SELECT p FROM Plantaparcela p")
    , @NamedQuery(name = "Plantaparcela.findByIdplanta", query = "SELECT p FROM Plantaparcela p WHERE p.plantaparcelaPK.idplanta = :idplanta")
    , @NamedQuery(name = "Plantaparcela.findByIdparcela", query = "SELECT p FROM Plantaparcela p WHERE p.plantaparcelaPK.idparcela = :idparcela")
    , @NamedQuery(name = "Plantaparcela.findByPorcentaje", query = "SELECT p FROM Plantaparcela p WHERE p.porcentaje = :porcentaje")})
public class Plantaparcela implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlantaparcelaPK plantaparcelaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentaje")
    private BigDecimal porcentaje;

    public Plantaparcela() {
    }

    public Plantaparcela(PlantaparcelaPK plantaparcelaPK) {
        this.plantaparcelaPK = plantaparcelaPK;
    }

    public Plantaparcela(long idplanta, long idparcela) {
        this.plantaparcelaPK = new PlantaparcelaPK(idplanta, idparcela);
    }

    public PlantaparcelaPK getPlantaparcelaPK() {
        return plantaparcelaPK;
    }

    public void setPlantaparcelaPK(PlantaparcelaPK plantaparcelaPK) {
        this.plantaparcelaPK = plantaparcelaPK;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        BigDecimal oldPorcentaje = this.porcentaje;
        this.porcentaje = porcentaje;
        changeSupport.firePropertyChange("porcentaje", oldPorcentaje, porcentaje);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plantaparcelaPK != null ? plantaparcelaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plantaparcela)) {
            return false;
        }
        Plantaparcela other = (Plantaparcela) object;
        if ((this.plantaparcelaPK == null && other.plantaparcelaPK != null) || (this.plantaparcelaPK != null && !this.plantaparcelaPK.equals(other.plantaparcelaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vista.Plantaparcela[ plantaparcelaPK=" + plantaparcelaPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
