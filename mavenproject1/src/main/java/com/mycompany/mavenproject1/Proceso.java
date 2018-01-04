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
@Table(name = "proceso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proceso.findAll", query = "SELECT p FROM Proceso p")
    , @NamedQuery(name = "Proceso.findById", query = "SELECT p FROM Proceso p WHERE p.id = :id")
    , @NamedQuery(name = "Proceso.findByDescripcion", query = "SELECT p FROM Proceso p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Proceso.findByTipoProceso", query = "SELECT p FROM Proceso p WHERE p.tipoProceso = :tipoProceso")
    , @NamedQuery(name = "Proceso.findByTotalProcesar", query = "SELECT p FROM Proceso p WHERE p.totalProcesar = :totalProcesar")
    , @NamedQuery(name = "Proceso.findByTotalCompletado", query = "SELECT p FROM Proceso p WHERE p.totalCompletado = :totalCompletado")
    , @NamedQuery(name = "Proceso.findByEstatus", query = "SELECT p FROM Proceso p WHERE p.estatus = :estatus")})
public class Proceso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipoProceso")
    private int tipoProceso;
    @Column(name = "totalProcesar")
    private Integer totalProcesar;
    @Column(name = "totalCompletado")
    private Integer totalCompletado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estatus")
    private int estatus;

    public Proceso() {
    }

    public Proceso(Long id) {
        this.id = id;
    }

    public Proceso(Long id, int tipoProceso, int estatus) {
        this.id = id;
        this.tipoProceso = tipoProceso;
        this.estatus = estatus;
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

    public int getTipoProceso() {
        return tipoProceso;
    }

    public void setTipoProceso(int tipoProceso) {
        this.tipoProceso = tipoProceso;
    }

    public Integer getTotalProcesar() {
        return totalProcesar;
    }

    public void setTotalProcesar(Integer totalProcesar) {
        this.totalProcesar = totalProcesar;
    }

    public Integer getTotalCompletado() {
        return totalCompletado;
    }

    public void setTotalCompletado(Integer totalCompletado) {
        this.totalCompletado = totalCompletado;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
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
        if (!(object instanceof Proceso)) {
            return false;
        }
        Proceso other = (Proceso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Proceso[ id=" + id + " ]";
    }
    
}
