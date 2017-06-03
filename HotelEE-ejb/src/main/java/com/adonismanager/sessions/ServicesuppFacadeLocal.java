/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adonismanager.sessions;

import com.adonismanager.entities.Servicesupp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author adonis97 <simoadonis@gmail.com>
 */
@Local
public interface ServicesuppFacadeLocal {

    void create(Servicesupp servicesupp);

    void edit(Servicesupp servicesupp);

    void remove(Servicesupp servicesupp);

    Servicesupp find(Object id);

    List<Servicesupp> findAll();

    List<Servicesupp> findRange(int[] range);

    int count();
    
}
