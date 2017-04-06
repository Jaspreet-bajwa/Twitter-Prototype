package twitter;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;
import connection.Global;

/**
 * Servlet implementation class tweet
 */
public class tweet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tweet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		connection.Global g=new connection.Global();
		g.setConnection();
		

		PrintWriter pw=response.getWriter();
		HttpSession ss=request.getSession();
		String j=(String)ss.getAttribute("abc");
		pw.println(j);

		
		String s11=request.getParameter("twt");
		long time = System.currentTimeMillis();
		java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
		//String str=d.toString();

		try
		{
		PreparedStatement stt = g.con.prepareStatement("insert into tweet1 values(?,?,?)");

		stt.setString(1,j);
		stt.setString(2,s11);
		stt.setTimestamp(3,timestamp);
		stt.execute();

		response.sendRedirect("profile.jsp");
		}catch(Exception e)
		{
			System.out.println("Exception:"+e);
			
		}
		
	}

}
