<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:bulmatemp>
	<jsp:attribute name="title">Add a player! - Team Roster</jsp:attribute>
	<jsp:attribute name="navTitle">Team Roster</jsp:attribute>
	<jsp:body>
		<div class="level">
			<div class="level-right">
				<div class="level-item">
					<h1 class="title">Add a player to team <c:out value="${team.getTeamName()}"></c:out></h1>
				</div>
			</div>
		</div>
		<form action="players?id=${param.id}" method="POST">
			<table class="table">
				<tbody>
					<tr>
						<td><label for="firstName">First Name: </label></td>
						<td><input type="text" name="firstName" required/></td>
					</tr>
					<tr>
						<td><label for="lastName">Last Name: </label></td>
						<td><input type="text" name="lastName" required/></td>
					</tr>
					<tr>
						<td><label for="age">Age:</label></td>
						<td><input type="number" name="age" required/></td>
					</tr>
				</tbody>
			</table>
			<button class="button">Add</button>
		</form>
	</jsp:body>
</t:bulmatemp>