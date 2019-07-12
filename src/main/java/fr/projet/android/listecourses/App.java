package fr.projet.android.listecourses;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.projet.android.entities.Product;

/**
 * 
 * @author BODIN_2019-07-10
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myApp");
    	EntityManager em = emf.createEntityManager();
    	Product pdct = em.find(Product.class, 1);
    	System.out.println(pdct);
    	
//    	got: : 
//    		Exception in thread "main" javax.persistence.PersistenceException: No Persistence provider for EntityManager named myApp
//    		at javax.persistence.Persistence.createEntityManagerFactory(Persistence.java:69)
//    		at javax.persistence.Persistence.createEntityManagerFactory(Persistence.java:47)
//    		at fr.projet.android.listecourses.App.main(App.java:20)
//		Error (1 item)
//    		The persistence.xml does not have recognized content.		persistence.xml		JPA Problem
    	
    }
}