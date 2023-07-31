package com.technoelevate.jpqlpractice.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.jpqlpractice.dto.Employees;

public class JpqlTest_Create {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpqlwork");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Employees employees1 = new Employees( "Chakra Pani", "J_Devloper", 23, 1, 45000.00);
		Employees employees2 = new Employees( "Ram Ganesh", "S_Devloper", 27, 6, 65000.00);
		Employees employees3 = new Employees( "Rajnish kumar", "S_Devloper", 25, 8, 85000.00);
		Employees employees4 = new Employees( "Bijan kumar", "J_Devloper", 24, 2, 55000.00);
		Employees employees5 = new Employees( "Pavithra J", "CEO", 27, 15, 145000.00);
		Employees employees6 = new Employees( "Dinesh M R", "Devloper", 26, 5, 75000.00);
		
		entityManager.persist(employees1);
		entityManager.persist(employees2);
		entityManager.persist(employees3);
		entityManager.persist(employees4);
		entityManager.persist(employees5);
		entityManager.persist(employees6);
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
