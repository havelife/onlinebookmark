<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

out.println(path);
out.println("<br/>");
out.println(request.getScheme());
out.println("<br/>");
out.println(request.getServerName());
out.println("<br/>");
out.println(request.getServerPort());
out.println("<br/>");
out.println(basePath);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
it works. chris chen.
</body>
</html>