<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="logo" >
<table style="background-color:skyblue;margin-left:20px;margin-left:20px;">

<tr><td><h3 style="color:red;">${massage }</h3>
<h3 style="color:red;">${ succesmassage }</h3></td></tr>
<tr><td><h3 style="color:red;">login page</h3></td></tr>
<tr><td>Email</td><td><input type="text" name="mailId" placeholder="Enter mail_id"></td></tr>
<tr><td>Password</td><td><input type="Password" name="Password1" placeholder="Enter password"></td></tr>
<tr><td><input type="submit" name="submit" value="login"></td><td>
<a href="resister.jsp">Registration</a></td></tr>


</table>

</form>
</body>
</html>