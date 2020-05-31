<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Checkerboard</title>
		<link rel="stylesheet" href="style.css">
	</head>
	<body>
	<%
	int width = Integer.parseInt(((request.getParameter("width") == null) ? "0" : request.getParameter("width")));
	int height = Integer.parseInt(((request.getParameter("height") == null) ? "0" : request.getParameter("height")));
	String insert1 = "";
	for (int h = 0; h<height; h++){
		insert1 = insert1 + "<div class='row'>";
		for (int w = 0; w<width; w++){
			if ( h%2 == 0 ){
				insert1 = insert1 + ((w%2 == 0) ? "<div class='tile tile1'></div>" : "<div class='tile tile2'></div>");
			}
			else {
				insert1 = insert1 + ((w%2 == 0) ? "<div class='tile tile2'></div>" : "<div class='tile tile1'></div>");
			}
		}
		insert1 = insert1 + "</div>";
	}
	%>
		<div id="main_container">
			<header>
				<h1>Checkerboard: <%=width%>w X <%=height%>h</h1>
			</header>
			<div id="board">
				<%=insert1%>
			</div>
		</div>
	</body>
</html>