package service;

import dao.IProduitDao;
import models.Produit;


public class ProduitServiceImpl implements IProduitService {

    IProduitDao dao;



    public ProduitServiceImpl(IProduitDao dao) {
        this.dao = dao;
    }


    @Override
    public void save(Produit produit) {
        dao.save(produit);
    }
}
