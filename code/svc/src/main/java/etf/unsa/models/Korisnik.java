package etf.unsa.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="korisnik")
public class Korisnik implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

	private String fullName;
    private String username;
    private String password;
    private String email;

    private Integer brojTacnihPrijava;
    private Integer brojNetacnihPrijava;

    private Double ocjena;

    private Boolean admin;
    private Boolean superAdmin;

	public Korisnik(String ime, String username, String password, String email, Integer brojTacnihPrijava,
					Integer brojNetacnihPrijava, Double ocjena,  Boolean admin, Boolean superAdmin) {
		this.fullName = ime;
		this.username = username;
		this.password = password;
		this.email = email;
		this.brojTacnihPrijava = brojTacnihPrijava;
		this.brojNetacnihPrijava = brojNetacnihPrijava;
		this.ocjena = ocjena;
		this.admin = admin;
		this.superAdmin = superAdmin;
	}

	public Korisnik(String ime, String username, String password, String email) {
		super();
        this.fullName = ime;
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
		return fullName;
	}
	public void setIme(String ime) {
		this.fullName = ime;
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
      return "Korisnik [ime i prezime: " + fullName + "]";
    }

    //TODO: Metoda za izračunavanje ocjene na osnovu broja tacnih i netacnih prijava
}
