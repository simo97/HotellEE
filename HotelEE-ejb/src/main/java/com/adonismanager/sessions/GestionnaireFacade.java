/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adonismanager.sessions;

import com.adonismanager.entities.Gestionnaire;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adonis97 <simoadonis@gmail.com>
 */
@Stateless
public class GestionnaireFacade extends AbstractFacade<Gestionnaire> implements GestionnaireFacadeLocal {
    @PersistenceContext(unitName = "com.adonismanager_HotelEE-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GestionnaireFacade() {
        super(Gestionnaire.class);
    }
    
}
