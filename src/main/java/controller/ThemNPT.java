package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/*
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/

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
 * Servlet implementation class ThemNPT
 */
@WebServlet("/ThemNPT")
public class ThemNPT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ThemNPT() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String fullname =  request.getParameter("fullname");
		Date dob = null;
		try {
			dob = new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("dob"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String address = request.getParameter("address");
		String cmnd = request.getParameter("cmnd");
		String relationship = request.getParameter("relationship");
		NguoiPhuThuoc npt = new NguoiPhuThuoc(1,fullname,address, cmnd, relationship,dob);
		NguoiPhuThuocDao nptDao = new NguoiPhuThuocDao();
		nptDao.themNPT(npt);
		ArrayList <NguoiPhuThuoc> NPTList = new ArrayList <NguoiPhuThuoc>();
	    if (session.getAttribute("NPTList") !=null) NPTList = (ArrayList <NguoiPhuThuoc>) session.getAttribute("NPTList");
		NPTList.add(npt);
		session.removeAttribute("NPTList");
		session.setAttribute("NPTList", NPTList);
		//?
		response.sendRedirect("KeKhaiNPT");
	}

}
