package dao;

import models.Produit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProduitDaoImpl implements IProduitDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_factures");
    EntityManager em =emf.createEntityManager();
    @Override
    public void save(Produit produit) {

        em.getTransaction().begin();
        em.persist(produit);
        em.getTransaction().commit();
    }
}
