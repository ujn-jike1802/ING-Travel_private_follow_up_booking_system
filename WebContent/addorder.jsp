<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="M.Order,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
 <form method="post" action="addorder.xh">
	用户姓名:<input type="text"  name="username" ><br>
	性别<input type="text"  name="gender" ><br>
	用户电话号码<input type="text"  name="phonenumber" ><br>
	摄影师编号<input type="text"  name="ph_id" ><br>
	摄影师姓名<input type="text"  name="ph_username" ><br>
	摄影师性别<input type="text"  name="ph_gender" ><br>
	摄影师电话号码<input type="text"  name="ph_phonenumber" ><br>
	状态<input type="text" name="status" ><br>
	<input type="submit" value="添加">
	</form>
</body>
</html>