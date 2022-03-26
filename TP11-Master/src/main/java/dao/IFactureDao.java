package dao;


import models.Facture;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IFactureDao  extends CrudRepository<Facture,Long> {

   List<Facture> findByAmount(String name);
}
