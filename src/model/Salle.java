package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Entity
@Table
public class Salle implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Salle_code")
    private int code;
    @Column(name = "Salle_nom")
    private String nom;

    public Salle() {

    }

    public Salle(int code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /* Cardinalité */
    
    @OneToMany(mappedBy = "salle")
	private List<Ordinateur> ordinateur;
	
    public List<Ordinateur> getOrdinateur() {
		return ordinateur;
	}

	public void setOrdinateur(List<Ordinateur> ordinateur) {
		this.ordinateur = ordinateur;
	}
	

	@ManyToMany
	private List<Formation> formation;
	
	public List<Formation> getFormation() {
		return formation;
	}

	public void setFormation(List<Formation> formation) {
		this.formation = formation;
	}
}
