package etf.si.controllers;

import etf.si.models.OdjavaPolozaja;
import etf.si.services.OdjavaPolozajaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Terko on 21.05.2017..
 */

@RestController
@CrossOrigin
@RequestMapping(path= "/odjavapolozaja")
public class OdjavaPolozajaController {
    @Autowired
    private OdjavaPolozajaService odjavaPolozajaService;

    public void setOdjavaPolozajaService(OdjavaPolozajaService opService){
        this.odjavaPolozajaService = opService;
    }

    @RequestMapping(path="/get/all", method = RequestMethod.GET)
    public List<OdjavaPolozaja> findAll() {
        List<OdjavaPolozaja> polozajiOdjava;
        polozajiOdjava = (List<OdjavaPolozaja>) OdjavaPolozajaService.findAll();
        return polozajiOdjava;
    }

    @RequestMapping(path="/get/{id}", method = RequestMethod.GET)
    public OdjavaPolozaja getOdjavaPolozaja(@PathVariable("id") Integer id){
        return OdjavaPolozajaService.findOdjavaPolozaja(id);
    }

    @RequestMapping(path = "/delete", method = RequestMethod.GET)
    public String deleteOdjavaPolozaja(@RequestParam(name = "id") Integer id) {
        OdjavaPolozajaService.deleteOdjavaPolozaja(id);
        return "Done";
    }
}
