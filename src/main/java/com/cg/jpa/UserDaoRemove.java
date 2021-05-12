package com.cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDaoRemove {

public static void main(String[] args) {
		
		EntityManagerFactory fr=Persistence.createEntityManagerFactory("UsersDB");
		
		EntityManager em= fr.createEntityManager();
		
		em.getTransaction().begin();
		
		Integer primaryKey = 1;
		User reference = em.getReference(User.class, primaryKey);
		em.remove(reference);
        em.getTransaction().commit();
         
        em.close();
        fr.close();
    }
}

	



