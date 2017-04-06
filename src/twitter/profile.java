package twitter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class profile extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		HttpSession ss=request.getSession();
	String j=(String)ss.getAttribute("abc");
	pw.println("Welcome "+j);
		
	
	}

}
