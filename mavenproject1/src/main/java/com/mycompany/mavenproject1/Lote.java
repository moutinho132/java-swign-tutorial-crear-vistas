/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
 * @author AKDESK23
 */
@Entity
@Table(name = "lote")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lote.findAll", query = "SELECT l FROM Lote l")
    , @NamedQuery(name = "Lote.findById", query = "SELECT l FROM Lote l WHERE l.id = :id")
    , @NamedQuery(name = "Lote.findByNroLote", query = "SELECT l FROM Lote l WHERE l.nroLote = :nroLote")
    , @NamedQuery(name = "Lote.findByDispTotal", query = "SELECT l FROM Lote l WHERE l.dispTotal = :dispTotal")
    , @NamedQuery(name = "Lote.findByReferencia", query = "SELECT l FROM Lote l WHERE l.referencia = :referencia")
    , @NamedQuery(name = "Lote.findByPrecioUnitario", query = "SELECT l FROM Lote l WHERE l.precioUnitario = :precioUnitario")
    , @NamedQuery(name = "Lote.findByGarantia", query = "SELECT l FROM Lote l WHERE l.garantia = :garantia")
    , @NamedQuery(name = "Lote.findByTipoGarantia", query = "SELECT l FROM Lote l WHERE l.tipoGarantia = :tipoGarantia")})
public class Lote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nroLote")
    private String nroLote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dispTotal")
    private int dispTotal;
    @Size(max = 50)
    @Column(name = "referencia")
    private String referencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioUnitario")
    private float precioUnitario;
    @Lob
    @Size(max = 16777215)
    @Column(name = "seriales")
    private String seriales;
    @Column(name = "garantia")
    private Integer garantia;
    @Column(name = "tipoGarantia")
    private Integer tipoGarantia;
    @OneToMany(mappedBy = "idLote")
    private List<Propuesta> propuestaList;
    @JoinColumn(name = "productoId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Producto productoId;
    @OneToMany(mappedBy = "loteIdNuevo")
    private List<Incidencia> incidenciaList;
    @OneToMany(mappedBy = "idLote")
    private List<Incidencia> incidenciaList1;
    @OneToMany(mappedBy = "idLote")
    private List<Mercadeo> mercadeoList;
    @OneToMany(mappedBy = "idLote")
    private List<Serial> serialList;
    @OneToMany(mappedBy = "idLote")
    private List<Robo> roboList;

    public Lote() {
    }

    public Lote(Long id) {
        this.id = id;
    }

    public Lote(Long id, String nroLote, int dispTotal, float precioUnitario) {
        this.id = id;
        this.nroLote = nroLote;
        this.dispTotal = dispTotal;
        this.precioUnitario = precioUnitario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNroLote() {
        return nroLote;
    }

    public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
    }

    public int getDispTotal() {
        return dispTotal;
    }

    public void setDispTotal(int dispTotal) {
        this.dispTotal = dispTotal;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getSeriales() {
        return seriales;
    }

    public void setSeriales(String seriales) {
        this.seriales = seriales;
    }

    public Integer getGarantia() {
        return garantia;
    }

    public void setGarantia(Integer garantia) {
        this.garantia = garantia;
    }

    public Integer getTipoGarantia() {
        return tipoGarantia;
    }

    public void setTipoGarantia(Integer tipoGarantia) {
        this.tipoGarantia = tipoGarantia;
    }

    @XmlTransient
    public List<Propuesta> getPropuestaList() {
        return propuestaList;
    }

    public void setPropuestaList(List<Propuesta> propuestaList) {
        this.propuestaList = propuestaList;
    }

    public Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Producto productoId) {
        this.productoId = productoId;
    }

    @XmlTransient
    public List<Incidencia> getIncidenciaList() {
        return incidenciaList;
    }

    public void setIncidenciaList(List<Incidencia> incidenciaList) {
        this.incidenciaList = incidenciaList;
    }

    @XmlTransient
    public List<Incidencia> getIncidenciaList1() {
        return incidenciaList1;
    }

    public void setIncidenciaList1(List<Incidencia> incidenciaList1) {
        this.incidenciaList1 = incidenciaList1;
    }

    @XmlTransient
    public List<Mercadeo> getMercadeoList() {
        return mercadeoList;
    }

    public void setMercadeoList(List<Mercadeo> mercadeoList) {
        this.mercadeoList = mercadeoList;
    }

    @XmlTransient
    public List<Serial> getSerialList() {
        return serialList;
    }

    public void setSerialList(List<Serial> serialList) {
        this.serialList = serialList;
    }

    @XmlTransient
    public List<Robo> getRoboList() {
        return roboList;
    }

    public void setRoboList(List<Robo> roboList) {
        this.roboList = roboList;
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
        if (!(object instanceof Lote)) {
            return false;
        }
        Lote other = (Lote) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Lote[ id=" + id + " ]";
    }
    
}
