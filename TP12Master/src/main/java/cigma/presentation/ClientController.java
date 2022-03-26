package cigma.presentation;
// @GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
import cigma.models.Client;
import cigma.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private IClientService service;

    @GetMapping("/{id}")
   // @GetMapping(path = "/{id}")
    public Client getOne(@PathVariable("id") long idClt){
        return service.getOne(idClt);
    }
    @GetMapping("/all")
   // @GetMapping(path = "/{all}")
    public List<Client> getAll(){
        return service.getAll();
    }
    @PostMapping("/create")
    public Client save(@RequestBody Client clt) {
        return service.save(clt);
    }
    @PutMapping("/update")
    public Client modify(@RequestBody Client clt){
        return service.modify(clt);
    }

        @DeleteMapping("/{id}")
        // @GetMapping(path = "/{id}")
        public void remove(@PathVariable("id") long idClt){
             service.remove(idClt);
    }
}