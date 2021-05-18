/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author luis
 */
@Entity
@Table(name = "parcelas", catalog = "bdinvernadero", schema = "")
@NamedQueries({
    @NamedQuery(name = "Parcelas.findAll", query = "SELECT p FROM Parcelas p")
    , @NamedQuery(name = "Parcelas.findById", query = "SELECT p FROM Parcelas p WHERE p.id = :id")
    , @NamedQuery(name = "Parcelas.findParcelasByIdPlanta", query = "SELECT p FROM Parcelas p inner join Plantaparcela pp WHERE pp.plantaparcelaPK.idplanta = :idplanta and pp.plantaparcelaPK.idparcela = p.id")
    , @NamedQuery(name = "Parcelas.findByNombre", query = "SELECT p FROM Parcelas p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Parcelas.findByArea", query = "SELECT p FROM Parcelas p WHERE p.area = :area")
    , @NamedQuery(name = "Parcelas.findByPrivada", query = "SELECT p FROM Parcelas p WHERE p.privada = :privada")})
public class Parcelas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "area")
    private float area;
    @Basic(optional = false)
    @Column(name = "privada")
    private boolean privada;

    public Parcelas() {
    }

    public Parcelas(Long id) {
        this.id = id;
    }

    public Parcelas(Long id, String nombre, float area, boolean privada) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
        this.privada = privada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        float oldArea = this.area;
        this.area = area;
        changeSupport.firePropertyChange("area", oldArea, area);
    }

    public boolean getPrivada() {
        return privada;
    }

    public void setPrivada(boolean privada) {
        boolean oldPrivada = this.privada;
        this.privada = privada;
        changeSupport.firePropertyChange("privada", oldPrivada, privada);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parcelas)) {
            return false;
        }
        Parcelas other = (Parcelas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vista.Parcelas[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
