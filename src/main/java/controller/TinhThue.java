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

/**
 * Servlet implementation class TinhThue
 */
@WebServlet("/TinhThue")
public class TinhThue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TinhThue() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("TinhThue.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String tongthunhap = request.getParameter("tongthunhap");
		String songuoiphuthuoc = request.getParameter("songuoiphuthuoc");
		
		long x = Long.parseLong(tongthunhap);
		long y = Long.parseLong(songuoiphuthuoc);*/
		
        
		doGet(request, response);
	}
}
