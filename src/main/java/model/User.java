package model;

import java.util.Date;

public class User {
	private int id;
	private String fullname, address, cmnd, mst, email, password, phonenumber;
	private Date dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMst() {
		return mst;
	}
	public void setMst(String mst) {
		this.mst = mst;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public User(String fullname, String address, String cmnd, String mst, String email, String password,
			String phonenumber, Date dob) {
		this.fullname = fullname;
		this.address = address;
		this.cmnd = cmnd;
		this.mst = mst;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
		this.dob = dob;
	}
	public User(int id, String fullname, String address, String cmnd, String mst, String email, String password,
			String phonenumber, Date dob) {
		this.id = id;
		this.fullname = fullname;
		this.address = address;
		this.cmnd = cmnd;
		this.mst = mst;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
		this.dob = dob;
	}
	
}
