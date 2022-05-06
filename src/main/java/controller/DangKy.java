package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import java.io.IOException;




import dao.TaiKhoanDao;
import model.TaiKhoan;

@WebServlet("/DangKy")
public class DangKy extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DangKy() {
        super();
    }
    String x="False";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.setContentType("text/html;charset=UTF-8");//1
		String username=request.getParameter("username");//2
		String password =request.getParameter("password");//3
		String repassword =request.getParameter("repassword");//4
		String hoten =request.getParameter("hoten");//5
		String ngaysinh =request.getParameter("ngaysinh");//6
		String diachi =request.getParameter("diachi");//7
		String sodienthoai=request.getParameter("sodienthoai");//8
		String email =request.getParameter("email");//9		
		if(!password.equals(repassword)) {//10
			x="False";
			response.getWriter().write(x);
			response.sendRedirect("dangky.jsp");//11
		}else {//12
			String sqlInsert = "insert into taikhoan (username,password, hoten,ngaysinh, sodienthoai, email, diachi ) "
	+ "values (" + "'" + username + "'," + "'" + password + "'," + "'" + hoten + "'," +"'" +ngaysinh + 
	"'," + "'" + sodienthoai + "'," + "'" + email + "'," + "'" + diachi + "')";//13
			TaiKhoanDao taiKhoanDao = new TaiKhoanDao();//14
			TaiKhoan taiKhoan = new TaiKhoan();//15
			taiKhoan = taiKhoanDao.checkTaiKhoan(username);//16
			if (taiKhoan != null) {//17
				x="False";
				response.getWriter().write(x);
				request.setAttribute("mess","Tài khoản đã tồn tại !");//18
				request.getRequestDispatcher("dangky.jsp").forward(request, response);//19
			} else {//20
				x="True";
				response.getWriter().write(x);
				taiKhoanDao.themTK(sqlInsert);//21
				//request.getRequestDispatcher("dangnhap.jsp").forward(request, response);
				response.sendRedirect("dangnhap.jsp");//22
			}	//23
		}	//24
	}//25

}