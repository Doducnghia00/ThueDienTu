package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DangKy
 */
@WebServlet("/DangKy")
public class DangKyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangKyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("dangky0.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String username=request.getParameter("username");
		String password =request.getParameter("password");
		String repassword =request.getParameter("repassword");
		String hoten =request.getParameter("hoten");
		String ngaysinh =request.getParameter("ngaysinh");
		String sodienthoai=request.getParameter("sodienthoai");
		String email =request.getParameter("email");		
		if(!password.equals(repassword)) {
			response.sendRedirect("dangky0.jsp");
		}
		
	}

}
