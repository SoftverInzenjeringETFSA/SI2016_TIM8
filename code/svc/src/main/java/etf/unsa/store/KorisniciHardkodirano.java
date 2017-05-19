package etf.unsa.store;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import etf.unsa.Klase.Korisnik;;
@Repository
public class KorisniciHardkodirano {
	private static List<Korisnik> customers = new ArrayList<>(3);
	  static {
	    customers.add(new Korisnik("Milan","Zuza","mzuza","pass1","dsad@dsa.com"));
	    customers.add(new Korisnik("Mila3n","Z32za","mzu32za","pass1","dsad@dsa.com"));
	    customers.add(new Korisnik("Mi3lan","Zuz32a","mz23uza","pass1","dsad@dsa.com"));
	  }
	  public Korisnik findByUsername(String username) {
		    for (Korisnik c : customers) {
		      if (c.getUsername().equals( username)) {
		        return c;
		      }
		    }
		    return null;
		  }
	  
}
