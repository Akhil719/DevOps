<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MOURITECH</title>
</head>
<body>
<h1>WEB APPLICATION WITHOUT SERVLET CONFIGURATION IN DEPLOYMENT DESCRIPTOR</h1>
<form action="./register" method="POST">  
Name:<input type="text" name="userName"/><br/><br/>  
Password:<input type="password" name="userPass"/><br/><br/>  
Email Id:<input type="text" name="userEmail"/><br/><br/>  
Country:  
<select name="userCountry">  
<option>India</option>  
<option>Pakistan</option>  
<option>other</option>  
</select>  
  
<br/><br/>  
<input type="submit" value="Register"/>  
  
</form>  
</body>
</html>