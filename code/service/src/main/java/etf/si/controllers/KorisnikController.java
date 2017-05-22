package etf.si.controllers;

import etf.si.models.Korisnik;
import etf.si.services.KorisnikService;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lejla on 20/05/2017.
 */

@RestController
@CrossOrigin
@RequestMapping(path= "/korisnici")
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

    @RequestMapping(path="/get/{id}", method = RequestMethod.GET)
    public Korisnik getKorisnik(@PathVariable("id") Integer id){
        return userService.findKorisnik(id);
    }

    @RequestMapping(path = "/delete", method = RequestMethod.GET)
    public String deleteUser(@RequestParam(name = "id") Integer id) {
        userService.deleteKorisnik(id);
        return "Done";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity register(@RequestBody Korisnik korisnik)
    {
        try {
                return ResponseEntity.status(HttpStatus.OK)
                        .body(userService.registerKorisnik(korisnik));
               
        }
        catch (ServiceException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                .body(e.getLocalizedMessage());
        }


    }
    
    
    
}