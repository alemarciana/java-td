<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib tagdir="/WEB-INF/tags" prefix="t"%>
<t:bulmatemp>
	<jsp:attribute name="title">${lang.getName()}</jsp:attribute>
	<jsp:attribute name="navTitle">Language: ${lang.getName()} info</jsp:attribute>
	<jsp:body>
		<a href="/languages" class="level level-item level-right is-size-4">Dashboard</a>
		<h1 class="title">${lang.getName()}</h1>
		<h2 class="subtitle">${lang.getCreator()}</h2>
		<p class="subtitle">${lang.getVersion()}</p>
	</jsp:body>
</t:bulmatemp>