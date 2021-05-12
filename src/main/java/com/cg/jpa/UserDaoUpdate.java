package com.cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDaoUpdate {

public static void main(String[] args) {
		
		EntityManagerFactory fr=Persistence.createEntityManagerFactory("UsersDB");
		
		EntityManager em= fr.createEntityManager();
		
		em.getTransaction().begin();
		
		User update = new User();
		
		update.setId(1);
        update.setEmail("madan4@gmail.com");
        update.setFullName("Madan");
        
        update.setPassword("madan12");
         
        em.merge(update);
         
        em.getTransaction().commit();
         
        em.close();
        fr.close();
    }
}

	


