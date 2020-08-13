<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:bulmatemp>
	<jsp:attribute name="title">Ninja Gold Game</jsp:attribute>
	<jsp:attribute name="navTitle">Ninja Gold Game</jsp:attribute>
	<jsp:body>
	<div class="level">
		<p class="level-left level-item title">Your Gold: ${user.getGold()}</p>
	</div>
	<div class="tile is-ancestor">
		<div class="tile is-parent">
			<div class="tile is-child box has-background-primary">
				<h1 class="title">Farm</h1>
				<p>(earns 10-20 gold)</p>
				<form action="farm" method="POST">
					<input value="Get Gold!" type="submit" class="button is-outlined is-link"/>
				</form>
			</div>
		</div>
		<div class="tile is-parent">
			<div class="tile is-child box has-background-primary">
				<h1 class="title">Cave</h1>
				<p>(earns 5-10 gold)</p>
				<form action="cave" method="POST">
					<input value="Get Gold!" type="submit" class="button is-outlined is-link"/>
				</form>
			</div>
		</div>
		<div class="tile is-parent">
			<div class="tile is-child box has-background-primary">
				<h1 class="title">House</h1>
				<p>(earns 2-5 gold)</p>
				<form action="house" method="POST">
					<input value="Get Gold!" type="submit" class="button is-outlined is-link"/>
				</form>
			</div>
		</div>
		<div class="tile is-parent">
			<div class="tile is-child box has-background-primary">
				<h1 class="title">Casino!</h1>
				<p>(earns/takes 0-50)</p>
				<form action="casino" method="POST">
					<input value="Get Gold!" type="submit" class="button is-outlined is-danger"/>
				</form>
			</div>
		</div>
	</div>
	<article class="message">
		<div class="message-body">
			<c:forEach items="${user.getLogs()}" var="log">
				${log}
			</c:forEach>
		</div>
	</article>
	</jsp:body>
</t:bulmatemp>