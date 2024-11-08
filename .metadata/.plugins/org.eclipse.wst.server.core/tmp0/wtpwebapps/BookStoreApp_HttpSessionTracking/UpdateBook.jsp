<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update book</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
String msg=(String)request.getAttribute("msg");
out.println("Page Belongs to "+ab.getfName()+"<br>");
out.println(msg);
%>
<a href="book.html">AddBook</a>
<a href="view">ViewBooks</a>
<a href="logout">Logout</a>
</body>
</html>