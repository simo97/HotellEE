/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adonismanager.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adonis97 <simoadonis@gmail.com>
 */
@Entity
@Table(name = "client", catalog = "hotel_jee", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"idclient"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findByIdclient", query = "SELECT c FROM Client c WHERE c.idclient = :idclient"),
    @NamedQuery(name = "Client.findByNoms", query = "SELECT c FROM Client c WHERE c.noms = :noms"),
    @NamedQuery(name = "Client.findByPrenoms", query = "SELECT c FROM Client c WHERE c.prenoms = :prenoms"),
    @NamedQuery(name = "Client.findByNumcni", query = "SELECT c FROM Client c WHERE c.numcni = :numcni")})
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idclient", nullable = false)
    private Integer idclient;
    @Size(max = 254)
    @Column(name = "noms", length = 254)
    private String noms;
    @Size(max = 254)
    @Column(name = "prenoms", length = 254)
    private String prenoms;
    @Size(max = 254)
    @Column(name = "numcni", length = 254)
    private String numcni;
    @JoinTable(name = "client_facture", joinColumns = {
        @JoinColumn(name = "idclient", referencedColumnName = "idclient", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "idfacture", referencedColumnName = "idfacture", nullable = false)})
    @ManyToMany
    private List<Facture> factureList;
    @ManyToMany(mappedBy = "clientList")
    private List<Chambre> chambreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idclient")
    private List<Reservation> reservationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idclient")
    private List<Servicesupp> servicesuppList;

    public Client() {
    }

    public Client(Integer idclient) {
        this.idclient = idclient;
    }

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getNumcni() {
        return numcni;
    }

    public void setNumcni(String numcni) {
        this.numcni = numcni;
    }

    @XmlTransient
    public List<Facture> getFactureList() {
        return factureList;
    }

    public void setFactureList(List<Facture> factureList) {
        this.factureList = factureList;
    }

    @XmlTransient
    public List<Chambre> getChambreList() {
        return chambreList;
    }

    public void setChambreList(List<Chambre> chambreList) {
        this.chambreList = chambreList;
    }

    @XmlTransient
    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @XmlTransient
    public List<Servicesupp> getServicesuppList() {
        return servicesuppList;
    }

    public void setServicesuppList(List<Servicesupp> servicesuppList) {
        this.servicesuppList = servicesuppList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclient != null ? idclient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.idclient == null && other.idclient != null) || (this.idclient != null && !this.idclient.equals(other.idclient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adonismanager.entities.Client[ idclient=" + idclient + " ]";
    }
    
}
