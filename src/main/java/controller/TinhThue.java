package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TinhThue
 */
public class TinhThue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TinhThue() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("TinhThue.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tongthunhap = request.getParameter("tongthunhap");
		String songuoiphuthuoc = request.getParameter("songuoiphuthuoc");
		
		long x = Long.parseLong(tongthunhap);
		long y = Long.parseLong(songuoiphuthuoc);
		
        long z=0,t = 0;

		
        if(x>=0){
            if(y>=0){
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
						//thue = t;
					 }
					 else t = 0 ;
				 }
				 else
				 t = 0 ;
             }
         else{
            t = 0 ;
        }
		
        String thue = Long.toString(t) + "đ";

		request.setAttribute("thue", thue);
        
		doGet(request, response);
		//request.getRequestDispatcher("TinhThue.jsp").forward(request, response);
	}
}
