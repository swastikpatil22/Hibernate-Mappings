package edu.jsp.controller;


import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.onetoone.Car;
import edu.jsp.onetoone.Engine;



public class SaveData {

public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("one_to_one");
		
		EntityManager manager= factory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		

	         
	     	Engine engine = new Engine();
	         engine.setEngid(202);
	         engine.setHp(100);
	         engine.setName("Beast");
	         
	         Car car = new Car();
	         car.setCarid(20);
	         car.setModel("Safari");
	         car.setPrice(350000);
	         car.setEngine(engine);
		
		transaction.begin();
		manager.persist(engine);
		manager.persist(car);
		transaction.commit();
		
		System.out.println("Car saved");
		
		
		
	}
	
	
}
