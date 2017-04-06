package connection;

import java.sql.*;


public class Global {

	public Connection con;
	
	public Global()
	{
		
	}

	public void setConnection()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jaspreet","root","root");
		
		}
		catch(Exception e)
		{e.printStackTrace();}
	}
	
}
