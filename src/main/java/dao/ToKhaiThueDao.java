package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.NguoiPhuThuoc;
import model.ToKhaiThue;

public class ToKhaiThueDao extends DAO {
	public boolean themToKhaiThue(ToKhaiThue tkt) {
        String SAVE_TOKHAITHUE = "insert into thuedientu.tokhaithue (idUser,cqt,namkekhai,thunhapvn,thunhapnn,danop,conphainop,nopthua,mst,tennguoinop,tongthue,ngaytao) value (?,?,?,?,?,?,?,?,?,?,?,?);";
        try ( PreparedStatement pr = con.prepareStatement(SAVE_TOKHAITHUE)) {
            pr.setInt(1, tkt.getIdUser());
            pr.setString(2, tkt.getCqt());
            pr.setString(3,  tkt.getNamkekhai());
            pr.setDouble(4, tkt.getThunhapvn());
            pr.setDouble(5, tkt.getThunhapnn());
            pr.setDouble(6, tkt.getDanop());
            pr.setDouble(7, tkt.getConphainop());
            pr.setDouble(8, tkt.getNopthua());
            pr.setString(9, tkt.getMst());
            pr.setString(10, tkt.getTennguoinop());
            pr.setDouble(11, tkt.getTongthue());
            pr.setDate(12, new java.sql.Date(tkt.getCreated_at().getTime()));
            pr.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
	public ArrayList<ToKhaiThue> getTKTs(int idUser) {
        String COUNT_TKT = "select * from thuedientu.tokhaithue where idUser = ? ";
        try ( PreparedStatement pr = con.prepareStatement(COUNT_TKT)) {
        	pr.setInt(1, idUser);
        	ResultSet rs = pr.executeQuery();
        	ArrayList<ToKhaiThue> list = new ArrayList<ToKhaiThue>();
            while (rs.next()) {
            	 int id = rs.getInt("id");
            	 String cqt = rs.getString("cqt");
                 String namkekhai = rs.getString("namkekhai");
                 String tennguoinop = rs.getString("tennguoinop");
                 String mst = rs.getString("mst");
                 double thunhapvn = Double.parseDouble(rs.getString("thunhapvn"));
                 double thunhapnn = Double.parseDouble(rs.getString("thunhapnn"));
                 double danop = Double.parseDouble(rs.getString("danop"));
                 double tongthue = Double.parseDouble(rs.getString("tongthue"));
                 double conphainop = Double.parseDouble(rs.getString("conphainop"));
                 double nopthua = Double.parseDouble(rs.getString("nopthua"));
                 Date ngaytao = rs.getDate("ngaytao");
                 list.add(new ToKhaiThue(id,idUser,cqt,namkekhai,mst,tennguoinop,thunhapvn,thunhapnn,tongthue,danop,conphainop,nopthua,ngaytao));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
