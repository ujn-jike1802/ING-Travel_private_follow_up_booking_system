<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
     <%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    UserDao userDao=new UserDao();
    int PageSize=(int)request.getAttribute("pageNumber");
    int currPage=(int)request.getAttribute("currPage");
     %>
     <table border="1">
        <tr>
           <td>学号</td><td>姓名</td><td>密码</td><td>性别</td><td>年龄</td><td>操作</td>
        </tr>
        <%
          ArrayList<User> li= (ArrayList<User>)request.getAttribute("uslist");
          if(li!=null && li.size()>0){
        	 for(int i=0;i<li.size();i++){
        		 User user=li.get(i);
        		 %>  
        	    <tr>
                 <td><a href='optionServlet?action=find_by_id&id=<%=user.getId()%>'><%=user.getId() %></a></td>
                 <td><a href='optionServlet?action=find_by_username&username=<%=user.getUsername()%>'><%=user.getUsername()%></a></td>
                 <td><%=user.getPassword() %></td>
                 <td><%=user.getGender() %></td>
                 <td><%=user.getAge() %></td>
                 <td><a href='optionServlet?action=update_user&id=<%=user.getId()%>'>修改</a>
                     &nbsp;
                     <a href='optionServlet?id=<%=user.getId()%>&&action=delete'>删除</a></td>
                </tr>
        		 <% 
        	 }
         } 
        %>
        
     </table>
             总共有<%=PageSize %>页，当前第<%=currPage %>页 &nbsp;&nbsp;
           <%
             if(currPage>1){
            	 %><a href="optionServlet?action=selectAll&page=<%=currPage-1 %>"> 上一页</a>
            	 <%
             }
           %>
             <% if(currPage<PageSize){
             %>
                 <a href="optionServlet?action=selectAll&page=<%=currPage+1 %>">下一页</a>
             <% 
             }
            %>

            	<a href="optionServlet?action=selectAll&page=1">首页</a>      
                <a href="optionServlet?action=selectAll&page=<%=PageSize %>">尾页</a>
               <form method="POST" action="optionServlet?action=selectAll">
                 <input type="number" name="page" min="1" max='<%=PageSize %>' step="1" style="-moz-appearance:textfield;">
                 <input type="submit" value="跳转">
                </form>
             <form action="optionServlet?action=find_by_username" method="post">
                        请输入要查询的用户名:<input type="text" name="username"/><br>
             <input type="submit" name="submit" value="提交"/>
             <input type="reset" name="reset" />   
       </form>
      
</body>
</html>