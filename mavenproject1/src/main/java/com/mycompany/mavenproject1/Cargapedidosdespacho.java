/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AKDESK23
 */
@Entity
@Table(name = "cargapedidosdespacho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cargapedidosdespacho.findAll", query = "SELECT c FROM Cargapedidosdespacho c")
    , @NamedQuery(name = "Cargapedidosdespacho.findById", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.id = :id")
    , @NamedQuery(name = "Cargapedidosdespacho.findByCodigoMovistar", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.codigoMovistar = :codigoMovistar")
    , @NamedQuery(name = "Cargapedidosdespacho.findByCorListado", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.corListado = :corListado")
    , @NamedQuery(name = "Cargapedidosdespacho.findByEstatus", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.estatus = :estatus")
    , @NamedQuery(name = "Cargapedidosdespacho.findByFactura", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.factura = :factura")
    , @NamedQuery(name = "Cargapedidosdespacho.findByFecha", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cargapedidosdespacho.findByLoteDespacho", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.loteDespacho = :loteDespacho")
    , @NamedQuery(name = "Cargapedidosdespacho.findByNombreEstatus", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.nombreEstatus = :nombreEstatus")
    , @NamedQuery(name = "Cargapedidosdespacho.findByPeso", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.peso = :peso")
    , @NamedQuery(name = "Cargapedidosdespacho.findByPiezas", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.piezas = :piezas")
    , @NamedQuery(name = "Cargapedidosdespacho.findByRazonSocial", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.razonSocial = :razonSocial")
    , @NamedQuery(name = "Cargapedidosdespacho.findByTransportista", query = "SELECT c FROM Cargapedidosdespacho c WHERE c.transportista = :transportista")})
public class Cargapedidosdespacho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "codigoMovistar")
    private String codigoMovistar;
    @Column(name = "corListado")
    private BigInteger corListado;
    @Column(name = "estatus")
    private Integer estatus;
    @Size(max = 255)
    @Column(name = "factura")
    private String factura;
    @Size(max = 255)
    @Column(name = "fecha")
    private String fecha;
    @Lob
    @Size(max = 16777215)
    @Column(name = "guiaDespacho")
    private String guiaDespacho;
    @Size(max = 255)
    @Column(name = "loteDespacho")
    private String loteDespacho;
    @Size(max = 255)
    @Column(name = "nombreEstatus")
    private String nombreEstatus;
    @Size(max = 255)
    @Column(name = "peso")
    private String peso;
    @Size(max = 255)
    @Column(name = "piezas")
    private String piezas;
    @Size(max = 255)
    @Column(name = "razonSocial")
    private String razonSocial;
    @Lob
    @Size(max = 16777215)
    @Column(name = "seriales")
    private String seriales;
    @Size(max = 255)
    @Column(name = "transportista")
    private String transportista;

    public Cargapedidosdespacho() {
    }

    public Cargapedidosdespacho(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoMovistar() {
        return codigoMovistar;
    }

    public void setCodigoMovistar(String codigoMovistar) {
        this.codigoMovistar = codigoMovistar;
    }

    public BigInteger getCorListado() {
        return corListado;
    }

    public void setCorListado(BigInteger corListado) {
        this.corListado = corListado;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGuiaDespacho() {
        return guiaDespacho;
    }

    public void setGuiaDespacho(String guiaDespacho) {
        this.guiaDespacho = guiaDespacho;
    }

    public String getLoteDespacho() {
        return loteDespacho;
    }

    public void setLoteDespacho(String loteDespacho) {
        this.loteDespacho = loteDespacho;
    }

    public String getNombreEstatus() {
        return nombreEstatus;
    }

    public void setNombreEstatus(String nombreEstatus) {
        this.nombreEstatus = nombreEstatus;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPiezas() {
        return piezas;
    }

    public void setPiezas(String piezas) {
        this.piezas = piezas;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getSeriales() {
        return seriales;
    }

    public void setSeriales(String seriales) {
        this.seriales = seriales;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
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
        if (!(object instanceof Cargapedidosdespacho)) {
            return false;
        }
        Cargapedidosdespacho other = (Cargapedidosdespacho) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Cargapedidosdespacho[ id=" + id + " ]";
    }
    
}
