package dao;

import models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class FactureDaoImpl implements IFactureDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_factures");
    EntityManager em =emf.createEntityManager();

    public FactureDaoImpl(){
        System.out.println(("dao created"));
    }

    @Override
    public void save(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }




}
