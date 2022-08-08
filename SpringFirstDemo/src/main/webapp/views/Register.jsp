<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form action="/cont/register" method="post" modelAttribute="myobj">
<center><h1>Register Page</h1></center>
<br>
<center>
EmployeeName<form:input type="text" path="empname"/><br>
<br>
Password<input type="password" name="pass"/><br>
<br>
Re-Enter Password<input type="password" name="pass1"/>
<br>
Age<form:input type="text" path="age"/>
<br>
EmployeeCity<form:input type="text" path="empcity"/><br>
<br>
Employee Address<form:input type="text" path="addr"/><br>
<br>
ContactNumber<form:input type="text"  path="cnum"/><br>
<br>
image:<form:input type="file" path="img"/><br>

</center>


<center>
<input type="submit" value="Ok...."/>
</center>
</form:form>