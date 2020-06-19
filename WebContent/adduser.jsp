<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="M.User,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
 <form method="post" action="adduser.xh">
	用户名:<input type="text"  name="username" ><br>
	密码:<input type="password"  name="password" ><br>
	性别:<input type="text"  name="gender" ><br>
	电话号码:<input type="text"  name="phonenumber"><br>
	<input type="submit" value="添加">
	</form>
</body>
</html>