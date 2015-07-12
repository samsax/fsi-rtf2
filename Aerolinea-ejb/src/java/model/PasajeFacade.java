/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entities.Pasaje;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 
 * @author Juan Felipe Zuluaga Gómez <juan.zuluagag@udea.edu.co
 */
@Stateless
public class PasajeFacade extends AbstractFacade<Pasaje> {
    @PersistenceContext(unitName = "Aerolinea-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PasajeFacade() {
        super(Pasaje.class);
    }

}
