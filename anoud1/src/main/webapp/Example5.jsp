<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Some dynamic content created using various JSP mechanisms:
<UL>
  <LI><B>Expression.</B><BR>
      Your hostname: <%= request.getRemoteHost() %>.
  <LI><B>Scriptlet.</B><BR>
      <% out.println("Attached GET data: " +
                     request.getQueryString()); %>
  <LI><B>Declaration (plus expression).</B><BR>
      <%! private int accessCount = 0; %>
      Accesses to page since server reboot: <%= ++accessCount %>
  <LI><B>Directive (plus expression).</B><BR>
      <%@ page import = "java.util.*" %>
      Current date: <%= new Date() %>
</UL>

</body>
</html>