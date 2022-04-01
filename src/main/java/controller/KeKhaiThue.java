package controller;

import java.util.ArrayList;
import java.util.Date;

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

import dao.NguoiPhuThuocDao;
import dao.ToKhaiThueDao;
import model.NguoiPhuThuoc;
import model.ToKhaiThue;

/**
 * Servlet implementation class KeKhaiThue
 */
@WebServlet("/KeKhaiThue")
public class KeKhaiThue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KeKhaiThue() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		System.out.print("sdfd");
//		int idUser = (int)session.getAttribute("idUser");
		String cqt =  request.getParameter("cqt");
		String namkekhai =  request.getParameter("namkekhai");
		NguoiPhuThuocDao nptDao = new NguoiPhuThuocDao();
		ArrayList<NguoiPhuThuoc> listNPT = nptDao.getNPTs(1);
		request.setAttribute("soNPT", listNPT.size());
		request.setAttribute("cqt", session.getAttribute("cqt"));
		request.setAttribute("namkekhai", session.getAttribute("namkekhai"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("ToKhaiThueTNCN.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		System.out.print("sdfd");
//		int idUser = (int)session.getAttribute("idUser");
		String cqt =  request.getParameter("cqt");
		String namkekhai =  request.getParameter("namkekhai");
		NguoiPhuThuocDao nptDao = new NguoiPhuThuocDao();
		ArrayList<NguoiPhuThuoc> listNPT = nptDao.getNPTs(1);
		request.setAttribute("soNPT", listNPT.size());
		request.setAttribute("cqt", cqt);
		request.setAttribute("namkekhai", namkekhai);
		session.setAttribute("cqt",cqt);
		session.setAttribute("namkekhai", namkekhai);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ToKhaiThueTNCN.jsp");
		dispatcher.forward(request, response);
	}

}
