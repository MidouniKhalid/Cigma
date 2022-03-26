package cigma.dao;


import cigma.models.Facture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IFactureDao  extends CrudRepository<Facture,Long> {

  // void save (Facture f);
   List<Facture> findByAmount(String name);
}
