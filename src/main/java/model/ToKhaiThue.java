package model;

import java.util.Date;

public class ToKhaiThue {
	private int id, idUser;
	private String cqt,namkekhai,mst,tennguoinop;
	private double thunhapvn,thunhapnn,danop,conphainop,nopthua,tongthue;
	private Date created_at;
	
	public ToKhaiThue(String cqt, String namkekhai, String mst, String tennguoinop, double thunhapvn, double thunhapnn,
			double danop, double conphainop, double nopthua, double tongthue, Date created_at) {
		super();
		this.cqt = cqt;
		this.namkekhai = namkekhai;
		this.mst = mst;
		this.tennguoinop = tennguoinop;
		this.thunhapvn = thunhapvn;
		this.thunhapnn = thunhapnn;
		this.danop = danop;
		this.conphainop = conphainop;
		this.nopthua = nopthua;
		this.tongthue = tongthue;
		this.created_at = created_at;
	}
	public ToKhaiThue(int id, int idUser, String cqt, String namkekhai, String mst, String tennguoinop,
			double thunhapvn, double thunhapnn, double danop, double conphainop, double nopthua, double tongthue,
			Date created_at) {
		this.id = id;
		this.idUser = idUser;
		this.cqt = cqt;
		this.namkekhai = namkekhai;
		this.mst = mst;
		this.tennguoinop = tennguoinop;
		this.thunhapvn = thunhapvn;
		this.thunhapnn = thunhapnn;
		this.danop = danop;
		this.conphainop = conphainop;
		this.nopthua = nopthua;
		this.tongthue = tongthue;
		this.created_at = created_at;
	}
	public ToKhaiThue(int idUser, String cqt, String namkekhai, String mst, String tennguoinop,
			double thunhapvn, double thunhapnn, double danop, double conphainop, double nopthua, double tongthue,
			Date created_at) {
		this.idUser = idUser;
		this.cqt = cqt;
		this.namkekhai = namkekhai;
		this.mst = mst;
		this.tennguoinop = tennguoinop;
		this.thunhapvn = thunhapvn;
		this.thunhapnn = thunhapnn;
		this.danop = danop;
		this.conphainop = conphainop;
		this.nopthua = nopthua;
		this.tongthue = tongthue;
		this.created_at = created_at;
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
	public String getTennguoinop() {
		return tennguoinop;
	}
	public void setTennguoinop(String tennguoinop) {
		this.tennguoinop = tennguoinop;
	}
	public double getTongthue() {
		return tongthue;
	}
	public void setTongthue(double tongthue) {
		this.tongthue = tongthue;
	}
	public String getMst() {
		return mst;
	}
	public void setMst(String mst) {
		this.mst = mst;
	}
	public double getConphainop() {
		return conphainop;
	}
	public void setConphainop(double conphainop) {
		this.conphainop = conphainop;
	}
	public double getNopthua() {
		return nopthua;
	}
	public void setNopthua(double nopthua) {
		this.nopthua = nopthua;
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
	public String getNamkekhai() {
		return namkekhai;
	}
	public void setNamkekhai(String namkekhai) {
		this.namkekhai = namkekhai;
	}
	public double getThunhapvn() {
		return thunhapvn;
	}
	public void setThunhapvn(double thunhapvn) {
		this.thunhapvn = thunhapvn;
	}
	public double getThunhapnn() {
		return thunhapnn;
	}
	public void setThunhapnn(double thunhapnn) {
		this.thunhapnn = thunhapnn;
	}
	public double getDanop() {
		return danop;
	}
	public void setDanop(double danop) {
		this.danop = danop;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
}
