<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:bulmatemp>
	<jsp:attribute name="title">Create Team</jsp:attribute>
	<jsp:attribute name="navTitle">Team Roster</jsp:attribute>
	<jsp:body>
		<form action="teams" method="POST">
			<label for="name">Team Name:</label>
			<input type="text" name="name"/>
			<button class="button">Submit</button>
		</form>	
	</jsp:body>
</t:bulmatemp>