package edu.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.jsp.onetoone.Car;
import edu.jsp.onetoone.Engine;



public class SearchData {

public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("one_to_one");
		
		EntityManager manager= factory.createEntityManager();
		
		
		Engine engine = manager.find(Engine.class, 5);
		Car car = manager.find(Car.class, 4);

		
		if (car!=null) {
			System.out.println("car id:"+ car.getCarid());
			System.out.println("User model:"+ car.getModel());
			System.out.println("User price:"+ car.getPrice());
			System.out.println("engine id:"+ engine.getEngid());
			System.out.println("engine hp:"+ engine.getHp());
			System.out.println("engine name:"+ engine.getName());
			
			
		} else {
            System.out.println("car not found");
		}
		
		
		
		}


	
	
}
	

