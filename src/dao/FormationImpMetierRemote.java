package dao;

import java.util.List;

import javax.ejb.Remote;

import model.Formation;

@Remote
public interface FormationImpMetierRemote {

	public void ajouterFormation(Formation form);

	public void supprimerFormation(int code);

	public void modifierFormation(Formation form);

	public List<Formation> consulter();

	public List<Formation> chercherFormationByNom(String nom);

	public Formation chercherFormationById(int code);
}
