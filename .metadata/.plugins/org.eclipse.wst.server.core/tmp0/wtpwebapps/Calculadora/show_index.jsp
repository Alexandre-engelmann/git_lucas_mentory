<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado da operacao</title>
</head>
<body>
	<h1>Resultado:</h1>
	<%= (String)request.getAttribute("result") %>
</body>
</html>