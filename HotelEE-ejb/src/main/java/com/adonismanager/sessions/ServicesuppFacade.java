/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adonismanager.sessions;

import com.adonismanager.entities.Servicesupp;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adonis97 <simoadonis@gmail.com>
 */
@Stateless
public class ServicesuppFacade extends AbstractFacade<Servicesupp> implements ServicesuppFacadeLocal {
    @PersistenceContext(unitName = "com.adonismanager_HotelEE-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServicesuppFacade() {
        super(Servicesupp.class);
    }
    
}
