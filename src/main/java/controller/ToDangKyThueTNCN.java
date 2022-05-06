package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/*
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
*/

import dao.DangKyThueDao;

/**
 * Servlet implementation class ToDangKyThueTNCN
 */
@WebServlet("/ToDangKyThueTNCN")
public class ToDangKyThueTNCN extends HttpServlet {
	private static final long serialVersionUID = 1L;
    


    public ToDangKyThueTNCN() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("GuiGiayTo.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();


		List<String> colName = new ArrayList<String>();
		List<String> values = new ArrayList<String>();
		
		Enumeration paramNames = request.getParameterNames();
		while(paramNames.hasMoreElements()) {
			String paramName =  (String)paramNames.nextElement();
			colName.add(paramName);
			String paramValue = request.getParameter(paramName);
			values.add(paramValue.replaceAll("\\s\\s+", " ").trim());		
		}
		saveData(colName, values);
		//String sqlInsert = sql(colName, values);
		
		/*String sqlInsert = "insert into thuedientu.dangkythue ";
		String S1 = "(";
		String S2 = "values (";
		for(int i = 0; i< colName.size(); i++) {
			if(i< colName.size() - 1) {
				if(values.get(i) != "") {
					S1 += "" + colName.get(i)+",";
					S2 += "' " + values.get(i) +" ',";
				}else {}
			}else {
				S1 += "" + colName.get(i)+") ";
				if(values.get(i) != "") S2 += "'" + values.get(i) +"') ";
				else S2 += "null)";
				
			}
		}
		sqlInsert += S1 + S2;
		out.println(sqlInsert);*/
		
		/*DangKyThueDao dkt = new DangKyThueDao();
		dkt.themDangKy(sqlInsert);*/
		//out.println(sqlInsert);
		doGet(request, response);
	}
	
	public String sql(List<String> colName, List<String> values) {
		String sqlInsert = "insert into thuedientu.dangkythue ";
		String S1 = "(";
		String S2 = "values (";
		for(int i = 0; i< colName.size(); i++) {
			if(i< colName.size() - 1) {
				if(values.get(i) != "") {
					S1 += "" + colName.get(i)+",";
					S2 += "' " + values.get(i) +" ',";
				}else {}
			}else {
				S1 += "" + colName.get(i)+") ";
				if(values.get(i) != "") S2 += "'" + values.get(i) +"') ";
				else S2 += "null)";
				
			}
		}
		sqlInsert += S1 + S2;
		//out.println(sqlInsert);
		return sqlInsert;
	}
	
	public void saveData(List<String> colName, List<String> values) {
		String sqlInsert = "insert into thuedientu.dangkythue ";
		String S1 = "(";
		String S2 = "values (";
		for(int i = 0; i< colName.size(); i++) {
			if(i< colName.size() - 1) {
				if(values.get(i) != "") {
					S1 += "" + colName.get(i)+",";
					S2 += "' " + values.get(i) +" ',";
				}else {}
			}else {
				S1 += "" + colName.get(i)+") ";
				if(values.get(i) != "") S2 += "'" + values.get(i) +"') ";
				else S2 += "null)";
				
			}
		}
		sqlInsert += S1 + S2;
		//out.println(sqlInsert);
		DangKyThueDao dkt = new DangKyThueDao();
		dkt.themDangKy(sqlInsert);
	}

}
