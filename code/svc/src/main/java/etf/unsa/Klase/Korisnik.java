package etf.unsa.Klase;

public class Korisnik {
String ime, prezime, username, password,email;
int brojTacnihPrijava, brojNetacnihPrijava;
public Korisnik(String ime, String prezime, String username, String password, String email, int brojTacnihPrijava,
		int brojNetacnihPrijava, boolean admin, boolean superAdmin) {
	super();
	this.ime = ime;
	this.prezime = prezime;
	this.username = username;
	this.password = password;
	this.email = email;
	this.brojTacnihPrijava = brojTacnihPrijava;
	this.brojNetacnihPrijava = brojNetacnihPrijava;
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
public int getBrojTacnihPrijava() {
	return brojTacnihPrijava;
}
public void setBrojTacnihPrijava(int brojTacnihPrijava) {
	this.brojTacnihPrijava = brojTacnihPrijava;
}
public int getBrojNetacnihPrijava() {
	return brojNetacnihPrijava;
}
public void setBrojNetacnihPrijava(int brojNetacnihPrijava) {
	this.brojNetacnihPrijava = brojNetacnihPrijava;
}
public boolean isAdmin() {
	return admin;
}
public void setAdmin(boolean admin) {
	this.admin = admin;
}
public boolean isSuperAdmin() {
	return superAdmin;
}
public void setSuperAdmin(boolean superAdmin) {
	this.superAdmin = superAdmin;
}

@Override
public String toString() {
  return "Korisnik [ime=" + ime + ", prezime=" + prezime+"]";
}
boolean admin, superAdmin;
}
