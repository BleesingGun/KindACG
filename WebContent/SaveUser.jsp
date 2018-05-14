<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Kind Of ACG 新用户注册</title>
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
   <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
   <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>	
	<p>欢迎来到注册界面！</p>
	<form action="user_save.action" method="post">
		<div>
		用户名：<input type="text" name="u_account">
		</div>
		<div>
		密码：<input type="password" name="u_password">
		</div>
		<div>
		昵称：<input type="text" name="u_name">
		</div>
		<div>
		电话：<input type="text" name="u_telephone">
		</div>
		<div>
		电子邮箱：<input type="text" name="u_email">
		</div>
		<button type="submit" >注册</button>
	</form>
</body>
</html>