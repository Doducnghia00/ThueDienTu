package dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DangKyThueDao extends DAO {
	public void themDangKy (String sql) {
		Statement statement;
		try {
			statement = con.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public int layIdCuoi() {
		
		String sql = "SELECT Max(idDangKyThue) as LastID FROM dangkythue";
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
	
	  public boolean check(String nameTable, String value, String name) {
		  String sql = "SELECT *FROM " + nameTable + " WHERE " + name + " = '" + value +"'";
		 // int id = -1;
		  System.out.println(sql);
		  Statement statement;
			try {
				statement = con.createStatement();
				ResultSet rs = statement.executeQuery(sql);
				int key = 0;
				if (rs.next()) {
				    key = rs.getInt(1);
				}
				return true;
			} catch (SQLException e) {			
				e.printStackTrace();
				return false;
			}
		  //return false;
	  }
	  
	  public void delete() {
		  String sqlString = "DELETE FROM thuedientu.dangkythue WHERE idDangKyThue = " + layIdCuoi();
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
