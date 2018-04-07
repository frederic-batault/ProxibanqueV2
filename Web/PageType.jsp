<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="domaine.Client"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Client refClient = (Client) session.getAttribute("Client");
	%>
	<ul>
		<li>nom: <%=refClient.getNom()%>
		<li>prénom: <%=refClient.getPrenom()%>
		<li>age: <%=refClient.getAge()%>
		<li>n° conseiller: <%=refClient.getIdConseiller() %>
	</ul>
</body>
</html>