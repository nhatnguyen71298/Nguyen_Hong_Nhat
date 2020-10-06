package furama.bo.service;

import furama.model.Customer;
import furama.model.Service;

import java.util.List;

public interface ServiceInterface {
    boolean addNewService(Service service);
    List<Service> displayAllService();
    String validateService(Service service);
}
