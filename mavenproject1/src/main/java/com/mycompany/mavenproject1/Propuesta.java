/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AKDESK23
 */
@Entity
@Table(name = "propuesta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propuesta.findAll", query = "SELECT p FROM Propuesta p")
    , @NamedQuery(name = "Propuesta.findById", query = "SELECT p FROM Propuesta p WHERE p.id = :id")
    , @NamedQuery(name = "Propuesta.findByNroPropuesta", query = "SELECT p FROM Propuesta p WHERE p.nroPropuesta = :nroPropuesta")
    , @NamedQuery(name = "Propuesta.findByPrecioUnitario", query = "SELECT p FROM Propuesta p WHERE p.precioUnitario = :precioUnitario")
    , @NamedQuery(name = "Propuesta.findByFechaValido", query = "SELECT p FROM Propuesta p WHERE p.fechaValido = :fechaValido")
    , @NamedQuery(name = "Propuesta.findByTipoDirigido", query = "SELECT p FROM Propuesta p WHERE p.tipoDirigido = :tipoDirigido")
    , @NamedQuery(name = "Propuesta.findByDirigido", query = "SELECT p FROM Propuesta p WHERE p.dirigido = :dirigido")
    , @NamedQuery(name = "Propuesta.findByDiaDespacho", query = "SELECT p FROM Propuesta p WHERE p.diaDespacho = :diaDespacho")
    , @NamedQuery(name = "Propuesta.findByDisponibilidad", query = "SELECT p FROM Propuesta p WHERE p.disponibilidad = :disponibilidad")
    , @NamedQuery(name = "Propuesta.findByLimiteCliente", query = "SELECT p FROM Propuesta p WHERE p.limiteCliente = :limiteCliente")
    , @NamedQuery(name = "Propuesta.findByEstatus", query = "SELECT p FROM Propuesta p WHERE p.estatus = :estatus")
    , @NamedQuery(name = "Propuesta.findByCantidadMinimaCompra", query = "SELECT p FROM Propuesta p WHERE p.cantidadMinimaCompra = :cantidadMinimaCompra")
    , @NamedQuery(name = "Propuesta.findByIdAntiguo", query = "SELECT p FROM Propuesta p WHERE p.idAntiguo = :idAntiguo")
    , @NamedQuery(name = "Propuesta.findByDescripcion", query = "SELECT p FROM Propuesta p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Propuesta.findByMoneda", query = "SELECT p FROM Propuesta p WHERE p.moneda = :moneda")})
public class Propuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nroPropuesta")
    private String nroPropuesta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioUnitario")
    private float precioUnitario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaValido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaValido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipoDirigido")
    private int tipoDirigido;
    @Size(max = 20)
    @Column(name = "dirigido")
    private String dirigido;
    @Size(max = 30)
    @Column(name = "diaDespacho")
    private String diaDespacho;
    @Basic(optional = false)
    @NotNull
    @Column(name = "disponibilidad")
    private int disponibilidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "limiteCliente")
    private int limiteCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estatus")
    private int estatus;
    @Column(name = "cantidadMinimaCompra")
    private Integer cantidadMinimaCompra;
    @Column(name = "idAntiguo")
    private BigInteger idAntiguo;
    @Size(max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "moneda")
    private String moneda;
    @JoinColumn(name = "estadoId", referencedColumnName = "id")
    @ManyToOne
    private Estadociudad estadoId;
    @JoinColumn(name = "idLote", referencedColumnName = "id")
    @ManyToOne
    private Lote idLote;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPropuesta")
    private List<Pedido> pedidoList;

    public Propuesta() {
    }

    public Propuesta(Long id) {
        this.id = id;
    }

    public Propuesta(Long id, String nroPropuesta, float precioUnitario, Date fechaValido, int tipoDirigido, int disponibilidad, int limiteCliente, int estatus) {
        this.id = id;
        this.nroPropuesta = nroPropuesta;
        this.precioUnitario = precioUnitario;
        this.fechaValido = fechaValido;
        this.tipoDirigido = tipoDirigido;
        this.disponibilidad = disponibilidad;
        this.limiteCliente = limiteCliente;
        this.estatus = estatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNroPropuesta() {
        return nroPropuesta;
    }

    public void setNroPropuesta(String nroPropuesta) {
        this.nroPropuesta = nroPropuesta;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Date getFechaValido() {
        return fechaValido;
    }

    public void setFechaValido(Date fechaValido) {
        this.fechaValido = fechaValido;
    }

    public int getTipoDirigido() {
        return tipoDirigido;
    }

    public void setTipoDirigido(int tipoDirigido) {
        this.tipoDirigido = tipoDirigido;
    }

    public String getDirigido() {
        return dirigido;
    }

    public void setDirigido(String dirigido) {
        this.dirigido = dirigido;
    }

    public String getDiaDespacho() {
        return diaDespacho;
    }

    public void setDiaDespacho(String diaDespacho) {
        this.diaDespacho = diaDespacho;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getLimiteCliente() {
        return limiteCliente;
    }

    public void setLimiteCliente(int limiteCliente) {
        this.limiteCliente = limiteCliente;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public Integer getCantidadMinimaCompra() {
        return cantidadMinimaCompra;
    }

    public void setCantidadMinimaCompra(Integer cantidadMinimaCompra) {
        this.cantidadMinimaCompra = cantidadMinimaCompra;
    }

    public BigInteger getIdAntiguo() {
        return idAntiguo;
    }

    public void setIdAntiguo(BigInteger idAntiguo) {
        this.idAntiguo = idAntiguo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Estadociudad getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Estadociudad estadoId) {
        this.estadoId = estadoId;
    }

    public Lote getIdLote() {
        return idLote;
    }

    public void setIdLote(Lote idLote) {
        this.idLote = idLote;
    }

    @XmlTransient
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
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
        if (!(object instanceof Propuesta)) {
            return false;
        }
        Propuesta other = (Propuesta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Propuesta[ id=" + id + " ]";
    }
    
}
