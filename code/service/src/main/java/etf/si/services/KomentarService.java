package etf.si.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etf.si.models.Komentar;
import etf.si.models.Korisnik;
import etf.si.repositories.KomentarRepository;
import etf.si.repositories.KorisnikRepository;

@Service
public class KomentarService {

    @Autowired
    private KomentarRepository userRepo;

    public Iterable<Komentar> findAll(){
        return userRepo.findAll();
    }

    public Komentar findKomentar(Integer id){
        return userRepo.findOne(id);
    }

    public void addKomentar(Komentar k){
        userRepo.save(k);
    }

    public void deleteKomentar(Komentar k){
        userRepo.delete(k);
    }

    public void deleteKomentar(Integer id){
        userRepo.delete(userRepo.findOne(id));
    }

    public Boolean updateKomentar(Komentar k){
        userRepo.save(k);
        return true;
    }

}

