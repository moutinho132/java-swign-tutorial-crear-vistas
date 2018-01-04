/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AKDESK23
 */
@Entity
@Table(name = "incidencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Incidencia.findAll", query = "SELECT i FROM Incidencia i")
    , @NamedQuery(name = "Incidencia.findById", query = "SELECT i FROM Incidencia i WHERE i.id = :id")
    , @NamedQuery(name = "Incidencia.findByEspecifiqueIncidente", query = "SELECT i FROM Incidencia i WHERE i.especifiqueIncidente = :especifiqueIncidente")
    , @NamedQuery(name = "Incidencia.findByEstatus", query = "SELECT i FROM Incidencia i WHERE i.estatus = :estatus")
    , @NamedQuery(name = "Incidencia.findByFechaDespachado", query = "SELECT i FROM Incidencia i WHERE i.fechaDespachado = :fechaDespachado")
    , @NamedQuery(name = "Incidencia.findByFechaEntregado", query = "SELECT i FROM Incidencia i WHERE i.fechaEntregado = :fechaEntregado")
    , @NamedQuery(name = "Incidencia.findByFechaIncidencia", query = "SELECT i FROM Incidencia i WHERE i.fechaIncidencia = :fechaIncidencia")
    , @NamedQuery(name = "Incidencia.findByGuiaDespacho", query = "SELECT i FROM Incidencia i WHERE i.guiaDespacho = :guiaDespacho")
    , @NamedQuery(name = "Incidencia.findByLoteDespacho", query = "SELECT i FROM Incidencia i WHERE i.loteDespacho = :loteDespacho")
    , @NamedQuery(name = "Incidencia.findByNroIncidente", query = "SELECT i FROM Incidencia i WHERE i.nroIncidente = :nroIncidente")
    , @NamedQuery(name = "Incidencia.findByObservaciones", query = "SELECT i FROM Incidencia i WHERE i.observaciones = :observaciones")
    , @NamedQuery(name = "Incidencia.findByPeso", query = "SELECT i FROM Incidencia i WHERE i.peso = :peso")
    , @NamedQuery(name = "Incidencia.findByPiezas", query = "SELECT i FROM Incidencia i WHERE i.piezas = :piezas")
    , @NamedQuery(name = "Incidencia.findByTipoIncidencia", query = "SELECT i FROM Incidencia i WHERE i.tipoIncidencia = :tipoIncidencia")
    , @NamedQuery(name = "Incidencia.findByTransportista", query = "SELECT i FROM Incidencia i WHERE i.transportista = :transportista")
    , @NamedQuery(name = "Incidencia.findByFechaCierre", query = "SELECT i FROM Incidencia i WHERE i.fechaCierre = :fechaCierre")
    , @NamedQuery(name = "Incidencia.findByNotasCliente", query = "SELECT i FROM Incidencia i WHERE i.notasCliente = :notasCliente")
    , @NamedQuery(name = "Incidencia.findByNotasWitec", query = "SELECT i FROM Incidencia i WHERE i.notasWitec = :notasWitec")
    , @NamedQuery(name = "Incidencia.findByGuiaDespachoNew", query = "SELECT i FROM Incidencia i WHERE i.guiaDespachoNew = :guiaDespachoNew")
    , @NamedQuery(name = "Incidencia.findByLoteDespachoNew", query = "SELECT i FROM Incidencia i WHERE i.loteDespachoNew = :loteDespachoNew")
    , @NamedQuery(name = "Incidencia.findByNombreEstatus", query = "SELECT i FROM Incidencia i WHERE i.nombreEstatus = :nombreEstatus")
    , @NamedQuery(name = "Incidencia.findByNotificacionAdmin", query = "SELECT i FROM Incidencia i WHERE i.notificacionAdmin = :notificacionAdmin")
    , @NamedQuery(name = "Incidencia.findByNotificacionCliente", query = "SELECT i FROM Incidencia i WHERE i.notificacionCliente = :notificacionCliente")
    , @NamedQuery(name = "Incidencia.findByPesoNew", query = "SELECT i FROM Incidencia i WHERE i.pesoNew = :pesoNew")
    , @NamedQuery(name = "Incidencia.findByPiezasNew", query = "SELECT i FROM Incidencia i WHERE i.piezasNew = :piezasNew")
    , @NamedQuery(name = "Incidencia.findByRecibido", query = "SELECT i FROM Incidencia i WHERE i.recibido = :recibido")
    , @NamedQuery(name = "Incidencia.findBySerialNuevo", query = "SELECT i FROM Incidencia i WHERE i.serialNuevo = :serialNuevo")
    , @NamedQuery(name = "Incidencia.findBySerialReportado", query = "SELECT i FROM Incidencia i WHERE i.serialReportado = :serialReportado")
    , @NamedQuery(name = "Incidencia.findByTransportistaNew", query = "SELECT i FROM Incidencia i WHERE i.transportistaNew = :transportistaNew")
    , @NamedQuery(name = "Incidencia.findByDiasResolucion", query = "SELECT i FROM Incidencia i WHERE i.diasResolucion = :diasResolucion")})
