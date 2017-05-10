<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to sales page</title>
</head>
<body>
Dear <strong>${sales}</strong>, Welcome to Sales Page.
	<br/>
	<a href="admin">admin</a> | <a href="home">home</a><br/>
	<br/>
	<a href="<c:url value="/logout" />">Logout</a>
</body>
</html>