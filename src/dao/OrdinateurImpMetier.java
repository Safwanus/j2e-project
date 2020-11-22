package dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Ordinateur;

/**
 * Session Bean implementation class OrdinateurImpMetier
 */
@Stateless
@LocalBean
public class OrdinateurImpMetier implements OrdinateurImpMetierRemote, OrdinateurImpMetierLocal {

	@PersistenceContext(unitName = "Ordinateur")

	private EntityManagerFactory emO = Persistence.createEntityManagerFactory("Ordinateur");

	EntityManager em = emO.createEntityManager();

	/**
	 * Default constructor.
	 */
	public OrdinateurImpMetier() {
		// TODO Auto-generated constructor stub
	}

	// ******************ajouter*********************************//
	@Override
	public void ajouterOrdinateur(Ordinateur ord) {
		em.getTransaction().begin();
		em.persist(ord);
		em.getTransaction().commit();
	}

	// ************Modifier****************************************//
	@Override

	public void modifierOrdinateur(Ordinateur ordNewValues) {
		Ordinateur ord = em.find(Ordinateur.class, ordNewValues.getCode());

		em.persist(ord);

	}

	//// ***********Supprimer**********************************//
	// cour page82
	@Override

	public void supprimerOrdinateur(int code) {
		em.remove(em.find(Ordinateur.class, code));

	}

	// *************consulter**********************************
	@SuppressWarnings("unchecked")
	@Override

	public List<Ordinateur> consulter() {
		Query req = em.createQuery("select o from Ordinateur o");

		return req.getResultList();
	}

	// ***************recherche par son id **************************//
	@Override
	public Ordinateur chercherOrdinateurById(int code)

	{
		Ordinateur ord = em.find(Ordinateur.class, code);
		return ord;

	}

	// *************recherche par son nom*************************
	@Override
	public List<Ordinateur> chercherOrdinateurByNom(String nom)

	{
		@SuppressWarnings("unchecked")
		List<Ordinateur> ord = (List<Ordinateur>) em.find(Ordinateur.class, nom);
		return ord;

	}

}
