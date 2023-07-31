package com.technoelevate.hibernatepractice1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.technoelevate.hibernatepractice1.dto.Student;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		/*
		 * // create Student student1 = new Student("Chakra", "A", "Andhra"); Student
		 * student2 = new Student("Ram", "B", "Tamilnadu"); Student student3 = new
		 * Student("Rajnish", "C", "Bihar"); Student student4 = new Student("Pavitra",
		 * "D", "Karnataka"); entityManager.persist(student1);
		 * entityManager.persist(student2); entityManager.persist(student3);
		 * entityManager.persist(student4);
		 */

		/*
		 * // Read Student student = entityManager.find(Student.class, 1); try {
		 * System.out.println("Student Details :" + student.getStudentId() + " " +
		 * student.getStudentName() + " " + student.getStudentSection() + " " +
		 * student.getStudentAddress()); } catch (Exception e) {
		 * System.out.println("Sorry! Data not found..!!"); } finally {
		 * entityTransaction.commit(); entityManager.close();
		 * entityManagerFactory.close(); }
		 */

		// ReadAll
		Query createQuery = entityManager.createQuery("select s.studentName from Student s ");
		createQuery.getResultStream().forEach(System.out::println);

		/*
		 * //or 
		 * Query createQuery2 = entityManager.createQuery("select s.studentName from Student s");
		 * List<Student> resultList = createQuery2.getResultList(); 
		 * for (Student student : resultList) {
		 * System.out.println(student); }
		 */

		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}
