/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AKDESK23
 */
@Entity
@Table(name = "plantillanotificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plantillanotificacion.findAll", query = "SELECT p FROM Plantillanotificacion p")
    , @NamedQuery(name = "Plantillanotificacion.findById", query = "SELECT p FROM Plantillanotificacion p WHERE p.id = :id")
    , @NamedQuery(name = "Plantillanotificacion.findByNombre", query = "SELECT p FROM Plantillanotificacion p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Plantillanotificacion.findByContenido", query = "SELECT p FROM Plantillanotificacion p WHERE p.contenido = :contenido")})
public class Plantillanotificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 800)
    @Column(name = "contenido")
    private String contenido;

    public Plantillanotificacion() {
    }

    public Plantillanotificacion(Integer id) {
        this.id = id;
    }

    public Plantillanotificacion(Integer id, String contenido) {
        this.id = id;
        this.contenido = contenido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
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
        if (!(object instanceof Plantillanotificacion)) {
            return false;
        }
        Plantillanotificacion other = (Plantillanotificacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Plantillanotificacion[ id=" + id + " ]";
    }
    
}
