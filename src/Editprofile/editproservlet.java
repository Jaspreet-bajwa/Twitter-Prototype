package Editprofile;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class editproservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public editproservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		HttpSession ss=request.getSession();
		String j=(String)ss.getAttribute("abc");
		String country=request.getParameter("cnew");
		
		editjdbc1 c=new editjdbc1();
		c.updateCountry(country,j);
		System.out.println("Update Successful");
		response.sendRedirect("profilemain.jsp");
		
	}

}
