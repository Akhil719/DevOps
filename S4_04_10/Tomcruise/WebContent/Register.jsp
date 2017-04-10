<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="US-ASCII">
<title>Register Page</title>
</head>
<body>
<h3>Provide all the fields for registration.</h3>
<form action="Register" method="post">
<strong>Email ID</strong>:<input type="text" name="email"><br>
<strong>Password</strong>:<input type="password" name="password"><br>
<strong>Name</strong>:<input type="text" name="name"><br>
<strong>Country</strong>:<input type="text" name="country"><br>
<input type="submit" value="Register">
</form>
<br>
If you are registered user, please <a href="Login.jsp">login</a>.
</body>
</html>