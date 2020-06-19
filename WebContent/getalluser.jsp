<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List,M.User" %>
<%@ page import="M.criteriauser" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>纯css3网页左上角扇形状导航效果</title>
<link href="css/houtaiyemian.css" type="text/css" rel="stylesheet" />
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
<script type="text/javascript" src="scripts/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
  $(function(){
	  $(".delete").click(function(){
		  var name=$(this).parent().parent().find("td:eq(1)").text();
  		  var flag=confirm("确定要删除"+name+"吗");
  		  return flag;
	  });
  });
</script>
<% 
criteriauser cc;
if(session.getAttribute("cc")==null)
{
	 cc=new criteriauser("","","","");
}
else
{
	cc=(criteriauser)session.getAttribute("cc");
}
%>
<form name="queryForm" action="query3.xh" mothod="post">
 	姓名:<input type="text" name="username" value="<%=cc.getUsername().substring(1,cc.getUsername().length()-1) %>"><br><br>
 	密码:<input type="text" name="password" value="<%=cc.getPassword().substring(1,cc.getPassword().length()-1) %>"><br><br>
 	性别:<input type="text" name="gender" value="<%=cc.getGender().substring(1,cc.getGender().length()-1) %>"> <br><br>
	年龄:<input type="text" name="phonenumber" value="<%=cc.getPhonenumber().substring(1,cc.getPhonenumber().length()-1) %>"><br><br>
 		<input type="submit" value="Query"><br><br>
 		<a href="adduser.jsp">添加</a>
</form>
<%
int pageSize=2;
int currPage;
int pageCount;
if(request.getAttribute("currPage")==null)
{
	currPage=1;
}
else
{
	currPage=(Integer)(request.getAttribute("currPage"));
	
}
if(request.getAttribute("pageCount")==null)
{
	pageCount=1;
}
else
{
	pageCount=(Integer)(request.getAttribute("pageCount"));
}
%>

<%
	List<User> users=(List<User>)request.getAttribute("user");
	if(users!=null&&users.size()>0){
%>
<table border="1" cellpadding="10" cellspacing="0">
<tr>
<th>id</th>
<th>username</th>
<th>password</th>
<th>sex</th>
<td>age</td>
<th>操作</th>
</tr>
<% for(int i=0;i<users.size();i++){
		 User user=users.get(i);
%>
		<tr>
		 <td><%=user.getId()%></td>
		 <td><%=user.getUsername()%></td>
		 <td><%=user.getPassword()%></td>
		 <td><%=user.getGender() %></td>
		 <td><%=user.getPhonenumber()%></td>
		<td><a href="exituser.xh?id=<%=user.getId()%>">修改</a><a href="deleteuser.xh?id=<%=user.getId()%>"class="delete">删除</a></td>
		 </tr>
<%}%>
</table>
总共有<%=pageCount %>
		页，当前第<%=currPage%>页 &nbsp;&nbsp;
		<%
		if(currPage>1) 
		{
		%>
			<a href="query4.xh?page=<%=currPage-1%>">上一页 </a> 
		<% 
		}else
		{
			out.print("上一页&nbsp;");
		}
		%>
		<%
		if(currPage<pageCount)
		{
		%>
			<a href="query4.xh?page=<%=currPage+1%>">下一页 </a> 
		<% 
		}else
		{
			out.print("下一页&nbsp;");
		}
		%>
		&nbsp;
		<a href="query4.xh?page=1">首页</a> &nbsp;
		<a href="query4.xh?page=<%=pageCount %>">尾页 </a> 
	<%} %>
<br><br>

<a href="index.jsp">返回首页</a>
</body>
</html>