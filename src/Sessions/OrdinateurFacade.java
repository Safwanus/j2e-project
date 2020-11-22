/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Ordinateur;

/**
 *
 * @author sabenelkad
 */
@Stateless
public class OrdinateurFacade extends AbstractFacade<Ordinateur> {

    @PersistenceContext(unitName = "Formation")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdinateurFacade() {
        super(Ordinateur.class);
    }
    
}
