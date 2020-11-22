package dao;

import java.util.List;

import javax.ejb.Local;

import model.Salle;

@Local
public interface SalleImpMetierLocal {

	public void ajouterSalle(Salle salle);

	public void supprimerSalle(int code);

	public void modifierSalle(Salle salle);

	public List<Salle> consulter();

	public List<Salle> chercherSalleByNom(String nom);

	public Salle chercherSalleById(int code);

}
