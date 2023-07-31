package com.technoelevate.mappingpractice.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.mappingpractice.dto.*;

public class CountryPM_OneToOne {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
//		PrimeMinister minister = new PrimeMinister("Narendra Damodar Modi", 62, "Gujurat");
//		
//		Country country = new Country("+91", "INDIA", "Hindi");
//		country.setMinister(minister);
//		entityManager.persist(country);
		
		
		Country country2 = entityManager.find(Country.class, 1);
		System.out.println(country2.getCountryId()+" "+country2.getCountryName()+" "+country2.getCountryLanguage()+" "+country2.getMinister());
		
		
		
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
