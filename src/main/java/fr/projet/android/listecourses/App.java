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
    	System.out.println("Start...");
    	System.out.println("...Create EntityManagerFactory...");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myApp");
    	System.out.println("...Creating Entity manager...");
    	EntityManager em = emf.createEntityManager();
    	System.out.println("...Find Product \"Café\" id 1 ...");
    	Product pdct = em.find(Product.class, 1);
    	System.out.println("...Printing product...");
    	System.out.println(pdct);
    	System.out.println("...End");
    	
    	
    }
}