package com.wwcxy.entity;
public class AdminEntity {
private int uid;//����Ա���
private String username;//����Ա�û���
private String userpwd;//����Ա����
private String uname;//����Ա����
private String upower;//����ԱȨ��
public AdminEntity(){
	
}
public AdminEntity(int uid, String username, String userpwd, String uname,
		String upower) {
	super();
	this.uid = uid;
	this.username = username;
	this.userpwd = userpwd;
	this.uname = uname;
	this.upower = upower;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserpwd() {
	return userpwd;
}
public void setUserpwd(String userpwd) {
	this.userpwd = userpwd;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpower() {
	return upower;
}
public void setUpower(String upower) {
	this.upower = upower;
}

}
