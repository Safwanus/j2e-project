package dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Logiciel;

/**
 * Session Bean implementation class LogicielImpMetier
 */
@Stateless
@LocalBean
public class LogicielImpMetier implements LogicielImpMetierRemote, LogicielImpMetierLocal {

	@PersistenceContext(unitName = "Logiciel")

	private EntityManagerFactory emL = Persistence.createEntityManagerFactory("Logiciel");

	EntityManager em = emL.createEntityManager();
	
    /**
     * Default constructor. 
     */
    public LogicielImpMetier() {
        // TODO Auto-generated constructor stub
    }
    
  //***************Ajouter***************************//
    @Override
    public void ajouterLogiciel(Logiciel log)
    {
     em.getTransaction().begin();
     em.persist(log);
      em.getTransaction().commit();

     

    	
    	 

    }
    //***************Modifier**********************//
    @Override

    public void modifierLogiciel(Logiciel logNewValues) 
    {
    Logiciel log = em.find(Logiciel.class, logNewValues.getCode());

    		 em.persist(log);

    }
    //*************supprimer*******************//
    @Override

    public void supprimerLogiciel(int code) 
    { 
    	em.remove(em.find(Logiciel.class, code));


    }
    //***********consulter**********************************
    @SuppressWarnings("unchecked")
	@Override

    public List<Logiciel> consulter()
    {

    Query req = em.createQuery("select i from Installation i");
            return req.getResultList();
    }

    //************recherche par son id **************************
    @Override
     public Logiciel chercherLogicielById(int code)

     {  Logiciel log = em.find(Logiciel.class, code);
     	return log;
    }

        
    //**********recherche par son nom*************************
    @Override

    	 public  List<Logiciel> chercherLogicielByNom(String nom)

     {  @SuppressWarnings("unchecked")
	List<Logiciel> log = (List<Logiciel>) em.find(Logiciel.class, nom);
     	return log;

    }



}
