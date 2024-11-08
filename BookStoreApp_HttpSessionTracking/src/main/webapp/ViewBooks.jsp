<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import ="test.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");

ArrayList al=(ArrayList)session.getAttribute("al");
out.println("Page Belongs to "+ab.getfName()+"<br>");

if(al.size()==0){
	out.println("Books not available.... <br>");
}
else{
	Iterator<BookBean> i=al.iterator();
	while(i.hasNext()){
		BookBean bb=(BookBean)i.next();
		
		out.println(bb.getName()+"&nbsp&nbsp"+bb.getCode()+"&nbsp&nbsp"+bb.getAuthor()
		+"&nbsp&nbsp"+bb.getPrice()+"&nbsp&nbsp"+bb.getQty()+"&nbsp&nbsp"+
		"<a href='edit?bcode="+bb.getCode()+" '>Edit</a>"  +"&nbsp&nbsp"
		+"<a href='delete?bcode="+bb.getCode()+" '>Delete</a> "+"<br>");
			}
	}
%>
<a href="book.html">AddBook</a>
<a href="logout">Logout</a>
</body>
</html>