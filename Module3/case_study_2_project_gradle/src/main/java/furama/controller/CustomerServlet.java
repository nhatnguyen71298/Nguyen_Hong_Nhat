package furama.controller;

import furama.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FuramaServlet",urlPatterns = "")
public class CustomerServlet extends HttpServlet {

    Customer customer = new Customer();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String action = request.getParameter("action");
//        if (action="create_customer"){
//            createCustomer(request,response);
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action.equals("create_customer")) {
            request.getRequestDispatcher("customer/create_customer.jsp").forward(request, response);
        }

    }
}
