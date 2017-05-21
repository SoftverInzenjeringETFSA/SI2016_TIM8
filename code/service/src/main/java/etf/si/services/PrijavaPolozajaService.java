package etf.si.services;

import org.springframework.stereotype.Service;

import etf.si.models.PrijavaPolozaja;

import etf.si.repositories.OdjavaPolozajaRepository;
import etf.si.repositories.PrijavaPolozajaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PrijavaPolozajaService {
    @Autowired
    private static PrijavaPolozajaRepository PrijavaPolozaja;

    public static Iterable<PrijavaPolozaja> findAll(){
        return PrijavaPolozaja.findAll();
    }

    public static PrijavaPolozaja findPrijavaPolozaja(Integer id){
        return PrijavaPolozaja.findOne(id);
    }

    public void addPrijavaPolozaja(PrijavaPolozaja p){
        PrijavaPolozaja.save(p);
    }

    public void deletePrijavaPolozaja(PrijavaPolozaja p){
        PrijavaPolozaja.delete(p);
    }

    public static void deletePrijavaPolozaja(Integer id){
        PrijavaPolozaja.delete(PrijavaPolozaja.findOne(id));
    }

    public Boolean updatePrijavaPolozaja(PrijavaPolozaja p){
        PrijavaPolozaja.save(p);
        return true;
    }
}