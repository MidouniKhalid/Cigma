package service;
import dao.IClientDao;
import models.Client;

public class ClientServiceImpl implements IClientService {
    private IClientDao cdao;

    public void setCdao(IClientDao cdao) {
        this.cdao = cdao;
    }

    public ClientServiceImpl(IClientDao cdao) {
        this.cdao = cdao;
    }

    @Override
    public Client save(Client c) {
        return cdao.save(c);
    }
    @Override
    public Client modify(Client c) {
        return cdao.update(c);
    }
    @Override
    public void removeById(long id) {
        cdao.deleteById(id);
    }
    @Override
    public Client getById(long id) {
        return cdao.findById(id);
    }

}
