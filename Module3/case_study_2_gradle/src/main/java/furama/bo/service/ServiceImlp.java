package furama.bo.service;

import furama.dao.service.ServiceDaoImpl;

public class ServiceImlp implements Service {

    ServiceDaoImpl serviceDao= new ServiceDaoImpl();

    @Override
    public boolean addNewService(furama.model.Service service) {
        return this.serviceDao.addNewService(service);
    }
}
