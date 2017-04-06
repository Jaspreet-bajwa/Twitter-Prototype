package Signup;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

import utility.hibernateutility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;



public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String str1=request.getParameter("name");
		String str2=request.getParameter("email");
		String str3=request.getParameter("country");
		String str4=request.getParameter("uname");
		String str5=request.getParameter("pword");
		
		System.out.print("jaspreet");
		
		try
		{
			 
				SessionFactory sesfac=hibernateutility.getSessionFactory();
				Session ses=sesfac.openSession();
				System.out.println("\nSession created.");
				Transaction tx=ses.beginTransaction();
				System.out.println("Transaction started.");
			
				//only save command
				signup hr1=new signup();
				hr1.setCountry(str3);
				hr1.setName(str1);
				hr1.setEmail(str2);
				hr1.setUname(str4);
				hr1.setPassword(str5);
		     	
		     	
		     	ses.save(hr1);
		     	
				tx.commit();
				System.out.println("\nTransaction committed.");
				ses.close();
				System.out.println("Session closed.");
			 
			 
				
		}
		catch(HibernateException he)
		{
		he.printStackTrace();
		}
		
		
		
		response.sendRedirect("login.jsp");
		}
	}







