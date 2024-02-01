package edu.jsp.onetoone;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {

	
	@Id
	private int carid;
	private String model;
	private double price;
	
	
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@OneToOne
	private Engine engine;


	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
