<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,M.Order" %>
<%@ page import="M.criteriaorder" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>纯css3网页左上角扇形状导航效果</title>
<link href="css/houtaiyemian.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="scripts/jquery-1.12.4.min.js"></script>

</head>
<body>
<!-- 代码部分begin -->
<div class="menuHolder">
	<div class="menuWindow">
		<ul class="p1">
			<li class="s1"><a href="#url">后台管理</a>
				<ul class="p2">
					<li class="s2"><a href="#"><span>首页</span></a></li>
					<li class="s2"><a href="getalluser.jsp"><span>用户信息管理</span></a>
						<ul class="p3 a5">
							<li><a href="#">修改用户信息</a></li>
							<li><a href="#">查询用户信息</a></li>
							<li><a href="#">增加用户</a></li>
							<li><a href="#">删除用户</a></li>
						</ul>
					</li>
					<li class="s2"><a href="query2.pzl"><span>摄影师信息管理</span></a>
						<ul class="p3 a5">
							<li><a href="#">查询摄影师信息</a></li>
							<li><a href="#">修改摄影师信息</a></li>
							<li><a href="#">增加摄影师信息</a></li>
							<li><a href="#">删除摄影师信息</a></li>
							<li><a href="#">相关作品查询</a></li>
							
						</ul>
					</li>
					<li class="s2"><a href="query4.pzl"><span>风景信息管理</span></a>
						<ul class="p3 a3">
							<li><a href="#">人文风景</a></li>
							<li><a href="#">自然风景</a></li>
							
						</ul>
					</li>
					<li class="s2"><a href="getallorder.jsp"><span>预约信息管理</span></a>
						<ul class="p3 a5">
							<li><a href="#">预约时间查询/a></li>
							<li><a href="#">增加预约</a></li>
							<li><a href="#">删除预约</a></li>
							<li><a href="#">修改预约信息</a></li>
						</ul>
					</li>
					<li class="s2 b6"><a href="#url"><span>查询反馈信息</span></a>
						<ul class="p3 a1">
							<li><a href="#">查询反馈信息</a></li>
						
						</ul>
					</li>
				</ul>
			</li>
		</ul>
	</div>
</div>
<%
	Order order=(Order)request.getAttribute("order");
%>

 <form method="post" action="updateorder.xh">
     <input type="hidden" name="id" value="<%=order.getId()%>">
	用户姓名:<input type="text"  name="username" value="<%=order.getUsername()%>"><br>
	性别<input type="text"  name="gender" value="<%=order.getGender()%>"><br>
	用户电话号码<input type="text"  name="phonenumber" value="<%=order.getPhonenumber()%>"><br>
	摄影师编号<input type="text"  name="ph_id" value="<%=order.getPh_id()%>"><br>
	摄影师姓名<input type="text"  name="ph_username" value="<%=order.getPh_username()%>"><br>
	摄影师性别<input type="text"  name="ph_gender" value="<%=order.getPh_gender() %>"><br>
	摄影师电话号码<input type="text"  name="ph_phonenumber" value="<%=order.getPh_phonenumber() %>"><br>
	状态<input type="text" name="status" value="<%=order.getStatus() %>"><br>
	<input type="submit" value="修改">
	</form>
</body>
</html>