
package com.cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDaoFind {

public static void main(String[] args) {
		
		EntityManagerFactory fr=Persistence.createEntityManagerFactory("UsersDB");
		
		EntityManager em= fr.createEntityManager();
		
		em.getTransaction().begin();
		
		Integer primaryKey=2;
		User user=em.find(User.class,primaryKey);
		
		System.out.println(user.getFullName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
         
        em.getTransaction().commit();
         
        em.close();
        fr.close();
    }
}

	


