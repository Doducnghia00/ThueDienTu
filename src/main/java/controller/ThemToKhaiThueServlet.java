package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.NguoiPhuThuocDao;
import dao.ToKhaiThueDao;
import model.NguoiPhuThuoc;
import model.ToKhaiThue;

/**
 * Servlet implementation class KeKhaiThueServlet
 */
@WebServlet("/ThemToKhaiThue")
public class ThemToKhaiThueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ToKhaiThueDao tktDao = new ToKhaiThueDao();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThemToKhaiThueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
//		int idUser = (int)session.getAttribute("idUser");
		System.out.print(request.getParameter("tongthue"));
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
		ToKhaiThue tkt = new ToKhaiThue(1, cqt,namkekhai,mst, tennguoinop,thunhapvn,thunhapnn, danop, conphainop, nopthua,tongthue,ngaytao);
		
		tktDao.themToKhaiThue(tkt);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

}
