/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Logiciel;

/**
 *
 * @author sabenelkad
 */
@Stateless
public class LogicielFacade extends AbstractFacade<Logiciel> {

    @PersistenceContext(unitName = "Formation")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LogicielFacade() {
        super(Logiciel.class);
    }
    
}
