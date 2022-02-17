package service;

import dao.IFactureDao;
import models.Facture;

public class FactureServiceImpl implements IFactureService {

    IFactureDao fdao;
  /*
    public IFactureDao getFdao() {
        return fdao;
    }

   */

    public void setFdao(IFactureDao fdao) {
        this.fdao = fdao;
    }

    @Override
    public void save(Facture o) {
        fdao.save(o);
    }


    /*
    public void setFdao(IFactureService fdao) {
        this.fdao = fdao;
    }
*/



}
