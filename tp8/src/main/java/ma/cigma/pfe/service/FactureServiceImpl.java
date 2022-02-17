package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IFactureDao;
import ma.cigma.pfe.models.Facture;

public class FactureServiceImpl implements IFactureService {

    IFactureDao fdao;



    @Override
    public void save(Facture f) {
        fdao.save(f);
    }




}
