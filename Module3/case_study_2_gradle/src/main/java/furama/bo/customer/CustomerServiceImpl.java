package furama.bo.customer;

import furama.dao.customer.CustomerDaoImpl;
import furama.model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    CustomerDaoImpl customerDaoImpl= new CustomerDaoImpl();


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
}
