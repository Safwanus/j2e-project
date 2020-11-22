package dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Formation;

/**
 * Session Bean implementation class FormationImpMetier
 */
@Stateless
@LocalBean
public class FormationImpMetier implements FormationImpMetierRemote, FormationImpMetierLocal {

	@PersistenceContext(unitName = "Formation")

	private EntityManagerFactory emF = Persistence.createEntityManagerFactory("Formation");

	EntityManager em = emF.createEntityManager();

	/**
	 * Default constructor.
	 */
	public FormationImpMetier() {
		// TODO Auto-generated constructor stub
	}

	// ************Ajouter******************/

	@Override
	public void ajouterFormation(Formation form) {
		em.getTransaction().begin();
		em.persist(form);
		em.getTransaction().commit();
	}

	// ************Modifier*************************//

	@Override
	public void modifierFormation(Formation formNewValues) {
		Formation form = em.find(Formation.class, formNewValues.getCode());

		em.persist(form);

	}

	// *************supprimer*******************//
	@Override
	public void supprimerFormation(int code) {
		em.remove(em.find(Formation.class, code));

	}

	// *************consulter************************//
	@SuppressWarnings("unchecked")
	@Override
	public List<Formation> consulter() {
		Query req = em.createQuery("SELECT f FROM Formation f");

		return req.getResultList();

	}

	// recherche par son id **************************
	@Override
	public Formation chercherFormationById(int code)

	{
		Formation form = em.find(Formation.class, code);
		return form;
	}

	// **********recherche par son nom*************************
	@SuppressWarnings("unchecked")
	@Override

	public List<Formation> chercherFormationByNom(String nom) {
		List<Formation> form = (List<Formation>) em.find(Formation.class, nom);
		return form;

	}

}
