package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="country")
public class Country {
	@Id
	private int cid;
	private String cname;
	private String ccapital;
	
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + ", ccapital=" + ccapital + "]";
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Country(int cid, String cname, String ccapital) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccapital = ccapital;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcapital() {
		return ccapital;
	}
	public void setCcapital(String ccapital) {
		this.ccapital = ccapital;
	}
	

}
