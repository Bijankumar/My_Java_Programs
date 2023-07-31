package com.technoelevate.maaping.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.maaping.dto.*;

public class Hospital_ManyToMany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("maping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		// Doctors...
		
		Doctors doctors1 = new Doctors();
		doctors1.setDoctorName("MD Pavithra");
		
		Doctors doctors2 = new Doctors();
		doctors2.setDoctorName("MBBS Pani");
		
		Doctors doctors3 = new Doctors();
		doctors3.setDoctorName("R&D Ram");
		
		//Patients...
		Patients patients1 = new Patients();
		patients1.setPatientName("Chakra");
		
		Patients patients2 = new Patients();
		patients2.setPatientName("Ganesh");
		
		Patients patients3 = new Patients();
		patients3.setPatientName("Rajnish");
		
		Patients patients4 = new Patients();
		patients4.setPatientName("Kumar");
		
		//List of Doctors...
		List<Doctors> doctorsList = Arrays.asList(doctors1,doctors2,doctors3);
		
		//List of Patients...
		List<Patients> patientsList1 = Arrays.asList(patients1,patients2,patients3);
		List<Patients> patientsList2 = Arrays.asList(patients4,patients3);
		List<Patients> patientsList3 = Arrays.asList(patients2,patients4,patients1);
		
		doctors1.setPatientsList(patientsList2);
		doctors2.setPatientsList(patientsList1);
		doctors3.setPatientsList(patientsList3);
		
		entityManager.persist(doctors1);
		entityManager.persist(doctors2);
		entityManager.persist(doctors3);
	
		entityTransaction.commit();
		entityManager.close();
		entityManagerFactory.close();
		
	}
}
