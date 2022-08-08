<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form action="/form1/register" method="post" modelAttribute="myobj">

User Name<form:input path="uname"/><br>
<br>
Password<form:input path="upass"/><br>
<br>
Phone<form:input path="phone"/><br>
<br>
G-Mail<form:input path="gmail"/><br>

<input type="submit" value="click...."/>




</form:form>