package Tweet;

import java.sql.*;
import java.util.*;
import connection.Global;

public class mytweet {

	
	Statement stmt;
	ResultSet rs;
	PreparedStatement stmt1;
	String tweet="";
	public ArrayList tweets=new ArrayList();
	String username="";
	String date="";
	String user="";
	String finaloutput="";
	
	connection.Global g=new connection.Global();
	
	
	public mytweet()
	{
		g.setConnection();
	}
	
	public void getTweets(String s)
	{
		user=s;
		String s12="select * from tweet1 where userid=? order by date desc";
	
		try {
			stmt1 = g.con.prepareStatement(s12);
			stmt1.setString(1,user);
			stmt1.execute();
			rs=stmt1.getResultSet();
			while(rs.next())
			{
				tweet=rs.getString("tweet");
				date=rs.getString("date");
				finaloutput=user+":   "+tweet+"   "+"      "+date+"\n";
				tweets.add(finaloutput);
				
			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
}
