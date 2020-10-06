package furama.controller;

import furama.bo.employee.EmployeeServiceimpl;
import furama.dao.employee.EmployeeDaoImpl;
import furama.model.Customer;
import furama.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet",urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {

    EmployeeServiceimpl employeeServiceimpl=new EmployeeServiceimpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String messenger="";
        switch (action){
            case "create":
//                id,postion_id,education_id,division_id;
//                name,birthday,cmnd, salary, phoneNumber,email,address,username;
                int postion_id = Integer.parseInt(request.getParameter("postion_id"));
                int education_id = Integer.parseInt(request.getParameter("education_id"));
                int division_id = Integer.parseInt(request.getParameter("division_id"));
                String name = request.getParameter("name");
                String birthday = request.getParameter("birthday");
                String cmnd = request.getParameter("cmnd");
                String salary = request.getParameter("salary");
                String phoneNumber = request.getParameter("phoneNumber");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                Employee newEmployee = new Employee(postion_id,education_id,division_id,name,birthday,cmnd,salary,phoneNumber,email,address);
                messenger=this.employeeServiceimpl.validateEmployee(newEmployee);
                if (messenger.equals("")){
                    if(this.employeeServiceimpl.addNewEmployee(newEmployee)){
                        messenger="Created new employee "+ name +" !";
                    } else {
                        messenger="Error";
                    }
                }
                request.setAttribute("messenger",messenger);
                request.getRequestDispatcher("employee/create_employee.jsp").forward(request,response);
                break;
            case "edit":
                int idEdit=Integer.parseInt(request.getParameter("id"));
                int postion_idEdit = Integer.parseInt(request.getParameter("postion_id"));
                int education_idEdit = Integer.parseInt(request.getParameter("education_id"));
                int division_idEdit = Integer.parseInt(request.getParameter("division_id"));
                String nameEdit = request.getParameter("name");
                String birthdayEdit = request.getParameter("birthday");
                String cmndEdit = request.getParameter("cmnd");
                String salaryEdit = request.getParameter("salary");
                String phoneNumberEdit = request.getParameter("phoneNumber");
                String emailEdit = request.getParameter("email");
                String addressEdit = request.getParameter("address");
                Employee newEmployeeEdit = new Employee(idEdit,postion_idEdit,education_idEdit,division_idEdit,nameEdit,birthdayEdit,cmndEdit,salaryEdit,phoneNumberEdit,emailEdit,addressEdit);
                messenger=this.employeeServiceimpl.validateEmployee(newEmployeeEdit);
                if (messenger.equals("")){
                    if(this.employeeServiceimpl.editEmployee(newEmployeeEdit)){
                        messenger="Updated employee: "+ nameEdit +" !";
                    } else {
                        messenger="Error";
                    }
                }
                Employee employeeEdit =  this.employeeServiceimpl.getEmployeeByID(idEdit);
                request.setAttribute("employeeEdit",employeeEdit);
                request.setAttribute("messenger",messenger);
                request.getRequestDispatcher("employee/edit_employee.jsp").forward(request,response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String mesesnger="";
        switch (action){
            case "create":
                request.getRequestDispatcher("employee/create_employee.jsp").forward(request, response);
                break;
            case "displayAllEmployee":
                List<Employee> allEmployee= this.employeeServiceimpl.displayAllEmployee();
                request.setAttribute("allEmployee",allEmployee);
                request.getRequestDispatcher("employee/display_employee.jsp").forward(request,response);
                break;
            case "delete":
                int idDelete=Integer.parseInt(request.getParameter("idDelete"));
                this.employeeServiceimpl.delEmployee(idDelete);
                List<Employee> allEmployeeAfterDel= this.employeeServiceimpl.displayAllEmployee();
                request.setAttribute("allEmployee",allEmployeeAfterDel);
                request.getRequestDispatcher("employee/display_employee.jsp").forward(request,response);
                break;
            case "edit":
                int idEdit=Integer.parseInt(request.getParameter("idEdit"));
                Employee employeeEdit =  this.employeeServiceimpl.getEmployeeByID(idEdit);
                request.setAttribute("employeeEdit",employeeEdit);
                request.getRequestDispatcher("employee/edit_employee.jsp").forward(request,response);
                break;
        }

    }
}
