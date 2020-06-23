<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Great Number Game!</title>
		<link rel="stylesheet" href="resources/bulma.min.css">
		<script src="resources/jquery-3.5.1.min.js"></script>
		<script src="resources/script.js"></script>
	</head>
	<body>
		<div id="container" class="container is-centered has-text-centered">
			<h1 class="is-size-2 title">Welcome to the Great Number Game!</h1>
			<h2 class="is-size-4 subtitle">I am thinking of a number between <c:out value="${user.getMinNumber()}"/> and <c:out value="${user.getMaxNumber()}"/></h2>
			<form action="getnumber" method="POST">
    			<input type="number" name="guess" class="input is-primary" required/>
	    		<button class="button is-primary is-outlined">Take a guess!</button>
			</form>
			<c:choose>
				<c:when test="${user.getSuccess() == -2}"></c:when>
				<c:when test="${user.getSuccess() == 0}">
					<div class="has-background-success box">
						<p class="is-size-4">Congratulations! the number was: <c:out value="${user.getNumber()}"></c:out>
						<form action="reset" method="POST">
							<button class="button is-link is-outlined">Play Again</button>
						</form>
					</div>
				</c:when>
				<c:otherwise>
					<div class="has-background-danger box">
						<p class="is-size-4">
						<c:choose>
						<c:when test="${user.getSuccess() == -1 }">Wrong, too low!</c:when>
						<c:otherwise>Wrong, too high!</c:otherwise>
						</c:choose>
						</p>
					</div>
				</c:otherwise>
			</c:choose>
			<!--<p>number: <c:out value="${user.getNumber()}"/></p> -->
			<p>last guess: <c:out value="${user.getGuess()}"/></p>
			<a id="settings-toggle">Advanced Settings</a>
			<form id="advanced-settings" style="display: none;">
				<label for="minNum">Minimum Value</label>
				<input type="number" id="minNum" placeholder="1"/>
				<label for="maxNum">Maximum Value</label>
				<input type="number" id="maxNum" placeholder="100"/>
			</form>
		</div>
	</body>
</html>