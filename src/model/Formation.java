package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table
public class Formation implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Form_code")
    private int code;
    @Column(name = "Form_nom")
    private String nom;

    public Formation() {
    }

    public Formation(int code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }
    

}
