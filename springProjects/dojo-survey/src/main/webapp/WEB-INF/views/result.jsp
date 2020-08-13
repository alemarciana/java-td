<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:bulmatemp>
	<jsp:attribute name="title">Dojo Survey Results</jsp:attribute>
	<jsp:attribute name="navTitle">Dojo Survey!</jsp:attribute>
	<jsp:body>
		<article class="message">
			<h1 class="title message-header">Submitted Info:</h1>
			<div class="message-body pl-6 pr-6">
				<div class="level">
					<p class="level-left level-item">Name:</p>
					<p class="level-right level-item">${name}</p>
				</div>
				<div class="level">
					<p class="level-left level-item">Location:</p>
					<p class="level-right level-item">${location}</p>
				</div>
				<div class="level">
					<p class="level-left level-item">Language:</p>
					<p class="level-right level-item">${language}</p>
				</div>
				<div class="level">
					<p class="level-left level-item">Comment:</p>
					<p class="level-right level-item">${comment}</p>
				</div>
			</div>
		</article>
	</jsp:body>
</t:bulmatemp>