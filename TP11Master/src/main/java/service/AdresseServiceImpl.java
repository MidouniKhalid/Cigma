package service;

import dao.IAdressDao;
import models.Adresse;

public class AdresseServiceImpl implements IAdresseService {


    IAdressDao dao;

    public AdresseServiceImpl(IAdressDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(Adresse adresse) {
        dao.save(adresse);
    }
}
