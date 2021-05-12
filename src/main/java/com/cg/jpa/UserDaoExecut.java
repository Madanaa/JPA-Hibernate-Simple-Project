package com.cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserDaoExecut {

public static void main(String[] args) {
		
		EntityManagerFactory fr=Persistence.createEntityManagerFactory("UsersDB");
		
		EntityManager em= fr.createEntityManager();
		
		em.getTransaction().begin();
		
		String sql = "SELECT u from User u where u.email = 'madan4@gmail.com'";
		Query query = em.createQuery(sql);
		User user = (User) query.getSingleResult();
		
		System.out.println(user.getFullName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
         
        em.getTransaction().commit();
         
        em.close();
        fr.close();
    }
}

	


