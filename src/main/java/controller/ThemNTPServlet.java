package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.NguoiPhuThuocDao;
import model.NguoiPhuThuoc;

/**
 * Servlet implementation class KeKhaiNTPServlet
 */
@WebServlet("/ThemNPT")
public class ThemNTPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NguoiPhuThuocDao nptDao = new NguoiPhuThuocDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemNTPServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		nptDao.themNPT(npt);
		ArrayList <NguoiPhuThuoc> NPTList = new ArrayList <NguoiPhuThuoc>();
	    if (session.getAttribute("NPTList") !=null) NPTList = (ArrayList <NguoiPhuThuoc>) session.getAttribute("NPTList");
		NPTList.add(npt);
		session.removeAttribute("NPTList");
		session.setAttribute("NPTList", NPTList);
		response.sendRedirect("KeKhaiNPT");
	}
}
