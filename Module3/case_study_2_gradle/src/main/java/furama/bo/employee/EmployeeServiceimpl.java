package furama.bo.employee;

import furama.common.ValidateImpl;
import furama.dao.employee.EmployeeDaoImpl;
import furama.model.Customer;
import furama.model.Employee;

import java.util.List;

public class EmployeeServiceimpl implements EmployeeService {

    EmployeeDaoImpl employeeDao =new EmployeeDaoImpl();
    ValidateImpl validate =new ValidateImpl();

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

    @Override
    public String validateEmployee(Employee employee) {
        String messeger="";
        if (!this.validate.validateNameEmployee(employee.getName())){
            messeger = "Name employee have format NV-XXXX (X is a number)!\n";
        }
        if (!this.validate.validatePhoneNumber(employee.getPhoneNumber())){
            messeger += "Phone number not right!\n";
        }
        if (!this.validate.validateCMND(employee.getCmnd())){
            messeger += "Card ID have 9 or 10 number!\n";
        }
        if (!this.validate.validateEmail(employee.getEmail())){
            messeger += "Email have format x@x.x\n";
        }
        if (!this.validate.validateNumber(employee.getSalary())){
            messeger += "Salary is number >0\n";
        }
        return messeger;
    }
}
