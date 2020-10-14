package controller;

import bo.mat_bang.MatBangBOImpl;
import model.MatBang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MatBangServlet",urlPatterns = "/matBang")
public class MatBangServlet extends HttpServlet {

    MatBangBOImpl matBangBO=new MatBangBOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String messenger="";
        switch (action){
            case "create":
                String maMatBang = request.getParameter("maMatBang");
                String dienTich = request.getParameter("dienTich");
                String trangThai = request.getParameter("trangThai");
                String soTang = request.getParameter("soTang");
                String loaiVanPhong = request.getParameter("loaiVanPhong");
                String gia = request.getParameter("gia");
                String ngayBatDau = request.getParameter("ngayBatDau");
                String ngayKetThuc = request.getParameter("ngayKetThuc");
                MatBang matBang=new MatBang(maMatBang,dienTich,trangThai,soTang,loaiVanPhong,gia,ngayBatDau,ngayKetThuc);
                messenger=this.matBangBO.validatMatBang(matBang);
                if (messenger.equals("")) {
                    if (this.matBangBO.themMoiMatBang(matBang)){
                        messenger="Đa them moi mat bang!";
                    } else {
                        messenger+="Ma mat bang bi trung !";
                    }
                }
                request.setAttribute("messenger",messenger);
                request.getRequestDispatcher("mat_bang/create.jsp").forward(request, response);
                break;
            case "timLoaiMatBang":
                String loaiVanPhongTim = request.getParameter("loaiVanPhongTim");
                List<MatBang> matBangListVanPhong=this.matBangBO.timVanPhong(loaiVanPhongTim);
                request.setAttribute("matBangList",matBangListVanPhong);
                request.getRequestDispatcher("mat_bang/display.jsp").forward(request,response);
                break;
            case "timBangSoTang":
                String soTangTim = request.getParameter("soTangTim");
                List<MatBang> matBangListSoTang=this.matBangBO.timSoTang(soTangTim);
                request.setAttribute("matBangList",matBangListSoTang);
                request.getRequestDispatcher("mat_bang/display.jsp").forward(request,response);
                break;
            case "timGiaTien":
                String giaTim = request.getParameter("giaTim");
                List<MatBang> matBangListGia=this.matBangBO.timGia(giaTim);
                request.setAttribute("matBangList",matBangListGia);
                request.getRequestDispatcher("mat_bang/display.jsp").forward(request,response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "create":
                request.getRequestDispatcher("mat_bang/create.jsp").forward(request, response);
                break;
            case "display":
                List<MatBang> matBangList = this.matBangBO.tatCaMatBang();
                request.setAttribute("matBangList",matBangList);
                request.getRequestDispatcher("mat_bang/display.jsp").forward(request,response);
                break;
            case "delete":
                String maXoa=request.getParameter("maXoa");
                this.matBangBO.xoaBangMa(maXoa);
                List<MatBang> matBangListSauXoa = this.matBangBO.tatCaMatBang();
                request.setAttribute("matBangList",matBangListSauXoa);
                request.getRequestDispatcher("mat_bang/display.jsp").forward(request,response);
        }
    }
}
