package follow;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 * Servlet implementation class unfollow
 */
public class unfollow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public unfollow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		HttpSession ss=request.getSession();
		String j=(String)ss.getAttribute("abc");
		System.out.println(j);
		String k=request.getParameter("val");
		System.out.println(k);
		followme f=new followme();
		f.unfollow(j,k);
		
		
		response.sendRedirect("profile.jsp");
		
		
	}

}
