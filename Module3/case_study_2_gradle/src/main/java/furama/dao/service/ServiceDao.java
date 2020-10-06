package furama.dao.service;

import furama.model.Service;

import java.util.List;

public interface ServiceDao {
    List<Service> displayAllService();
    boolean addNewService(furama.model.Service service);
}
