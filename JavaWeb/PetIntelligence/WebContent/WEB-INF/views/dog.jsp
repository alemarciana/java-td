<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="UTF-8">
		<title>Tu nuevo gato esta aqui!</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.2/css/bulma.min.css"/>		
	</head>
	<body>
		<div id="container">
			<nav class="navbar is-primary is-fixed-top" style="position:sticky;">
				<div class="navbar-start">
					<p class="navbar-item title">Bienvenido/a a PetIntelligence</p>
				</div>
				<div class="navbar-end">
					<a class="navbar-item" href="https://github.com/angeelgod/java-td" target="_blank">GitHub Repo</a>
					<a href="https://bulma.io" class="navbar-item" target="_blank">
						<img src="https://bulma.io/images/made-with-bulma--white.png" alt="Made with Bulma" width="128" height="24">
					</a>
				</div>
			</nav>
			<h1 class="is-size-2"><c:out value="${dog.showAffection()}" /></h1>
		</div>
	</body>
</html>