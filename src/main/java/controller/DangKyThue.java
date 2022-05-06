package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Servlet implementation class DangKyThue
 */
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
		
		PrintWriter out = response.getWriter(); //1
		
		String tenNNT = request.getParameter("tenNNT").replaceAll("\\s\\s+", " ").trim(); //2
		request.setAttribute("tenNNT", tenNNT); //3
		out.println(tenNNT);//4
		String loaiGiayTo = request.getParameter("loaiGiayTo");//5
		
		//Check(loaiGiayTo, request);
		
		//out.println(loaiGiayTo);
		String selected = "selected"; //6
		switch (loaiGiayTo) { //7
		case "1010": //8
			request.setAttribute("CMND", selected); //9
			break;//10
		case "2080": //11
			request.setAttribute("CCCD", selected);//12
			break;//13
		case "1020"://14
			request.setAttribute("HoChieu", selected);//15
			break;//16
		case "1070"://17
			request.setAttribute("CMTBG", selected);//18
			break;//19
		case "1040"://20
			request.setAttribute("GTH", selected);//21
			break;//22
		default: request.setAttribute("Default", selected);//23
			break;//24
		}//25
		String soGiayTo = request.getParameter("soGiayTo").replaceAll("\\s\\s+", " ").trim();//26
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
