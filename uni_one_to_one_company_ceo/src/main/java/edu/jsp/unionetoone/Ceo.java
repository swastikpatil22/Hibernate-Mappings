package edu.jsp.unionetoone;

import javax.persistence.Entity;



import javax.persistence.Id;

@Entity
public class Ceo {

	
	@Id
	private int ceoid;
	private String name;
	private double sal;
	
	

	


	


	public int getCeoid() {
		return ceoid;
	}









	public void setCeoid(int ceoid) {
		this.ceoid = ceoid;
	}









	public String getName() {
		return name;
	}









	public void setName(String name) {
		this.name = name;
	}









	public double getSal() {
		return sal;
	}









	public void setSal(double sal) {
		this.sal = sal;
	}









	public Ceo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}
