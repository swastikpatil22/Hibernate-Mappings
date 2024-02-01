package edu.jsp.controller2;

import javax.persistence.EntityManager;



import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.unionetoone.Ceo;
import edu.jsp.unionetoone.Company;



public class Update {

public static void main(String[] args) {
		
		

		EntityManagerFactory factory= Persistence.createEntityManagerFactory("one_to_one");
		
		EntityManager manager= factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		
		
		Ceo e1 = manager.find(Ceo.class, 77);
		Company m1 = manager.find(Company.class, 88);
		
		if (e1!=null && m1!=null) {
			
			
		    m1.setField("Consultancy");
			m1.setName("Infinity");
			e1.setName("Viki M");
		  
			
			
			transaction.begin();
			manager.merge(m1);
			manager.merge(e1);
			transaction.commit();
			System.out.println("Company & CEO data updated");
			
		} else {
	        System.out.println(" Not found");
		}
		
		
			
			
		
		
		
		}


	
}
