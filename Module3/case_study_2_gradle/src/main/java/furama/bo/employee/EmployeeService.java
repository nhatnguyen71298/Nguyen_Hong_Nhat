package furama.bo.employee;

import furama.model.Customer;
import furama.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> displayAllEmployee();
    Employee getEmployeeByID(int id);
    boolean addNewEmployee(Employee employee);
    boolean delEmployee(int id);
    boolean editEmployee(Employee employee);
}
