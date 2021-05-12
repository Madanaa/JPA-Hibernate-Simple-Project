package com.cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDaoTest {


	public static void main(String[] args) {
		
		EntityManagerFactory fr=Persistence.createEntityManagerFactory("UsersDB");
		
		EntityManager em= fr.createEntityManager();
		
		em.getTransaction().begin();
		
		User newUser = new User();
		
		
        newUser.setEmail("ramji@gmail.com");
        newUser.setFullName("Madanji");
        
        newUser.setPassword("madan123");
         
        em.persist(newUser);
         
        em.getTransaction().commit();
         
        em.close();
        fr.close();
    }
}

	


