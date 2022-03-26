package cigma.service;


import cigma.models.Client;

import java.util.List;

public interface IClientService {

    Client save(Client clt);
    Client modify(Client clt);
    void remove(long idClt);
    Client getOne(long idClt);
    List<Client> getAll();
    List<Client> findByName(String name);
}

