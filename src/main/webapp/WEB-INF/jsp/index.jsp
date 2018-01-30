<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome page</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.6/cosmo/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<form:form action="personaInsert" method="post">
		<span>nombre de la persona:</span>
		<form:input type="text" path="name" />
		<input type="submit" value="Guardar nombre persona" />
	</form:form>
	<br />
	<br />
	El nombre de la persona es <span><c:out value="${persona.nombre}" /></span>
	<br />
	<br />
	<br />


	<form:form action="itemInsert" method="post">
		<span>nuevo item:</span>
		<form:input type="text" path="itemName" />
		<input type="submit" value="guardar item"/>
	</form:form>
	<table border="1">
		<thead>
			<tr>
				<td>Nombre del item</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${persona.items}">
				<tr>
					<td><c:out value="${item.nombre}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br />
	<br />
	<br />
	<br />
	<br /> 

</body>
</html>