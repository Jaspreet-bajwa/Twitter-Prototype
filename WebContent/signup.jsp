<%@ page import="java.io.*,javax.servlet.http.*,java.sql.*,java.util.*" 
language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Sign Up</title>
<meta name="keywords" content="css templates, light house" />
<meta name="description" content="Welcome to Twitter" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />

<script type="text/javascript">


	function validateForm()
	{   var y;
		var x=document.forms["signup"]["name"].value;
		if(x==null || x=="")
  		{  
	  		y=document.getElementById("p1");  
		    y.innerHTML="please enter your first name"; 
  			signup.name.focus(); 
 	 		return false;
 	 	}

		var x=document.forms["signup"]["email"].value
		if (x==null || x=="")
 		 {
			y=document.getElementById("p2");  
			y.innerHTML="Email must be filled out";  
		    signup.email.focus(); 
  			return false;
  		} 
		else
	 	{
			var atpos=x.indexOf("@");
			var dotpos=x.lastIndexOf(".");
			if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
  			{   
	  			y=document.getElementById("p2");  
			    y.innerHTML="Not a valid e-mail address"; 
  				signup.email.focus(); 
  				return false;
	 	 	}
		}

		var x=document.forms["signup"]["country"].value;
		if(x==null || x=="")
	  	{   y=document.getElementById("p3");  
	        y.innerHTML="country name must be filled out"; 
	  		signup.country.focus(); 
	 	 	return false;
	 	 }

	 	 var x=document.forms["signup"]["uname"].value;
               
           if(x==null || x=="")
 	 	{
        	   y=document.getElementById("p4");  
   	        y.innerHTML= ("User name must be filled out");
			signup.uname.focus(); 
 	 		return false;

 	 	}
     
 	 	
        var x=document.forms["signup"]["pword"].value;
		if (x2==null || x2=="")
 	 	{
			  y=document.getElementById("p5");  
	   	        y.innerHTML= ("password must be filled out");
			signup.pword.focus(); 
 	 		return false;
	  	}
		else
		{
			var maxlength = 15;
			var minlength=5;
		  	if (x2.length > maxlength ||  x2.length<minlength)
			{  
		  		 y=document.getElementById("p5");  
		   	        y.innerHTML= ("Password can have minimum"+" "+minlength+" "+"and maximum"+" "+maxlength+" "+"characters");
				signup.pword.focus();
  				 return false;
			}
		}
	return false;	
}
</script>




</head>
<body>




<div id="templatemo_wrapper">
	<div id="templatemo_header">
   <center> <br><br></br>
      
         	<font color="black" size="7" align="center">Welcome to twitter</font>
            	<br></br>
            	<p>
            <font color="black" >Find out what's happening, right now, with the people and organizations you care about....
            	</font>	
            	</p>
              	</center>
    
        
        
        
      
	<br>
	
	
        
         
         <div id="templatemo_menu">
       	
        </div> <!-- end of templatemo_menu -->
    	<div class="cleaner"></div>
    </div> <!-- end of header -->
  <center>
    <div id="templatemo_main">
    	<div id="intro">
        
<center><b>SIGN UP</b></center>
<form action="register" method="get" name="signup" onSubmit="return validateForm()">
<table align="center">
<tr><td><b>NAME:</b></td><td><input type="text" id="name"name="name"/></td></tr><tr><td colspan=2><p id="p1"> </p></td></tr>
<tr><td><b>EMAIL:</b></td><td><input type="text" id="email" name="email"/></td></tr><tr><td colspan=2><p id="p2"></p></td></tr>
<tr><td><b>COUNTRY:</b></td><td><input type="text" id="country"name="country"/></td></tr><tr><td colspan=2><p id="p3"></p></td></tr>
<tr><td><b>USERNAME:</b></td><td><input type="text" id="uname"name="uname"/></td></tr><tr><td colspan=2><p id="p4"></p></td></tr>
<tr><td><b>PASSWORD:</b></td><td><input type="password" id="pword" name="pword"/></td></tr><tr><td colspan=2><p id="p5"></p></td></tr>
</table>
<br>
<table align="center">
<tr><td><input type="submit" value="REGISTER"></input></td></tr>
</table>
</form>
</body>
</html>
