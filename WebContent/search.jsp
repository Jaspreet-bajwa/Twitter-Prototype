<%@ page import="java.io.*,javax.servlet.http.*,java.sql.*,java.util.Date,count.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home page</title>
<meta name="keywords" content="css templates, light house" />
<meta name="description" content="Welcome to Twitter" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />

</head>
<body>

<script type="text/javascript">
function make_blank()
{
	document.f1.srch.value ="";
}
</script>

<%
PrintWriter pw=response.getWriter();
HttpSession ss=request.getSession();
String j=(String)ss.getAttribute("abc");
int x=0;
String srch1="";
	count.Count c=new count.Count();
	c.countFollowers(j);
	c.countTweets(j);
	c.countFollowing(j);
	%>
		
	<%
	count.getProfile c1=new count.getProfile();
	c1.getPro(j);
	
	%>	

	

<div id="templatemo_wrapper">
	<div id="templatemo_header">
    
        
        <div id="newsletter">
            <form name="f1" action="search.jsp" method="get">
                <input type="text" value="Search" name="srch" size="10" id="search" title="searchfield" onclick="make_blank();" />
                <input type="submit" value="" name="Submit" id="subscribe" />
            </form>
        </div>        
    
	
		


	<br>
	
		</form>
	
        
         
         <div id="templatemo_menu">
            <ul>
                <li><a href="profile.jsp" class="current">Home</a></li>
                <li><a href="profilemain.jsp">Profile</a></li>
                <li><a href="twt1.jsp">Tweets<br>(<%=c.l%>)</a></li>
                <li><a href="follower.jsp">Followers  (<%=c.k%>)</a></li>
                <li><a href="myfollow.jsp">Following(<%=c.i%>)</a></li>
                <li><a href="logout.jsp">Logout</a></li>
      <li><a>      


<img src="C:\Users\Manager\Desktop\eclipse galileo\<%=c1.image %>" height=135 width=130 alt="Image 1"/>
	
            
    </a></li> 
            </ul>    	
        </div> <!-- end of templatemo_menu -->
    	<div class="cleaner"></div>
    </div> <!-- end of header -->
  <center>
    <div id="templatemo_main">
    	<div id="intro">
        	<div id="intro_center">
            	<h2>  Welcome 
            	 <%=j %>
            	</h2>

<%

srch1=request.getParameter("srch");
count.getProfile c2=new count.getProfile();
c2.getPro(srch1);
String user=c2.uname;
if(user.equals(srch1))
{
	ss.setAttribute("ab",srch1);
%><table>
<tr><td><a href="viewprofile.jsp"><font color="grey"><%=srch1%></font></a></td>
<td><a href="followServlet" onclick="return validateForm()">FOLLOW</a>

<%
follow.followme f1=new follow.followme();
f1.followTable();

for(int i=0;i<f1.ar2.size();i++)
	{
		String s1=(String)f1.ar2.get(i);
		String s2=(String)f1.ar3.get(i);
		if(s1.equals(j) && s2.equals(srch1))
		 	{
		 			x=1;
		 		}
	}
%>
 <script>
 function validateForm()
 {
 	
 	var y=<%=x%>;
 	
 
 	var z=document.getElementById("same");
 	if (y==1)
 	  {
 	  z.innerHTML="Already Following the User";
 	  	  return false;
 	  }
 		
 }
		
</script>

</form></td>
<td><a href="viewprofile.jsp?val=<%=srch1%>">VIEW PROFILE</td><td><p id="same"></p></td>
<%
}
%></tr></table>
</center>

</body>
</html> 