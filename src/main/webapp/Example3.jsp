<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table</title>
</head>
<body>

<TABLE BORDER=3>
<TR><TH>Course</TH><TH>Duration</TH> 
<%
String []course = {"OOAD","Java","Internet","Web"};
int []durn = {2,4,3,2};
   for(int i=0; i < course.length; i++)
   {%> 
     <TR>
         <TD> <%=course[i]%> </TD>       
         <TD> <%=durn[i]%>    </TD>    
     </TR>
   <%}%>
</TABLE>

</body>
</html>