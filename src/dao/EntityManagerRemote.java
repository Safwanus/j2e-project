package dao;

import javax.ejb.Remote;

import model.Formation;
import model.Installation;
import model.Logiciel;
import model.Ordinateur;
import model.Salle;

@Remote
public interface EntityManagerRemote {
	
    /* Ajout */
    
    public void addFormation(Formation formation);
    
    public void addInstallation(Installation installation);
    
    public void addLogiciel(Logiciel logiciel);
    
    public void addOrdinateur(Ordinateur ordinateur);
    
    public void addSalle(Salle salle);
    
    /* Modifier */
    
    public void modFormation(Formation formation);
    
    public void modInstallation(Installation installation);
    
    public void modLogiciel(Logiciel logiciel);
    
    public void modOrdinateur(Ordinateur ordinateur);
    
    public void modSalle(Salle salle);  
    
    /* Supprimer */
    
    public void supFormation(Formation formation);
    
    public void supInstallation(Installation installation);
    
    public void supLogiciel(Logiciel logiciel);
    
    public void supOrdinateur(Ordinateur ordinateur);
    
    public void supSalle(Salle salle);
    
    /* Consulter */
    
    public void vueFormation(Formation formation);
    
    public void vueInstallation(Installation installation);
    
    public void vueLogiciel(Logiciel logiciel);
    
    public void vueOrdinateur(Ordinateur ordinateur);
    
    public void vueSalle(Salle salle);
    
    /* ByID */
    
    public Formation getByIdFormation(int ID);
    
    public Installation getByIdInstallation(int ID);
    
    public Logiciel getByIdLogiciel(int ID);
    
    public Ordinateur getByIdOrdinateur(int ID);
    
    public Salle getByIdSalle(int ID);
    
    /* ByName */
    
    public Formation getByNameFormation(String name);
    
    public Installation getByNameInstallation(String name);
    
    public Logiciel getByNameLogiciel(String name);
    
    public Ordinateur getByNameOrdinateur(String name);
    
    public Salle getByNameSalle(String name);
    


}
