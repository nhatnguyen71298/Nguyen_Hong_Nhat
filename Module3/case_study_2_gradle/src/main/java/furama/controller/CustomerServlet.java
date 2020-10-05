package furama.controller;

import furama.bo.customer.CustomerService;
import furama.bo.customer.CustomerServiceImpl;
import furama.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FuramaServlet",urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    CustomerServiceImpl customerService =new CustomerServiceImpl();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String messenger="";
        switch (action){
            case "create_customer":
                int idService = Integer.parseInt(request.getParameter("id_service"));
                String name = request.getParameter("name");
                String birthday = request.getParameter("birthday");
                String gender = request.getParameter("gender");
                String cmnd = request.getParameter("cmnd");
                String phoneNumber = request.getParameter("phone_number");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                Customer newCustomer = new Customer(idService,name,birthday,gender,cmnd,phoneNumber,email,address);
                if(this.customerService.addNewCustomer(newCustomer)){
                    messenger="Created new customer "+ name +" !";
                } else {
                    messenger="Error";
                }
                request.setAttribute("messenger",messenger);
                request.getRequestDispatcher("customer/create_customer.jsp").forward(request,response);
                break;
            case "edit":
                int idEdit=Integer.parseInt(request.getParameter("id"));
                int idServiceEdit = Integer.parseInt(request.getParameter("id_service"));
                String nameEdit = request.getParameter("name");
                String birthdayEdit = request.getParameter("birthday");
                String genderEdit = request.getParameter("gender");
                String cmndEdit = request.getParameter("cmnd");
                String phoneNumberEdit = request.getParameter("phone_number");
                String emailEdit = request.getParameter("email");
                String addressEdit = request.getParameter("address");
                Customer newCustomerEdit = new Customer(idEdit,idServiceEdit,nameEdit,birthdayEdit,genderEdit,cmndEdit,phoneNumberEdit,emailEdit,addressEdit);
                if(this.customerService.editCustomer(newCustomerEdit)){
                    Customer customerEdit =  this.customerService.getCustomerByID(idEdit);
                    request.setAttribute("customerEdit",customerEdit);
                    messenger="Update success: "+ nameEdit +" !";
                } else {
                    messenger="Error";
                }
                request.setAttribute("messenger",messenger);
                request.getRequestDispatcher("customer/edit_customer.jsp").forward(request,response);
                break;
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String mesesnger="";
        switch (action){
            case "create_customer":
                request.getRequestDispatcher("customer/create_customer.jsp").forward(request, response);
                break;
            case "displayAllCustomer":
                List<Customer> allCustomer= this.customerService.displayAllCustomer();
                request.setAttribute("allCustomer",allCustomer);
                request.getRequestDispatcher("customer/display_customer.jsp").forward(request,response);
                break;
            case "delete":
                int idDelete=Integer.parseInt(request.getParameter("idDelete"));
                this.customerService.delCustomer(idDelete);
                List<Customer> allCustomerAfterDel= this.customerService.displayAllCustomer();
                request.setAttribute("allCustomer",allCustomerAfterDel);
                request.getRequestDispatcher("customer/display_customer.jsp").forward(request,response);
                break;
            case "edit":
                int idEdit=Integer.parseInt(request.getParameter("idEdit"));
                Customer customerEdit =  this.customerService.getCustomerByID(idEdit);
                request.setAttribute("customerEdit",customerEdit);
                request.getRequestDispatcher("customer/edit_customer.jsp").forward(request,response);
                break;
        }

    }
}
