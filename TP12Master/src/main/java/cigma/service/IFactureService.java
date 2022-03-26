package cigma.service;


import cigma.models.Facture;

import java.util.List;

public interface IFactureService {
    void save(Facture f);
    List<Facture> findByName(String name);

}
