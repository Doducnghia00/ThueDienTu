package controller;

import java.io.IOException;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import dao.DangKyNhapDAO;
import model.TaiKhoan;
/**
 * Servlet implementation class DangNhapServlet
 */
@WebServlet("/DangNhapServlet")
public class DangNhapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DangNhapServlet() {
		super();
	}
	String x="False";
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
//		if(x=="Flase") {
//			request.getRequestDispatcher("dangnhap.jsp");
//		}else {
//			request.getRequestDispatcher("home.jsp");
//		}
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");//1
		String username=request.getParameter("username");//2
		String password =request.getParameter("password");//3	
		
		DangKyNhapDAO dangKyNhapDAO= new DangKyNhapDAO();//4
		TaiKhoan a;//5
			try {//6
				a = dangKyNhapDAO.login(username, password);//7
				if(a==null) {//8
					
					x="False";
					response.getWriter().write(x);	
					request.setAttribute("mess","Sai tài khoản hoặc mật khẩu !");//9
					request.getRequestDispatcher("dangnhap.jsp").forward(request, response);//10
				}else {//11	
					x="True";
					response.getWriter().write(x);	
					HttpSession session=request.getSession();//12
					
					session.setAttribute("id", a.getId());//13
					session.setAttribute("username", a.getUsername());//14
					session.setAttribute("password", a.getPassword());//15
					session.setAttribute("hoten", a.getHoten());//16
					session.setAttribute("ngaysinh", a.getNgaysinh());//17
					session.setAttribute("sodienthoai", a.getSodienthoai());//18
					session.setAttribute("email", a.getEmail());//19
					session.setAttribute("diachi", a.getDiachi());//20
					
					request.getRequestDispatcher("home.jsp").forward(request, response);;//21
				}//22
			} catch (SQLException e) {//23
				e.printStackTrace();//24
			}//25
//			doGet(request, response);
	}//26

}