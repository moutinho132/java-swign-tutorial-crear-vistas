/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AKDESK23
 */
@Entity
@Table(name = "mercadeo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mercadeo.findAll", query = "SELECT m FROM Mercadeo m")
    , @NamedQuery(name = "Mercadeo.findById", query = "SELECT m FROM Mercadeo m WHERE m.id = :id")
    , @NamedQuery(name = "Mercadeo.findByCantidad", query = "SELECT m FROM Mercadeo m WHERE m.cantidad = :cantidad")
    , @NamedQuery(name = "Mercadeo.findByGuiaDespacho", query = "SELECT m FROM Mercadeo m WHERE m.guiaDespacho = :guiaDespacho")
    , @NamedQuery(name = "Mercadeo.findByLoteDespacho", query = "SELECT m FROM Mercadeo m WHERE m.loteDespacho = :loteDespacho")
    , @NamedQuery(name = "Mercadeo.findByPeso", query = "SELECT m FROM Mercadeo m WHERE m.peso = :peso")
    , @NamedQuery(name = "Mercadeo.findByPiezas", query = "SELECT m FROM Mercadeo m WHERE m.piezas = :piezas")
    , @NamedQuery(name = "Mercadeo.findByTransportista", query = "SELECT m FROM Mercadeo m WHERE m.transportista = :transportista")
    , @NamedQuery(name = "Mercadeo.findByEstatus", query = "SELECT m FROM Mercadeo m WHERE m.estatus = :estatus")
    , @NamedQuery(name = "Mercadeo.findByFechaDespachado", query = "SELECT m FROM Mercadeo m WHERE m.fechaDespachado = :fechaDespachado")
    , @NamedQuery(name = "Mercadeo.findByFechaRegistro", query = "SELECT m FROM Mercadeo m WHERE m.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Mercadeo.findByNombreEstatus", query = "SELECT m FROM Mercadeo m WHERE m.nombreEstatus = :nombreEstatus")
    , @NamedQuery(name = "Mercadeo.findByNotasEspeciales", query = "SELECT m FROM Mercadeo m WHERE m.notasEspeciales = :notasEspeciales")
    , @NamedQuery(name = "Mercadeo.findByNroMercadeo", query = "SELECT m FROM Mercadeo m WHERE m.nroMercadeo = :nroMercadeo")
    , @NamedQuery(name = "Mercadeo.findBySeriales", query = "SELECT m FROM Mercadeo m WHERE m.seriales = :seriales")
    , @NamedQuery(name = "Mercadeo.findByCedulaCliente", query = "SELECT m FROM Mercadeo m WHERE m.cedulaCliente = :cedulaCliente")
    , @NamedQuery(name = "Mercadeo.findByCorreoCliente", query = "SELECT m FROM Mercadeo m WHERE m.correoCliente = :correoCliente")
    , @NamedQuery(name = "Mercadeo.findByNombrePrin", query = "SELECT m FROM Mercadeo m WHERE m.nombrePrin = :nombrePrin")
    , @NamedQuery(name = "Mercadeo.findByTelefonoCliente", query = "SELECT m FROM Mercadeo m WHERE m.telefonoCliente = :telefonoCliente")
    , @NamedQuery(name = "Mercadeo.findByTipoPersona", query = "SELECT m FROM Mercadeo m WHERE m.tipoPersona = :tipoPersona")})
public class Mercadeo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Size(max = 255)
    @Column(name = "guiaDespacho")
    private String guiaDespacho;
    @Size(max = 255)
    @Column(name = "loteDespacho")
    private String loteDespacho;
    @Size(max = 255)
    @Column(name = "peso")
    private String peso;
    @Size(max = 255)
    @Column(name = "piezas")
    private String piezas;
    @Size(max = 255)
    @Column(name = "transportista")
    private String transportista;
    @Column(name = "estatus")
    private Integer estatus;
    @Column(name = "fechaDespachado")
    @Temporal(TemporalType.DATE)
    private Date fechaDespachado;
    @Column(name = "fechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Size(max = 255)
    @Column(name = "nombreEstatus")
    private String nombreEstatus;
    @Size(max = 255)
    @Column(name = "notasEspeciales")
    private String notasEspeciales;
    @Size(max = 255)
    @Column(name = "nroMercadeo")
    private String nroMercadeo;
    @Size(max = 255)
    @Column(name = "seriales")
    private String seriales;
    @Size(max = 255)
    @Column(name = "cedulaCliente")
    private String cedulaCliente;
    @Size(max = 255)
    @Column(name = "correoCliente")
    private String correoCliente;
    @Size(max = 255)
    @Column(name = "nombrePrin")
    private String nombrePrin;
    @Size(max = 255)
    @Column(name = "telefonoCliente")
    private String telefonoCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipoPersona")
    private int tipoPersona;
    @JoinColumn(name = "idProducto", referencedColumnName = "id")
    @ManyToOne
    private Producto idProducto;
    @JoinColumn(name = "idLote", referencedColumnName = "id")
    @ManyToOne
    private Lote idLote;
    @JoinColumn(name = "idCliente", referencedColumnName = "id")
    @ManyToOne
    private Cliente idCliente;

    public Mercadeo() {
    }

    public Mercadeo(Long id) {
        this.id = id;
    }

    public Mercadeo(Long id, int tipoPersona) {
        this.id = id;
        this.tipoPersona = tipoPersona;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    public Date getFechaDespachado() {
        return fechaDespachado;
    }

    public void setFechaDespachado(Date fechaDespachado) {
        this.fechaDespachado = fechaDespachado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombreEstatus() {
        return nombreEstatus;
    }

    public void setNombreEstatus(String nombreEstatus) {
        this.nombreEstatus = nombreEstatus;
    }

    public String getNotasEspeciales() {
        return notasEspeciales;
    }

    public void setNotasEspeciales(String notasEspeciales) {
        this.notasEspeciales = notasEspeciales;
    }

    public String getNroMercadeo() {
        return nroMercadeo;
    }

    public void setNroMercadeo(String nroMercadeo) {
        this.nroMercadeo = nroMercadeo;
    }

    public String getSeriales() {
        return seriales;
    }

    public void setSeriales(String seriales) {
        this.seriales = seriales;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getNombrePrin() {
        return nombrePrin;
    }

    public void setNombrePrin(String nombrePrin) {
        this.nombrePrin = nombrePrin;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public int getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(int tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Lote getIdLote() {
        return idLote;
    }

    public void setIdLote(Lote idLote) {
        this.idLote = idLote;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
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
        if (!(object instanceof Mercadeo)) {
            return false;
        }
        Mercadeo other = (Mercadeo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Mercadeo[ id=" + id + " ]";
    }
    
}
