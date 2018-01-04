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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AKDESK23
 */
@Entity
@Table(name = "diaferiado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diaferiado.findAll", query = "SELECT d FROM Diaferiado d")
    , @NamedQuery(name = "Diaferiado.findById", query = "SELECT d FROM Diaferiado d WHERE d.id = :id")
    , @NamedQuery(name = "Diaferiado.findByAnio", query = "SELECT d FROM Diaferiado d WHERE d.anio = :anio")
    , @NamedQuery(name = "Diaferiado.findByDia", query = "SELECT d FROM Diaferiado d WHERE d.dia = :dia")
    , @NamedQuery(name = "Diaferiado.findByMes", query = "SELECT d FROM Diaferiado d WHERE d.mes = :mes")
    , @NamedQuery(name = "Diaferiado.findByNombreFeriado", query = "SELECT d FROM Diaferiado d WHERE d.nombreFeriado = :nombreFeriado")
    , @NamedQuery(name = "Diaferiado.findByTipo", query = "SELECT d FROM Diaferiado d WHERE d.tipo = :tipo")})
public class Diaferiado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "dia")
    private Integer dia;
    @Column(name = "mes")
    private Integer mes;
    @Size(max = 255)
    @Column(name = "nombreFeriado")
    private String nombreFeriado;
    @Column(name = "tipo")
    private Integer tipo;

    public Diaferiado() {
    }

    public Diaferiado(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public String getNombreFeriado() {
        return nombreFeriado;
    }

    public void setNombreFeriado(String nombreFeriado) {
        this.nombreFeriado = nombreFeriado;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
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
        if (!(object instanceof Diaferiado)) {
            return false;
        }
        Diaferiado other = (Diaferiado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Diaferiado[ id=" + id + " ]";
    }
    
}
