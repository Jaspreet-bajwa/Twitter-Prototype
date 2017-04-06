package Editprofile;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class editcountry
 */
public class editcountry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editcountry() {
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
		String pass=request.getParameter("pnew");
		
		editjdbc1 c=new editjdbc1();
		c.updatePassword(pass,j);
		System.out.println("Update Successful");
		response.sendRedirect("profilemain.jsp");
		
		
	}

}
