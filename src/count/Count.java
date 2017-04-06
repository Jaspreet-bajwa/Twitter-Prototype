package count;

import java.sql.*;
import connection.Global;

public class Count {

	
	Statement stmt;
	ResultSet rs;
	PreparedStatement stmt1;
	
	public int l=0;
	public int i=0;
	public int k=0;
	String User="";
	
	connection.Global g=new connection.Global();
	
	public Count()
	{
		g.setConnection();
	}
	
	public void countTweets(String user)
	{
		User=user;
		
		String s3="Select count(tweet) from tweet1 where userid=?";
		
		try {
			stmt1 = g.con.prepareStatement(s3);
			stmt1.setString(1,User);
			stmt1.execute();
			 rs=stmt1.getResultSet();
			while(rs.next())
			{
				l=rs.getInt(1);
			}
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
	
}
	
	public void countFollowing(String user)
	{
		User=user;
		
		String s1="Select count(follow) from follow where userid=?";
		
		try {
			stmt1 = g.con.prepareStatement(s1);
			stmt1.setString(1,User);
			stmt1.execute();
	rs=stmt1.getResultSet();
		while(rs.next())
		{
	i=rs.getInt(1);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
}
	
	public void countFollowers(String user)
	{
User=user;
		
		String s1="Select count(userid) from follow where follow=?";
		
		try {
			stmt1 = g.con.prepareStatement(s1);
			stmt1.setString(1,User);
			stmt1.execute();
	rs=stmt1.getResultSet();
		while(rs.next())
		{
	k=rs.getInt(1);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
}
	
	
	
	
	
	
}
