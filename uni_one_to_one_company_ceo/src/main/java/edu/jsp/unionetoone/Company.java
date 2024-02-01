package edu.jsp.unionetoone;

import javax.persistence.Entity;



import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Company {

	@Id
	private int compid;
	private String name;
	private  String field;
	private double noofemp;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	


	public int getCompid() {
		return compid;
	}








	public void setCompid(int compid) {
		this.compid = compid;
	}








	public String getName() {
		return name;
	}








	public void setName(String name) {
		this.name = name;
	}








	public String getField() {
		return field;
	}








	public void setField(String field) {
		this.field = field;
	}








	public double getNoofemp() {
		return noofemp;
	}








	public void setNoofemp(double noofemp) {
		this.noofemp = noofemp;
	}








	



	@OneToOne
	private Ceo ceo;

	public Ceo getCeo() {
		return ceo;
	}








	public void setCeo(Ceo ceo) {
		this.ceo = ceo;
	}
	
	
	
	
}
