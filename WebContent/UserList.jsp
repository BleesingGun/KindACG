<%@page import="com.kindacg.entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户管理界面</title>
</head>
<body>
	<form action="administrator_select.action" method="post">
		<input type="submit" class="button" value="查询">
	</form>
	<table>
		<thead>
			<tr>
				<th>用户名</th>
				<th>昵称</th>
				<th>联系电话</th>
				<th>邮箱</th>
				<th>操作</th>
			</tr>
			
			
		</thead>
	
			<%
				List<User> users = (List<User>)request.getAttribute("users");
				for(User u:users){
			%>
			<tr>
				<td><%=u.getU_account() %></td>
				<td><%=u.getU_name() %></td>
				<td><%=u.getU_telephone() %></td>
				<td><%=u.getU_email() %></td>
				<!--<td><a href="emp_del.action?id=<%=u.getU_id()%>"
							onclick="return confirm('是否要删除<%=u.getU_name()%>');">删除</a>&nbsp;<a
							href="emp_update.action?id=<%=u.getU_id()%>">修改</a></td>  -->
				
			</tr>
			<%
				}
			%>
	</table>
</body>
</html>