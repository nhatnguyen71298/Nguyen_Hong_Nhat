package controller;

import bo.catelory.CateloryServiceImpl;
import bo.product.ProductServiceImpl;
import model.Product;
import model.TypeCatelory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    CateloryServiceImpl cateloryService=new CateloryServiceImpl();
    ProductServiceImpl productService=new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String messenger="";
        switch (action){
            case "create":
                String stt = request.getParameter("stt");
                String name = request.getParameter("name");
                String price = request.getParameter("price");
                String quantity = request.getParameter("quantity");
                String colorID = request.getParameter("colorID");
                String cateloryID = request.getParameter("cateloryID");
                Product newProduct=new Product(stt,name,price,quantity,colorID,cateloryID);
                messenger= this.productService.validateProdutc(newProduct);
                if (this.productService.addNewProduct(newProduct)){
                    messenger="Creted new product!";
                } else {
                    messenger="Error";
                }

                request.setAttribute("messenger",messenger);
                request.getRequestDispatcher("product/create.jsp").forward(request, response);
                break;
//            case "edit":
//                int idEdit=Integer.parseInt(request.getParameter("id"));
//                int postion_idEdit = Integer.parseInt(request.getParameter("postion_id"));
//                int education_idEdit = Integer.parseInt(request.getParameter("education_id"));
//                int division_idEdit = Integer.parseInt(request.getParameter("division_id"));
//                String nameEdit = request.getParameter("name");
//                String birthdayEdit = request.getParameter("birthday");
//                String cmndEdit = request.getParameter("cmnd");
//                String salaryEdit = request.getParameter("salary");
//                String phoneNumberEdit = request.getParameter("phoneNumber");
//                String emailEdit = request.getParameter("email");
//                String addressEdit = request.getParameter("address");
//                Employee newEmployeeEdit = new Employee(idEdit,postion_idEdit,education_idEdit,division_idEdit,nameEdit,birthdayEdit,cmndEdit,salaryEdit,phoneNumberEdit,emailEdit,addressEdit);
//                messenger=this.employeeServiceimpl.validateEmployee(newEmployeeEdit);
//                if (messenger.equals("")){
//                    if(this.employeeServiceimpl.editEmployee(newEmployeeEdit)){
//                        messenger="Updated employee: "+ nameEdit +" !";
//                    } else {
//                        messenger="Error";
//                    }
//                }
//                Employee employeeEdit =  this.employeeServiceimpl.getEmployeeByID(idEdit);
//                request.setAttribute("employeeEdit",employeeEdit);
//                request.setAttribute("messenger",messenger);
//                request.getRequestDispatcher("employee/edit_employee.jsp").forward(request,response);
//                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                List<TypeCatelory> allType= this.cateloryService.allCatelory();
                request.setAttribute("listAllType",allType);
                request.getRequestDispatcher("product/create.jsp").forward(request, response);
                break;
            case "display":
                List<Product> productList = this.productService.allProduct();
                request.setAttribute("productList",productList);
                request.getRequestDispatcher("product/display.jsp").forward(request,response);
                break;
//            case "edit":
//                String idEdit=request.getParameter("idEdit");
//                Employee employeeEdit=this.employeeService.getEmployeeByID(idEdit);
//                request.setAttribute("employeeEdit",employeeEdit);
//                request.getRequestDispatcher("employee/edit.jsp").forward(request,response);
//                break;
            case "delete":
                String sttDel=request.getParameter("sttDel");
                this.productService.deleteBySTT(sttDel);
                List<Product> productListDel = this.productService.allProduct();
                request.setAttribute("productList",productListDel);
                request.getRequestDispatcher("product/display.jsp").forward(request,response);
                break;
        }
    }
}
