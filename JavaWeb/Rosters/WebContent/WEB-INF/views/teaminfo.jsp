<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:bulmatemp>
	<jsp:attribute name="title">Team Info</jsp:attribute>
	<jsp:attribute name="navTitle">Team Roster</jsp:attribute>
	<jsp:body>
		<div class="level">
			<div class="level-left">
				<div class="level-item"><h1 class="title">${team.getTeamName()}</h1></div>
			</div>
			<div class="level-right">
				<div class="level-item"><a href='players?id=${param.id}' class="subtitle">New Player</a></div>
			</div>
		</div>
		<table class="table is-fullwidth is-bordered">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${roster.getTeams().get(param.id).getPlayers()}" var="player" varStatus="num">
					<tr>
						<td><c:out value="${player.getFirstName()}"></c:out></td>
						<td><c:out value="${player.getLastName()}"></c:out></td>
						<td><c:out value="${player.getAge()}"></c:out></td>
						<td><a href="removeplayer?teamId=${param.id}&playerId=${num.index}">Remove</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</jsp:body>
</t:bulmatemp>