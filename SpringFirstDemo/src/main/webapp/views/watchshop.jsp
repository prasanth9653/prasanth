<!DOCTYPE html>
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Watch Shop</title>


</head>
<body>
<h1>Watch Shop</h1>
<%! ResultSet rs ;
    DbCon db ;
    public void jspInit() {
        db = new DbCon();
    }
%>
<form action="/cont/shop" method="post">
<input type="hidden" name="shop" value="mobileshop">
<% rs=db.checkTable("watchshop"); 
while(rs.next()){ %>
<span><input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/cont/shopimg?shopname=watchshop&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input  type="submit" value="Next">
</form>
</body>

</html>