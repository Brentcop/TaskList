<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Taskform</title>
</head>
<body style="background-color:DodgerBlue;">
<h1 style ="color:white">Add a task below</h1>
<form action="/add" method="post" style ="color:white">
<!--ID : ${id} This value cannot be changed by a user, but they can see it -->
<!-- <input type="hidden" name="id" value="${id}"> -->
<br><br>Renter Email : <input type="text" name="idemail">
<br><br>Task Description : <input type="text" name="description">
<br><br>Due Date : <input type ="text" name="dueDate">
<br><br>Complete : <input type ="checkbox" name="complete">
<br><br><br><input type="submit" value="Submit">
</form>
</body>
</html>