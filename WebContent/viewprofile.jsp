<%@ page import="java.io.*,javax.servlet.http.*,java.sql.*,java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home page</title>
<meta name="keywords" content="css templates, light house" />
<meta name="description" content="Welcome to Twitter" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />

<script type="text/javascript">
function make_blank()
{
	document.f1.srch.value ="";
}
</script>

</head>
<body>

<% 
	
	
	
	PrintWriter pw=response.getWriter();
	HttpSession ss=request.getSession();
	String j=(String)ss.getAttribute("abc");
	 String q=request.getParameter("val");
	
 %>

<%
	count.Count c=new count.Count();
	c.countFollowers(j);
	c.countTweets(j);
	c.countFollowing(j);
	%>
		
	<%
	count.getProfile c1=new count.getProfile();
	c1.getPro(q);
	count.getProfile c2=new count.getProfile();
	c2.getPro(j);
	%>		

<div id="templatemo_wrapper">
	<div id="templatemo_header">
    
     
        <div id="newsletter">
            <form name="f1" action="search.jsp" method="get">
                <input type="text" value="Search" name="srch" size="10" id="search" title="searchfield" onclick="make_blank();" />
                <input type="submit" value="" name="Submit" id="subscribe" />
            </form>
        </div>
        
        
        
       
       
         
         <div id="templatemo_menu">
            <ul>
                <li><a href="profile.jsp" class="current">Home</a></li>
                <li><a href="profilemain.jsp">Profile</a></li>
                <li><a href="twt1.jsp">Tweets<br>(<%=c.l%>)</a></li>
                <li><a href="follower.jsp">Followers  (<%=c.k%>)</a></li>
                <li><a href="myfollow.jsp">Following(<%=c.i%>)</a></li>
                <li><a href="logout.jsp">Logout</a></li>
                 <li><a>           

<img src="C:\Users\Manager\Desktop\eclipse galileo\<%=c2.image %>" height=135 width=130 alt="Image 1"/>
	
            
  </a></li> 
            </ul>    	
        </div> <!-- end of templatemo_menu -->
    	<div class="cleaner"></div>
    </div> <!-- end of header -->
    
    <center>
    <div id="templatemo_main">
    	<div id="intro">
        	<div id="intro_center">
            	
                   	
  <table align="center"> <td>


<img src="C:\Users\Manager\Desktop\eclipse galileo\<%=c1.image %>" height=135 width=130 alt="Image 1"/>
	
            
    </td> <table>           
<td>
<br>
<br>NAME:
<%=c1.name%>
 
<br>PROFILE NAME:<%=c1.uname%>


<br>E-MAIL:<%=c1.email%>
<br>COUNTRY:<%=c1.country%>
</td>
</table></table>
   
                
                <div class="cleaner"></div>
           </div> <!-- end of a content box -->
        </div> <!-- end of content -->
       <div id="templatemo_footer">
    
        	Copyright ©  
            Designed by Jaspreet Kaur Bajwa 
            <br></br>
            Enjoy the Twitterati
   </center> 
    	</div> <!-- end of templatemo_footer -->
    </div> <!-- end of main -->
</div> <!-- end of wrapper -->
</body>
</html>