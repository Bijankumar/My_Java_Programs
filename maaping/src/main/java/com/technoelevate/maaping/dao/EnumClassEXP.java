package com.technoelevate.maaping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.maaping.dto.Status;
import com.technoelevate.maaping.dto.Whatsapp;

public class EnumClassEXP {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Whatsapp whatsapp1 = new Whatsapp();
		whatsapp1.setPersonName("Chakra Pani");
		whatsapp1.setStatus(Status.ACTIVE);
		
		Whatsapp whatsapp2 = new Whatsapp();
		whatsapp2.setPersonName("Pavithra");
		whatsapp2.setStatus(Status.PENDING);
		
		Whatsapp whatsapp3 = new Whatsapp();
		whatsapp3.setPersonName("Ram Pani");
		whatsapp3.setStatus(Status.INACTIVE);
		
		entityManager.persist(whatsapp1);
		entityManager.persist(whatsapp2);
		entityManager.persist(whatsapp3);
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
