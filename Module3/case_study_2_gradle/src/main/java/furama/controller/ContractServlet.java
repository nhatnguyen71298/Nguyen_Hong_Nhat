package furama.controller;

import furama.bo.contract.ContractDetailService;
import furama.bo.contract.ContractServiceDetailImpl;
import furama.bo.contract.ContractServiceImpl;
import furama.bo.customer.CustomerServiceImpl;
import furama.bo.employee.EmployeeServiceimpl;
import furama.bo.service.ServiceInterfaceImlp;
import furama.model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet",urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {

    EmployeeServiceimpl employeeServiceimpl =new EmployeeServiceimpl();
    ServiceInterfaceImlp serviceImlp =new ServiceInterfaceImlp();
    CustomerServiceImpl customerService=new CustomerServiceImpl();
    ContractServiceImpl contractService=new ContractServiceImpl();
    ContractServiceDetailImpl contractServiceDetail=new ContractServiceDetailImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String messenger="";
        switch (action){
            case "create":
//                name,area,maxPeople,floos,areaFool,orther,standardRoom
                int idEmployee=Integer.parseInt(request.getParameter("idEmployee"));
                int idCustomer=Integer.parseInt(request.getParameter("idCustomer"));
                int idService=Integer.parseInt(request.getParameter("idService"));
                String dayStart=request.getParameter("dayStart");
                String dayEnd=request.getParameter("dayEnd");
                int deposit=Integer.parseInt(request.getParameter("deposit"));
                int total=Integer.parseInt(request.getParameter("total"));
                Contract newContract =new Contract(total,idEmployee,idCustomer,idService,deposit,dayStart,dayEnd);
                messenger=this.contractService.validateContract(newContract);
                if (messenger.equals("")){
                    if (this.contractService.addNewContract(newContract)){
                        messenger="Created a new contract!" ;
                    } else {
                        messenger="Error";
                    }
                }
                List<Employee> allEmployee= this.employeeServiceimpl.displayAllEmployee();
                List<Service> allService= this.serviceImlp.displayAllService();
                List<Customer> allCustomer=this.customerService.displayAllCustomer();
                request.setAttribute("allEmployee",allEmployee);
                request.setAttribute("allService",allService);
                request.setAttribute("allCustomer",allCustomer);
                request.setAttribute("messenger",messenger);
                request.getRequestDispatcher("contract/create_contract.jsp").forward(request, response);
                break;
            case "createContractDetail":
                int idContract=Integer.parseInt(request.getParameter("idContract"));
                int attachService=Integer.parseInt(request.getParameter("attachService"));
                int quantity=Integer.parseInt(request.getParameter("quantity"));
                ContractDetail newContractDetail= new ContractDetail(idContract,attachService,quantity);
                messenger=this.contractServiceDetail.validateContractDetail(newContractDetail);
                if (messenger.equals("")){
                    if (this.contractServiceDetail.addNewContractDetail(newContractDetail)){
                        messenger="Created new contract detail!";
                    } else {
                        messenger="Error";
                    }
                }
                request.setAttribute("messenger",messenger);
                request.getRequestDispatcher("contract/create_contract_detail.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "create":
                List<Employee> allEmployee= this.employeeServiceimpl.displayAllEmployee();
                List<Service> allService= this.serviceImlp.displayAllService();
                List<Customer> allCustomer=this.customerService.displayAllCustomer();
                request.setAttribute("allEmployee",allEmployee);
                request.setAttribute("allService",allService);
                request.setAttribute("allCustomer",allCustomer);
                request.getRequestDispatcher("contract/create_contract.jsp").forward(request, response);
                break;
            case "createContractDetail":
                List<Contract> allContract=this.contractService.displayAllContract();
                request.setAttribute("allContract",allContract);
                request.getRequestDispatcher("contract/create_contract_detail.jsp").forward(request, response);

        }
    }
}
