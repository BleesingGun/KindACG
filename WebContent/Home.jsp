<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
   <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
   <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
body{
 font-family: 'microsoft yahei',Arial,sans-serif;
 margin:0;
 padding:0;
}

</style>
</head>
<body>
<div id="loginModal" class="modal show">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close">x</button>
        <h1 class="text-center text-primary">登录</h1>
      </div>
      <div class="modal-body">
        <form action="user_login.action" method="post" class="form col-md-12 center-block">
          <div class="form-group">
            <input type="text" name="u_account" class="form-control input-lg" placeholder="用户名">
          </div>
          <div class="form-group">
            <input type="password" name="u_password" class="form-control input-lg" placeholder="密码">
          </div>
          <div class="form-group">
            <button class="btn btn-primary btn-lg btn-block" type="submit">立刻登录</button>
            <span><a href="#">找回密码</a></span>
            <span><a href="#" class="pull-right">注册</a></span>
          </div>
        </form>
      </div>
      <div class="modal-footer">
        
      </div>
    </div>
  </div>
</div>
</body>
</html>