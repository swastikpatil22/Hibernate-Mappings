package edu.jsp.onetoone;

import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class Engine {

	@Id
	private int engid;
	private double hp;
	private String name;
	
	public int getEngid() {
		return engid;
	}
	public void setEngid(int engid) {
		this.engid = engid;
	}
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
public Engine() {
	super();
	// TODO Auto-generated constructor stub
}	





}
