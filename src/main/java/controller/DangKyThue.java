package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Servlet implementation class DangKyThue
 */
public class DangKyThue extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static final String urlString = "jdbc:mysql://localhost/thuecn";
	static final String rootString = "root";
	static final String passString = "123456";
	
    public DangKyThue() {
        super();

    }


	protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

		request.getRequestDispatcher("ToDangKyThueTNCN.jsp").forward(request, response);
	}

	protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
		
		String tenNNT = request.getParameter("tenNNT");
		//request.setAttribute("tenNNT", tenNNT);
		String loaiGiayTo = request.getParameter("loaiGiayTo");
		//request.setAttribute("loaiGiayTo", loaiGiayTo);
		String soGiayTo = request.getParameter("soGiayTo");
		//request.setAttribute("soGiayTo", soGiayTo);
		String ngayCap = request.getParameter("ngayCap");
		//request.setAttribute("ngayCap", ngayCap);
		String email = request.getParameter("email");
		//request.setAttribute("email", email);
		
		
		
		
		
		doGet(request, response);
	}

}
