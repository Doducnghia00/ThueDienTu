package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ToDangKyThueTNCN
 */
public class ToDangKyThueTNCN extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
    
	static final String urlString = "jdbc:mysql://localhost/thuecn";
	static final String rootString = "root";
	static final String passString = "123456";

    public ToDangKyThueTNCN() {
        super();

    }


	protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("GuiGiayTo.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(urlString, rootString, passString);

			
			
			List<String> colName = new ArrayList<String>();
			List<String> values = new ArrayList<String>();
			
			Enumeration paramNames = request.getParameterNames();
			while(paramNames.hasMoreElements()) {
				String paramName =  (String)paramNames.nextElement();
				colName.add(paramName);
				String paramValue = request.getParameter(paramName);
				values.add(paramValue);		
			}
			/*for (int i = 0; i< 44; i++) {
				int a = i+1;
				 out.println( a+ " " + colName.get(i) + " " + values.get(i));
				 out.println("<br>");
			}*/
			
			String sqlInsert = "insert into dangkythue ";
			String S1 = "(";
			String S2 = "values (";
			for(int i = 0; i< colName.size(); i++) {
				if(i< colName.size() - 1) {
					if(values.get(i) != "") {
						S1 += "" + colName.get(i)+",";
						S2 += "' " + values.get(i) +" ',";
					}else {
					
					}
				}else {
					S1 += "" + colName.get(i)+") ";
					if(values.get(i) != "") S2 += "'" + values.get(i) +"') ";
					else S2 += "null)";
					
				}
			}
			sqlInsert += S1 + S2;
			out.println(sqlInsert);
			
			statement = connection.createStatement();
			statement.executeUpdate(sqlInsert);
			
			/*String sqlInsert = "insert into test (Ten,Email) values ('" + <X> + " ',' " + <X> +" ' )";
			statement.executeUpdate(sqlInsert);*/
			

			
		}catch (ClassNotFoundException e) {
			out.println("Loi 1");
			e.printStackTrace();
		}catch (SQLException e) {
			out.println("Loi 2");
			e.printStackTrace();
		}catch (Exception e) {
			out.println("Loi 3");
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}
