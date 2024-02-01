package edu.jsp.controller2;

import javax.persistence.EntityManager;


import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.unionetoone.Ceo;
import edu.jsp.unionetoone.Company;



public class Save {

public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("one_to_one");
		
		EntityManager manager= factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		

	 
		
	     	Ceo ceo = new Ceo();
	         ceo.setCeoid(77);
	         ceo.setSal(2500000);
	         ceo.setName("Swastik Patil");
	         
	         
		      Company c1 = new Company();
		         c1.setCompid(88);
		         c1.setField("IT");
		         c1.setName("HCL Tech");
		         c1.setNoofemp(10000);
		         c1.setCeo(ceo);
	         
	         
	        
		
		transaction.begin();
		manager.persist(c1);
		manager.persist(ceo);
		transaction.commit();
		
		System.out.println("Company data saved with ceo's data");
		
		
		
	}


	
}
