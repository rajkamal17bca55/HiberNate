package com.jsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raj");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
//		College college1=new College();
//		college1.setName("amc");
//		
//		College college2=new College();
//		college2.setName("doak");
//		
//		Branch branch1=new Branch();
//		branch1.setName("goribalaya");
//		
//		Branch branch2=new Branch();
//		branch2.setName("sathrapatti");
//		
//		Branch branch3=new Branch();
//		branch3.setName("mtv");
//		
//		Branch branch4=new Branch();
//		branch4.setName("theni");
//		
//		List<Branch> list1=new ArrayList<Branch>();
//		list1.add(branch1);
//		list1.add(branch2);
//		
//		List<Branch> list2=new ArrayList<Branch>();
//		list2.add(branch3);
//		list2.add(branch4);
//		
//		List<College> list3=new ArrayList<College>();
//		list3.add(college1);
//		list3.add(college2);
//		
//		
//		college1.setBranches(list1);
//		college2.setBranches(list2);
//		
//
//		branch1.setClgs(list3);
//		branch2.setClgs(list3);
//		branch3.setClgs(list3);
//		branch4.setClgs(list3);
//		
//		
//		entityTransaction.begin();
//		entityManager.persist(college1);
//		entityManager.persist(college2);
//		entityManager.persist(branch1);
//		entityManager.persist(branch2);
//		entityManager.persist(branch3);
//		entityManager.persist(branch4);
//		entityTransaction.commit();
		
		
		College college=entityManager.find(College.class,1);
		System.out.println(college.getName());
		
		
		
		
		
		

	}

}
