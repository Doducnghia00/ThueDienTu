package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	public static Connection con;
  private String dbUrl = "jdbc:mysql://localhost:3306/thuedientu?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8";
  private String dbClass = "com.mysql.cj.jdbc.Driver";

  public DAO() {
      if (con == null) {
          try {
              Class.forName(dbClass);
              con = DriverManager.getConnection(dbUrl, "root", "");
          } catch (ClassNotFoundException | SQLException e) {
              e.printStackTrace();
          }
      }
      con = getConnection();
  }

  protected Connection getConnection() {
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          con = DriverManager.getConnection(dbUrl, "root", "");
      } catch (SQLException | ClassNotFoundException e) {
          e.printStackTrace();
      }
      return con;
  }
}

