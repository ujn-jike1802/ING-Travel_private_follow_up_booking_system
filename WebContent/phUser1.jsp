<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="M.phUser.phUser" %>
<%@ page import="M.phUserdao.*" %>
 <%@ page import="java.util.*" %>
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

<!-- 代码部分end -->
<form method="post" action="query2.pzl" name="form">
<label>用户名：</label>
<input type="text" name="username" ><br>
<label>性别：</label>
&nbsp;&nbsp;&nbsp;<input type="text" name="gender" ><br>
<label>电话：</label>
&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="phonenumber"><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="查询">

</form>
<br>
<br>
<br>
<hr>
<%

int pageSize;
if(request.getAttribute("pageSize")==null){
	pageSize=3;
}else
{
	pageSize=(Integer)request.getAttribute("pageSize");
}
int currentPage;
if(request.getAttribute("currentPage")==null){
	currentPage=1;
}else
{
	currentPage=(Integer)request.getAttribute("currentPage");
}
int  pageCount;
if(request.getAttribute("pageCount")==null){
	pageCount=1;
}else{
	pageCount=(Integer)request.getAttribute("pageCount");
}

	List<phUser> users=(List<phUser>)request.getAttribute("users");
	if(users!=null&&users.size()>0){
		

%>
<table border="1" cellpadding="10" cellspacing="0">
<h3>摄影师信息表</h3>
	<tr>
		<th>ID</th>
		<th>username</th>
		<th>gender</th>
		<th>phonenumber</th>
		<th>operation</th>
		
	</tr>
	<%
		for(phUser user:users){
			
		
	%>
<tr>
	<td><%=user.getId()%></td>	
	<td><a href="detail.do?name=<%=user.getId() %>"><%=user.getUsername() %></a></td>	
	<td><%=user.getGender() %></td>	
	<td><%=user.getPhonenumber() %></td>	
	<td><a href="edit.pzl?id=<%=user.getId() %>">修改</a>&nbsp;<a href="delete.pzl?id=<%=user.getId() %>" class="delete">删除</a></td>	
</tr>	
<%
		}
%>
<br>

总共有<%=pageCount %>页，当前第<%=currentPage %>页&nbsp;&nbsp; 
<%
		if(currentPage>1){
%>
<a href="query1.pzl?page=<%=currentPage-1%>">上一页</a>&nbsp;
<% 			
		}else{
			out.print("上一页&nbsp;");
		}
%>
<%
		if(currentPage<pageCount){
%>
<a href="query1.pzl?page=<%=currentPage+1%>">下一页</a>
<% 			
		}else{
			out.print("下一页&nbsp;");
		}
%>
<br>
<br>
</table>
<%
		
	}
%>
<br>
 <form method="post" action="exit.do" name="form"> 
<input type="submit" value="退出" />
</form>
<br>
</body>
</html>