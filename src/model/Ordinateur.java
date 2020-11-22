package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.List;
@SuppressWarnings("serial")
@Entity
@Table
public class Ordinateur implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Ordi_code")
    private int code;
    @Column(name = "Ordi_nom")
    private String nom;
    @Column(name = "Ordi_IP")
    private String adresseIP;

    public Ordinateur() {
    }

    public Ordinateur(int code, String nom, String adresseIP) {
        this.code = code;
        this.nom = nom;
        this.adresseIP = adresseIP;
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

    public String getAdresseIP() {
        return adresseIP;
    }

    public void setAdresseIP(String adresseIP) {
        this.adresseIP = adresseIP;
    }
    
    /* Cardinalité */
    
    @ManyToOne
	private Salle salle;
	
    public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	@OneToMany
	private List<Installation> installation;
	
	public List<Installation> getInstallation() {
		return installation;
	}

	public void setInstallation(List<Installation> installation) {
		this.installation = installation;
	}
    
}
