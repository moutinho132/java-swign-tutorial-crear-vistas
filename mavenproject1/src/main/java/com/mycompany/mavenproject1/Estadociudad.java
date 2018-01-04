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
@Table(name = "estadociudad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadociudad.findAll", query = "SELECT e FROM Estadociudad e")
    , @NamedQuery(name = "Estadociudad.findById", query = "SELECT e FROM Estadociudad e WHERE e.id = :id")
    , @NamedQuery(name = "Estadociudad.findByNombre", query = "SELECT e FROM Estadociudad e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Estadociudad.findByLatitud", query = "SELECT e FROM Estadociudad e WHERE e.latitud = :latitud")
    , @NamedQuery(name = "Estadociudad.findByLongitud", query = "SELECT e FROM Estadociudad e WHERE e.longitud = :longitud")})
public class Estadociudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitud")
    private Double latitud;
    @Column(name = "longitud")
    private Double longitud;
    @OneToMany(mappedBy = "padreId")
    private List<Estadociudad> estadociudadList;
    @JoinColumn(name = "padreId", referencedColumnName = "id")
    @ManyToOne
    private Estadociudad padreId;
    @OneToMany(mappedBy = "estadoId")
    private List<Propuesta> propuestaList;
    @OneToMany(mappedBy = "ciudadId")
    private List<Cliente> clienteList;
    @OneToMany(mappedBy = "estadoId")
    private List<Cliente> clienteList1;

    public Estadociudad() {
    }

    public Estadociudad(Long id) {
        this.id = id;
    }

    public Estadociudad(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @XmlTransient
    public List<Estadociudad> getEstadociudadList() {
        return estadociudadList;
    }

    public void setEstadociudadList(List<Estadociudad> estadociudadList) {
        this.estadociudadList = estadociudadList;
    }

    public Estadociudad getPadreId() {
        return padreId;
    }

    public void setPadreId(Estadociudad padreId) {
        this.padreId = padreId;
    }

    @XmlTransient
    public List<Propuesta> getPropuestaList() {
        return propuestaList;
    }

    public void setPropuestaList(List<Propuesta> propuestaList) {
        this.propuestaList = propuestaList;
    }

    @XmlTransient
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    @XmlTransient
    public List<Cliente> getClienteList1() {
        return clienteList1;
    }

    public void setClienteList1(List<Cliente> clienteList1) {
        this.clienteList1 = clienteList1;
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
        if (!(object instanceof Estadociudad)) {
            return false;
        }
        Estadociudad other = (Estadociudad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Estadociudad[ id=" + id + " ]";
    }
    
}
