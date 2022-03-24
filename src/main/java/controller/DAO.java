package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;

import model.TaiKhoan;
public class DAO {
	public TaiKhoan login(String username,String password) {
		Connection conn = null;
		String query="SELECT * FROM quanli.taikhoan\n"
				   +"where username="+username
				   +"and password= "+password;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanli", "root", "admin");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				return new TaiKhoan(rs.getInt(1), rs.getString(2) , rs.getString(3) ,rs.getString(4) ,rs.getString(5)
						,rs.getString(6) , rs.getString(7));
			}
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public TaiKhoan checkTaiKhoan(String username) {
		Connection conn = null;
		String query="SELECT * FROM quanli.taikhoan\n"
				   +"where username="+username;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanli", "root", "admin");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				return new TaiKhoan(rs.getInt(1), rs.getString(2) , rs.getString(3) ,rs.getString(4) ,rs.getString(5)
						,rs.getString(6) , rs.getString(7));
			}
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
