<%@page import="java.sql.ResultSet"%>
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.InsertImage"%>
<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mobile Shop</title>
</head>
<body><center>
<h1>Mobile Shop</h1>
<%! ResultSet rs ;
    DbCon db ;
    public void jspInit() {
        db = new DbCon();
    }
%>
<form action="/cont/shop" method="post">
<span><input type="hidden" name="shop" value="Invoice">
<% rs=db.checkTable("mobileshop"); 
while(rs.next()){ %>
<input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/cont/shopimg?shopname=mobileshop&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
      <input class="sub" type="submit" value="Next">
</form>
</center>
</body>
</html>