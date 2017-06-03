/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adonismanager.sessions;

import com.adonismanager.entities.Typechambre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author adonis97 <simoadonis@gmail.com>
 */
@Local
public interface TypechambreFacadeLocal {

    void create(Typechambre typechambre);

    void edit(Typechambre typechambre);

    void remove(Typechambre typechambre);

    Typechambre find(Object id);

    List<Typechambre> findAll();

    List<Typechambre> findRange(int[] range);

    int count();
    
}
