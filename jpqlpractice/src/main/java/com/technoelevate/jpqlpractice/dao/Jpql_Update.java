package com.technoelevate.jpqlpractice.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Jpql_Update {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpqlwork");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Query query = entityManager.createQuery("UPDATE Employees e SET e.employeeSalary = 50000 WHERE e.employeeName = 'Pavithra J'");
		query.executeUpdate();
		
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
