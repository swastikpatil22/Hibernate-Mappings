package edu.jsp.controller;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import edu.jsp.onetoone.Car;
import edu.jsp.onetoone.Engine;

public class UpdateData {

	public static void main(String[] args) {
		
		

	EntityManagerFactory factory= Persistence.createEntityManagerFactory("one_to_one");
	
	EntityManager manager= factory.createEntityManager();
	
	EntityTransaction transaction = manager.getTransaction();
	
	
	Car car = manager.find(Car.class, 101);
	Engine engine = manager.find(Engine.class, 10);

	if (car!=null && engine!=null) {
		
		
	    car.setModel("Light");
		car.setPrice(3000000);
	    engine.setHp(80);
		engine.setName("v7");
		
		transaction.begin();
		manager.merge(car);
		manager.merge(engine);
		transaction.commit();
		System.out.println("Car & Engine updated");
		
	} else {
        System.out.println(" Not found");
	}
	
	
		
		
	
	
	
	}
	
}
