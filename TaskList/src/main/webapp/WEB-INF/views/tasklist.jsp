<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Task List</title>
</head>
<body style="background-color:DodgerBlue;">

<h1 style ="color:white; text-align:center">Welcome to the task list page!</h1>
<table border="1">
<c:forEach items="${task }" var="task">
<tr>
	<th>Id</th>
	<th>IdEmail</th>
	<th>Description</th>
	<th>Due Date</th>
	<th>Complete</th>
<tr>
<td style="color:yellow">${task.id}</td>
<td style="color:yellow">${task.idemail }</td>
<td style="color:yellow">${task.description }</td>
<td style="color:yellow">${task.dueDate }</td>
<td style="color:yellow">${task.complete }</td>
<td><a href="delete?id=${task.id }" style="color:yellow">Delete</a></td>
<td><a href="update?id=${task.id }" style="color:yellow">Update</a></td>
</tr>
</c:forEach>
</table>

<form action="taskform">
<input type="submit" value="New Task">
</form>
</body>
</html>