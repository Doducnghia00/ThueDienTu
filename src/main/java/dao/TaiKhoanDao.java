package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.TaiKhoan;

public class TaiKhoanDao extends DAO{
	
	public void themTK(String sql) {
		Statement statement;
		try {
			statement = con.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public TaiKhoan login(String username,String password) throws SQLException {

		

		String query="SELECT * FROM thuedientu.taikhoan where username = "+username + " and password = "+password+" ;";
		System.out.print(query);
		try(PreparedStatement pr = con.prepareStatement(query)) {


			ResultSet rs = pr.executeQuery(query);
			
			while (rs.next()) {
				
				return new TaiKhoan(rs.getInt(1), rs.getString(2) , rs.getString(3) ,rs.getString(4) ,rs.getString(5)
						,rs.getString(6) , rs.getString(7),rs.getString(8));
				
			}
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public TaiKhoan checkTaiKhoan(String username) {
		String query="SELECT * FROM taikhoan where username="+ username + " ;";
		try {
			System.out.print(query);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				return new TaiKhoan(rs.getInt(1), rs.getString(2) , rs.getString(3) ,rs.getString(4) ,rs.getString(5)
						,rs.getString(6) , rs.getString(7),rs.getString(8));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public int layIdCuoi() {
		
		String sql = "SELECT Max(id) as LastID FROM taikhoan";
		Statement statement;
		try {
			statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			int key = 0;
			if (rs.next()) {
			    key = rs.getInt(1);
			}
			return key;
		} catch (SQLException e) {			
			e.printStackTrace();
			return 0;
		}
				
	}
public void delete() {
	  String sqlString = "DELETE FROM thuedientu.taikhoan WHERE id = " + layIdCuoi();
	  Statement statement;
	  try {
		statement = con.createStatement();
		statement.executeUpdate(sqlString);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	
}
