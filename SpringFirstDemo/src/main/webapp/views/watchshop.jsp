<!DOCTYPE html>
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Watch Shop</title>
<br>
<style type="text/css">
body{
background-image: url('watch.jpg');
text-align: center;
color: black;
}
h1,span{
color: black;
}
.sub{
 background-color: green;
 color: white;
}
</style>
</head>
<center>

<h1>Watch Shop</h1>
<br>
</center>
<%! ResultSet rs ;
    DbCon db ;
    public void jspInit() {
        db = new DbCon();
    }
%>
<form action="/cont/shop" method="GET">
<span><input type="hidden" name="shop" value="Invoice">
<% rs=db.checkTable("watchshop"); 
while(rs.next()){ %>
<input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/cont/shopimg?shopname=watchshop&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input class="sub" type="submit" value="Next">
</form>

</body>
</html>