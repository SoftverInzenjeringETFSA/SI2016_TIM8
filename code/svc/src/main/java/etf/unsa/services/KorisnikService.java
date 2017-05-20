package etf.unsa.services;


import etf.unsa.models.Korisnik;
import etf.unsa.repositories.KorisnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Lejla on 20/05/2017.
 */

@Service
public class KorisnikService {

    @Autowired
    KorisnikRepository userRepo;

    public Iterable<Korisnik> findAll(){
        return userRepo.findAll();
    }

    public Korisnik findKorisnik(Integer id){
        return userRepo.findOne(id);
    }

    public void addKorisnik(Korisnik k){
        userRepo.save(k);
    }

    public void deleteKorisnik(Korisnik k){
        userRepo.delete(k);
    }

    public void deleteKorisnik(Integer id){
        userRepo.delete(userRepo.findOne(id));
    }

    public Boolean updateKorisnik(Korisnik k){
        userRepo.save(k);
        return true;
    }

    /* public Boolean isAdmin(Integer id){
        if (userRepo.findOne(id).getAdmin()) return true;
        return false;
    }

    public Boolean isSuperAdmin(Integer id){
        if (userRepo.findOne(id).getSuperAdmin()) return true;
        return false;
    } */

    // TODO: Kod za registraciju korisnika
/*    public Boolean registerKorisnik(Korisnik k) {
    } */

}
