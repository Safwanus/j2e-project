package dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Salle;

/**
 * Session Bean implementation class SalleImpMetier
 */
@Stateless
@LocalBean
public class SalleImpMetier implements SalleImpMetierRemote, SalleImpMetierLocal {
	@PersistenceContext(unitName = "Salle")

	private EntityManagerFactory emS = Persistence.createEntityManagerFactory("Salle");

	EntityManager em = emS.createEntityManager();

	public SalleImpMetier() {
		// TODO Auto-generated constructor stub
	}

	// ************ajouter*************
	@Override
	public void ajouterSalle(Salle salle) {
		em.getTransaction().begin();
		em.persist(salle);
		em.getTransaction().commit();

	}

	// *******************modifier***************************//
	@Override
	public void modifierSalle(Salle salle) {
		Salle salleOld = em.find(Salle.class, salle.getCode());
		em.persist(salleOld);

	}

	// ********supprimer*******************

	@Override

	public void supprimerSalle(int code) {
		em.remove(em.find(Salle.class, code));

	}
	// ***************************consulter*****************

	@SuppressWarnings("unchecked")
	@Override

	public List<Salle> consulter() {
		Query req = em.createQuery("select s from Salle s");
		return req.getResultList();
	}

	// **********recherche par son id ******************************
	@Override

	public Salle chercherSalleById(int code) {
		Salle salle = em.find(Salle.class, code);
		return salle;

	}

	// recherche par son nom*****************************************
	@Override
	public List<Salle> chercherSalleByNom(String nom) {
		@SuppressWarnings("unchecked")
		List<Salle> salle = (List<Salle>) em.find(Salle.class, nom);

		return salle;

	}
}
