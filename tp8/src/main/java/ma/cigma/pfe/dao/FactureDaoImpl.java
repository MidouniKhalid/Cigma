package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class FactureDaoImpl implements IFactureDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_factures");
    EntityManager em =emf.createEntityManager();

    public FactureDaoImpl(){
        System.out.println(("dao "));
    }

    @Override
    public Facture save(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();

      return  null;

    }
}
