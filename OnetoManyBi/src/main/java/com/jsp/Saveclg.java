package com.jsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Saveclg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raj");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
//		College college=new College();
//		college.setCollegname("amc");
//		
//		Student student=new Student();
//		student.setStdname("raj");
//		
//		Student student1=new Student();
//		student1.setStdname("kamal");
//		
//	    List<Student> list1=new ArrayList<Student>();
//	    list1.add(student);
//	    list1.add(student1);
//	    
//	    college.setStd(list1);
//	    student.setColg(college);
//	    student1.setColg(college);
//	    
//	    entityTransaction.begin();
//		entityManager.persist(college);
//		entityManager.persist(student);
//		entityManager.persist(student1);
//		entityTransaction.commit();
		
		
		Student c1=entityManager.find(Student.class,1);
		System.out.println(c1.getStdname());

	}

}
