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
@Table(name = "localizaciones", catalog = "bdinvernadero", schema = "")
@NamedQueries({
    @NamedQuery(name = "Localizaciones.findAll", query = "SELECT l FROM Localizaciones l")
    , @NamedQuery(name = "Localizaciones.findById", query = "SELECT l FROM Localizaciones l WHERE l.id = :id")
    , @NamedQuery(name = "Localizaciones.deleteById", query = "DELETE FROM Localizaciones l WHERE l.id = :id")
    , @NamedQuery(name = "Localizaciones.findByLongitud", query = "SELECT l FROM Localizaciones l WHERE l.longitud = :longitud")
    , @NamedQuery(name = "Localizaciones.findByLatitud", query = "SELECT l FROM Localizaciones l WHERE l.latitud = :latitud")
    , @NamedQuery(name = "Localizaciones.findByGradosLongitud", query = "SELECT l FROM Localizaciones l WHERE l.gradosLongitud = :gradosLongitud")
    , @NamedQuery(name = "Localizaciones.findByGradosLatitud", query = "SELECT l FROM Localizaciones l WHERE l.gradosLatitud = :gradosLatitud")})
public class Localizaciones implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "longitud")
    private Character longitud;
    @Basic(optional = false)
    @Column(name = "latitud")
    private Character latitud;
    @Basic(optional = false)
    @Column(name = "gradosLongitud")
    private float gradosLongitud;
    @Basic(optional = false)
    @Column(name = "gradosLatitud")
    private float gradosLatitud;

    public Localizaciones() {
    }

    public Localizaciones(Long id) {
        this.id = id;
    }

    public Localizaciones(Long id, Character longitud, Character latitud, float gradosLongitud, float gradosLatitud) {
        this.id = id;
        this.longitud = longitud;
        this.latitud = latitud;
        this.gradosLongitud = gradosLongitud;
        this.gradosLatitud = gradosLatitud;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Character getLongitud() {
        return longitud;
    }

    public void setLongitud(Character longitud) {
        Character oldLongitud = this.longitud;
        this.longitud = longitud;
        changeSupport.firePropertyChange("longitud", oldLongitud, longitud);
    }

    public Character getLatitud() {
        return latitud;
    }

    public void setLatitud(Character latitud) {
        Character oldLatitud = this.latitud;
        this.latitud = latitud;
        changeSupport.firePropertyChange("latitud", oldLatitud, latitud);
    }

    public float getGradosLongitud() {
        return gradosLongitud;
    }

    public void setGradosLongitud(float gradosLongitud) {
        float oldGradosLongitud = this.gradosLongitud;
        this.gradosLongitud = gradosLongitud;
        changeSupport.firePropertyChange("gradosLongitud", oldGradosLongitud, gradosLongitud);
    }

    public float getGradosLatitud() {
        return gradosLatitud;
    }

    public void setGradosLatitud(float gradosLatitud) {
        float oldGradosLatitud = this.gradosLatitud;
        this.gradosLatitud = gradosLatitud;
        changeSupport.firePropertyChange("gradosLatitud", oldGradosLatitud, gradosLatitud);
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
        if (!(object instanceof Localizaciones)) {
            return false;
        }
        Localizaciones other = (Localizaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Localización[ id=" + id + ", longitud="+  gradosLongitud +"º "+ longitud +", latitud=" +gradosLatitud +"º " + latitud +" ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
