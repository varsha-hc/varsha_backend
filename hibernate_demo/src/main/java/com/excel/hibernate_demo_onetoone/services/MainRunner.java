package com.excel.hibernate_demo_onetoone.services;

import com.excel.hibernate_demo_onetoone.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

 public class MainRunner {
   private static EntityManagerFactory factory;
   private static EntityManager manager;
   private static EntityTransaction transaction;
   
	public static void main(String[] args) {
    factory = Persistence.createEntityManagerFactory("student");
    manager = factory.createEntityManager();
    transaction = manager.getTransaction();
    
    Student st = new Student();
    st.setName("kushi");
    st.setAge(20);
    
     transaction.begin();
     manager.persist(st);
     transaction.commit();
     
     manager.close();
    	
   }
}
