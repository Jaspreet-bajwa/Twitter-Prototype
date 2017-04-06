package Tweet;

import java.sql.*;
import connection.Global;
import java.util.*;

public class othertweets {
	
	Statement stmt;
	ResultSet rs;
	PreparedStatement stmt1;
	String tweet="";
	public ArrayList otweets=new ArrayList();
	String username="";
	String date="";
	String user="";
	String ofinaloutput="";
	
	
	connection.Global g=new connection.Global();
	
	public othertweets()
	{
		g.setConnection();
	}
	
	public void ogetTweets(String s)
	{
		user=s;
		try {
		String s12="select t.userid,t.tweet, t.date from tweet1 t, follow f where f.follow=t.userid && f.userid=? order by date desc;";
	
	
			stmt1 = g.con.prepareStatement(s12);
			stmt1.setString(1,user);
			stmt1.execute();
			rs=stmt1.getResultSet();
			while(rs.next())
			{
				username=rs.getString("userid");
				tweet=rs.getString("tweet");
				date=rs.getString("date");
				ofinaloutput=username+":   "+tweet+"   "+"      "+date+"\n";
				otweets.add(ofinaloutput);
				
			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
}