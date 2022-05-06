package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import dao.NguoiPhuThuocDao;
import model.NguoiPhuThuoc;
/**
 * Servlet implementation class ThemNPT
 */
@WebServlet("/ThemNPT")
public class ThemNPT extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NguoiPhuThuocDao nptDao = new NguoiPhuThuocDao();
	NguoiPhuThuoc npt = new NguoiPhuThuoc();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemNPT() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String fullname =  request.getParameter("fullname");
		//String id = (String) session.getAttribute("id");*/
		if (session.getAttribute("id") != null) {
			//int idUser = Integer.parseInt(id);
			int idUser = (int)session.getAttribute("id");
			Date dob = null;
			try {
				dob = new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("dob"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			String address = request.getParameter("address");
			String cmnd = request.getParameter("cmnd");
			String relationship = request.getParameter("relationship");
			NguoiPhuThuoc npt = new NguoiPhuThuoc(idUser,fullname,address, cmnd, relationship,dob);
			nptDao.themNPT(npt);
			response.getWriter().write("True");
			response.sendRedirect("KeKhaiNPT");		
		} //20
		else { 
			response.getWriter().write("False");
			RequestDispatcher dispatcher = request.getRequestDispatcher("dangnhap.jsp");
			dispatcher.forward(request, response);
		}
	}
}
