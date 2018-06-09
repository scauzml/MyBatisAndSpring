<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<form action="login" method="post" >
<font color="red">${requestScope.message }</font>
<table>
<tr>
<td><label>登陆id:</label></td>
<td><input type="text" id="id" name="id"></td>
</tr>
<tr>
<td><label>name：</label></td>
<td><input type="text" id="name" name="name"></td>
</tr>
<tr>
<td><input type="submit" value="登录"></td>
</tr>
</table>
</form>
</body>
</html>