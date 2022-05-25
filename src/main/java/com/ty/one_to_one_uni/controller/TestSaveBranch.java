package com.ty.one_to_one_uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one_uni.dao.Address;
import com.ty.one_to_one_uni.dao.Branch;

public class TestSaveBranch {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Address address = new Address();
		address.setDistrict("Bangalore");
		address.setState("Karnataka");
		address.setStreet("West of Cord Road");
		
		Branch branch = new Branch();
		branch.setArea("Rajajinagar");
		branch.setPhone(6134978025l);
		branch.setAddress(address);

		entityTransaction.begin();
		entityManager.persist(address);
		entityManager.persist(branch);
		entityTransaction.commit();
	}
}
