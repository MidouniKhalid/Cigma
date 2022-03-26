package dao;

import models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IClientDao extends CrudRepository<Client,Long> {


    List<Client> findByName(String name);

}
