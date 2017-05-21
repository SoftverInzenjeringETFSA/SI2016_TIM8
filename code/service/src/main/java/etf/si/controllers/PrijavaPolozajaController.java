package etf.si.controllers;

import etf.si.services.OdjavaPolozajaService;
import etf.si.services.PrijavaPolozajaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import etf.si.models.PrijavaPolozaja;

@RestController
@CrossOrigin
@RequestMapping(path= "/prijavapolozaja")
public class PrijavaPolozajaController {
    @Autowired

    private PrijavaPolozajaService prijavaPolozajaService;

    public void setPrijavaPolozajaService (PrijavaPolozajaService prService) {this.prijavaPolozajaService=prService;}

    @RequestMapping(path="/get/all", method = RequestMethod.GET)
    public List<PrijavaPolozaja> findAll() {
        List<PrijavaPolozaja> polozajiPrijava;
        polozajiPrijava = (List<PrijavaPolozaja>) PrijavaPolozajaService.findAll();
        return polozajiPrijava;
    }

    @RequestMapping(path="/get/{id}", method = RequestMethod.GET)
    public PrijavaPolozaja getPrijavaPolozaja(@PathVariable("id") Integer id){
        return PrijavaPolozajaService.findPrijavaPolozaja(id);
    }

    @RequestMapping(path = "/delete", method = RequestMethod.GET)
    public String deletePrijavaPolozaja(@RequestParam(name = "id") Integer id) {
        PrijavaPolozajaService.deletePrijavaPolozaja(id);
        return "Done";
    }
}
