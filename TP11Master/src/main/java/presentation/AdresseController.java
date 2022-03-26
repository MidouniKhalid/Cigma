package presentation;


import models.Adresse;
import service.IAdresseService;

public class AdresseController {

        private IAdresseService dservice;


        public AdresseController(IAdresseService dservice) {
                this.dservice = dservice;
        }

        public void save(Adresse adresse){

               dservice.save(adresse);
        }
}
