package etf.si.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="komentar")
public class Komentar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private int idKorisnika;
    private int idLokacije;
    String tekst;
    public Komentar()
    {
    	
    }
	public Komentar(int idKorisnika, int idLokacije, String tekst) {
		super();
		this.idKorisnika = idKorisnika;
		this.idLokacije = idLokacije;
		this.tekst = tekst;
	}
	@Override
	public String toString() {
		return "Komentar [id=" + id + ", idKorisnika=" + idKorisnika + ", idLokacije=" + idLokacije + ", tekst=" + tekst
				+ "]";
	}
	public int getIdKorisnika() {
		return idKorisnika;
	}
	public void setIdKorisnika(int idKorisnika) {
		this.idKorisnika = idKorisnika;
	}
	public int getIdLokacije() {
		return idLokacije;
	}
	public void setIdLokacije(int idLokacije) {
		this.idLokacije = idLokacije;
	}
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
}
