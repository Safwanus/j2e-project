package dao;

import java.util.List;

import javax.ejb.Remote;

import model.Installation;

@Remote
public interface InstallationImpMetierRemote {

	public void ajouterInstallation(Installation ins);

	public void supprimerInstallation(int code);

	public void modifierInstallation(Installation ins);

	public List<Installation> consulter();

	public Installation chercherInstallationById(int code);
}
