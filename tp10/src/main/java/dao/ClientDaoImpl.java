package dao;

import models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Repository
public class ClientDaoImpl implements IClientDao {

@PersistenceContext
private EntityManager entitymanager;
    @Override
    public Client save(Client c) {
        entitymanager.persist(c);
        return null;
    }
    public ClientDaoImpl() {
        System.out.println("creation bean dao");
    }

    @Override
    public Client update(Client newClient) {

        entitymanager.persist(newClient);

        return null;
    }
    @Override
    public void deleteById(long idClient) {
        entitymanager.persist(idClient);
    }
    @Override
    public Client findById(long idClient) {
          entitymanager.persist(idClient);
        return null;
    }
}
        /*
    @Override
    public Client save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return null;
    }
    @Override
    public Client update(Client newClient) {
        em.getTransaction().begin();
        Client currentClient = em.find(Client.class,newClient.getId());
        currentClient.setName(newClient.getName());
        em.persist(currentClient);
        em.getTransaction().commit();
        return null;
    }
    @Override
    public void deleteById(long idClient) {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class,idClient);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }
    @Override
    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }

}
*/