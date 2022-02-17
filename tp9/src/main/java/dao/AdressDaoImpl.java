package dao;

import models.Adresse;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdressDaoImpl implements IAdressDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_factures");
    EntityManager em =emf.createEntityManager();


    @Override
    public void save(Adresse adresse) {
        em.getTransaction().begin();
        em.persist(adresse);
        em.getTransaction().commit();
    }
}
