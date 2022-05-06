package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;


import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import dao.NguoiPhuThuocDao;
import dao.ToKhaiThueDao;
import model.NguoiPhuThuoc;
import model.ToKhaiThue;

/**
 * Servlet implementation class ThemToKhaiThue
 */
@WebServlet("/ThemToKhaiThue")
public class ThemToKhaiThue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ThemToKhaiThue() {
        super();

    }


//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
//		String id = (String) session.getAttribute("id");
		if (session.getAttribute("id") != null) {
			//int idUser = Integer.parseInt(id);
			int idUser = (int)session.getAttribute("id");
	//		System.out.print(request.getParameter("tongthue"));
			String cqt =  (String) session.getAttribute("cqt");
			String namkekhai = (String) session.getAttribute("namkekhai");
			String mst =  request.getParameter("mst");
			String tennguoinop =  request.getParameter("name");
			double thunhapvn =  Double.parseDouble(request.getParameter("thunhapvn"));
			double thunhapnn =  Double.parseDouble(request.getParameter("thunhapnn"));
			double danop =  Double.parseDouble(request.getParameter("danop"));
			double tongthue =  Double.parseDouble(request.getParameter("tongthue"));
			double conphainop =  Double.parseDouble(request.getParameter("conphainop"));
			double nopthua =  Double.parseDouble(request.getParameter("nopthua"));
			Date ngaytao = new Date();
			ToKhaiThue tkt = new ToKhaiThue(idUser, cqt,namkekhai,mst, tennguoinop,thunhapvn,thunhapnn, danop, conphainop, nopthua,tongthue,ngaytao);
			ToKhaiThueDao tktDao = new ToKhaiThueDao();
			tktDao.themToKhaiThue(tkt);
			response.getWriter().write("True");
			RequestDispatcher dispatcher = request.getRequestDispatcher("ChoDuyet.jsp");
			dispatcher.forward(request, response);
			//request.getRequestDispatcher("ChoDuyet.jsp");
		}
		else {
			response.getWriter().write("False");
			RequestDispatcher dispatcher = request.getRequestDispatcher("dangnhap.jsp");
			dispatcher.forward(request, response);
			//request.getRequestDispatcher("dangnhap.jsp");
		}
	}

}
