package furama.bo.service;

import furama.common.ValidateImpl;
import furama.dao.service.ServiceDaoImpl;
import furama.model.Service;

import java.util.List;

public class ServiceInterfaceImlp implements ServiceInterface {

    ServiceDaoImpl serviceDao= new ServiceDaoImpl();
    ValidateImpl validate =new ValidateImpl();

    @Override
    public boolean addNewService(furama.model.Service service) {
        return this.serviceDao.addNewService(service);
    }

    @Override
    public List<Service> displayAllService() {
        return this.serviceDao.displayAllService();
    }

    @Override
    public String validateService(Service service) {
        String messeger="";
        if (!this.validate.validateNameService(service.getName())){
            messeger = "Name customer have format DV-XXXX (X is a number)!\n";
        }
        if (!this.validate.validateNumber(service.getPrice())){
            messeger += "Input Price > 0!\n";
        }
        if (!this.validate.validateNumber(service.getMaxPeople())){
            messeger += "Input max member >0!\n";
        }
        if (!this.validate.validateNumber(service.getArea())){
            messeger += "Input area >0!\n";
        }
        if (!this.validate.validateNumber(service.getAreaFool())){
            messeger += "Input area pool >0!\n";
        }
        return messeger;
    }
}
