package Signup;

import utility.hibernateutility;
import javax.servlet.*;
import javax.servlet.http.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;



public class client {

	public static void main(String args[]) 
	{
		try
		{
			 
				SessionFactory sesfac=hibernateutility.getSessionFactory();
				Session ses=sesfac.openSession(); //getCurrentSession()
				System.out.println("\nSession created.");
				Transaction tx=ses.beginTransaction();
				System.out.println("Transaction started.");
			
			
				tx.commit();
				System.out.println("\nTransaction committed.");
				ses.close();
				System.out.println("Session closed.");
			 
			 
				
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
		}
	}
}