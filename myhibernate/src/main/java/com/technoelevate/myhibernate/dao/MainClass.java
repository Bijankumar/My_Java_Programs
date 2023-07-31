package com.technoelevate.myhibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.technoelevate.dto.Employee;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empdemo");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		// Create
//		Employee employee = new Employee("Pavitra","Devloper",26,42000.0);
//		entityManager.persist(employee);

//		Employee employee2 = new Employee();
//		
		// Read/Retrieve
		// Update
		Employee find = entityManager.find(Employee.class, 2);
		try {
			find.setEmployeeSalary(find.getEmployeeSalary() + 7000.00);

		} catch (Exception e) {
			System.out.println("Data not found");
		} finally {
			entityTransaction.commit();
			entityManager.close();
			entityManagerFactory.close();
		}

////		//Update
//		Employee find2 = entityManager.find(Employee.class, 8);
//		find2.setEmployeeId(1);
//		find2.setEmployeeAge(28);
//		find2.setEmployeeJobTitle("Fullstack Dev");
//		find2.setEmployeeSalary(65000.00);
//		System.out.println("Updated Employee Detais:"+find2.getEmployeeId()+" "+find2.getEmployeeName()+" "+find2.getEmployeeJobTitle()+" "+find2.getEmployeeAge()+" "+find2.getEmployeeSalary());

		// Delete
//		Employee find3 = entityManager.find(Employee.class, 1);
//		entityManager.remove(find3);

//		entityTransaction.commit();
//		entityManager.close();
//		entityManagerFactory.close();
	}
}
