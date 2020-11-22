package dao;

import java.util.List;

import javax.ejb.Local;

import model.Ordinateur;

@Local
public interface OrdinateurImpMetierLocal {
	
	public void ajouterOrdinateur(Ordinateur ord);

	public void supprimerOrdinateur(int code);

	public void modifierOrdinateur(Ordinateur ord);

	public List<Ordinateur> consulter();

	public List<Ordinateur> chercherOrdinateurByNom(String nom);

	public Ordinateur chercherOrdinateurById(int code);

}
