<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<t:bulmatemp>
	<jsp:attribute name="title">Edit Language</jsp:attribute>
	<jsp:attribute name="navTitle">Languages</jsp:attribute>
	<jsp:body>
			<div class="level">
				<a href="#" class="level-item level-right">Delete </a>
				<a href="/languages" class="level-item level-right">Dashboard</a>
			</div>
			<!--<form:form action="/languages/${lang.getId()}" method="POST" modelAttribute="lang">
				<input type="hidden" name="_method" value="put">
				<div class="level"><label for="name" class="subtitle has-text-left">Name:</label>
				<input type="text" name="name" value="${lang.getName()}"/></div>
				<div class="level"><label for="creator" class="subtitle has-text-left">Creator:</label>
				<input type="text" name="creator" value="${lang.getCreator()}"/></div>
				<div class="level"><label for="version" class="subtitle has-text-left">Version:</label>
				<input type="text" name="version" value="${lang.getVersion()}"/></div>
				<input type="submit" class="button is-pulled-right is-outlined is-primary" value="Submit"/>
			</form:form>-->
			<form:form action="/languages/${lang.id}" method="put"
		modelAttribute="lang" class="form">
		<p class="level">
			<form:label path="name" class="subtitle has-text-left">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p class="level">
			<form:label path="creator" class="subtitle has-text-left">Creator</form:label>
			<form:errors path="creator" />
			<form:input path="creator" />
		</p>
		<p class="level">
			<form:label path="version" class="subtitle has-text-left">Version</form:label>
			<form:errors path="version" />
			<form:input path="version" />
		</p>
		<input type="submit" value="Submit" class="button is-pulled-right is-outlined is-primary"/>
	</form:form>
	</jsp:body>
</t:bulmatemp>