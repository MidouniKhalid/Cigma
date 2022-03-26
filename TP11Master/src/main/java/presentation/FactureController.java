package presentation;

import models.Client;
import models.Facture;
import org.springframework.stereotype.Controller;
import service.IFactureService;

import java.util.List;
@Controller(value = "ctrl2")
public class FactureController {

    IFactureService service;

    public void setFservice(IFactureService fservice) {
        this.service = fservice;
    }
    /*
    public void setFservice(IFactureService fservice) {
        this.fservice = fservice;
    }

 */

    public Facture save(Facture f){
        service.save(f);
        return null;
    }
    public List<Facture> findByName(String name){
        return  service.findByName(name);
    }
}
