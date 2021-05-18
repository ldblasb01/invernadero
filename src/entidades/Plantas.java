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
@Table(name = "plantas", catalog = "bdinvernadero", schema = "")
@NamedQueries({
    @NamedQuery(name = "Plantas.findAll", query = "SELECT p FROM Plantas p")
    , @NamedQuery(name = "Plantas.findById", query = "SELECT p FROM Plantas p WHERE p.id = :id")
    , @NamedQuery(name = "Plantas.findByNombre", query = "SELECT p FROM Plantas p WHERE p.nombre = :nombre")
// , @NamedQuery(name = "Plantas.findParcelasByIdPlanta", query = "SELECT parcelas.id, parcelas.nombre, plantaparcela.porcentaje FROM Plantas p inner join plantaparcela pp on p.id=pp.idplanta inner join Parcelas pa on pp.idparcela = pa.id WHERE p.id = :id")})
})
public class Plantas implements Serializable {

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

    public Plantas() {
    }

    public Plantas(Long id) {
        this.id = id;
    }

    public Plantas(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plantas)) {
            return false;
        }
        Plantas other = (Plantas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Planta[ id=" + id + ", nombre=" + nombre + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
