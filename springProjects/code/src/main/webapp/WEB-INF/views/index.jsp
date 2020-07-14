<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Secret Code</title>
<link rel="stylesheet" type="text/css" href="css/bulma.min.css">
</head>
<body>
	<div class="container is-centered has-text-centered">
		<form action="code" method="POST">
			<p class="has-text-danger">${error}</p>
			<p class="title">What is the code?</p>
			<input type="text" name="code">
			<button type="submit">Try Code</button>
		</form>
	</div>
</body>
</html>