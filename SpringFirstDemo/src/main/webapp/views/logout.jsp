<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<center></center>
<h1> Thank You</h1>
</center>
<br>
<br>
<center>
<form action="/cont/log" method="get" >
<input type="hidden" name="name" value="${names}">
<input type="hidden" name="pass" value="${passs}">
<input class="sub" type="submit" value="Logout"></form>
</center>



</form>
