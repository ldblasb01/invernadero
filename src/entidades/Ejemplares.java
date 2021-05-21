/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidades.Plantas;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.TypedQuery;

/**
 *
 * @author luis
 */
@Entity
@Table(name = "ejemplares", catalog = "bdinvernadero", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ejemplares.findAll", query = "SELECT e FROM Ejemplares e")
    , @NamedQuery(name = "Ejemplares.findById", query = "SELECT e FROM Ejemplares e WHERE e.id = :id")
    , @NamedQuery(name = "Ejemplares.findByEdad", query = "SELECT e FROM Ejemplares e WHERE e.edad = :edad")
    , @NamedQuery(name = "Ejemplares.findByFechaCompra", query = "SELECT e FROM Ejemplares e WHERE e.fechaCompra = :fechaCompra")
    , @NamedQuery(name = "Ejemplares.findByFechaPlantacion", query = "SELECT e FROM Ejemplares e WHERE e.fechaPlantacion = :fechaPlantacion")
    , @NamedQuery(name = "Ejemplares.findByIdLocalizacion", query = "SELECT e FROM Ejemplares e WHERE e.idLocalizacion = :idLocalizacion")
    , @NamedQuery(name = "Ejemplares.findByIdPlanta", query = "SELECT e FROM Ejemplares e WHERE e.idPlanta = :idPlanta")})
public class Ejemplares implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "edad")
    private int edad;
    @Basic(optional = false)
    @Column(name = "fechaCompra")
    @Temporal(TemporalType.DATE)
    private Date fechaCompra;
    @Column(name = "fechaPlantacion")
    @Temporal(TemporalType.DATE)
    private Date fechaPlantacion;
    @Column(name = "idLocalizacion")
    private BigInteger idLocalizacion;
    @Basic(optional = false)
    @Column(name = "idPlanta")
    private long idPlanta;

    public Ejemplares() {
    }

    public Ejemplares(Long id) {
        this.id = id;
    }

    public Ejemplares(Long id, int edad, Date fechaCompra, long idPlanta, Date fechaPlantacion, BigInteger idLocalizacion) {
        this.id = id;
        this.edad = edad;
        this.fechaCompra = fechaCompra;
        this.idPlanta = idPlanta;
        this.fechaPlantacion = fechaPlantacion;
        this.idLocalizacion = idLocalizacion;
    }
    
    public Ejemplares(Long id, int edad, Date fechaCompra, long idPlanta) {
        this.id = id;
        this.edad = edad;
        this.fechaCompra = fechaCompra;
        this.idPlanta = idPlanta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        int oldEdad = this.edad;
        this.edad = edad;
        changeSupport.firePropertyChange("edad", oldEdad, edad);
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        Date oldFechaCompra = this.fechaCompra;
        this.fechaCompra = fechaCompra;
        changeSupport.firePropertyChange("fechaCompra", oldFechaCompra, fechaCompra);
    }

    public Date getFechaPlantacion() {
        return fechaPlantacion;
    }

    public void setFechaPlantacion(Date fechaPlantacion) {
        Date oldFechaPlantacion = this.fechaPlantacion;
        this.fechaPlantacion = fechaPlantacion;
        changeSupport.firePropertyChange("fechaPlantacion", oldFechaPlantacion, fechaPlantacion);
    }

    public BigInteger getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(BigInteger idLocalizacion) {
        BigInteger oldIdLocalizacion = this.idLocalizacion;
        this.idLocalizacion = idLocalizacion;
        changeSupport.firePropertyChange("idLocalizacion", oldIdLocalizacion, idLocalizacion);
    }

    public long getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(long idPlanta) {
        long oldIdPlanta = this.idPlanta;
        this.idPlanta = idPlanta;
        changeSupport.firePropertyChange("idPlanta", oldIdPlanta, idPlanta);
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
        if (!(object instanceof Ejemplares)) {
            return false;
        }
        Ejemplares other = (Ejemplares) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        javax.persistence.EntityManager entityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bdinvernadero?zeroDateTimeBehavior=convertToNullPU").createEntityManager();

        Long idPlanta = (Long) this.getIdPlanta();
        TypedQuery<Plantas> findPlantaById = entityManager0.createNamedQuery("Plantas.findById", Plantas.class);
        findPlantaById.setParameter("id", idPlanta);
        Plantas p = new Plantas();
        List<Plantas> result = findPlantaById.getResultList();
        if (result.size() > 0) {
            p = (Plantas) result.get(0);
        }
        return "Ejemplar[ id=" + id + ", Planta=" + p.getNombre() + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
