package count;

import java.io.*;
import java.sql.*;
import connection.Global;

public class getProfile {


	Statement stmt;
	ResultSet rs;
	PreparedStatement stmt1;
	
	public String name="";
	public String email="";
	public String country="";
	public String password="";
	public String uname="";
	public String image="";
	String user="";
	
	connection.Global g=new connection.Global();
	
	public getProfile()
	{
		g.setConnection();
	}
	
	public void getPro(String s)
	{
		user=s;
		String s12="select * from userreg where uname=?";
	
		try {
			stmt1 = g.con.prepareStatement(s12);
			stmt1.setString(1,user);
			stmt1.execute();
			rs=stmt1.getResultSet();
			while(rs.next())
			{
				name=rs.getString("name");
				email=rs.getString("email");
				uname=rs.getString("uname");
				country=rs.getString("country");
				password=rs.getString("password");
				image=rs.getString("picture");
			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
