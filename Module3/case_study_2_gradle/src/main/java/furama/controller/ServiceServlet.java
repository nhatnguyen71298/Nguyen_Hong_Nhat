package furama.controller;

import furama.bo.service.ServiceInterfaceImlp;
import furama.common.ValidateImpl;
import furama.model.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet",urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {

    ServiceInterfaceImlp serviceImlp= new ServiceInterfaceImlp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String messenger="";
        switch (action){
            case "create":
//                name,area,maxPeople,floos,areaFool,orther,standardRoom
                int price=Integer.parseInt(request.getParameter("price"));
                int rentalTypeID=Integer.parseInt(request.getParameter("rentalTypeID"));
                int serviceTypeID=Integer.parseInt(request.getParameter("serviceTypeID"));
                String name=request.getParameter("name");
                String area=request.getParameter("area");
                String maxPeople=request.getParameter("maxPeople");
                String floos=request.getParameter("floos");
                String areaFool=request.getParameter("areaFool");
                String orther=request.getParameter("orther");
                String standardRoom=request.getParameter("standardRoom");
                Service newService =new Service(price,rentalTypeID,serviceTypeID,name,area,maxPeople,floos,areaFool,orther,standardRoom);
                messenger=this.serviceImlp.validateService(newService);
                if (messenger.equals("")){
                    if (this.serviceImlp.addNewService(newService)){
                        messenger="Created service : "+ name;
                    } else {
                        messenger="Error";
                    }
                }
                request.setAttribute("messenger",messenger);
                request.getRequestDispatcher("service/create_service.jsp").forward(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "create":
                request.getRequestDispatcher("service/create_service.jsp").forward(request, response);
                break;
        }

    }
}
