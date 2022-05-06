package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;


import java.io.IOException;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import dao.NguoiPhuThuocDao;
import model.NguoiPhuThuoc;

/**
 * Servlet implementation class KeKhaiNTP
 */
@WebServlet("/KeKhaiNPT")
public class KeKhaiNPT extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NguoiPhuThuocDao nptDao = new NguoiPhuThuocDao();
	private ArrayList<NguoiPhuThuoc> listNPT = new ArrayList<NguoiPhuThuoc>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KeKhaiNPT() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	//	String id = (String) session.getAttribute("id");
		if (session.getAttribute("id") != null) {
			//int idUser = Integer.parseInt(id);
			int idUser = (int)session.getAttribute("id");
			ArrayList<NguoiPhuThuoc> listNPT = nptDao.getNPTs(idUser);
			response.getWriter().write("True");
			request.setAttribute("listNPT", listNPT);
			
			//RequestDispatcher dispatcher = request.getRequestDispatcher("KeKhaiNPT.jsp");
			//dispatcher.forward(request, response);
			 request.getRequestDispatcher("KeKhaiNPT.jsp").forward(request, response);
		} 
		else {
			response.getWriter().write("False");
			response.sendRedirect("dangnhap.jsp");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
