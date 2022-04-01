package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/
import java.io.IOException;
import java.io.PrintWriter;



import dao.TaiKhoanDao;
import model.TaiKhoan;


public class DangKy extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DangKy() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//request.getRequestDispatcher("dangnhap0.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
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
		}else {
			String sqlInsert = "insert into taikhoan (username, hoten, sodienthoai, email, password ) "
					+ "values (" + "'" + username + "'," + "'" + hoten + "'," + "'" + sodienthoai + "'," + "'" + email + "'," + "'" + password + "')";
			
			out.println(sqlInsert + "<br>");
			//out.println("<br>");
			//out.println(email);
			TaiKhoanDao taiKhoanDao = new TaiKhoanDao();
			TaiKhoan taiKhoan = new TaiKhoan();
			taiKhoan = taiKhoanDao.checkTaiKhoan(username);
			//out.println("Username: " + taiKhoan.getUsername() + "<br>");
			if (taiKhoan != null) {
				//tai khoan da ton tai
				//out.println("Username da ton tai");
			} else {
				//taiKhoanDao.themTK(sqlInsert);
				//out.println("Username moi");
				taiKhoanDao.themTK(sqlInsert);
				request.getRequestDispatcher("dangnhap0.jsp").forward(request, response);
			}
			
		}
		
		doGet(request, response);
	}

}
