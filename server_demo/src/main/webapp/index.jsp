<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <body>
 <h1> hello home hello </h1>

 <p> THE LOCAL DATE </p>
 <%= new Date().toLocaleString() %>
<br>
<a   href="login" >login page</a>
</body>
</html>