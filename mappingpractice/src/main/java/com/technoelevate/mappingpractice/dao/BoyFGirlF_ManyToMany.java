package com.technoelevate.mappingpractice.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.mappingpractice.dto.*;

public class BoyFGirlF_ManyToMany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mapping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		BoyFriend boyFriend1 = new BoyFriend("Ritik", "3rd");
		BoyFriend boyFriend2 = new BoyFriend("Abinash", "4th");
		BoyFriend boyFriend3 = new BoyFriend("Chakra", "2nd");
		BoyFriend boyFriend4 = new BoyFriend("Pani", "1st");

		Girlfriend girlfriend2 = new Girlfriend("Madhuri", "1st");
		Girlfriend girlfriend1 = new Girlfriend("Shamila", "2nd");
		Girlfriend girlfriend3 = new Girlfriend("Sheetal", "3rd");
		Girlfriend girlfriend4 = new Girlfriend("Anushka", "4th");
		Girlfriend girlfriend5 = new Girlfriend("Kajol", "2nd");

		List<BoyFriend> boyFriends1 = Arrays.asList(boyFriend1, boyFriend2, boyFriend3, boyFriend4);
		List<BoyFriend> boyFriends2 = Arrays.asList( boyFriend3, boyFriend4,boyFriend2);
		List<Girlfriend> girlfriends1 = Arrays.asList(girlfriend1, girlfriend2);
		List<Girlfriend> girlfriends2 = Arrays.asList(girlfriend3, girlfriend4, girlfriend5);
		
		girlfriend1.setBoyFriends(boyFriends2);
			entityManager.persist(girlfriend1);
		
		girlfriend2.setBoyFriends(boyFriends2);
			entityManager.persist(girlfriend2);

		girlfriend3.setBoyFriends(boyFriends1);
			entityManager.persist(girlfriend3);

		girlfriend4.setBoyFriends(boyFriends2);
			entityManager.persist(girlfriend4);

		girlfriend5.setBoyFriends(boyFriends1);
			entityManager.persist(girlfriend5);

		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
