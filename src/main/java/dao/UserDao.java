package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;

public class UserDao extends DAO {
	public User getUser(int id) {
		String GET_USER = "select * from thuedientu.user where (id = ?) ;";
		try ( PreparedStatement pr = con.prepareStatement(GET_USER)) {
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                String fullname = rs.getString("fullname");
                String cmnd = rs.getString("cmnd");
                String address = rs.getString("address");
                Date dob = rs.getDate("dob");
                String mst = rs.getString("mst");
                String phone = rs.getString("phone_number");
                String email = rs.getString("email");
                String password = rs.getString("password");
                return new User(id,fullname,address, cmnd, mst,email,password,phone,dob);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
}
