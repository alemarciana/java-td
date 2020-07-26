<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:bulmatemp>
	<jsp:attribute name="title">Team Roster</jsp:attribute>
	<jsp:attribute name="navTitle">Team Roster</jsp:attribute>
	<jsp:body>		
		<div class="level">
			<div class="level-left">
				<div class="level-item"><h1 class="title">Prototype Roster</h1></div>
			</div>
			<div class="level-right">
				<div class="level-item"><a href="teams" class="subtitle">New Team</a></div>
			</div>
		</div>			
		<table class="table is-fullwidth is-bordered">
			<thead>
				<tr>
					<th>Team</th>
					<th>Players</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${roster.getTeams()}" var="team" varStatus="num">
					<tr>
						<td><c:out value="${team.getTeamName()}"></c:out></td>
						<td><c:out value="${team.getNumOfPlayers()}"></c:out></td>
						<td>
							<div class="level">
								<div class="level-left level-item"><a href="teams?id=${num.index}">Details</a></div>
								<div class="level-item"><a href="removeteam?id=${num.index}">Remove</a></div>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</jsp:body>
</t:bulmatemp>