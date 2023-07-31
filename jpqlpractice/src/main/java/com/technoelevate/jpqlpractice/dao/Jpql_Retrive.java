package com.technoelevate.jpqlpractice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.technoelevate.jpqlpractice.dto.Employees;

public class Jpql_Retrive {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpqlwork");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
//		Query createQuery1 = entityManager.createQuery("select e from Employees e");
//		createQuery1.getResultStream().forEach(System.out::println);
		
//		Query createQuery2 = entityManager.createQuery("select e.employeeName from Employees e");
//		createQuery2.getResultStream().forEach(System.out::println);
		
//		Query createQuery = entityManager.createQuery("select e from Employees e");
//		List<Employees> resultList = createQuery.getResultList();
//			for (Employees o : resultList) {
//				System.out.println("E_name :"+o.getEmployeeName()+"E_Salary :"+o.getEmployeeSalary());
//			}
		
		
		//Find out a particular employee details
//		entityManager.createQuery("select e from Employees e where e.employeeName= 'Chakra Pani'").getResultStream().forEach(System.out::println);
		
		//display those employee have age greater then 24
//		entityManager.createQuery("select e from Employees e where e.employeeAge > 24 ").getResultStream().forEach(System.out::println);
		
		//display those employee names starts with 'R'
//		entityManager.createQuery("select e from Employees e where e.employeeName like 'R%' ").getResultStream().forEach(System.out::println);
		
		//display those employee have age between 24 and 27
//		entityManager.createQuery("select e from Employees e where e.employeeAge between 24 and 27 ").getResultStream().forEach(System.out::println);
		
		//Display all employee in Upper case 
//		entityManager.createQuery("select UPPER(e.employeeName) from Employees e ").getResultStream().forEach(System.out::println);
		
		//Display all employee in Lower case 
//		entityManager.createQuery("select LOWER(e.employeeName) from Employees e ").getResultStream().forEach(System.out::println);
		
		// find out how many(count) employees are there
//		entityManager.createQuery("select count(e.employeeName) from Employees e ").getResultStream().forEach(System.out::println);
		
		// find out who have max salary
//		entityManager.createQuery("select max(e.employeeSalary) from Employees e ").getResultStream().forEach(System.out::println);
		
		// find out who have 2nd max salary
//		entityManager.createQuery("select max(e.employeeSalary) from Employees e where e.employeeSalary <(select max(e2.employeeSalary) from Employees e2)").getResultStream().forEach(System.out::println);
		
		// find out Employee Names on ordered manner
//		entityManager.createQuery("select e.employeeName from Employees e order by e.employeeName,e.employeeJobTitle ").getResultStream().forEach(System.out::println);
	
		// find Out Last 3 record from Database 
		entityManager.createQuery("select e.employeeName from Employees e order by e.employeeId desc").getResultStream().limit(3).forEach(System.out::println);
						// or
		Query query = entityManager.createQuery("select e.employeeName from Employees e order by e.employeeId desc");
		List resultList = query.setMaxResults(3).getResultList();
		System.out.println("\n"+resultList);
			
		entityTransaction.commit();
	}
}
