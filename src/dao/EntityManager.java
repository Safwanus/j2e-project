package dao;

import javax.ejb.Stateless;

import model.Formation;
import model.Installation;
import model.Logiciel;
import model.Ordinateur;
import model.Salle;

/**
 * Session Bean implementation class EntityManager
 */
@Stateless
public class EntityManager implements EntityManagerRemote, EntityManagerLocal {

    /**
     * Default constructor. 
     */
    public EntityManager() {
        // TODO Auto-generated constructor stub
    }
    
    /* Ajout */
    
    public void addFormation(Formation formation) {
    	
    }
    
    public void addInstallation(Installation installation) {
    	
    }
    
    public void addLogiciel(Logiciel logiciel) {
    	
    }
    
    public void addOrdinateur(Ordinateur ordinateur) {
    	
    }
    
    public void addSalle(Salle salle) {
    	
    }
    
    /* Modifier */
    
    public void modFormation(Formation formation) {
    	
    }
    
    public void modInstallation(Installation installation) {
    	
    }
    
    public void modLogiciel(Logiciel logiciel) {
    	
    }
    
    public void modOrdinateur(Ordinateur ordinateur) {
    	
    }
    
    public void modSalle(Salle salle) {
    	
    }  
    
    /* Supprimer */
    
    public void supFormation(Formation formation) {
    	
    }
    
    public void supInstallation(Installation installation) {
    	
    }
    
    public void supLogiciel(Logiciel logiciel) {
    	
    }
    
    public void supOrdinateur(Ordinateur ordinateur) {
    	
    }
    
    public void supSalle(Salle salle) {
    	
    }
    
    /* Consulter */
    
    public void vueFormation(Formation formation) {
    	
    }
    
    public void vueInstallation(Installation installation) {
    	
    }
    
    public void vueLogiciel(Logiciel logiciel) {
    	
    }
    
    public void vueOrdinateur(Ordinateur ordinateur) {
    	
    }
    
    public void vueSalle(Salle salle) {
    	
    }
    
    /* ByID */
    
    public Formation getByIdFormation(int ID) {
		return null;
    	
    }
    
    public Installation getByIdInstallation(int ID) {
		return null;
    	
    }
    
    public Logiciel getByIdLogiciel(int ID) {
		return null;

    }
    
    public Ordinateur getByIdOrdinateur(int ID) {
		return null;

    }
    
    public Salle getByIdSalle(int ID) {
		return null;

    }
    
    /* ByName */
    
    public Formation getByNameFormation(String name) {
		return null;

    }
    
    public Installation getByNameInstallation(String name) {
		return null;

    }
    
    public Logiciel getByNameLogiciel(String name) {
		return null;

    }
    
    public Ordinateur getByNameOrdinateur(String name) {
		return null;

    }
    
    public Salle getByNameSalle(String name) {
		return null;

    }
    
}
