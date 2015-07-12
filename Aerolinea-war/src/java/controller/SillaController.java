/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import model.SillaFacade;
import entities.*;

/**
 *
 * @author Juan Felipe Zuluaga Gómez <juan.zuluagag@udea.edu.co
 */
@ManagedBean
@Named(value = "sillaController")
@SessionScoped
public class SillaController implements Serializable{
    
    @EJB
    private SillaFacade sillaFacade;

    
    public SillaController() {
    }
    public List<Silla> findAll(){
        return this.sillaFacade.findAll();
    }
    
}
