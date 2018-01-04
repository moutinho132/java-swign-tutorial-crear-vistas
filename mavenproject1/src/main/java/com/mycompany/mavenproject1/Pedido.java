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
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findById", query = "SELECT p FROM Pedido p WHERE p.id = :id")
    , @NamedQuery(name = "Pedido.findByCorPedido", query = "SELECT p FROM Pedido p WHERE p.corPedido = :corPedido")
    , @NamedQuery(name = "Pedido.findByNroPedido", query = "SELECT p FROM Pedido p WHERE p.nroPedido = :nroPedido")
    , @NamedQuery(name = "Pedido.findByCantidad", query = "SELECT p FROM Pedido p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "Pedido.findByFechaDespacho", query = "SELECT p FROM Pedido p WHERE p.fechaDespacho = :fechaDespacho")
    , @NamedQuery(name = "Pedido.findByFechaPedido", query = "SELECT p FROM Pedido p WHERE p.fechaPedido = :fechaPedido")
    , @NamedQuery(name = "Pedido.findByNotas", query = "SELECT p FROM Pedido p WHERE p.notas = :notas")
    , @NamedQuery(name = "Pedido.findByNroComprobante", query = "SELECT p FROM Pedido p WHERE p.nroComprobante = :nroComprobante")
    , @NamedQuery(name = "Pedido.findByBancoOrigen", query = "SELECT p FROM Pedido p WHERE p.bancoOrigen = :bancoOrigen")
    , @NamedQuery(name = "Pedido.findByRifCiTitular", query = "SELECT p FROM Pedido p WHERE p.rifCiTitular = :rifCiTitular")
    , @NamedQuery(name = "Pedido.findByMontoDeposito", query = "SELECT p FROM Pedido p WHERE p.montoDeposito = :montoDeposito")
    , @NamedQuery(name = "Pedido.findByRetencion", query = "SELECT p FROM Pedido p WHERE p.retencion = :retencion")
    , @NamedQuery(name = "Pedido.findByNotasAdmin", query = "SELECT p FROM Pedido p WHERE p.notasAdmin = :notasAdmin")
    , @NamedQuery(name = "Pedido.findByIncidencia", query = "SELECT p FROM Pedido p WHERE p.incidencia = :incidencia")
    , @NamedQuery(name = "Pedido.findByNroFactura", query = "SELECT p FROM Pedido p WHERE p.nroFactura = :nroFactura")
    , @NamedQuery(name = "Pedido.findByTransportista", query = "SELECT p FROM Pedido p WHERE p.transportista = :transportista")
    , @NamedQuery(name = "Pedido.findByPiezas", query = "SELECT p FROM Pedido p WHERE p.piezas = :piezas")
    , @NamedQuery(name = "Pedido.findByPeso", query = "SELECT p FROM Pedido p WHERE p.peso = :peso")
    , @NamedQuery(name = "Pedido.findByNroPropuesta", query = "SELECT p FROM Pedido p WHERE p.nroPropuesta = :nroPropuesta")
    , @NamedQuery(name = "Pedido.findByIdAnt", query = "SELECT p FROM Pedido p WHERE p.idAnt = :idAnt")
    , @NamedQuery(name = "Pedido.findByRecibido", query = "SELECT p FROM Pedido p WHERE p.recibido = :recibido")
    , @NamedQuery(name = "Pedido.findByFechaDespachado", query = "SELECT p FROM Pedido p WHERE p.fechaDespachado = :fechaDespachado")
    , @NamedQuery(name = "Pedido.findByFechaEntregado", query = "SELECT p FROM Pedido p WHERE p.fechaEntregado = :fechaEntregado")
    , @NamedQuery(name = "Pedido.findByFechaConfirmado", query = "SELECT p FROM Pedido p WHERE p.fechaConfirmado = :fechaConfirmado")
    , @NamedQuery(name = "Pedido.findByLoteDespacho", query = "SELECT p FROM Pedido p WHERE p.loteDespacho = :loteDespacho")
    , @NamedQuery(name = "Pedido.findByIvaPorc", query = "SELECT p FROM Pedido p WHERE p.ivaPorc = :ivaPorc")
    , @NamedQuery(name = "Pedido.findByFechaFactura", query = "SELECT p FROM Pedido p WHERE p.fechaFactura = :fechaFactura")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "corPedido")
    private String corPedido;
    @Size(max = 500)
    @Column(name = "nroPedido")
    private String nroPedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaDespacho")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDespacho;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaPedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPedido;
    @Size(max = 500)
    @Column(name = "notas")
    private String notas;
    @Size(max = 300)
    @Column(name = "nroComprobante")
    private String nroComprobante;
    @Lob
    @Size(max = 16777215)
    @Column(name = "comprobantePago")
    private String comprobantePago;
    @Size(max = 300)
    @Column(name = "bancoOrigen")
    private String bancoOrigen;
    @Size(max = 100)
    @Column(name = "rifCiTitular")
    private String rifCiTitular;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montoDeposito")
    private Float montoDeposito;
    @Size(max = 5)
    @Column(name = "retencion")
    private String retencion;
    @Size(max = 500)
    @Column(name = "notasAdmin")
    private String notasAdmin;
    @Size(max = 200)
    @Column(name = "incidencia")
    private String incidencia;
    @Size(max = 50)
    @Column(name = "nroFactura")
    private String nroFactura;
    @Lob
    @Size(max = 16777215)
    @Column(name = "seriales")
    private String seriales;
    @Lob
    @Size(max = 16777215)
    @Column(name = "guiaDespacho")
    private String guiaDespacho;
    @Size(max = 60)
    @Column(name = "transportista")
    private String transportista;
    @Size(max = 50)
    @Column(name = "piezas")
    private String piezas;
    @Size(max = 50)
    @Column(name = "peso")
    private String peso;
    @Size(max = 255)
    @Column(name = "nroPropuesta")
    private String nroPropuesta;
    @Column(name = "idAnt")
    private BigInteger idAnt;
    @Size(max = 10)
    @Column(name = "recibido")
    private String recibido;
    @Column(name = "fechaDespachado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDespachado;
    @Column(name = "fechaEntregado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntregado;
    @Column(name = "fechaConfirmado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConfirmado;
    @Size(max = 100)
    @Column(name = "loteDespacho")
    private String loteDespacho;
    @Size(max = 255)
    @Column(name = "ivaPorc")
    private String ivaPorc;
    @Column(name = "fechaFactura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFactura;
    @OneToMany(mappedBy = "idPedido")
    private List<Incidencia> incidenciaList;
    @OneToMany(mappedBy = "idPedido")
    private List<Serial> serialList;
    @JoinColumn(name = "idCliente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "estatus", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Estatus estatus;
    @JoinColumn(name = "idPropuesta", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Propuesta idPropuesta;

    public Pedido() {
    }

    public Pedido(Long id) {
        this.id = id;
    }

    public Pedido(Long id, String corPedido, int cantidad, Date fechaDespacho, Date fechaPedido) {
        this.id = id;
        this.corPedido = corPedido;
        this.cantidad = cantidad;
        this.fechaDespacho = fechaDespacho;
        this.fechaPedido = fechaPedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorPedido() {
        return corPedido;
    }

    public void setCorPedido(String corPedido) {
        this.corPedido = corPedido;
    }

    public String getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(String nroPedido) {
        this.nroPedido = nroPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(Date fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(String nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public String getComprobantePago() {
        return comprobantePago;
    }

    public void setComprobantePago(String comprobantePago) {
        this.comprobantePago = comprobantePago;
    }

    public String getBancoOrigen() {
        return bancoOrigen;
    }

    public void setBancoOrigen(String bancoOrigen) {
        this.bancoOrigen = bancoOrigen;
    }

    public String getRifCiTitular() {
        return rifCiTitular;
    }

    public void setRifCiTitular(String rifCiTitular) {
        this.rifCiTitular = rifCiTitular;
    }

    public Float getMontoDeposito() {
        return montoDeposito;
    }

    public void setMontoDeposito(Float montoDeposito) {
        this.montoDeposito = montoDeposito;
    }

    public String getRetencion() {
        return retencion;
    }

    public void setRetencion(String retencion) {
        this.retencion = retencion;
    }

    public String getNotasAdmin() {
        return notasAdmin;
    }

    public void setNotasAdmin(String notasAdmin) {
        this.notasAdmin = notasAdmin;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getSeriales() {
        return seriales;
    }

    public void setSeriales(String seriales) {
        this.seriales = seriales;
    }

    public String getGuiaDespacho() {
        return guiaDespacho;
    }

    public void setGuiaDespacho(String guiaDespacho) {
        this.guiaDespacho = guiaDespacho;
    }

    public String getTransportista() {
        return transportista;
    }

    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }

    public String getPiezas() {
        return piezas;
    }

    public void setPiezas(String piezas) {
        this.piezas = piezas;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getNroPropuesta() {
        return nroPropuesta;
    }

    public void setNroPropuesta(String nroPropuesta) {
        this.nroPropuesta = nroPropuesta;
    }

    public BigInteger getIdAnt() {
        return idAnt;
    }

    public void setIdAnt(BigInteger idAnt) {
        this.idAnt = idAnt;
    }

    public String getRecibido() {
        return recibido;
    }

    public void setRecibido(String recibido) {
        this.recibido = recibido;
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

    public Date getFechaConfirmado() {
        return fechaConfirmado;
    }

    public void setFechaConfirmado(Date fechaConfirmado) {
        this.fechaConfirmado = fechaConfirmado;
    }

    public String getLoteDespacho() {
        return loteDespacho;
    }

    public void setLoteDespacho(String loteDespacho) {
        this.loteDespacho = loteDespacho;
    }

    public String getIvaPorc() {
        return ivaPorc;
    }

    public void setIvaPorc(String ivaPorc) {
        this.ivaPorc = ivaPorc;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    @XmlTransient
    public List<Incidencia> getIncidenciaList() {
        return incidenciaList;
    }

    public void setIncidenciaList(List<Incidencia> incidenciaList) {
        this.incidenciaList = incidenciaList;
    }

    @XmlTransient
    public List<Serial> getSerialList() {
        return serialList;
    }

    public void setSerialList(List<Serial> serialList) {
        this.serialList = serialList;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public Propuesta getIdPropuesta() {
        return idPropuesta;
    }

    public void setIdPropuesta(Propuesta idPropuesta) {
        this.idPropuesta = idPropuesta;
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
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Pedido[ id=" + id + " ]";
    }
    
}
