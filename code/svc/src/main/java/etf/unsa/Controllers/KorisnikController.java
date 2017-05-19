package etf.unsa.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import etf.unsa.Klase.*;
import etf.unsa.store.*;
import etf.unsa.exception.*;
@RestController
@RequestMapping("/korisnici")
public class KorisnikController {
	
	
	private final KorisniciHardkodirano customersRepository;
	  @Autowired
	  public KorisnikController(KorisniciHardkodirano repository) {
	    this.customersRepository = repository;
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  Korisnik getKorisnik(@PathVariable("id") String username) {
	    
	    
	    Korisnik customer = customersRepository.findByUsername(username);
	    if (customer == null) {
	        throw new EntityNotFoundException("Korisnik nije nadjen - username: " + username);
	    }
	    return customer;
	    
	  }
	
	

}
