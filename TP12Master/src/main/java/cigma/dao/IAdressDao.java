package cigma.dao;

import cigma.models.Adresse;
import cigma.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdressDao extends CrudRepository<Adresse,Long> {

}
