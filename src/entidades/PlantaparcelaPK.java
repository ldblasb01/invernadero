/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author luis
 */
@Embeddable
public class PlantaparcelaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idplanta")
    private long idplanta;
    @Basic(optional = false)
    @Column(name = "idparcela")
    private long idparcela;

    public PlantaparcelaPK() {
    }

    public PlantaparcelaPK(long idplanta, long idparcela) {
        this.idplanta = idplanta;
        this.idparcela = idparcela;
    }

    public long getIdplanta() {
        return idplanta;
    }

    public void setIdplanta(long idplanta) {
        this.idplanta = idplanta;
    }

    public long getIdparcela() {
        return idparcela;
    }

    public void setIdparcela(long idparcela) {
        this.idparcela = idparcela;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idplanta;
        hash += (int) idparcela;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlantaparcelaPK)) {
            return false;
        }
        PlantaparcelaPK other = (PlantaparcelaPK) object;
        if (this.idplanta != other.idplanta) {
            return false;
        }
        if (this.idparcela != other.idparcela) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vista.PlantaparcelaPK[ idplanta=" + idplanta + ", idparcela=" + idparcela + " ]";
    }
    
}
