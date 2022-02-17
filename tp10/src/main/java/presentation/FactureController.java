package presentation;

import models.Facture;
import service.IFactureService;

public class FactureController {

    IFactureService fservice;

    public void setFservice(IFactureService fservice) {
        this.fservice = fservice;
    }
    /*
    public void setFservice(IFactureService fservice) {
        this.fservice = fservice;
    }

 */

    public Facture save(Facture f){
        fservice.save(f);
        return null;
    }
}
