<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="domaine.Client"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<!-- Meta -->
<meta charset="utf-8"></meta>
<!-- lien CSS maison -->
<!--  <link rel="stylesheet" href="css/cssMaison2.css">-->

<!-- Titre de la page -->
<title>ProxibanqueV2: Modification client</title>
</head>
<body>
	<%
		Client refClient = (Client) session.getAttribute("clientU");
	%>
	<div class=container>
		<div class="logo1">
			<img src="images/logoSI.svg" alt="logo SI" height="100px"
				width="100px">
		</div>
		<div class="logo2">
			<img src="images/logoBanque.svg" alt="logo Banque" height="100px"
				width="100px">
		</div>
		<div class="titre">
			<h1>Modification client</h1>
		</div>
		<div>
			<h1>
				Client :
				<%=refClient.getPrenom()%>
				<%=refClient.getNom()%></h1>
		</div>
		<form method="POST" action="modifier">
			<div class="form-group row">
				<label for="nom" class="col-2 col-form-label">Nom</label>
				<div class="col-10">
					<input class="form-control" type="text"
						value=<%=refClient.getNom()%> id="nom">
				</div>
				<button type="submit" class="btn btn-primary">Modifier</button>
		</form>
		<div class="bas">
			<p>
				Cr�� par <img src="images/GTM.png" alt="logo GT'M" height="30px">
			</p>
		</div>
	</div>
</body>
</html>