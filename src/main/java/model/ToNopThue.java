package model;

import java.util.Date;

public class ToNopThue {
	private int id, idUser;
	private String cqt,mst,tennguoinop,nganhang,stk,cmnd, tienchu;
	private double tienso;
	private Date kithueStart,kithueEnd, ngaytao;
	
	public ToNopThue(int id, int idUser, String cqt, String mst, String tennguoinop, String nganhang, String stk,
			String cmnd, String tienchu, double tienso, Date kithueStart, Date kithueEnd, Date ngaytao) {
		this.id = id;
		this.idUser = idUser;
		this.cqt = cqt;
		this.mst = mst;
		this.tennguoinop = tennguoinop;
		this.nganhang = nganhang;
		this.stk = stk;
		this.cmnd = cmnd;
		this.tienchu = tienchu;
		this.tienso = tienso;
		this.kithueStart = kithueStart;
		this.kithueEnd = kithueEnd;
		this.ngaytao = ngaytao;
	}
	public ToNopThue(int idUser, String cqt, String mst, String tennguoinop, String nganhang, String stk,
			String cmnd, String tienchu, double tienso, Date kithueStart, Date kithueEnd, Date ngaytao) {
		this.idUser = idUser;
		this.cqt = cqt;
		this.mst = mst;
		this.tennguoinop = tennguoinop;
		this.nganhang = nganhang;
		this.stk = stk;
		this.cmnd = cmnd;
		this.tienchu = tienchu;
		this.tienso = tienso;
		this.kithueStart = kithueStart;
		this.kithueEnd = kithueEnd;
		this.ngaytao = ngaytao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getCqt() {
		return cqt;
	}
	public void setCqt(String cqt) {
		this.cqt = cqt;
	}
	public String getMst() {
		return mst;
	}
	public void setMst(String mst) {
		this.mst = mst;
	}
	public String getTennguoinop() {
		return tennguoinop;
	}
	public void setTennguoinop(String tennguoinop) {
		this.tennguoinop = tennguoinop;
	}
	public String getNganhang() {
		return nganhang;
	}
	public void setNganhang(String nganhang) {
		this.nganhang = nganhang;
	}
	public String getStk() {
		return stk;
	}
	public void setStk(String stk) {
		this.stk = stk;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getTienchu() {
		return tienchu;
	}
	public void setTienchu(String tienchu) {
		this.tienchu = tienchu;
	}
	public double getTienso() {
		return tienso;
	}
	public void setTienso(double tienso) {
		this.tienso = tienso;
	}
	public Date getKithueStart() {
		return kithueStart;
	}
	public void setKithueStart(Date kithueStart) {
		this.kithueStart = kithueStart;
	}
	public Date getKithueEnd() {
		return kithueEnd;
	}
	public void setKithueEnd(Date kithueEnd) {
		this.kithueEnd = kithueEnd;
	}
	public Date getNgaytao() {
		return ngaytao;
	}
	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}
}
