package service;
import dao.IClientDao;
import models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientServiceImpl implements IClientService {
    /*
    private IClientDao cdao;

    public void setCdao(IClientDao cdao) {
        this.cdao = cdao;
    }

    public ClientServiceImpl(IClientDao cdao) {
        this.cdao = cdao;
    }

     */
    @Autowired
    private IClientDao dao;
    public ClientServiceImpl() {
        System.out.println("creation bean service");
    }
    @Override
    public Client save(Client c) {
        dao.save(c);
        return c;
    }
    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }
    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }
    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }
}





