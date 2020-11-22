package dao;

import java.util.List;

import javax.ejb.Remote;

import model.Logiciel;

@Remote
public interface LogicielImpMetierRemote {

	public void ajouterLogiciel(Logiciel log);

	public void supprimerLogiciel(int code);

	public void modifierLogiciel(Logiciel log);

	public List<Logiciel> consulter();

	public List<Logiciel> chercherLogicielByNom(String nom);

	public Logiciel chercherLogicielById(int code);
}
