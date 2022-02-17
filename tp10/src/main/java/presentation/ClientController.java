package presentation;


import models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.IClientService;

@Controller("ctrl1")
public class ClientController {

    @Autowired
    private IClientService service;
    public void save(Client c) {
        service.save(c);
    }
    public ClientController() {
        System.out.println("creation bean controller");
    }
    public void modify(Client c){
        service.modify(c);
    }
    public void removeById(long id){
        service.removeById(id);
    }
    public Client getById(long id){
        return service.getById(id);
    }
}



