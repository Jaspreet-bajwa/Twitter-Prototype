package follow;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class followServlet
 */
public class followServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public followServlet() {
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
		String k=(String)ss.getAttribute("ab");
		followme f=new followme();
		f.follow(j,k);
		response.sendRedirect("myfollow.jsp");
	
		
		
		
	}

}
