package dao;

import java.util.List;

import javax.ejb.Local;

import model.Installation;

@Local
public interface InstallationImpMetierLocal {

	public void ajouterInstallation(Installation ins);

	public void supprimerInstallation(int code);

	public void modifierInstallation(Installation ins);

	public List<Installation> consulter();

	public Installation chercherInstallationById(int code);

}
