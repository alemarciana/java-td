<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Demo UwU</title>
	</head>
	<body>
		<%String name = request.getParameter("name"); %>
		<h1>Hola <%=name%></h1>
	</body>
</html>