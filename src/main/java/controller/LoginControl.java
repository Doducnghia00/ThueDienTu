package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TaiKhoan;

/**
 * Servlet implementation class LoginControl
 */
@WebServlet("/LoginControl")
public class LoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("dopost");
		String username=request.getParameter("username");
		String password =request.getParameter("password");
				
		DAO dao= new DAO();
		TaiKhoan a;
			a = dao.login(username, password);
			if(a==null) {
				request.getRequestDispatcher("dangnhap0.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("home.jsp").forward(request, response);
			}
		
	
	}

}
