<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Search page</title>
</head>
<body>
<div align="center"><h1>Delete Employee</h1></div>
<h5>Please enter either Emp ID </h5>
<form action="./DeleteEmployee" method="post">
	<table>
		<tr>
			<td>Emp Id</td>
			<td><input type="number" name="eid"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit"></td>
			<td><input type="reset" value="Reset"></td>
		</tr>
	</table>
</form>
</body>
</html>