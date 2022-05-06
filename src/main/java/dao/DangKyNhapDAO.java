package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.sql.Statement;

import model.TaiKhoan;
public class DangKyNhapDAO {
	public TaiKhoan login(String username,String password) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thuedientu", "root", "123456");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		Connection conn = null;
		String query="SELECT * FROM thuedientu.taikhoan where username = "+username + " and password = "+password+" ;";
		try(PreparedStatement pr = conn.prepareStatement(query)) {
			ResultSet rs = pr.executeQuery(query);			
			while (rs.next()) {				
				return new TaiKhoan(rs.getInt(1), rs.getString(2) , rs.getString(3) ,rs.getString(4) ,rs.getString(5)
						,rs.getString(6) , rs.getString(7),rs.getString(8));
				
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
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thuedientu", "root", "123456");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				return new TaiKhoan(rs.getInt(1), rs.getString(2) , rs.getString(3) ,rs.getString(4) ,rs.getString(5)
						,rs.getString(6) , rs.getString(7),rs.getString(8));
			}
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
