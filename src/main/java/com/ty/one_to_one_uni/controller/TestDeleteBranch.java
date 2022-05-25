package com.ty.one_to_one_uni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.one_to_one_uni.dao.Branch;

public class TestDeleteBranch {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Branch branch = entityManager.find(Branch.class, 1);
		if(branch != null) {
			entityManager.remove(branch.getAddress());
			entityManager.remove(branch);
			System.out.println("Deleted");
		} 
	}
}
