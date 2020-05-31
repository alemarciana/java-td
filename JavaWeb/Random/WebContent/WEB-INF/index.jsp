<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Random Word Generator</title>
			<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.2/css/bulma.min.css">
		</head>
	<body>
		<div id="container" class="container is-centered has-text-centered">
			<form action="GetWord">
				<h2 class="is-size-4">You have generated a word <c:out value="${user.getClicks()}"/> times</h2>
				<h3 class="is-size-2">Word: <c:out value="${user.getWord()}"/></h3>
				<button class="button is-primary is-outlined" type="submit">Generate</button>
			</form>
			<h3 class="is-size-4">The last time you generated a word was <c:out value="${user.getLastDate()}"/></h3>
		</div>
	</body>
</html>