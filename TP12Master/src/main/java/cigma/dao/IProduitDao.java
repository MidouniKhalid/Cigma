package cigma.dao;


import cigma.models.Client;
import cigma.models.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduitDao extends CrudRepository<Produit,Long> {


}
