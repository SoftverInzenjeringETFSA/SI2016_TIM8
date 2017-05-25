package etf.si.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="komentar")
public class Komentar implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

	@ManyToOne
	@JoinColumn(name="id_korisnika")
	private Korisnik korisnik;

	@ManyToOne
	@JoinColumn(name="id_lokacije")
	private Lokacija lokacija;

    String tekst;
    public Komentar()
    {
    	
    }
	public Komentar(Korisnik k, Lokacija l, String tekst) {
		super();
		this.korisnik = k;
		this.lokacija = l;
		this.tekst = tekst;
	}
	@Override
	public String toString() {
		return "Komentar [id=" + id + ", Korisnik=" + korisnik + ", Lokacija=" + lokacija + ", tekst=" + tekst
				+ "]";
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik k) {
		this.korisnik = k;
	}

	public Lokacija getLokacija() {
		return lokacija;
	}

	public void setLokacija(Lokacija l) {
		this.lokacija = l;
	}

	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
}
