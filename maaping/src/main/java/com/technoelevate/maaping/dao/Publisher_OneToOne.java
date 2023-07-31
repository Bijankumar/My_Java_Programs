package com.technoelevate.maaping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.maaping.dto.Author;
import com.technoelevate.maaping.dto.Book;

public class Publisher_OneToOne {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("maping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Author author = new Author();
		author.setAuthorName("Sam");
		author.setAuthorAddress("Andhra");
		
		Book book = new Book();
		book.setAuthor(author);
		book.setBookName("Mahabharata");
		book.setBookPrice(1200.00);
		
		entityManager.persist(book);
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
