<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Date"%>
<%@ page
language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    buffer="10kb"
    autoFlush="true"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(int i=0;i<10000;i++){
	out.println("தமிழ்");
} %>>
காலை வணக்கம்
<%
	Date d;
	List list;
	ArrayList al;
%>
	<%="welcome to JSP................................." %>
	<%=application.getRealPath("") %>
	<%
		String uname=request.getParameter("uname");
	%>
	<h1>
		<%out.println(uname);met();%>
	</h1>
	<h2>	<%=uname %><%=value %> 	</h2>
		
	<%!
		String value="hello world...";
		void met(){
			System.out.println("called....");
		}
	%>
</body>
</html>