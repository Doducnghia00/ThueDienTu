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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

/**
 * Servlet implementation class DangKyThue
 */
@WebServlet("/DangKyThue")
public class DangKyThue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	static final String urlString = "jdbc:mysql://localhost/thuecn";
	static final String rootString = "root";
	static final String passString = "123456";
	
    public DangKyThue() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("ToDangKyThueTNCN.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String tenNNT = request.getParameter("tenNNT").replaceAll("\\s\\s+", " ").trim();
		request.setAttribute("tenNNT", tenNNT);
		out.println(tenNNT);
		String loaiGiayTo = request.getParameter("loaiGiayTo");
		
		
		//out.println(loaiGiayTo);
		String selected = "selected";
		switch (loaiGiayTo) {
		case "1010":
			request.setAttribute("CMND", selected);
			break;
		case "2080":
			request.setAttribute("CCCD", selected);
			break;
		case "1020":
			request.setAttribute("HoChieu", selected);
			break;
		case "1070":
			request.setAttribute("CMTBG", selected);
			break;
		case "1040":
			request.setAttribute("GTH", selected);
			break;
		default: request.setAttribute("Default", selected);
			break;
		}
		String soGiayTo = request.getParameter("soGiayTo").replaceAll("\\s\\s+", " ").trim();
		request.setAttribute("soGiayTo", soGiayTo);
		String ngayCap = request.getParameter("ngayCap");
		request.setAttribute("ngayCap", ngayCap);
		out.println(ngayCap);
		String email = request.getParameter("email").replaceAll("\\s\\s+", " ").trim();
		request.setAttribute("email", email);
		

		
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter.format(date);  
	    //System.out.println(strDate); 
	    request.setAttribute("ngayKy", strDate);
		
		doGet(request, response);
	}

}
