package cigma.service;

import cigma.dao.IFactureDao;
import cigma.models.Facture;

import java.util.List;

public class FactureServiceImpl implements IFactureService {

    IFactureDao dao;
  /*
    public IFactureDao getFdao() {
        return fdao;
    }

   */

    public void setFdao(IFactureDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(Facture o) {
        dao.save(o);
    }

    @Override
    public List<Facture> findByName(String name) {
        return null;
    }






}
