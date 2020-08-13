<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="UTF-8">
		<title>PetIntelligence</title>
		<!--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.2/css/bulma.min.css"/>-->
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
							<li><a href="/PetIntelligence/Home" class="is-active">PetIntelligence</a></li>
							<li><a href="/ButtonClicker/Count">Button Clicker</a></li>
							<li><a href="/Random/Random">Random Words</a></li>
							<li><a href="GreatNumberGame/game">Great Number Game</a></li>
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
					<form action="Dogs" id="dog_form" class="column tile is-half is-vertical level-left">
						<h2 class="is-size-3">Crea un perro</h2>
						<label class="level-item" for="name">Nombre: </label>
						<input class="level-item input is-primary" type="text" id="name" name="name" required/>
						<label class="level-item" for="breed">Raza: </label>
						<input class="level-item input is-primary" type="text" id="breed" name="breed" required/>
						<label class="level-item" for="weight">Peso: </label>
						<input class="level-item input is-primary" type="number" id="weight" name="weight" required/>
						<input class="level-item button is-outlined is-primary" value="Crear Perro" type="submit">
					</form>
					<form action="Cats" id="cat_form" class="column tile is-vertical level-right">
						<h2 class="is-size-3">Crea un gato</h2>
						<label class="level-item" for="name">Nombre: </label>
						<input class="level-item input is-info" type="text" id="name" name="name" required/>
						<label class="level-item" for="breed">Raza: </label>
						<input class="level-item input is-info" type="text" id="breed" name="breed" required/>
						<label class="level-item" for="weight">Peso: </label>
						<input class="level-item input is-info" type="number" id="weight" name="weight" required/>
						<input class="level-item button is-outlined is-info" value="Crear Gato" type="submit">
					</form>
				</div>
			</div>
		</div>
	</body>
</html>