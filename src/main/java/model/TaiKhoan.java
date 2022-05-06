package model;

public class TaiKhoan {
private int id;
private String username;
private String password;
private String hoten;
private String ngaysinh;
private String sodienthoai;
private String email,diachi;
public TaiKhoan() {
	
}
public TaiKhoan(int id, String username, String password, String hoten, String ngaysinh, String sodienthoai,
		String email, String diachi) {
	
	this.id = id;
	this.username = username;
	this.password = password;
	this.hoten = hoten;
	this.ngaysinh = ngaysinh;
	this.sodienthoai = sodienthoai;
	this.email = email;
	this.diachi = diachi;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public String getNgaysinh() {
	return ngaysinh;
}
public void setNgaysinh(String ngaysinh) {
	this.ngaysinh = ngaysinh;
}
public String getSodienthoai() {
	return sodienthoai;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public void setSodienthoai(String sodienthoai) {
	this.sodienthoai = sodienthoai;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "TaiKhoan [id=" + id + ", username=" + username + ", password=" + password + ", hoten=" + hoten
			+ ", ngaysinh=" + ngaysinh + ", sodienthoai=" + sodienthoai + ", email=" + email + "]";
}

}
