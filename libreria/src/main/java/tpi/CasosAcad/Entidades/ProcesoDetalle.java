/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi.CasosAcad.Entidades;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author manuel
 */
@Entity
@Table(name = "Proceso_Detalle", catalog = "CasosAcad_db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProcesoDetalle.findAll", query = "SELECT p FROM ProcesoDetalle p")
    , @NamedQuery(name = "ProcesoDetalle.findByIdProcesoDetalle", query = "SELECT p FROM ProcesoDetalle p WHERE p.idProcesoDetalle = :idProcesoDetalle")
    , @NamedQuery(name = "ProcesoDetalle.findByIdProceso", query = "SELECT p FROM ProcesoDetalle p WHERE p.idProceso = :idProceso")
    , @NamedQuery(name = "ProcesoDetalle.findByIdPaso", query = "SELECT p FROM ProcesoDetalle p WHERE p.idPaso = :idPaso")
    , @NamedQuery(name = "ProcesoDetalle.findByFecha", query = "SELECT p FROM ProcesoDetalle p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "ProcesoDetalle.findByResponsable", query = "SELECT p FROM ProcesoDetalle p WHERE p.responsable = :responsable")
    , @NamedQuery(name = "ProcesoDetalle.findBySolicitante", query = "SELECT p FROM ProcesoDetalle p WHERE p.solicitante = :solicitante")})
public class ProcesoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProceso_Detalle")
    private Integer idProcesoDetalle;
    @Basic(optional = false)
    @Column(name = "idProceso")
    private int idProceso;
    @Basic(optional = false)
    @Column(name = "idPaso")
    private int idPaso;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @Basic(optional = false)
    @Column(name = "responsable")
    private String responsable;
    @Basic(optional = false)
    @Column(name = "solicitante")
    private String solicitante;

    public ProcesoDetalle() {
    }

    public ProcesoDetalle(Integer idProcesoDetalle) {
        this.idProcesoDetalle = idProcesoDetalle;
    }

    public ProcesoDetalle(Integer idProcesoDetalle, int idProceso, int idPaso, String fecha, String responsable, String solicitante) {
        this.idProcesoDetalle = idProcesoDetalle;
        this.idProceso = idProceso;
        this.idPaso = idPaso;
        this.fecha = fecha;
        this.responsable = responsable;
        this.solicitante = solicitante;
    }

    public Integer getIdProcesoDetalle() {
        return idProcesoDetalle;
    }

    public void setIdProcesoDetalle(Integer idProcesoDetalle) {
        this.idProcesoDetalle = idProcesoDetalle;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public int getIdPaso() {
        return idPaso;
    }

    public void setIdPaso(int idPaso) {
        this.idPaso = idPaso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcesoDetalle != null ? idProcesoDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcesoDetalle)) {
            return false;
        }
        ProcesoDetalle other = (ProcesoDetalle) object;
        if ((this.idProcesoDetalle == null && other.idProcesoDetalle != null) || (this.idProcesoDetalle != null && !this.idProcesoDetalle.equals(other.idProcesoDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tpi.CasosAcad.Entidades.ProcesoDetalle[ idProcesoDetalle=" + idProcesoDetalle + " ]";
    }
    
}
