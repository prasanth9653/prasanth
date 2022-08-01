<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form action="/cont/register" method="post" modelAttribute="myobj">


EmployeeName<form:input path="EmpName"/><br>
<br>
Password<form:input path="Password"/><br>
<br>
Re-Enter Password<form:input path="Password1"/>
<br>
EmployeeCity<form:input path="EmpCity"/><br>
<br>
Employee Address<form:input path="Address"/><br>
<br>
ContactNumber<form:input path="ContactNum"/><br>
<br>
image:<form:input type="file" path="img"/><br>





<input type="submit" value="Ok...."/>

</form:form>