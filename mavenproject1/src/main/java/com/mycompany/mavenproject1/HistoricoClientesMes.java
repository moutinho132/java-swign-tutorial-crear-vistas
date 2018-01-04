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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AKDESK23
 */
@Entity
@Table(name = "historico_clientes_mes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoricoClientesMes.findAll", query = "SELECT h FROM HistoricoClientesMes h")
    , @NamedQuery(name = "HistoricoClientesMes.findById", query = "SELECT h FROM HistoricoClientesMes h WHERE h.id = :id")
    , @NamedQuery(name = "HistoricoClientesMes.findByMes", query = "SELECT h FROM HistoricoClientesMes h WHERE h.mes = :mes")
    , @NamedQuery(name = "HistoricoClientesMes.findByAnio", query = "SELECT h FROM HistoricoClientesMes h WHERE h.anio = :anio")
    , @NamedQuery(name = "HistoricoClientesMes.findByTotalClientes", query = "SELECT h FROM HistoricoClientesMes h WHERE h.totalClientes = :totalClientes")})
public class HistoricoClientesMes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mes")
    private int mes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "anio")
    private int anio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalClientes")
    private int totalClientes;
    @JoinColumn(name = "grupoId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Grupo grupoId;

    public HistoricoClientesMes() {
    }

    public HistoricoClientesMes(Integer id) {
        this.id = id;
    }

    public HistoricoClientesMes(Integer id, int mes, int anio, int totalClientes) {
        this.id = id;
        this.mes = mes;
        this.anio = anio;
        this.totalClientes = totalClientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public Grupo getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(Grupo grupoId) {
        this.grupoId = grupoId;
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
        if (!(object instanceof HistoricoClientesMes)) {
            return false;
        }
        HistoricoClientesMes other = (HistoricoClientesMes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.HistoricoClientesMes[ id=" + id + " ]";
    }
    
}
