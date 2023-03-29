<%@page import="org.mql.biblio.models.Author"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="../css/styles.css" rel="stylesheet">
</head>
<body>
	<h1>${title}</h1>
	<%
		List<Author> authors = (List<Author>) request.getAttribute("authors");
	%>
	<table class="data-table">
		<thead>
			<tr>
				<td>Id</td>
				<td>Nom de l'auteur</td>
				<td>Année</td>
			</tr>
		</thead>
		<tbody>
			<%
				for (Author a : authors) {
			%>
			<tr>
				<td><%=a.getId()%></td>
				<td><%=a.getName()%></td>
				<td><%=a.getYearBorn()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>