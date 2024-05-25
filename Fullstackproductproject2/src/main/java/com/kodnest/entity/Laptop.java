package com.kodnest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	int id;
	String lapname;
	String lapcolor;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(int id, String lapname, String lapcolor) {
		super();
		this.id = id;
		this.lapname = lapname;
		this.lapcolor = lapcolor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLapname() {
		return lapname;
	}
	public void setLapname(String lapname) {
		this.lapname = lapname;
	}
	public String getLapcolor() {
		return lapcolor;
	}
	public void setLapcolor(String lapcolor) {
		this.lapcolor = lapcolor;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", lapname=" + lapname + ", lapcolor=" + lapcolor + "]";
	}
	
	

}
