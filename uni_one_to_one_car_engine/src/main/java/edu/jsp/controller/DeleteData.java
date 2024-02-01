package edu.jsp.controller;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.onetoone.Car;
import edu.jsp.onetoone.Engine;


public class DeleteData {

	
	
public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("one_to_one");
		
		EntityManager manager= factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		
		
		Engine engine = manager.find(Engine.class,678);
		
		Car car = manager.find(Car.class, 345);
		
		
		if (car!=null && engine!=null) {
			transaction.begin();
			manager.remove(car);
			manager.remove(engine);
			transaction.commit();
			System.out.println("car deleted");
			
		} else {
            System.out.println("car not found");
		}

		
		
		
	}

	
}
