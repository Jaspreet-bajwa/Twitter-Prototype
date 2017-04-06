<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Welcome to Twitter</title>
<meta name="keywords" content="css templates, light house" />
<meta name="description" content="Welcome to Twitter" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
        function noBack()
         {
             window.history.forward();
         }
        noBack();
        window.onload = noBack;
        window.onpageshow = function(evt) { if (evt.persisted) {noBack();} }
        window.onunload = function() { void (0); }
    </script>


<script>
function validateForm()
{
	var x=document.forms["login"]["t1"].value;
	var y=document.forms["login"]["t2"].value;
	var z=document.getElementById("same");
	var z1=document.getElementById("same1");
	if (x==null||x=="")
	  {
		  
	  z.innerHTML="Username must be filled";
	  return false;
	  }
	if(y==null||y=="")
	{
		 z1.innerHTML="Password must be filled";
		 return false;
	}	
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
        
        
    	<div class="cleaner"></div>
    </div> <!-- end of header -->
    
    <div id="templatemo_main">
    	<div id="intro">
        	<div id="intro_left">
   
        			
        		
              	<p>
              	 <form action="loginservlet" method="get" name="login" onSubmit="return validateForm()">

<br>
<table align="center">
<tr>
<td>
<b><font size="4">USERNAME:</b></font>
</td>
<td>
<input type="text" id="t1" name="t1"/></td><tr><td colspan=2><p id="same"></p>
</td></tr>
<tr>
<td><font size="4"><b>PASSWORD:</b></font></td>
<td><input type="password" name="t2"/></td><tr><td colspan=2><p id="same1"></p></td>
</tr>

<br>

<tr>
<td align="right">
<br>
<input type="submit" style=" color: #CC9933; font-weight: bold; background: url(images/templatemo_button.png)" value=" Login "/>
</form></td>
<td>

<form action="signup.jsp" method="get">
&nbsp;&nbsp;<input type="submit" style="color: #CC9933; font-weight: bold; background: url(images/templatemo_button.png)" value="New User"/>
</td></tr>
</form>

</table>
            </div>
           
            <img align=right src="images/twitter-logo.png" alt="Welcome" width="250" height="250"/>
            
            
               
                <div class="cleaner"></div>
           </div> <!-- end of a content box -->
        </div> <!-- end of content -->
        <div id="templatemo_footer">
    
        	Copyright ©  
            Designed by Jaspreet Kaur Bajwa 
            <br></br>
            Enjoy the Twitterati
    
    	</div> <!-- end of templatemo_footer -->
    </div> <!-- end of main -->
</div> <!-- end of wrapper -->

</body>
</html>