package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.ToNopThue;

public class ToNopThueDao extends DAO {
	public boolean themToNopThue(ToNopThue tnt) {
        String SAVE_TONOPTHUE = "insert into thuedientu.tonopthue (idUser,tennguoinop,mst,cmnd,cqt,kithue_start,kithue_end,nganhang,sotaikhoan,sotien,sotien_chu,ngaytao) value(?,?,?,?,?,?,?,?,?,?,?,?);";
        try ( PreparedStatement pr = con.prepareStatement(SAVE_TONOPTHUE)) {
            pr.setInt(1, tnt.getIdUser());
            pr.setString(2, tnt.getTennguoinop());
            pr.setString(3,  tnt.getMst());
            pr.setString(4, tnt.getCmnd());
            pr.setString(5, tnt.getCqt());
            pr.setDate(6, new java.sql.Date(tnt.getKithueStart().getTime()));
            pr.setDate(7, new java.sql.Date(tnt.getKithueEnd().getTime()));
            pr.setString(8, tnt.getNganhang());
            pr.setString(9, tnt.getStk());
            pr.setDouble(10, tnt.getTienso());
            pr.setString(11, tnt.getTienchu());
            pr.setDate(12, new java.sql.Date(tnt.getNgaytao().getTime()));
            pr.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
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
	
	public int layIdCuoi() {
			
			String sql = "SELECT Max(id) as LastID FROM tonopthue";
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
		  String sqlString = "DELETE FROM thuedientu.tonopthue WHERE id = " + layIdCuoi();
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
