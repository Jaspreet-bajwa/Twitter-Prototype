package Editprofile;

import java.sql.*;
import connection.Global;

public class editjdbc1 {

	
	Statement stmt;
	ResultSet rs;
	PreparedStatement stmt1;
	
	String s1="";
	String s2="";
	
	connection.Global g=new connection.Global();
	
	editjdbc1()
	{
		g.setConnection();
	}
	
	public void updateCountry(String s, String t)
	{
		s1=s;
		s2=t;
		
		String s12="update userreg set country=? where uname=?";
	
		try {
			stmt1 = g.con.prepareStatement(s12);
			stmt1.setString(1,s1);
			stmt1.setString(2,s2);
			stmt1.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void updateEmail(String s, String t)
	{
		s1=s;
		s2=t;
		
		String s12="update userreg set email=? where uname=?";
	
		try {
			stmt1 = g.con.prepareStatement(s12);
			stmt1.setString(1,s1);
			stmt1.setString(2,s2);
			stmt1.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void updatePassword(String s, String t)
	{
		s1=s;
		s2=t;
		
		String s12="update userreg set password=? where uname=?";
	
		try {
			stmt1 = g.con.prepareStatement(s12);
			stmt1.setString(1,s1);
			stmt1.setString(2,s2);
			stmt1.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	public void updateImage(String s, String t)
	{
		s1=s;
		s2=t;
		
		String s12="update userreg set country=? where uname=?";
	
		try {
			stmt1 = g.con.prepareStatement(s12);
			stmt1.setString(1,s1);
			stmt1.setString(2,s2);
			stmt1.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
