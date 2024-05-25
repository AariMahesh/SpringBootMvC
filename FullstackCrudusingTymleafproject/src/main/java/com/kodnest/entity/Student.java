package com.kodnest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int sid;
	String sname;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
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
	

}
