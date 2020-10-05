package furama.bo.customer;

import furama.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> displayAllCustomer();
    Customer getCustomerByID(int id);
    boolean addNewCustomer(Customer customer);
    boolean delCustomer(int id);
    boolean editCustomer(Customer customer);
}
