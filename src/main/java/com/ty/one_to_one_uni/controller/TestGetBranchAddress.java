package com.ty.one_to_one_uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.one_to_one_uni.dao.Branch;

public class TestGetBranchAddress {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		System.out.println(entityManager.find(Branch.class, 1));
	}
	
}
