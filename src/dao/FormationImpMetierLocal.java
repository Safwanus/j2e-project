package dao;

import java.util.List;

import javax.ejb.Local;

import model.Formation;

@Local
public interface FormationImpMetierLocal {

	public void ajouterFormation(Formation form);

	public void supprimerFormation(int code);

	public void modifierFormation(Formation form);

	public List<Formation> consulter();

	public List<Formation> chercherFormationByNom(String nom);

	public Formation chercherFormationById(int code);

}
