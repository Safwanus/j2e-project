package dao;

import java.util.List;

import javax.ejb.Local;

import model.Logiciel;

@Local
public interface LogicielImpMetierLocal {

	public void ajouterLogiciel(Logiciel log);

	public void supprimerLogiciel(int code);

	public void modifierLogiciel(Logiciel log);

	public List<Logiciel> consulter();

	public List<Logiciel> chercherLogicielByNom(String nom);

	public Logiciel chercherLogicielById(int code);
}
