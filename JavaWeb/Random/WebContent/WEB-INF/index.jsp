<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Random Word Generator</title>
<link rel="stylesheet"
	href="resources/bulmaswatch.min.css">
</head>
<body>
	<div id="container" class="is-centered columns">
		<aside class="menu column is-2" style="padding: 1% !important;">
			<p class="menu-label">Projects / Assignments</p>
			<ul class="menu-list">
				<li><a>APIs / Ajax</a>
					<ul>
						<li><a
							href="https://github.com/angeelgod/java-td/tree/master/apis_ajax/pokemon">Pokemon
								Sprites</a></li>
						<li><a
							href="https://github.com/angeelgod/java-td/tree/master/apis_ajax/dex">PokeDex</a></li>
						<li><a
							href="https://github.com/angeelgod/java-td/tree/master/apis_ajax/weather/">Weather
								Forecast</a></li>
						<li><a
							href="https://github.com/angeelgod/java-td/tree/master/apis_ajax/got">Game
								of Thrones</a></li>
					</ul></li>
				<li><a>MySQL</a></li>
				<li><a>Java</a>
					<ul>
						<li><a href="/PetIntelligence/Home">PetIntelligence</a></li>
						<li><a href="/ButtonClicker/Count">Button
								Clicker</a></li>
						<li><a href="/Random/Random"class="is-active">Random Words</a></li>
						<li><a href="/GreatNumberGame/game">Great Number Game</a></li>
					</ul></li>
			</ul>
		</aside>
		<div class="is-10 has-text-centered container column"
			style="padding: 1 !important">
			<nav class="navbar is-primary" role="navigation"
				style="position: sticky !important;">
				<div class="navbar-start">
					<p class="navbar-item title">Button Clicker</p>
				</div>
				<div class="navbar-end">
					<a class="navbar-item" href="https://github.com/angeelgod/java-td"
						target="_blank">GitHub Repo</a> <a href="https://bulma.io"
						class="navbar-item" target="_blank"> <img
						src="https://bulma.io/images/made-with-bulma--white.png"
						alt="Made with Bulma" width="128" height="24">
					</a>
				</div>
			</nav>
			<div class="section">
				<form action="GetWord">
					<h2 class="is-size-4">
						You have generated a word
						<c:out value="${user.getClicks()}" />
						times
					</h2>
					<h3 class="is-size-2">
						Word:
						<c:out value="${user.getWord()}" />
					</h3>
					<button class="button is-primary is-outlined" type="submit">Generate</button>
				</form>
				<h3 class="is-size-4">
					The last time you generated a word was
					<c:out value="${user.getLastDate()}" />
				</h3>
			</div>
		</div>
	</div>
</body>
</html>