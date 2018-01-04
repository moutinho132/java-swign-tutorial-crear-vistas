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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "fotosincidencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fotosincidencia.findAll", query = "SELECT f FROM Fotosincidencia f")
    , @NamedQuery(name = "Fotosincidencia.findById", query = "SELECT f FROM Fotosincidencia f WHERE f.id = :id")})
public class Fotosincidencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Lob
    @Size(max = 16777215)
    @Column(name = "foto")
    private String foto;
    @JoinColumn(name = "incidenciaId", referencedColumnName = "id")
    @ManyToOne
    private Incidencia incidenciaId;

    public Fotosincidencia() {
    }

    public Fotosincidencia(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Incidencia getIncidenciaId() {
        return incidenciaId;
    }

    public void setIncidenciaId(Incidencia incidenciaId) {
        this.incidenciaId = incidenciaId;
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
        if (!(object instanceof Fotosincidencia)) {
            return false;
        }
        Fotosincidencia other = (Fotosincidencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Fotosincidencia[ id=" + id + " ]";
    }
    
}
