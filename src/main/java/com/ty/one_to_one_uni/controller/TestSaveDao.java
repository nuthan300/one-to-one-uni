package com.ty.one_to_one_uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one_uni.dao.*;

public class TestSaveDao {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		Person person = new Person();
//		person.setName("Chetan");
//		person.setEmail("chetan@mail.com");
//		person.setPhone(9685741230l);
		
//		Pan pan = new Pan();
//		pan.setAddress("Bangalore Mahalax");
//		pan.setName("Chetan");
//		pan.setPanNum("CHET968574TY");
		
//		person.setPan(pan);
		
//		entityTransaction.begin();
//		entityManager.persist(person);
//		entityManager.persist(pan);
//		entityTransaction.commit();
	}
}
