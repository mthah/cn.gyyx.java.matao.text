<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UserRegester</title>
</head>
<body>
	<form action="regest" method="get">
		用户名：<input type="text" name="userName" ><br/>
		密码：&nbsp<input type="password"  name="password" ><br/>
		<input type="submit" value="注册"><br/>
	</form>
<%-- 	<jsp:forward page="selectAll?page=1">查询所有用户</jsp:forward> --%>
	<a href="selectAll?page=0">查询所有用户</a>
	
	<%-- <form action="selectAll">
		<input type='<jsp:param value="0" name="page"/>'>	
		<input type="submit" values="查询所有用户">
	</form> --%>
	
	<!-- <a href="www.baidu.com">sdf</a> -->
</body>
</html>