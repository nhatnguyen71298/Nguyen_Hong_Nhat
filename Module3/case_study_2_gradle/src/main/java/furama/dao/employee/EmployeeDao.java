package furama.dao.employee;

import furama.model.Customer;
import furama.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> displayAllEmployee();
    boolean addNewEmployee(Employee employee);
    boolean delEmployee(int id);
    Employee getEmployeeByID(int id);
    boolean editEmployee(Employee employee);
}
