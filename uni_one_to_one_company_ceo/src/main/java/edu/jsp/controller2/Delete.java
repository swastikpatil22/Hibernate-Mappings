package edu.jsp.controller2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.unionetoone.Ceo;
import edu.jsp.unionetoone.Company;

public class Delete {

public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("one_to_one");
		
		EntityManager manager= factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		
		
		
		Ceo e1 = manager.find(Ceo.class, 77);
		Company m1 = manager.find(Company.class, 88);
		
		
		if (m1!=null && e1!=null) {
			transaction.begin();
			manager.remove(e1);
			manager.remove(m1);
			transaction.commit();
			System.out.println(" Company and CEO data deleted");
			
		} else {
            System.out.println("Data not found");
		}

		
		
		
	}

	

	
}
