/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AKDESK23
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByRazonsocial", query = "SELECT c FROM Cliente c WHERE c.razonsocial = :razonsocial")
    , @NamedQuery(name = "Cliente.findByRif", query = "SELECT c FROM Cliente c WHERE c.rif = :rif")
    , @NamedQuery(name = "Cliente.findByCodigodeudor", query = "SELECT c FROM Cliente c WHERE c.codigodeudor = :codigodeudor")
    , @NamedQuery(name = "Cliente.findByCodigocomercial", query = "SELECT c FROM Cliente c WHERE c.codigocomercial = :codigocomercial")
    , @NamedQuery(name = "Cliente.findById", query = "SELECT c FROM Cliente c WHERE c.id = :id")
    , @NamedQuery(name = "Cliente.findByCentrocomercial", query = "SELECT c FROM Cliente c WHERE c.centrocomercial = :centrocomercial")
    , @NamedQuery(name = "Cliente.findByEdificio", query = "SELECT c FROM Cliente c WHERE c.edificio = :edificio")
    , @NamedQuery(name = "Cliente.findByPiso", query = "SELECT c FROM Cliente c WHERE c.piso = :piso")
    , @NamedQuery(name = "Cliente.findByLocal", query = "SELECT c FROM Cliente c WHERE c.local = :local")
    , @NamedQuery(name = "Cliente.findByOficina", query = "SELECT c FROM Cliente c WHERE c.oficina = :oficina")
    , @NamedQuery(name = "Cliente.findByAvenida", query = "SELECT c FROM Cliente c WHERE c.avenida = :avenida")
    , @NamedQuery(name = "Cliente.findByCalle", query = "SELECT c FROM Cliente c WHERE c.calle = :calle")
    , @NamedQuery(name = "Cliente.findByUrbanizacion", query = "SELECT c FROM Cliente c WHERE c.urbanizacion = :urbanizacion")
    , @NamedQuery(name = "Cliente.findByCodigopostal", query = "SELECT c FROM Cliente c WHERE c.codigopostal = :codigopostal")
    , @NamedQuery(name = "Cliente.findByPuntoreferencia", query = "SELECT c FROM Cliente c WHERE c.puntoreferencia = :puntoreferencia")
    , @NamedQuery(name = "Cliente.findBySector", query = "SELECT c FROM Cliente c WHERE c.sector = :sector")
    , @NamedQuery(name = "Cliente.findByParroquia", query = "SELECT c FROM Cliente c WHERE c.parroquia = :parroquia")
    , @NamedQuery(name = "Cliente.findByMunicipio", query = "SELECT c FROM Cliente c WHERE c.municipio = :municipio")
    , @NamedQuery(name = "Cliente.findByEstatus", query = "SELECT c FROM Cliente c WHERE c.estatus = :estatus")
    , @NamedQuery(name = "Cliente.findByEstatuswitec", query = "SELECT c FROM Cliente c WHERE c.estatuswitec = :estatuswitec")
    , @NamedQuery(name = "Cliente.findByEstadoactualizacion", query = "SELECT c FROM Cliente c WHERE c.estadoactualizacion = :estadoactualizacion")
    , @NamedQuery(name = "Cliente.findByDiadespacho", query = "SELECT c FROM Cliente c WHERE c.diadespacho = :diadespacho")
    , @NamedQuery(name = "Cliente.findByNotas", query = "SELECT c FROM Cliente c WHERE c.notas = :notas")
    , @NamedQuery(name = "Cliente.findByPassword", query = "SELECT c FROM Cliente c WHERE c.password = :password")
    , @NamedQuery(name = "Cliente.findByNombrePrin", query = "SELECT c FROM Cliente c WHERE c.nombrePrin = :nombrePrin")
    , @NamedQuery(name = "Cliente.findByTelefonoCelPrin", query = "SELECT c FROM Cliente c WHERE c.telefonoCelPrin = :telefonoCelPrin")
    , @NamedQuery(name = "Cliente.findByTelefonoOficinaPrin", query = "SELECT c FROM Cliente c WHERE c.telefonoOficinaPrin = :telefonoOficinaPrin")
    , @NamedQuery(name = "Cliente.findByCorreoPrin", query = "SELECT c FROM Cliente c WHERE c.correoPrin = :correoPrin")
    , @NamedQuery(name = "Cliente.findByCorreoAlternoPrin", query = "SELECT c FROM Cliente c WHERE c.correoAlternoPrin = :correoAlternoPrin")
    , @NamedQuery(name = "Cliente.findByNombreSeg", query = "SELECT c FROM Cliente c WHERE c.nombreSeg = :nombreSeg")
    , @NamedQuery(name = "Cliente.findByTelefonoCelSeg", query = "SELECT c FROM Cliente c WHERE c.telefonoCelSeg = :telefonoCelSeg")
    , @NamedQuery(name = "Cliente.findByTelefonoOficinaSeg", query = "SELECT c FROM Cliente c WHERE c.telefonoOficinaSeg = :telefonoOficinaSeg")
    , @NamedQuery(name = "Cliente.findByCorreoSeg", query = "SELECT c FROM Cliente c WHERE c.correoSeg = :correoSeg")
    , @NamedQuery(name = "Cliente.findByCorreoAlternoSeg", query = "SELECT c FROM Cliente c WHERE c.correoAlternoSeg = :correoAlternoSeg")
    , @NamedQuery(name = "Cliente.findByRegionMovistar", query = "SELECT c FROM Cliente c WHERE c.regionMovistar = :regionMovistar")
    , @NamedQuery(name = "Cliente.findBySupervisorMovistar", query = "SELECT c FROM Cliente c WHERE c.supervisorMovistar = :supervisorMovistar")
    , @NamedQuery(name = "Cliente.findByGerenteComercial", query = "SELECT c FROM Cliente c WHERE c.gerenteComercial = :gerenteComercial")
    , @NamedQuery(name = "Cliente.findByDireccionComercial", query = "SELECT c FROM Cliente c WHERE c.direccionComercial = :direccionComercial")
    , @NamedQuery(name = "Cliente.findByZonaComercial", query = "SELECT c FROM Cliente c WHERE c.zonaComercial = :zonaComercial")
    , @NamedQuery(name = "Cliente.findByNombreZona", query = "SELECT c FROM Cliente c WHERE c.nombreZona = :nombreZona")
    , @NamedQuery(name = "Cliente.findByIdAnt", query = "SELECT c FROM Cliente c WHERE c.idAnt = :idAnt")
    , @NamedQuery(name = "Cliente.findByCantPedidos", query = "SELECT c FROM Cliente c WHERE c.cantPedidos = :cantPedidos")
    , @NamedQuery(name = "Cliente.findByLatitud", query = "SELECT c FROM Cliente c WHERE c.latitud = :latitud")
    , @NamedQuery(name = "Cliente.findByLongitud", query = "SELECT c FROM Cliente c WHERE c.longitud = :longitud")
    , @NamedQuery(name = "Cliente.findByEstatusPoliticas", query = "SELECT c FROM Cliente c WHERE c.estatusPoliticas = :estatusPoliticas")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Size(max = 20)
    @Column(name = "rif")
    private String rif;
    @Size(max = 50)
    @Column(name = "codigodeudor")
    private String codigodeudor;
    @Size(max = 50)
    @Column(name = "codigocomercial")
    private String codigocomercial;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "centrocomercial")
    private String centrocomercial;
    @Size(max = 70)
    @Column(name = "edificio")
    private String edificio;
    @Size(max = 50)
    @Column(name = "piso")
    private String piso;
    @Size(max = 40)
    @Column(name = "local")
    private String local;
    @Size(max = 60)
    @Column(name = "oficina")
    private String oficina;
    @Size(max = 70)
    @Column(name = "avenida")
    private String avenida;
    @Size(max = 60)
    @Column(name = "calle")
    private String calle;
    @Size(max = 100)
    @Column(name = "urbanizacion")
    private String urbanizacion;
    @Size(max = 20)
    @Column(name = "codigopostal")
    private String codigopostal;
    @Size(max = 700)
    @Column(name = "puntoreferencia")
    private String puntoreferencia;
    @Size(max = 100)
    @Column(name = "sector")
    private String sector;
    @Size(max = 100)
    @Column(name = "parroquia")
    private String parroquia;
    @Size(max = 100)
    @Column(name = "municipio")
    private String municipio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estatus")
    private int estatus;
    @Column(name = "estatuswitec")
    private Integer estatuswitec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estadoactualizacion")
    private int estadoactualizacion;
    @Column(name = "diadespacho")
    private BigInteger diadespacho;
    @Size(max = 600)
    @Column(name = "notas")
    private String notas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "password")
    private String password;
    @Size(max = 100)
    @Column(name = "nombrePrin")
    private String nombrePrin;
    @Size(max = 20)
    @Column(name = "telefonoCelPrin")
    private String telefonoCelPrin;
    @Size(max = 20)
    @Column(name = "telefonoOficinaPrin")
    private String telefonoOficinaPrin;
    @Size(max = 100)
    @Column(name = "correoPrin")
    private String correoPrin;
    @Size(max = 100)
    @Column(name = "correoAlternoPrin")
    private String correoAlternoPrin;
    @Size(max = 100)
    @Column(name = "nombreSeg")
    private String nombreSeg;
    @Size(max = 20)
    @Column(name = "telefonoCelSeg")
    private String telefonoCelSeg;
    @Size(max = 20)
    @Column(name = "telefonoOficinaSeg")
    private String telefonoOficinaSeg;
    @Size(max = 100)
    @Column(name = "correoSeg")
    private String correoSeg;
    @Size(max = 100)
    @Column(name = "correoAlternoSeg")
    private String correoAlternoSeg;
    @Size(max = 100)
    @Column(name = "regionMovistar")
    private String regionMovistar;
    @Size(max = 100)
    @Column(name = "supervisorMovistar")
    private String supervisorMovistar;
    @Size(max = 100)
    @Column(name = "gerenteComercial")
    private String gerenteComercial;
    @Size(max = 100)
    @Column(name = "direccionComercial")
    private String direccionComercial;
    @Size(max = 100)
    @Column(name = "zonaComercial")
    private String zonaComercial;
    @Size(max = 100)
    @Column(name = "nombreZona")
    private String nombreZona;
    @Column(name = "idAnt")
    private BigInteger idAnt;
    @Column(name = "cantPedidos")
    private Integer cantPedidos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitud")
    private Double latitud;
    @Column(name = "longitud")
    private Double longitud;
    @Column(name = "estatusPoliticas")
    private Integer estatusPoliticas;
    @OneToMany(mappedBy = "idCliente")
    private List<Incidencia> incidenciaList;
    @OneToMany(mappedBy = "idCliente")
    private List<Mercadeo> mercadeoList;
    @JoinColumn(name = "ciudadId", referencedColumnName = "id")
    @ManyToOne
    private Estadociudad ciudadId;
    @JoinColumn(name = "estadoId", referencedColumnName = "id")
    @ManyToOne
    private Estadociudad estadoId;
    @JoinColumn(name = "grupoId", referencedColumnName = "id")
    @ManyToOne
    private Grupo grupoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private List<Pedido> pedidoList;

    public Cliente() {
    }

    public Cliente(Long id) {
        this.id = id;
    }

    public Cliente(Long id, String razonsocial, int estatus, int estadoactualizacion, String password) {
        this.id = id;
        this.razonsocial = razonsocial;
        this.estatus = estatus;
        this.estadoactualizacion = estadoactualizacion;
        this.password = password;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getCodigodeudor() {
        return codigodeudor;
    }

    public void setCodigodeudor(String codigodeudor) {
        this.codigodeudor = codigodeudor;
    }

    public String getCodigocomercial() {
        return codigocomercial;
    }

    public void setCodigocomercial(String codigocomercial) {
        this.codigocomercial = codigocomercial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCentrocomercial() {
        return centrocomercial;
    }

    public void setCentrocomercial(String centrocomercial) {
        this.centrocomercial = centrocomercial;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getPuntoreferencia() {
        return puntoreferencia;
    }

    public void setPuntoreferencia(String puntoreferencia) {
        this.puntoreferencia = puntoreferencia;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public Integer getEstatuswitec() {
        return estatuswitec;
    }

    public void setEstatuswitec(Integer estatuswitec) {
        this.estatuswitec = estatuswitec;
    }

    public int getEstadoactualizacion() {
        return estadoactualizacion;
    }

    public void setEstadoactualizacion(int estadoactualizacion) {
        this.estadoactualizacion = estadoactualizacion;
    }

    public BigInteger getDiadespacho() {
        return diadespacho;
    }

    public void setDiadespacho(BigInteger diadespacho) {
        this.diadespacho = diadespacho;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombrePrin() {
        return nombrePrin;
    }

    public void setNombrePrin(String nombrePrin) {
        this.nombrePrin = nombrePrin;
    }

    public String getTelefonoCelPrin() {
        return telefonoCelPrin;
    }

    public void setTelefonoCelPrin(String telefonoCelPrin) {
        this.telefonoCelPrin = telefonoCelPrin;
    }

    public String getTelefonoOficinaPrin() {
        return telefonoOficinaPrin;
    }

    public void setTelefonoOficinaPrin(String telefonoOficinaPrin) {
        this.telefonoOficinaPrin = telefonoOficinaPrin;
    }

    public String getCorreoPrin() {
        return correoPrin;
    }

    public void setCorreoPrin(String correoPrin) {
        this.correoPrin = correoPrin;
    }

    public String getCorreoAlternoPrin() {
        return correoAlternoPrin;
    }

    public void setCorreoAlternoPrin(String correoAlternoPrin) {
        this.correoAlternoPrin = correoAlternoPrin;
    }

    public String getNombreSeg() {
        return nombreSeg;
    }

    public void setNombreSeg(String nombreSeg) {
        this.nombreSeg = nombreSeg;
    }

    public String getTelefonoCelSeg() {
        return telefonoCelSeg;
    }

    public void setTelefonoCelSeg(String telefonoCelSeg) {
        this.telefonoCelSeg = telefonoCelSeg;
    }

    public String getTelefonoOficinaSeg() {
        return telefonoOficinaSeg;
    }

    public void setTelefonoOficinaSeg(String telefonoOficinaSeg) {
        this.telefonoOficinaSeg = telefonoOficinaSeg;
    }

    public String getCorreoSeg() {
        return correoSeg;
    }

    public void setCorreoSeg(String correoSeg) {
        this.correoSeg = correoSeg;
    }

    public String getCorreoAlternoSeg() {
        return correoAlternoSeg;
    }

    public void setCorreoAlternoSeg(String correoAlternoSeg) {
        this.correoAlternoSeg = correoAlternoSeg;
    }

    public String getRegionMovistar() {
        return regionMovistar;
    }

    public void setRegionMovistar(String regionMovistar) {
        this.regionMovistar = regionMovistar;
    }

    public String getSupervisorMovistar() {
        return supervisorMovistar;
    }

    public void setSupervisorMovistar(String supervisorMovistar) {
        this.supervisorMovistar = supervisorMovistar;
    }

    public String getGerenteComercial() {
        return gerenteComercial;
    }

    public void setGerenteComercial(String gerenteComercial) {
        this.gerenteComercial = gerenteComercial;
    }

    public String getDireccionComercial() {
        return direccionComercial;
    }

    public void setDireccionComercial(String direccionComercial) {
        this.direccionComercial = direccionComercial;
    }

    public String getZonaComercial() {
        return zonaComercial;
    }

    public void setZonaComercial(String zonaComercial) {
        this.zonaComercial = zonaComercial;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public BigInteger getIdAnt() {
        return idAnt;
    }

    public void setIdAnt(BigInteger idAnt) {
        this.idAnt = idAnt;
    }

    public Integer getCantPedidos() {
        return cantPedidos;
    }

    public void setCantPedidos(Integer cantPedidos) {
        this.cantPedidos = cantPedidos;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Integer getEstatusPoliticas() {
        return estatusPoliticas;
    }

    public void setEstatusPoliticas(Integer estatusPoliticas) {
        this.estatusPoliticas = estatusPoliticas;
    }

    @XmlTransient
    public List<Incidencia> getIncidenciaList() {
        return incidenciaList;
    }

    public void setIncidenciaList(List<Incidencia> incidenciaList) {
        this.incidenciaList = incidenciaList;
    }

    @XmlTransient
    public List<Mercadeo> getMercadeoList() {
        return mercadeoList;
    }

    public void setMercadeoList(List<Mercadeo> mercadeoList) {
        this.mercadeoList = mercadeoList;
    }

    public Estadociudad getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(Estadociudad ciudadId) {
        this.ciudadId = ciudadId;
    }

    public Estadociudad getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Estadociudad estadoId) {
        this.estadoId = estadoId;
    }

    public Grupo getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(Grupo grupoId) {
        this.grupoId = grupoId;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Cliente[ id=" + id + " ]";
    }
    
}
