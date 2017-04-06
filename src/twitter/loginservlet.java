package twitter;

import java.io.*;
import connection.Global;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class loginservlet extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	
ResultSet rs;
Connection con;
PrintWriter out=response.getWriter();

connection.Global g=new connection.Global();
g.setConnection();

	try
	{
		response.setContentType("templatemo_style.css");
		response.setContentType("text/html");
		
		
	
		
		String sql="Select uname,password from userreg";
		
		Statement s=g.con.createStatement();
		s.executeQuery(sql);
		rs=s.getResultSet();
		int x=0;
		String str1=request.getParameter("t1");
		String str2=request.getParameter("t2");
		
		
		while(rs.next())
		{	String user=rs.getString("uname");
			String pass=rs.getString("password");
	
			
			if(str1.equals(user)&&str2.equals(pass))
		{
			
		x=1;
		HttpSession ss=request.getSession();
		ss.setAttribute("abc",user);
		response.sendRedirect("profile.jsp");
	
				
		}
			
	}
		if(x==0)
		{
		response.sendRedirect("login.jsp");
		}
		
	
		rs.close();
		
		s.close();
		
		
		
	}
	catch(SQLException e)
	{
	System.out.println(e);	
	}
	

	}
}
