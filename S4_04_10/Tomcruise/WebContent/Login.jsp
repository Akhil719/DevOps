<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="US-ASCII">
<title>Login Page</title>
</head>
<body>
<h3>Login with email and password</h3>
<form action="Login" method="post">
<strong>User Email</strong>:<input type="text" name="email"><br>
<strong>Password</strong>:<input type="password" name="password"><br>
<input type="submit" value="Login">
</form>
<br>
If you are new user, please <a href="Register.jsp">register</a>.
</body>
</html>