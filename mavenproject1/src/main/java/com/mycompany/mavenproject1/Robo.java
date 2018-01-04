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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AKDESK23
 */
@Entity
@Table(name = "robo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Robo.findAll", query = "SELECT r FROM Robo r")
    , @NamedQuery(name = "Robo.findById", query = "SELECT r FROM Robo r WHERE r.id = :id")
    , @NamedQuery(name = "Robo.findByDescripcion", query = "SELECT r FROM Robo r WHERE r.descripcion = :descripcion")
    , @NamedQuery(name = "Robo.findByFechaRegistro", query = "SELECT r FROM Robo r WHERE r.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Robo.findByFechaRobo", query = "SELECT r FROM Robo r WHERE r.fechaRobo = :fechaRobo")
    , @NamedQuery(name = "Robo.findByModelo", query = "SELECT r FROM Robo r WHERE r.modelo = :modelo")
    , @NamedQuery(name = "Robo.findByNombreUbicacionRobo", query = "SELECT r FROM Robo r WHERE r.nombreUbicacionRobo = :nombreUbicacionRobo")
    , @NamedQuery(name = "Robo.findByNroRobo", query = "SELECT r FROM Robo r WHERE r.nroRobo = :nroRobo")
    , @NamedQuery(name = "Robo.findByUbicacionRobo", query = "SELECT r FROM Robo r WHERE r.ubicacionRobo = :ubicacionRobo")})
public class Robo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 255)
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "fechaRegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "fechaRobo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRobo;
    @Size(max = 255)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 255)
    @Column(name = "nombreUbicacionRobo")
    private String nombreUbicacionRobo;
    @Size(max = 255)
    @Column(name = "nroRobo")
    private String nroRobo;
    @Column(name = "ubicacionRobo")
    private Integer ubicacionRobo;
    @JoinColumn(name = "idLote", referencedColumnName = "id")
    @ManyToOne
    private Lote idLote;
    @JoinColumn(name = "idSerial", referencedColumnName = "id")
    @ManyToOne
    private Serial idSerial;

    public Robo() {
    }

    public Robo(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaRobo() {
        return fechaRobo;
    }

    public void setFechaRobo(Date fechaRobo) {
        this.fechaRobo = fechaRobo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombreUbicacionRobo() {
        return nombreUbicacionRobo;
    }

    public void setNombreUbicacionRobo(String nombreUbicacionRobo) {
        this.nombreUbicacionRobo = nombreUbicacionRobo;
    }

    public String getNroRobo() {
        return nroRobo;
    }

    public void setNroRobo(String nroRobo) {
        this.nroRobo = nroRobo;
    }

    public Integer getUbicacionRobo() {
        return ubicacionRobo;
    }

    public void setUbicacionRobo(Integer ubicacionRobo) {
        this.ubicacionRobo = ubicacionRobo;
    }

    public Lote getIdLote() {
        return idLote;
    }

    public void setIdLote(Lote idLote) {
        this.idLote = idLote;
    }

    public Serial getIdSerial() {
        return idSerial;
    }

    public void setIdSerial(Serial idSerial) {
        this.idSerial = idSerial;
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
        if (!(object instanceof Robo)) {
            return false;
        }
        Robo other = (Robo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Robo[ id=" + id + " ]";
    }
    
}
