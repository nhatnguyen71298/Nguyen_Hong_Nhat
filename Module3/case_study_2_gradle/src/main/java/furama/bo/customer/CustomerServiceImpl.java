package furama.bo.customer;

import furama.common.ValidateImpl;
import furama.dao.customer.CustomerDaoImpl;
import furama.model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    CustomerDaoImpl customerDaoImpl= new CustomerDaoImpl();
    ValidateImpl validate= new ValidateImpl();

    @Override
    public boolean addNewCustomer(Customer customer) {
        return this.customerDaoImpl.addNewCustomer(customer);
    }

    @Override
    public List<Customer> displayAllCustomer() {
        return this.customerDaoImpl.displayAllCustomer();
    }

    @Override
    public boolean delCustomer(int id) {
        return this.customerDaoImpl.delCustomer(id);
    }

    @Override
    public Customer getCustomerByID(int id) {
        return this.customerDaoImpl.getCustomerByID(id);
    }

    @Override
    public boolean editCustomer(Customer customer) {
        return this.customerDaoImpl.editCustomer(customer);
    }

    @Override
    public String validateCustomer(Customer customer) {
        String messeger="";
        if (!this.validate.validateNameCustomer(customer.getName())){
            messeger = "Name customer have format KH-XXXX (X is a number)!\n";
        }
        if (!this.validate.validatePhoneNumber(customer.getPhoneNumber())){
            messeger += "Phone number not right!\n";
        }
        if (!this.validate.validateCMND(customer.getCmnd())){
            messeger += "Card ID have 9 or 10 number!\n";
        }
        if (!this.validate.validateEmail(customer.getEmail())){
            messeger += "Email have format x@x.x\n";
        }
        return messeger;
    }
}
