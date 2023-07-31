package com.technoelevate.mappingpractice.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.mappingpractice.dto.District;
import com.technoelevate.mappingpractice.dto.State;

public class SateDistrict_OneToMany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		District district1 = new District("Balasore", 756001);
		District district2 = new District("Mayurbhanj", 757001);
		District district3 = new District("Cuttack", 752120);
		List<District> districts = Arrays.asList(district1,district2,district3);
		
		State state1 = new State("OD", "Odisha", districts);
		entityManager.persist(state1);
		
		District district4 = new District("Nellore", 524001);
		District district5 = new District("Hyderabad", 509133);
		District district6 = new District("Krishna", 520001);
		List<District> districts2 = Arrays.asList(district4,district5,district6);

		State state2 = new State("AP", "Andhra Pradesh", districts2);
		entityManager.persist(state2);
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
