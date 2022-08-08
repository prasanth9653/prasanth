<!DOCTYPE html>
<%@page import="java.util.Enumeration"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invoice</title>
<style type="text/css">
body {
	
	text-align: center;
}
a{
text-decoration: none;
}
table {
	text-align: center;
	align-content: center;
}
</style>
</head>
<body>
<h1>Invoice</h1><center>
<br>
<br>
<table  border="1"><thead><tr><th>Name</th><th>Value</th></tr></thead>
<% int c=0;
Enumeration<String> em=session.getAttributeNames();
while(em.hasMoreElements()){
	String a=em.nextElement().toString();
	String b=session.getAttribute(a).toString();
	if(a.equals("shop")){}
	else{
		c=c+Integer.parseInt(b);
%>
<tbody>
<tr><td><%=a %></td><td><%=b %></td></tr>
</tbody>
<%
	}
}
%>
<tfoot><tr><td>Total</td><td><%=c %></td></tr></tfoot>
</table></center>
<br>
<br>
<a href="../index.html">Home</a>

<center>
<jsp:include page="logout.jsp"></jsp:include>
<br>
</body>
</html>