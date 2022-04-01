package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/*
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.ToNopThueDao;
import model.NguoiPhuThuoc;
import model.ToNopThue;

/**
 * Servlet implementation class NopThue
 */
@WebServlet("/NopThue")
public class NopThue extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    public NopThue() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
//		int idUser = (int)session.getAttribute("idUser");
		System.out.print(request.getParameter("name"));
		String cqt =  (String) request.getParameter("cqt");
		String nganhang = (String) request.getParameter("nganhang");
		String stk = (String) request.getParameter("stk");
		String mst = (String) request.getParameter("mst");
		String tennguoinop =  request.getParameter("name");
		double tienso = Double.parseDouble((String) request.getParameter("tienso"));
		String tienchu = (String) request.getParameter("tienchu");
		String cmnd =  request.getParameter("cmnd");
		Date ngaytao = new Date();
		Date kithueStart = null;
		Date kithueEnd =  null;
		try {
			kithueStart = new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("kithueStart"));
			kithueEnd =  new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("kithueEnd"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ToNopThue tnt = new ToNopThue(1, cqt, mst,tennguoinop,nganhang,stk,cmnd,tienchu,tienso, kithueStart, kithueEnd,ngaytao);
		ToNopThueDao tntDao = new ToNopThueDao();  
		tntDao.themToNopThue(tnt);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ChoDuyet.jsp");
		dispatcher.forward(request, response);
	}

}
