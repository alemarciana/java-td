<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="UTF-8">
		<title>PetIntelligence</title>
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
			<div class="columns level">
				<form action="Dogs" id="dog_form" class="column tile is-half is-vertical level-left">
					<h2 class="is-size-3">Crea un perro</h2>
					<label class="level-item" for="name">Nombre: </label>
					<input class="level-item input is-primary" type="text" id="name" name="name"/>
					<label class="level-item" for="breed">Raza: </label>
					<input class="level-item input is-primary" type="text" id="breed" name="breed"/>
					<label class="level-item" for="weight">Peso: </label>
					<input class="level-item input is-primary" type="number" id="weight" name="weight"/>
					<input class="level-item button is-outlined is-primary" value="Crear Perro" type="submit">
				</form>
				<form action="Cats" id="cat_form" class="column tile is-vertical level-right">
					<h2 class="is-size-3">Crea un gato</h2>
					<label class="level-item" for="name">Nombre: </label>
					<input class="level-item input is-info" type="text" id="name" name="name"/>
					<label class="level-item" for="breed">Raza: </label>
					<input class="level-item input is-info" type="text" id="breed" name="breed"/>
					<label class="level-item" for="weight">Peso: </label>
					<input class="level-item input is-info" type="number" id="weight" name="weight"/>
					<input class="level-item button is-outlined is-info" value="Crear Gato" type="submit">
				</form>
			</div>
		</div>
	</body>
</html>