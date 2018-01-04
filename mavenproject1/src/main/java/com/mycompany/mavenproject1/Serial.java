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
@Table(name = "serial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Serial.findAll", query = "SELECT s FROM Serial s")
    , @NamedQuery(name = "Serial.findById", query = "SELECT s FROM Serial s WHERE s.id = :id")
    , @NamedQuery(name = "Serial.findByEstatus", query = "SELECT s FROM Serial s WHERE s.estatus = :estatus")
    , @NamedQuery(name = "Serial.findBySerial", query = "SELECT s FROM Serial s WHERE s.serial = :serial")
    , @NamedQuery(name = "Serial.findByUbicacion", query = "SELECT s FROM Serial s WHERE s.ubicacion = :ubicacion")})
public class Serial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estatus")
    private int estatus;
    @Size(max = 255)
    @Column(name = "serial")
    private String serial;
    @Size(max = 255)
    @Column(name = "ubicacion")
    private String ubicacion;
    @JoinColumn(name = "idLote", referencedColumnName = "id")
    @ManyToOne
    private Lote idLote;
    @JoinColumn(name = "idPedido", referencedColumnName = "id")
    @ManyToOne
    private Pedido idPedido;
    @OneToMany(mappedBy = "idSerial")
    private List<Robo> roboList;

    public Serial() {
    }

    public Serial(Long id) {
        this.id = id;
    }

    public Serial(Long id, int estatus) {
        this.id = id;
        this.estatus = estatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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
        if (!(object instanceof Serial)) {
            return false;
        }
        Serial other = (Serial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Serial[ id=" + id + " ]";
    }
    
}
