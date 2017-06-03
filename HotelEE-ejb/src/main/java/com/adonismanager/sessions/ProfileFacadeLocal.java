/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adonismanager.sessions;

import com.adonismanager.entities.Profile;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author adonis97 <simoadonis@gmail.com>
 */
@Local
public interface ProfileFacadeLocal {

    void create(Profile profile);

    void edit(Profile profile);

    void remove(Profile profile);

    Profile find(Object id);

    List<Profile> findAll();

    List<Profile> findRange(int[] range);

    int count();
    
}
