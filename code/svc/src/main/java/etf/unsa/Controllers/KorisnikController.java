package etf.unsa.controllers;
import etf.unsa.models.Korisnik;
import etf.unsa.repositories.KorisnikRepository;
import etf.unsa.services.KorisnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/korisnici")
public class KorisnikController {

	@Autowired
	private KorisnikService userService;

	public void setUserService(KorisnikService userService){
		this.userService = userService;
	}

	@RequestMapping(path="/get/all", method = RequestMethod.GET)
	public List<Korisnik> findAll() {
		List<Korisnik> korisnici;
		korisnici = (List<Korisnik>) userService.findAll();
		return korisnici;
	}

	@RequestMapping(path = "/delete", method = RequestMethod.GET)
	public String deleteUser(@RequestParam(name = "id") Integer id) {
		userService.deleteKorisnik(id);
		return "Done";
	}


}
