package utility;
import Signup.signup;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateutility
{
	private static SessionFactory sesfac;
	
	static
	{
		try
		{
			System.out.println("STATIC");
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			System.out.println("Configuration File found & loaded.");
			sesfac=cfg.buildSessionFactory();
			System.out.println("SessionFactory created.");
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory()
	{
		System.out.println("In get Session");
		return sesfac;
	}
}
