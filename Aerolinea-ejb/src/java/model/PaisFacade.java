/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entities.Pais;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 
 * @author Juan Felipe Zuluaga Gómez <juan.zuluagag@udea.edu.co
 */
@Stateless
public class PaisFacade extends AbstractFacade<Pais> {
    @PersistenceContext(unitName = "Aerolinea-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaisFacade() {
        super(Pais.class);
    }

}
