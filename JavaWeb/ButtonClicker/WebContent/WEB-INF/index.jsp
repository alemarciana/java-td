<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ButtonClicker!</title>
		<link rel="stylesheet" href="resources/bulmaswatch.min.css">
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
							<li><a href="/ButtonClicker/Count" class="is-active">Button Clicker</a></li>
							<li><a href="/Random/Random">Random Words</a></li>
							<li><a href="/GreatNumberGame/game">Great Number Game</a></li>
						</ul>
					</li>
				</ul>
			</aside>
			<div class="is-10 has-text-centered container column" style="padding:1!important">
				<nav class="navbar is-primary" role="navigation" style="position: sticky !important;">
					<div class="navbar-start">
						<p class="navbar-item title">Button Clicker</p>
					</div>
					<div class="navbar-end">
						<a class="navbar-item" href="https://github.com/angeelgod/java-td" target="_blank">GitHub Repo</a>
						<a href="https://bulma.io" class="navbar-item" target="_blank">
							<img src="https://bulma.io/images/made-with-bulma--white.png" alt="Made with Bulma" width="128" height="24">
						</a>
					</div>
				</nav>
				<div class="section">				
					<form action="AddClick">
						<button class="button is-primary is-outlined" type="submit">Click!</button>
					</form>
					<h1 class="title is-centered">Haz hecho click en este boton <c:out value="${user.getClicks()}" /> veces</h1>
				</div>
			</div>
		</div>
	</body>
</html>