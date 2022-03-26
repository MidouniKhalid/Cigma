package cigma.presentation;

import cigma.models.Produit;
import cigma.service.IProduitService;

public class ProduitController {

   private IProduitService pservice;

    public ProduitController(IProduitService pservice) {
        this.pservice = pservice;
    }

    public void save(Produit produit){
        pservice.save(produit);
    }
}
