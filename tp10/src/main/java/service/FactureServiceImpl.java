package service;

import dao.IFactureDao;
import models.Facture;

public class FactureServiceImpl implements IFactureService {

    IFactureDao fdao;


    public void setFdao(IFactureDao fdao) {
        this.fdao = fdao;
    }

    @Override
    public void save(Facture o) {
        fdao.save(o);
    }






}
