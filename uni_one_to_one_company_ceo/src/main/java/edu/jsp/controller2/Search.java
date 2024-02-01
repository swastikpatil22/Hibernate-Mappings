package edu.jsp.controller2;

import javax.persistence.EntityManager;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.jsp.unionetoone.Ceo;
import edu.jsp.unionetoone.Company;

public class Search {

public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("one_to_one");
		
		EntityManager manager= factory.createEntityManager();
		
		
		Ceo e1 = manager.find(Ceo.class, 1);
		Company m1 = manager.find(Company.class,22);

		
		if (m1!=null) {
			System.out.println("Company id:"+ m1.getCompid());
			System.out.println("Company field:"+ m1.getField());
			System.out.println("Company No. of Emp:"+ m1.getNoofemp());
			System.out.println("Company name:"+ m1.getName());
			System.out.println("CEO ID:"+ e1.getCeoid());			
			System.out.println("CEO name:"+ e1.getName());
			System.out.println("CEO salary:"+ e1.getSal());
			
			
			
			
		} else {
            System.out.println("Not found");
		}
		
		
		
		}


	
}
