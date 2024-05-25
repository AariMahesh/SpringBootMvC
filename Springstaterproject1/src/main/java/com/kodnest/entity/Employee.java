package com.kodnest.entity;

public class Employee {
	int edi;
	String name;
	int sal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int edi, String name, int sal) {
		super();
		this.edi = edi;
		this.name = name;
		this.sal = sal;
	}
	public int getEdi() {
		return edi;
	}
	public void setEdi(int edi) {
		this.edi = edi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [edi=" + edi + ", name=" + name + ", sal=" + sal + "]";
	}
	
	

}
