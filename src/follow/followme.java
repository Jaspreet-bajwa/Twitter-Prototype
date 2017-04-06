package follow;

import java.sql.*;
import java.util.*;



public class followme {

	
	Statement stmt;
	ResultSet rs;
	PreparedStatement stmt1;
	
	String s1="";
	String s2="";
	public ArrayList ar=new ArrayList();
	public ArrayList ar1=new ArrayList();
	public ArrayList ar2=new ArrayList();
	public ArrayList ar3=new ArrayList();
	
	connection.Global g=new connection.Global();
	
	public followme()
	{
		g.setConnection();
	}
	
	public void unfollow(String s,String t)
	{
		s1=s;
		s2=t;
		System.out.println(s1);
		System.out.println(s2);
		try
		{
		stmt1 = g.con.prepareStatement("delete from follow where userid=? && follow=?");
		System.out.println(stmt1);
		stmt1.setString(1,s1);
		stmt1.setString(2,s2);
		stmt1.execute();
		System.out.println("2");
		}
		catch(Exception e){e.printStackTrace();}
	}
	
	public void getFollowing(String s)
	{
		s1=s;
		
		try
		{
			stmt1=g.con.prepareStatement("Select follow from follow where userid=?");
			stmt1.setString(1, s1);
			stmt1.execute();
			rs=stmt1.getResultSet();
			
			while(rs.next())
			{
			String user=rs.getString("follow");
			ar.add(user);
			}
			
			
		}
		catch(Exception e)
		{e.printStackTrace();}
	}
	
	public void getFollowers(String s)
	{
		s1=s;
		
		try
		{
			stmt1=g.con.prepareStatement("Select userid from follow where follow=?");
			stmt1.setString(1, s1);
			stmt1.execute();
			rs=stmt1.getResultSet();
			
			while(rs.next())
			{
			String user=rs.getString("userid");
			ar1.add(user);
			}
			
			
		}
		catch(Exception e)
		{e.printStackTrace();}
	}
	
	public void follow(String s,String t)
	{
		s1=s;
		s2=t;
		try
		{
		stmt1 = g.con.prepareStatement("insert into follow values(?,?)");
		stmt1.setString(1,s1);
		stmt1.setString(2,s2);
		stmt1.execute();
		}
		catch(Exception e)
		{e.printStackTrace();}
	}
	
	public void followTable()
	{
		try
		{
			String sql="Select * from follow";
			stmt=g.con.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				String user=rs.getString("userid");
				ar2.add(user);
				String follow=rs.getString("follow");
				ar3.add(follow);
			}
			
		}catch(Exception e)
		{e.printStackTrace();}
	}
	
}
