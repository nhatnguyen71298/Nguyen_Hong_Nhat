package furama.bo.employee;

import furama.dao.employee.EmployeeDaoImpl;
import furama.model.Customer;
import furama.model.Employee;

import java.util.List;

public class EmployeeServiceimpl implements EmployeeService {

    EmployeeDaoImpl employeeDao =new EmployeeDaoImpl();

    @Override
    public boolean editEmployee(Employee employee) {
        return this.employeeDao.editEmployee(employee);
    }

    @Override
    public Employee getEmployeeByID(int id) {
        return this.employeeDao.getEmployeeByID(id);
    }

    @Override
    public boolean delEmployee(int id) {
        return this.employeeDao.delEmployee(id);
    }

    @Override
    public boolean addNewEmployee(Employee employee) {
        return this.employeeDao.addNewEmployee(employee);
    }

    @Override
    public List<Employee> displayAllEmployee() {
        return this.employeeDao.displayAllEmployee();
    }
}
