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
import java.text.NumberFormat;
import java.util.Locale;



/**
 * Servlet implementation class TinhThue
 */
@WebServlet("/TinhThue")
public class TinhThue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TinhThue() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, jakarta.servlet.ServletException {
		request.getRequestDispatcher("TinhThue2.jsp");
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, jakarta.servlet.ServletException {
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String tongthunhap = request.getParameter("tongthunhap");
		
		String songuoiphuthuoc = request.getParameter("songuoiphuthuoc");
		
		
		tongthunhap = tongthunhap.replace(".", "");
		songuoiphuthuoc = songuoiphuthuoc.replace(".", "");
		
		long x = Long.parseLong(tongthunhap);
		long y = Long.parseLong(songuoiphuthuoc);
		
		
		long z=0,t=0,thue = 0;
		
		z=x-11000000-y*4400000;
		 if(z>0){
			 //z : thu nhap chiu thue
				 if(z<=5000000&&z>0){
					 t=(long) (z*0.05);
				 }
				 if(5000000<z&&z<=10000000){
					 t=(long) (5000000*0.05+(z-5000000)*0.1);
				  }
				 if(z>10000000&&z<=18000000){
					 t=(long)(5000000*0.15+(z-10000000)*0.15);
				 }
				 if(z>18000000&&z<=32000000){
					 t=(long) (5000000*0.15+8000000*0.15+(z-18000000)*0.2);
				 }
				 if(z>32000000&&z<=52000000){
					 t=(long) (5000000*0.15+8000000*0.15+14000000*0.2+(z-32000000)*0.25);
				 }
				 if(z>52000000&&z<=80000000){
					 t=(long) (5000000*0.15+8000000*0.15+14000000*0.2+20000000*0.25+(z-52000000)*0.3);
				 }
				  if(z>80000000){
					 t=(long) (5000000*0.15+8000000*0.15+14000000*0.2+20000000*0.25+28000000*0.3+(z-80000000)*0.35);
				 }
				// t: thue phai nop
				thue = t;
			 }
			 else thue = 0 ;
		
	
		 Locale localeVN = new Locale("vi", "VN");
		 NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		 String thue1 = currencyVN.format(thue);
		 response.getWriter().write(Long.toString(thue));
		request.setAttribute("thue", "Thuế phải nộp: " + thue1);
        
		doGet(request, response);
	}
	

}
