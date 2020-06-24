<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="UTF-8">
		<title>Tu nuevo gato esta aqui!</title>
		<link rel="stylesheet" href="resources/bulmaswatch.min.css"/>		
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
							<li><a href="#" class="is-active">PetIntelligence</a></li>
							<li><a href="#">Button Clicker</a></li>
							<li><a href="#">Random Words</a></li>
							<li><a href="/GreatNumberGame/game">Great Number Game</a></li>
						</ul>
					</li>
				</ul>
			</aside>
			<div class="is-10 column container">
				<nav class="navbar is-primary" style="position:sticky;">
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
				<div class="columns level section">				
					<c:choose>
						<c:when test='${cat.getName().toLowerCase().equals("smudge")}'>
							<h1 class="is-size-2">Smudge loves you! He doesn't seem to feel the same about vegetables tho</h1>
							<figure class="image">
								<img alt="Smudge loves you" src="resources/smudge.jpg"/>
							</figure>
						</c:when>
						<c:when test='${cat.getName().toLowerCase().equals("ron")}'>
							<h1 class="is-size-2">Ron tries to hypnotize you!, but he was too focused on food to do anything</h1>
							<figure class="image">
								<img alt="Ron UwU" src="resources/ron.png"/>
							</figure>
						</c:when>
						<c:otherwise>				
							<h1 class="is-size-2"><c:out value="${cat.showAffection()}"/></h1>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</body>
</html>