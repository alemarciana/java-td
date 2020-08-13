<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<t:bulmatemp>
	<jsp:attribute name="title">Dojo Survey Index</jsp:attribute>
	<jsp:attribute name="navTitle">Dojo Survey!</jsp:attribute>
	<jsp:body>
		<form action="/result" method="POST">
			<div class="level">
				<div class="level-item">
					<label for="name">Your Name:</label>
					<input name="name" required/>
				</div>
				<div class="level-item">
					<label for="location">Dojo Location:</label>
					<input name="location" required/>
				</div>
			</div>
			<div class="level">
				<div class="level-left"><div class="level-item">
					<label for="language">Favorite Language:</label>
					<div class="select">
						<select name="language">
							<option>Java</option>
							<option>Javascript</option>
							<option>Python</option>
							<option>C</option>
							<option>C++</option>
							<option>Scala</option>
							<option>Ruby</option>
						</select>
					</div>
				</div></div>
			</div>
			<div class="level">
				<div class="level-item">
					<label for="comment">Comment (optional)</label>
				</div>
				<div class="level-item">
					<textarea name="comment" class="textarea"></textarea>
				</div>
				<div class="level-item">
					<button class="button is-link" type="submit">Submit</button>
				</div>
			</div>
		</form>
	</jsp:body>
</t:bulmatemp>