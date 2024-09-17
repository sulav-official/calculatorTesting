<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to Sample Web Application</title>
</head>
<body>

<h1>Hello, Welcome to the Sample Web Application!</h1>

<p>This is a simple web application to demonstrate WAR file packaging and deployment on a server.</p>

<%-- Java code inside JSP --%>
<%
    // Simple dynamic content using Java code in JSP
    String message = "The current server time is: " + new java.util.Date();
%>

<p><%= message %></p>

</body>
</html>
