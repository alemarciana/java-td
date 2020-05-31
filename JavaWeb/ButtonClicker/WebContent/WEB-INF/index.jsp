<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ButtonClicker!</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.2/css/bulma.min.css">
	</head>
	<body>
		<div class="container is-centered has-text-centered">
			<form action="AddClick">
				<button class="button is-primary is-outlined" type="submit">Click!</button>
			</form>
			<h1 class="title is-centered">Haz hecho click en este boton <c:out value="${user.getClicks()}" /> veces</h1>
		</div>
	</body>
</html>