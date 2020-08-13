<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<t:bulmatemp>
	<jsp:attribute name="title">Dashboard</jsp:attribute>
	<jsp:attribute name="navTitle">Languages Dashboard</jsp:attribute>
	<jsp:body>
		<table class="table is-fullwidth is-hoverable is-bordered is-striped">
			<thead>
				<tr>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${languages}" var="language">
					<tr>
						<td><a href="/languages/${language.getId()}">${language.getName()}</a></td>
						<td>${language.getCreator()}</td>
						<td>${language.getVersion()}</td>
						<td>
							<div class="level">
								<form:form action="/languages/${language.getId()}" method="put" class="level-item">
									<input type="submit" value="delete" class="button is-text"/>
								</form:form>
								<form:form action="/languages/${language.getId()}" class="level-item">
									<input type="submit" value="edit" class="button is-text"/>
								</form:form>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="section field">
			<form action="/languages" method="POST" id="lang">
				<div class="level"><label for="name" class="subtitle has-text-left">Name:</label>
				<input type="text" name="name"/></div>
				<div class="level"><label for="creator" class="subtitle has-text-left">Creator:</label>
				<input type="text" name="creator"/></div>
				<div class="level"><label for="version" class="subtitle has-text-left">Version:</label>
				<input type="text" name="version"/></div>
				<input type="submit" class="button is-pulled-right is-outlined is-primary" value="Submit"/>
			</form>
		</div>
	</jsp:body>
</t:bulmatemp>