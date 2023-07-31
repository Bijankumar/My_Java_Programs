package com.technoelevate.maaping.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.maaping.dto.*;

public class TeaCups_OneToMany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("maping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Cups cups = new Cups();
		cups.setCupsName("hot cup");
		cups.setCupsColour("red");
		
		Cups cups1 = new Cups();
		cups1.setCupsName("cold cup");
		cups1.setCupsColour("blue");
		
		ArrayList<Cups> arrayList = new ArrayList<>();
		arrayList.add(cups);
		arrayList.add(cups1);
		
		Tea tea = new Tea();
		tea.setTeaName("black tea");
		tea.setListOfCups(arrayList);
		entityManager.persist(tea);
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
