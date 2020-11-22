package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table
public class Installation implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Inst_code")
    private int code;
    @Temporal(TemporalType.DATE)
    @Column(name = "Inst_date")
    private Date dateInstall;
    @Column(name = "Inst_version")
    private String version;

    public Installation() {
    }

    public Installation(int code, Date dateInstall, String version) {
        this.code = code;
        this.dateInstall = dateInstall;
        this.version = version;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDateInstall() {
        return dateInstall;
    }

    public void setDateInstall(Date dateInstall) {
        this.dateInstall = dateInstall;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
    /* Cardinalité */
    @ManyToOne
	private Logiciel logiciel;
    
    public Logiciel getLogiciel() {
		return logiciel;
	}

	public void setLogiciel(Logiciel logiciel) {
		this.logiciel = logiciel;
	}
    
}
