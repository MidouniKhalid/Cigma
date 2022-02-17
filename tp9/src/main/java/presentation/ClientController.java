package presentation;


import models.Client;
import service.IClientService;


public class ClientController {

    private IClientService cservice ;

    public void setCservice(IClientService cservice) {
        this.cservice = cservice;
    }



    public void save(Client c){
        cservice.save(c);
    }
    public void modify(Client c){
        cservice.modify(c);
    }
    public void removeById(long id){
        cservice.removeById(id);
    }
    public Client getById(long id){
        return cservice.getById(id);
    }


}

