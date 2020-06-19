<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="M.attractions.attractions" %>
<%@ page import="M.attDao.*" %>
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

<%
	Object msg=request.getAttribute("msg");
	if(msg!=null){
%>
		<br>
		<font color="red"><%=msg %></font>
<%} %>
<%

	attractions user=(attractions)request.getAttribute("user");
	
%>
<form method="post" action="update2.pzl?id=<%=user.getId()%>" >

<label>景点名称：</label>
<input type="text" name="attname" value="<%=user.getAttname()%>"><br>
<label>主要图片路径：</label>
<input type="text" name="attsrc_img" value="<%=user.getAttsrc_img()%>"><br>
<label>攻略一路径：</label>
<input type="text" name="attsrc_img1" value="<%=user.getAttsrc_img1()%>"><br>
<label>攻略二路径：</label>
<input type="text" name="attsrc_img2" value="<%=user.getAttsrc_img2()%>"><br>
<label>攻略三路径：</label>
<input type="text" name="attsrc_img3" value="<%=user.getAttsrc_img3()%>"><br>
<label>一：</label>
<input type="text" name="glname1" value="<%=user.getGlname1()%>"><br>
<label>二：</label>
<input type="text" name="glname2" value="<%=user.getGlname2()%>"><br>
<label>三：</label>
<input type="text" name="glname3" value="<%=user.getGlname3()%>"><br>
<label>风景类型：</label>
<input type="text" name="atttype" value="<%=user.getAtttype()%>"><br>
<label>开放时长：</label>
<input type="text" name="opentime" value="<%=user.getOpentime()%>"><br>
<label>建议时长：</label>
<input type="text" name="lasting" value="<%=user.getLasting()%>"><br>
<label>适合游玩季节：</label>
<input type="text" name="seasons" value="<%=user.getSeasons()%>"><br>
<label>景区等级：</label>
<input type="text" name="attlevels" value="<%=user.getAttlevels()%>"><br>
<label>景区视频：</label>
<input type="text" name="attvideo" value="<%=user.getAttvideo()%>"><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="修改">
</form>
</body>
</html>