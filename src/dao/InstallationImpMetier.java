package dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Installation;

/**
 * Session Bean implementation class InstallationImpMetier
 */
@Stateless
@LocalBean
public class InstallationImpMetier implements InstallationImpMetierRemote, InstallationImpMetierLocal {

	@PersistenceContext(unitName = "Installation")

	private EntityManagerFactory emI = Persistence.createEntityManagerFactory("Installation");

	EntityManager em = emI.createEntityManager();

	/**
	 * Default constructor.
	 */
	public InstallationImpMetier() {
		// TODO Auto-generated constructor stub
	}

	// **********************Ajouter*************************//
	@Override

	public void ajouterInstallation(Installation ins) {
		em.getTransaction().begin();
		em.persist(ins);
		em.getTransaction().commit();

	}

	// ******************Modifier*******************//
	@Override

	public void modifierInstallation(Installation insNewValues) {
		Installation ins = em.find(Installation.class, insNewValues.getCode());

		em.persist(ins);

	}

	// ***********************Supprimer**************//
	@Override

	public void supprimerInstallation(int code) {
		em.remove(em.find(Installation.class, code));

	}

	// *************************consulter**********************************
	@SuppressWarnings("unchecked")
	@Override

    public List<Installation> consulter(){

    Query req = em.createQuery("select i from Installation i");
            return req.getResultList();
    }

	// ********************recherche par son id **************************

	@Override

	public Installation chercherInstallationById(int code){
		Installation ins = em.find(Installation.class, code);
		return ins;
	}

}
