package etf.unsa.models;

import javax.persistence.*;

@Entity
@Table(name="korisnik")
public class Korisnik {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

	private String ime;
    private String prezime;
    private String username;
    private String password;
    private String email;

    private Integer brojTacnihPrijava;
    private Integer brojNetacnihPrijava;

    private Double ocjena;

    private Boolean admin;
    private Boolean superAdmin;

	public Korisnik(String ime, String prezime, String username, String password, String email, Integer brojTacnihPrijava,
					Integer brojNetacnihPrijava, Double ocjena,  Boolean admin, Boolean superAdmin) {
		this.ime = ime;
		this.prezime = prezime;
		this.username = username;
		this.password = password;
		this.email = email;
		this.brojTacnihPrijava = brojTacnihPrijava;
		this.brojNetacnihPrijava = brojNetacnihPrijava;
		this.ocjena = ocjena;
		this.admin = admin;
		this.superAdmin = superAdmin;
	}

	public Korisnik(String ime, String prezime, String username, String password, String email) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Integer getId() {
	    return this.id;
	}
	public void setId(Integer id){
	    this.id = id;
    }

	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getBrojTacnihPrijava() {
		return brojTacnihPrijava;
	}
	public void setBrojTacnihPrijava(Integer brojTacnihPrijava) {
		this.brojTacnihPrijava = brojTacnihPrijava;
	}

	public Integer getBrojNetacnihPrijava() {
		return brojNetacnihPrijava;
	}
	public void setBrojNetacnihPrijava(Integer brojNetacnihPrijava) {
		this.brojNetacnihPrijava = brojNetacnihPrijava;
	}

	public Double getOcjena() {
	    return ocjena;
    }
    public void setOcjena(Double ocjena){
	    this.ocjena = ocjena;
    }

	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public Boolean getSuperAdmin() {
		return superAdmin;
	}
	public void setSuperAdmin(Boolean superAdmin) {
		this.superAdmin = superAdmin;
	}

    @Override
    public String toString() {
      return "Korisnik [ime=" + ime + ", prezime=" + prezime+"]";
    }

    //TODO: Metoda za izračunavanje ocjene na osnovu broja tacnih i netacnih prijava
}
