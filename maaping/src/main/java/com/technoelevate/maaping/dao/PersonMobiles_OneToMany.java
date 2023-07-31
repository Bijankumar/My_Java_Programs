package com.technoelevate.maaping.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.maaping.dto.*;

public class PersonMobiles_OneToMany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("maping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Mobile mobile1 = new Mobile();
		mobile1.setMobileName("Samsung");
		mobile1.setMobileColor("Sky");
		
		Mobile mobile2 = new Mobile();
		mobile2.setMobileName("Oppo");
		mobile2.setMobileColor("Sky Blue");
		
		List<Mobile> mobileList = Arrays.asList(mobile1,mobile2);
		
		Person person = new Person();
		person.setPersonName("Ram ganesh");
		person.setPersonMobile(mobileList);
		
		entityManager.persist(person);
		entityTransaction.commit();
		entityManager.close();
	}
}
