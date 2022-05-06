package model;

import java.util.Date;

public class NguoiPhuThuoc {
	private int id, idUser;
	private String fullname, address, cmnd, relationship;
	private Date dob;
	public NguoiPhuThuoc(int idUser, String fullname, String address, String cmnd, String relationship,
			Date dob) {
		this.idUser = idUser;
		this.fullname = fullname;
		this.address = address;
		this.cmnd = cmnd;
		this.relationship = relationship;
		this.dob = dob;
	}
	
	public NguoiPhuThuoc() {
		super();
	}

	public NguoiPhuThuoc(String fullname, String address, String cmnd, String relationship, Date dob) {
		super();
		this.fullname = fullname;
		this.address = address;
		this.cmnd = cmnd;
		this.relationship = relationship;
		this.dob = dob;
	}

	public NguoiPhuThuoc(int id,int idUser, String fullname, String address, String cmnd, String relationship,
			Date dob) {
		this.id = id;
		this.idUser = idUser;
		this.fullname = fullname;
		this.address = address;
		this.cmnd = cmnd;
		this.relationship = relationship;
		this.dob = dob;
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
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
}
