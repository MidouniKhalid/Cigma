package cigma.presentation;


import cigma.models.Adresse;
import cigma.service.IAdresseService;

public class AdresseController {

        private IAdresseService dservice;


        public AdresseController(IAdresseService dservice) {
                this.dservice = dservice;
        }

        public void save(Adresse adresse){

               dservice.save(adresse);
        }
}
