<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
	Greeting : ${greeting} This is a welcome page.
	<br />
	<a href="admin">admin</a> |
	<br />
	<a href="db">dba</a>
	<br />
	<a href="sales">sales</a>
	<br />
	<a href="accounts">accounts</a>
	<br />
	<a href="supplier">supplier</a>
	<br />
	<a href="<c:url value="/logout" />">Logout</a>
</body>
</html>