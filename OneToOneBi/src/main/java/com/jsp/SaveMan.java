package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raj");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
//		Man man=new Man();
//		man.setName("raj");
//		
//		Aadhar aadhar=new Aadhar();
//		aadhar.setAdharno("1234err");
//		
//		man.setAadhar(aadhar);
//		aadhar.setMan(man);
//		
//		entityTransaction.begin();
//		entityManager.persist(man);
//		entityManager.persist(aadhar);
//		entityTransaction.commit();
		
		
		Man man=entityManager.find(Man.class,1);
		System.out.println(man.getName());
		
	}

}
