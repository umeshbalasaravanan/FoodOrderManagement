<%@ include file="/include.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Food Order Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" ></meta>
<script type = "text/javascript"> 
function validateForm(){
	var uname = document.forms["logForm"]["username"].value();
	var password = document.forms["logForm"]["password"].value();
	if(uname == "" || uname == null){
		alert("please provide the user name");
		return false;
	}
	if(password == "" || password == null){
		alert("please provide the password");
		return false;
		}
	}
	
	</script>
</head>
<style>
.error {
	color: red;
	font-size: 13px;
	font-weight: bold;
}
</style>
<body>
<br/>
<br/>
<br/>
<br/>
<%
		HttpSession session = request.getSession();
		session.invalidate();
	%>
<form method = "post" name = "logForm "  action = "searchUser.htm" onsubmit = "return validateForm()">
<table width = " 80%" align = "center" border ="1" bordercolor = " blue">
<tr>
<td align = "center" >
<div id = "header">
<div> Food Order Management System</div>
</div>
<table>
<tr>
<td colspan = "2" align = "center">
<div id = "content">
<h1> Portal Login Page</h1></div>
</td>
</tr>
<tr>
<td>User Id : </td>
<td><input type ="text" name = "username"></td>
</tr>
<tr>
<td>password : </td>
<td><input type = "password"  name = "password"></td>
</tr>
<tr>
<td align = "right" colspan = "2"><input type = "submit" value = " login"></input></td>
</tr>
<tr>
<td colspan="2" align="center"><span class="error">${ERROR}</span></td>
</tr>
<tr>
<td align = "left" colspan = " 2">
<div id = "content" >New User:</div>
<div id = " content"> <a href = "/FoodOrderManagementSystem/registration.jsp">Register 
Here</a></div>
</td></tr>
</table>
</tr>
</table>
</form>
</body>
</html>