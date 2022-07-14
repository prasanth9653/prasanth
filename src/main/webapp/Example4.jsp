<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
         private int  fact(int n) { return n >0 ? n* fact(n-1): 1 ;   }  
      %>
        Testing  function
      <TABLE BORDER=3>
         <TR> <TH>Value</TH><TH>Factorial</TH> </TR>
         <% 
          for (int i=0; i<10; i++) { %>
            <TR>
               <TD><%= i %> </TD>
               <TD><%= fact(i)%></TD>
             </TR>
           <%}%> 
       </TABLE>

</body>
</html>