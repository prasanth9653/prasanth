<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<HTML> <HEAD> <TITLE> Expressions  </TITLE> </HEAD>
  <BODY>
   <TABLE BORDER=2>
     <TR>    <TH>Message</TH> <TH>Result</TH>   </TR>
     <TR>     <TD>SQRT of 6</TD> 
                    <TD> <%= Math.sqrt(5) %></TD>   </TR> 
     <TR>     <TD>Current time</TD> 
                    <TD> <%= new java.util.Date() %></TD>   </TR>     
     <TR>     <TD>Your hostname</TD>
                    <TD> <%= request.getRemoteHost() %></TD>  </TR>  
     <TR>     <TD>Port :</TD>
                    <TD> <%= request.getServerPort() %></TD>  </TR> 
      <TR>    <TD>Scheme </TD>
                    <TD> <%= request.getScheme() %></TD>  </TR>   
      <TR>    <TD> Address</TD>
                    <TD> <%= request.getServerName() %></TD>  </TR>  
      </TABLE>
   </BODY> 
</HTML>





