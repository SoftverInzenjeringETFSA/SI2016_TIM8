package etf.si.services;

import etf.si.models.OdjavaPolozaja;
import etf.si.repositories.OdjavaPolozajaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Terko on 21.05.2017..
 */

@Service
public class OdjavaPolozajaService {
    @Autowired
    private static OdjavaPolozajaRepository OdjavaPolozaja;

    public static Iterable<OdjavaPolozaja> findAll(){
        return OdjavaPolozaja.findAll();
    }

    public static OdjavaPolozaja findOdjavaPolozaja(Integer id){
        return OdjavaPolozaja.findOne(id);
    }

    public void addOdjavaPolozaja(OdjavaPolozaja o){
        OdjavaPolozaja.save(o);
    }

    public void deleteOdjavaPolozaja(OdjavaPolozaja o){
        OdjavaPolozaja.delete(o);
    }

    public static void deleteOdjavaPolozaja(Integer id){
        OdjavaPolozaja.delete(OdjavaPolozaja.findOne(id));
    }

    public Boolean updateOdjavaPolozaja(OdjavaPolozaja o){
        OdjavaPolozaja.save(o);
        return true;
    }
}
