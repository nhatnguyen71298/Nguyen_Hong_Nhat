package furama.dao.customer;

import furama.dao.BaseDao;
import furama.model.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> displayAllCustomer();
    boolean addNewCustomer(Customer customer);
    boolean delCustomer(int id);
    Customer getCustomerByID(int id);
    boolean editCustomer(Customer customer);
}
