<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Food Order Management System</title>
</head>
<body>
<form action="/insertUser.htm" method = "post" name = "regForm">
<table width = 80% align = "center" border = "1" bordercolor = "blue">
<tr>
<td><h1 align = "center">Food Order Management System</h1>
<table align = "center">
<tr>
<td>email id     : </td>
<td><input type = "text" name = "emailAddress"></td></tr>
<tr>
<td>password     : </td>
<td><input type = "password" name = "password"></td></tr>
<tr>
<td>First Name   : </td>
<td><input type = "text" name = "fname"></td></tr>
<tr>
<td>Last Name    : </td>
<td><input type = "text" name = "lname"></td></tr>
<tr>
<td>Phone Number : </td>
<td><input type = "text" name = "phoneNumber"></td></tr>
<tr>
<td>Address      : </td>
<td><input type = "text" name = "address"></td></tr>
<tr>
<td><input type = "submit" value = "register"></td>
<td><input type = "reset" value = "cancel"></td>
</tr></table></td>
</tr>
</table>
</form>
</body>
</html>