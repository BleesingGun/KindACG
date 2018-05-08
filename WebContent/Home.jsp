<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>欢迎来到KindACG!</p>
	<form action="user_login.action" method="post">
		<table cellpadding="0" cellspacing="0" border="0" class="form_table">
			<tr>
				<td><input type="text" name="u_account"></td>
				<td><input type="password" name="u_password"></td>
				<td><input type="submit" class="button" name="submit" value="Submit &raquo;"></td>
			</tr>
		</table>
	</form>
</body>
</html>