public class Incidencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 500)
    @Column(name = "especifiqueIncidente")
    private String especifiqueIncidente;
    @Column(name = "estatus")
    private Integer estatus;
    @Column(name = "fechaDespachado")
    @Temporal(TemporalType.DATE)
    private Date fechaDespachado;
    @Column(name = "fechaEntregado")
    @Temporal(TemporalType.DATE)
    private Date fechaEntregado;
    @Column(name = "fechaIncidencia")
    @Temporal(TemporalType.DATE)
    private Date fechaIncidencia;
    @Size(max = 255)
    @Column(name = "guiaDespacho")
    private String guiaDespacho;
    @Size(max = 255)
    @Column(name = "loteDespacho")
    private String loteDespacho;
    @Size(max = 255)
    @Column(name = "nroIncidente")
    private String nroIncidente;
    @Size(max = 255)
    @Column(name = "observaciones")
    private String observaciones;
    @Size(max = 255)
    @Column(name = "peso")
    private String peso;
    @Size(max = 255)
    @Column(name = "piezas")
    private String piezas;
    @Column(name = "tipoIncidencia")
    private Integer tipoIncidencia;
    @Size(max = 255)
    @Column(name = "transportista")
    private String transportista;
    @Column(name = "fechaCierre")
    @Temporal(TemporalType.DATE)
    private Date fechaCierre;
    @Size(max = 500)
    @Column(name = "notasCliente")
    private String notasCliente;
    @Size(max = 500)
    @Column(name = "notasWitec")
    private String notasWitec;
    @Size(max = 255)
    @Column(name = "guiaDespachoNew")
    private String guiaDespachoNew;
    @Size(max = 255)
    @Column(name = "loteDespachoNew")
    private String loteDespachoNew;
    @Size(max = 255)
    @Column(name = "nombreEstatus")
    private String nombreEstatus;
    @Column(name = "notificacionAdmin")
    private Integer notificacionAdmin;
    @Column(name = "notificacionCliente")
    private Integer notificacionCliente;
    @Size(max = 255)
    @Column(name = "pesoNew")
    private String pesoNew;
    @Size(max = 255)
    @Column(name = "piezasNew")
    private String piezasNew;
    @Size(max = 255)
    @Column(name = "recibido")
    private String recibido;
    @Size(max = 255)
    @Column(name = "serialNuevo")
    private String serialNuevo;
    @Size(max = 255)
    @Column(name = "serialReportado")
    private String serialReportado;
    @Size(max = 255)
    @Column(name = "transportistaNew")
    private String transportistaNew;
    @Column(name = "diasResolucion")
    private Integer diasResolucion;
    @OneToMany(mappedBy = "incidenciaId")
    private List<Fotosincidencia> fotosincidenciaList;
    @JoinColumn(name = "loteIdNuevo", referencedColumnName = "id")
    @ManyToOne
    private Lote loteIdNuevo;
    @JoinColumn(name = "idLote", referencedColumnName = "id")
    @ManyToOne
    private Lote idLote;
    @JoinColumn(name = "idPedido", referencedColumnName = "id")
    @ManyToOne
    private Pedido idPedido;
    @JoinColumn(name = "idCliente", referencedColumnName = "id")
    @ManyToOne
    private Cliente idCliente;

    public Incidencia() {
    }

    public Incidencia(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEspecifiqueIncidente() {
        return especifiqueIncidente;
    }

    public void setEspecifiqueIncidente(String especifiqueIncidente) {
        this.especifiqueIncidente = especifiqueIncidente;
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

    public Date getFechaEntregado() {
        return fechaEntregado;
    }

    public void setFechaEntregado(Date fechaEntregado) {
        this.fechaEntregado = fechaEntregado;
    }

    public Date getFechaIncidencia() {
        return fechaIncidencia;
    }

    public void setFechaIncidencia(Date fechaIncidencia) {
        this.fechaIncidencia = fechaIncidencia;
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

    public String getNroIncidente() {
        return nroIncidente;
    }

    public void setNroIncidente(String nroIncidente) {
        this.nroIncidente = nroIncidente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public Integer getTipoIncidencia() {
        return tipoIncidencia;
    }

    public void setTipoIncidencia(Integer tipoIncidencia) {
        this.tipoIncidencia = tipoIncidencia;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getNotasCliente() {
        return notasCliente;
    }

    public void setNotasCliente(String notasCliente) {
        this.notasCliente = notasCliente;
    }

    public String getNotasWitec() {
        return notasWitec;
    }

    public void setNotasWitec(String notasWitec) {
        this.notasWitec = notasWitec;
    }

    public String getGuiaDespachoNew() {
        return guiaDespachoNew;
    }

    public void setGuiaDespachoNew(String guiaDespachoNew) {
        this.guiaDespachoNew = guiaDespachoNew;
    }

    public String getLoteDespachoNew() {
        return loteDespachoNew;
    }

    public void setLoteDespachoNew(String loteDespachoNew) {
        this.loteDespachoNew = loteDespachoNew;
    }

    public String getNombreEstatus() {
        return nombreEstatus;
    }

    public void setNombreEstatus(String nombreEstatus) {
        this.nombreEstatus = nombreEstatus;
    }

    public Integer getNotificacionAdmin() {
        return notificacionAdmin;
    }

    public void setNotificacionAdmin(Integer notificacionAdmin) {
        this.notificacionAdmin = notificacionAdmin;
    }

    public Integer getNotificacionCliente() {
        return notificacionCliente;
    }

    public void setNotificacionCliente(Integer notificacionCliente) {
        this.notificacionCliente = notificacionCliente;
    }

    public String getPesoNew() {
        return pesoNew;
    }

    public void setPesoNew(String pesoNew) {
        this.pesoNew = pesoNew;
    }

    public String getPiezasNew() {
        return piezasNew;
    }

    public void setPiezasNew(String piezasNew) {
        this.piezasNew = piezasNew;
    }

    public String getRecibido() {
        return recibido;
    }

    public void setRecibido(String recibido) {
        this.recibido = recibido;
    }

    public String getSerialNuevo() {
        return serialNuevo;
    }

    public void setSerialNuevo(String serialNuevo) {
        this.serialNuevo = serialNuevo;
    }

    public String getSerialReportado() {
        return serialReportado;
    }

    public void setSerialReportado(String serialReportado) {
        this.serialReportado = serialReportado;
    }

    public String getTransportistaNew() {
        return transportistaNew;
    }

    public void setTransportistaNew(String transportistaNew) {
        this.transportistaNew = transportistaNew;
    }

    public Integer getDiasResolucion() {
        return diasResolucion;
    }

    public void setDiasResolucion(Integer diasResolucion) {
        this.diasResolucion = diasResolucion;
    }

    @XmlTransient
    public List<Fotosincidencia> getFotosincidenciaList() {
        return fotosincidenciaList;
    }

    public void setFotosincidenciaList(List<Fotosincidencia> fotosincidenciaList) {
        this.fotosincidenciaList = fotosincidenciaList;
    }

    public Lote getLoteIdNuevo() {
        return loteIdNuevo;
    }

    public void setLoteIdNuevo(Lote loteIdNuevo) {
        this.loteIdNuevo = loteIdNuevo;
    }

    public Lote getIdLote() {
        return idLote;
    }

    public void setIdLote(Lote idLote) {
        this.idLote = idLote;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
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
        if (!(object instanceof Incidencia)) {
            return false;
        }
        Incidencia other = (Incidencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Incidencia[ id=" + id + " ]";
    }
    
}
