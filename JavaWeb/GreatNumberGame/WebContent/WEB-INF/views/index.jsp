<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Great Number Game!</title>
		<link rel="stylesheet" href="resources/bulmaswatch.min.css">
		<script src="resources/jquery-3.5.1.min.js"></script>
		<script src="resources/script.js"></script>
	</head>
	<body>
		<div id="container" class="is-centered columns">
			<aside class="menu column is-2" style="padding:1%!important;">
				<p class="menu-label">Projects / Assignments</p>
				<ul class="menu-list">
					<li>
						<a>APIs / Ajax</a>
						<ul>
							<li><a href="https://github.com/angeelgod/java-td/tree/master/apis_ajax/pokemon">Pokemon Sprites</a></li>
							<li><a href="https://github.com/angeelgod/java-td/tree/master/apis_ajax/dex">PokeDex</a></li>
							<li><a href="https://github.com/angeelgod/java-td/tree/master/apis_ajax/weather/">Weather Forecast</a></li>
							<li><a href="https://github.com/angeelgod/java-td/tree/master/apis_ajax/got">Game of Thrones</a></li>
						</ul>
					</li>
					<li><a>MySQL</a></li>
					<li>
						<a>Java</a>
						<ul>
							<li><a href="/PetIntelligence/Home">PetIntelligence</a></li>
							<li><a href="#">Button Clicker</a></li>
							<li><a href="#">Random Words</a></li>
							<li><a href="#" class="is-active">Great Number Game</a></li>
						</ul>
					</li>
				</ul>
			</aside>
			<div class="is-10 has-text-centered container column" style="padding:1!important">
				<nav class="navbar is-primary" role="navigation" style="position: sticky !important;">
					<div class="navbar-start">
						<p class="navbar-item title">Great Number Game</p>
					</div>
					<div class="navbar-end">
						<p class="navbar-item">Score: <c:out value="${user.getScore()}"></c:out></p>
						<a class="navbar-item" href="https://github.com/angeelgod/java-td" target="_blank">GitHub Repo</a>
						<a href="https://bulma.io" class="navbar-item" target="_blank">
							<img src="https://bulma.io/images/made-with-bulma--white.png" alt="Made with Bulma" width="128" height="24">
						</a>
					</div>
				</nav>
				<div class="section">
				<h1 class="title is-size-2">Welcome to the Great Number Game!</h1>
				<h2 class="subtitle is-size-4">I am thinking of a number between <c:out value="${user.getMinNumber()}"/> and <c:out value="${user.getMaxNumber()}"/></h2>
				<form action="getnumber" method="POST">
	    			<input type="number" name="guess" class="input is-primary" required <c:if test="${user.getSuccess() == 2}">disabled</c:if>/>
		    		<button class="button is-primary is-outlined" <c:if test="${user.getSuccess() == 2}">disabled</c:if>>Take a guess!</button>
				</form>
				<c:choose>
					<c:when test="${user.getSuccess() == -2}"></c:when>
					<c:when test="${user.getSuccess() == 0}">
						<div class="has-background-success box">
							<p class="is-size-4">Congratulations! the number was: <c:out value="${user.getNumber()}"></c:out>
							<form action="reset" method="POST">
								<button class="button is-link">Play Again</button>
							</form>
						</div>
					</c:when>
					<c:otherwise>
						<div class="has-background-danger box">
							<p class="is-size-4">
								<c:choose>
								<c:when test="${user.getSuccess() == 2 }">
									<p class="is-size-4">Too bad, you lost! the number was: <c:out value="${user.getNumber()}"></c:out>
									<form action="reset" method="POST">
										<button class="button is-link">Play Again</button>
									</form>
								</c:when>
								<c:when test="${user.getSuccess() == -1 }">Wrong, too low!</c:when>
								<c:otherwise>Wrong, too high!</c:otherwise>
								</c:choose>
							</p>
						</div>
					</c:otherwise>
				</c:choose>
				<!--<p>number: <c:out value="${user.getNumber()}"/></p>-->
				<p>tries: <c:out value="${user.getTries()}"></c:out></p>
				<p>last guess: <c:out value="${user.getGuess()}"/></p>
				<a id="settings-toggle">Advanced Settings</a>
				<form action="reset" method="POST" id="advanced-settings" style="display: none;">
					<label for="minNum">Minimum Value</label>
					<input type="number" id="minNum" placeholder="1" name="min"/>
					<label for="maxNum">Maximum Value</label>
					<input type="number" id="maxNum" placeholder="100" name="max"/>
					<button class="button is-link is-outlined">Submit!</button>
				</form>
				</div>
			</div>
		</div>
	</body>
</html>
