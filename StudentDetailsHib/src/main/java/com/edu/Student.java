package com.edu;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hiberstudent")
public class Student {
	@Id
@GeneratedValue	
private int sid;
	@Column(name="stname",length = 50)
private String sname;
	@Column(name="stcourse", length=50)
private String scourse;
	@OneToOne(cascade =CascadeType.ALL )
	@JoinColumn(name="student_add")
	private Address stadd;
	
	public Address getStadd() {
		return stadd;
	}
	public void setStadd(Address stadd) {
		this.stadd = stadd;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scourse=" + scourse + "]";
	}
	
	
	

}
