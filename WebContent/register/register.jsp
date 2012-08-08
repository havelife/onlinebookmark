<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Sign Up</title>
</head>
<body>
register

<form action="/user!register.action" method="post">
Username: <input type="text" name="username"/><br/>
Password: <input type="password" name="password"/>
Email: <input type="text" name="email"/>
<input type="submit" value="提交"/>
</form>
</body>
</html>