package etf.unsa.controllers;
import etf.unsa.models.Korisnik;
import etf.unsa.repositories.KorisnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/korisnici")
public class KorisnikController {

	@Autowired
	private KorisnikRepository userRepository;



}
