package com.technoelevate.mappingpractice.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.mappingpractice.dto.Cars;
import com.technoelevate.mappingpractice.dto.Owner;

public class CarsOwner_ManyToOne {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Owner owner = new Owner("Pavithra", 27, "Tumkur");
		Owner owner2 = new Owner("Chakra Pani", 24, "Andhra");
		
		Cars cars = new Cars("KIA", "Sonet", owner);
		entityManager.persist(cars);
		
		Cars cars2 = new Cars("KIA", "Seltos", owner);
		entityManager.persist(cars2);
		
		Cars cars3 = new Cars("Suzuki", "Brezza", owner);
		entityManager.persist(cars3);
		
		Cars cars4 = new Cars("Suzuki", "Baleno", owner);
		entityManager.persist(cars4);

		Cars cars5 = new Cars("Renault", "Duster", owner2);
		entityManager.persist(cars5);

		Cars cars6 = new Cars("TOYOTA", "Innova", owner2);
		entityManager.persist(cars6);

		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
