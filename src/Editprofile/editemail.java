package Editprofile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class editemail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public editemail() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		HttpSession ss=request.getSession();
		String j=(String)ss.getAttribute("abc");
		String email=request.getParameter("enew");
		
		editjdbc1 c=new editjdbc1();
		c.updateEmail(email,j);
		System.out.println("Update Successful");
		response.sendRedirect("profilemain.jsp");
		
	}

}
