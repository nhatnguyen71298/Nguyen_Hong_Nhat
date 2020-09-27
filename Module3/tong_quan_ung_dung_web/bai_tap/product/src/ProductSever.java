import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductSever",urlPatterns = "/infor")
public class ProductSever extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int price= Integer.parseInt(request.getParameter("price"));
            int percent= Integer.parseInt(request.getParameter("percent"));
            int discountAmout=0;
            int discountPrice=0;

            if (percent!=0){
                discountAmout = price/100*percent;
                discountPrice =price-discountAmout;
            }
            request.setAttribute("discountAmout",discountAmout);
            request.setAttribute("discountPrice",discountPrice);
            request.getRequestDispatcher("display_discount.jsp").forward(request,response);
            response.sendRedirect("/display_discount.jsp");
        }

}
