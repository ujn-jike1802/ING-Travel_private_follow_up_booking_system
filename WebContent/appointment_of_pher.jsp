<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="M.PageMan"%>
<%@ page import="M.order"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户预约信息查询</title>
<script type="text/javascript" src="scripts/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
  $(function(){
	  $(".delete").click(function(){
		  var name=$(this).parent().parent().find("td:eq(1)").text();
		  var flag=confirm("确定要拒绝"+name+"的预约吗?");
		  return flag;
	  });
  });
  $(function(){
	  $(".order").click(function(){
		  var name=$(this).parent().parent().find("td:eq(1)").text();
		  var flag=confirm("确定要接受"+name+"的预约吗?");
		  return flag;
	  });
  });
</script>
</head>
<body>

<%
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    PageMan pageMan=(PageMan)request.getAttribute("pageMan");
%>
<form action="pher_select_appointment.yb?do=yes" method="post">
     <table align="center">
               <tr><td></td><td>Input for fuzzy query</td></tr>
             <tr><td>Username:</td><td><input type="text" name="username"/></td></tr>
        	 <tr><td>Gender:</td><td><input type="radio" name="gender" value="男"/> 男 <input type="radio" name="gender " value="女"/> 女 </td></tr>
             <tr><td><input type="submit" value="Query"/></td><td><input type="reset" value="Reset"/></td></tr>
    </table>
   </form>
     <br>
     <br>
     <hr>
     <br>
     <br>    
      
     <%
        List<order> orders= (List<order>)request.getAttribute("orders");        
        if( orders!=null&& orders.size()>0){
        	%>
        	  <table border="1" cellpadding="10" cellspacing="0" align="center">
       <tr>
       <th>ph_ID</th>
       <th>ph_UserName</th>
       <th>ph_Gender</th>
       <th>ph_Phonenumber</th>
       <th>Operate</th>
       </tr>
        	<% 
        	 for(int i=0;i<orders.size();i++){
        		 order or=orders.get(i);     	
        		 %>  
        	    <tr>
                 <td><%=or.getId() %></td>
                 <td><%=or.getUsername() %></td>
                 <td><%=or.getGender() %></td>
                 <td><%=or.getPhonenumber() %></td>
                 <%if(or.getOr_status().equals("0")){ 
                	 
                	 %>
                	   <td><a href='delete_from_pher.yb?id=<%=or.getOrder_id()%>'class="delete">拒绝</a>
                      <a href='update_from_pher.yb?id=<%=or.getOrder_id()%>'class="order">接受</a></td>
                	 <%
                 }else{
                  %>
                     <td>已接受</td>
                  <%
                 }
                 %>
                
                </tr>
        		 <% 
        	}
        	
        	if(pageMan!=null){    	
        		%>
        		<div style="text-align:center;">
        		总共有:<%=pageMan.getPageNumber()%>页,当前在:<%=pageMan.getCurrent() %>页。
        		<%
                if(pageMan.getCurrent()>1){
            	 %><a href="pher_select_appointment.yb?do=no&page=<%=pageMan.getCurrent()-1 %>"> 上一页</a>
            	 <%
             }
           %>
             <% if(pageMan.getCurrent()<pageMan.getPageNumber()){
             %>
                 <a href="pher_select_appointment.yb?do=no&page=<%=pageMan.getCurrent()+1 %>">下一页</a>
             <% 
             }
            %>
            <a href="pher_select_appointment.yb?do=no&page=1">首页</a>      
                <a href="pher_select_appointment.yb?do=no&page=<%=pageMan.getPageNumber() %>">尾页</a>
               <form method="POST" action="pher_select_appointment.yb?do=no">
                 <input type="number" name="page" min="1"  max='<%=pageMan.getPageNumber() %>' step="1" />
                 <input type="submit" value="跳转"/>
                </form>
        		</div>
        		<%
        	}
        }
     %>
  </table>
</body>
</html>