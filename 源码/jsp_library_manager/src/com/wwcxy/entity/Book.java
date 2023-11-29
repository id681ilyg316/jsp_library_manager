package com.wwcxy.entity;

public class Book {
private int bid;//�鼮id
private String bname;//�鼮����
private int tid;//�鼮���id
private String author;//�鼮����
private String publisher;//�鼮������
private String years;//�鼮����ʱ��
private String ibsn;//�鼮IBSN����
private int allnum;//�鼮���
private int nownum;//�鼮�ִ�
private String bimage;//�鼮ͼƬ
private String ibsnimg;//�鼮ͼƬ·��
private String tname;
public Book(){
	
}
public Book(int bid, String bname, int tid, String author, String publisher,
		String years, String ibsn, int allnum, int nownum, String bimage) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.tid = tid;
	this.author = author;
	this.publisher = publisher;
	this.years = years;
	this.ibsn = ibsn;
	this.allnum = allnum;
	this.nownum = nownum;
	this.bimage = bimage;
}

public Book(int bid, String bname, int tid, String author, String publisher,
		String years, String ibsn, int allnum, int nownum, String bimage,String ibsnimg) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.tid = tid;
	this.author = author;
	this.publisher = publisher;
	this.years = years;
	this.ibsn = ibsn;
	this.allnum = allnum;
	this.nownum = nownum;
	this.bimage = bimage;
	this.ibsnimg = ibsnimg;
}
public Book(int bid, String bname, int tid, String author, String publisher,
		String years, String ibsn, int allnum, int nownum, String bimage,String ibsnimg,String tname) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.tid = tid;
	this.author = author;
	this.publisher = publisher;
	this.years = years;
	this.ibsn = ibsn;
	this.allnum = allnum;
	this.nownum = nownum;
	this.bimage = bimage;
	this.ibsnimg = ibsnimg;
	this.tname = tname;
}



public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getIbsnimg() {
	return ibsnimg;
}
public void setIbsnimg(String ibsnimg) {
	this.ibsnimg = ibsnimg;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public String getYears() {
	return years;
}
public void setYears(String years) {
	this.years = years;
}
public String getIbsn() {
	return ibsn;
}
public void setIbsn(String ibsn) {
	this.ibsn = ibsn;
}
public int getAllnum() {
	return allnum;
}
public void setAllnum(int allnum) {
	this.allnum = allnum;
}
public int getNownum() {
	return nownum;
}
public void setNownum(int nownum) {
	this.nownum = nownum;
}
public String getBimage() {
	return bimage;
}
public void setBimage(String bimage) {
	this.bimage = bimage;
}

}
