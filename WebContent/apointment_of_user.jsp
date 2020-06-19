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
		  var flag=confirm("确定要取消和"+name+"的预约吗?");
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

<form action="user_select_appointment.yb?do=yes" method="post">
     <table align="center">
               <tr><td></td><td>Input for fuzzy query</td></tr>
             <tr><tr><td>ph_Id:</td><td><input type="number" name="ph_id"></td></tr>
             <tr><td>ph_Username:</td><td><input type="text" name="ph_username"/></td></tr>
        	 <tr><td>ph_Gender:</td><td><input type="radio" name="ph_gender" value="男"/> 男 <input type="radio" name="ph_gender" value="女"/> 女 </td></tr>
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
                 <td><%=or.getPh_id()%></td>
                 <td><%=or.getPh_username()%></td>
                 <td><%=or.getPh_gender()%></td>
                 <td><%=or.getPhonenumber()%></td>
                 <%if(or.getStatus().equals("0")){
                	%>
                	  <td><a href='delete_form_user.yb?id=<%=or.getOrder_id()%>'>unorder</a></td>
                	<% 
                 }else{
                   %>
                     <td>已接受</td>
                   <%
                 }%>
               
                </tr>
        		 <% 
        	}
        	
        	if(pageMan!=null){    	
        		%>
        		<div style="text-align:center;">
        		总共有:<%=pageMan.getPageNumber()%>页,当前在:<%=pageMan.getCurrent() %>页。
        		<%
                if(pageMan.getCurrent()>1){
            	 %><a href="user_select_appointment.yb?do=no&page=<%=pageMan.getCurrent()-1 %>"> 上一页</a>
            	 <%
             }
           %>
             <% if(pageMan.getCurrent()<pageMan.getPageNumber()){
             %>
                 <a href="user_select_appointment.yb?do=no&page=<%=pageMan.getCurrent()+1 %>">下一页</a>
             <% 
             }
            %>
            <a href="user_select_appointment.yb?do=no&page=1">首页</a>      
                <a href="user_select_appointment.yb?do=no&page=<%=pageMan.getPageNumber() %>">尾页</a>
               <form method="POST" action="user_select_appointment.yb?do=no">
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