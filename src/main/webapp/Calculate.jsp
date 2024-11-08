<%@ page language="java" 
    	  contentType="text/html; charset=UTF-8"
          pageEncoding="UTF-8"
          errorPage="Error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
int fact;
int factorial(int n){
	fact=1;
	for(int i=2;i<=n;i++){
		fact*=i;
	}
	return fact;
}
%>

<% 
int n=Integer.parseInt(request.getParameter("v"));
int result=factorial(n);
out.println("Factorial : "+result);
%>

<%@ include file="input.html" %>
</body>
</html>