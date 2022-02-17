package ma.cigma.pfe.Controller;

import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.service.IFactureService;

public class FactureController {

    IFactureService service;

    public void setFservice(IFactureService service) {
        this.service = service;
    }



    public void save(Facture f){
        service.save(f);
    }
}
