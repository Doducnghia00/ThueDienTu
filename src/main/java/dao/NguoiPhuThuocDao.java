package dao;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.NguoiPhuThuoc;
public class NguoiPhuThuocDao extends DAO {
	public void themNPT(NguoiPhuThuoc npt) {
        String SAVE_MESSAGE = "insert into thuedientu.nguoiphuthuoc (fullname,dob,cmnd,relationship,address,idUser) value (?,?,?,?,?,?);";
        try ( PreparedStatement pr = con.prepareStatement(SAVE_MESSAGE)) {
            pr.setString(1, npt.getFullname());
            pr.setDate(2, new java.sql.Date(npt.getDob().getTime()));
            pr.setString(3, npt.getCmnd());
            pr.setString(4, npt.getRelationship());
            pr.setString(5, npt.getAddress());
            pr.setInt(6, npt.getIdUser());
            pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public ArrayList<NguoiPhuThuoc> getNPTs(int idUser) {
        String COUNT_NPT = "select * from thuedientu.nguoiphuthuoc where idUser = ? ";
        try ( PreparedStatement pr = con.prepareStatement(COUNT_NPT)) {
        	pr.setInt(1, idUser);
        	ResultSet rs = pr.executeQuery();
        	ArrayList<NguoiPhuThuoc> list = new ArrayList<NguoiPhuThuoc>();
            while (rs.next()) {
            	 int id = rs.getInt("id");
            	 String fullname = rs.getString("fullname");
                 String cmnd = rs.getString("cmnd");
                 String address = rs.getString("address");
                 String relationship = rs.getString("relationship");
                 Date dob = rs.getDate("dob");
                // String dob = rs.getString("dob");
                 list.add(new NguoiPhuThuoc(id,idUser,fullname, address, cmnd, relationship, dob));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
