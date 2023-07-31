package com.technoelevate.maaping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.maaping.dto.*;

public class College_ManyToOne {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("maping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Laptop laptop = new Laptop();
		laptop.setLaptopName("Dell");
		laptop.setLaptopColor("Silver");
		
		Student student1 = new Student();
		student1.setStudentName("Ram");
		student1.setLaptop(laptop);
		
		Student student2 = new Student();
		student2.setStudentName("Ganesh");
		student2.setLaptop(laptop);
		
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		
	}
}
