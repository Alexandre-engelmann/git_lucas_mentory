<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show string JSP -Resultado da operacao</title>
</head>
<body>
	<h1>Show string h1 - Resultado:</h1>
	<%= (String)request.getAttribute("result") %>
</body>
</html>