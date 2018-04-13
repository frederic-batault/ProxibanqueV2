<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="domaine.Conseiller"%>

<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="fr">
<head>
<!-- Meta -->
<meta charset="utf-8"></meta>
<!-- lien CSS maison -->
<!--<link rel="stylesheet" href="css/cssMaison2.css">-->

<!-- Titre de la page -->
<title>ProxibanqueV2:Espace conseiller</title>
</head>
<body>

	<%
		Conseiller refConseiller = (Conseiller) session.getAttribute("conseiller");
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
			<h1>Connexion réussie</h1>
		</div>
		<div class="centre">

			<h1>
				Espace conseiller de
				<%=refConseiller.getPrenom()%>
				<%=refConseiller.getNom()%></h1>


			<p>Sélectionner un client, puis une des actions suivantes</p>

			<div class="row text-center">
				<table class="table  table-striped">
					<thead>
						<tr>
							<th>ID</th>
							<th>Nom</th>
							<th>Prenom</th>
							<th>email</th>
							<th>Adresse</th>
							<th>CodePostale</th>
							<th>Ville</th>
							<th>idConseiller</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${listeClients}" var="lesClients">

							<tr>
								<td><c:out value="${lesClients.idClient}" /></td>
								<td><c:out value="${lesClients.nom}" /></td>
								<td><c:out value="${lesClients.prenom}" /></td>
								<td><c:out value="${lesClients.email}" /></td>
								<td><c:out value="${lesClients.adresse}" /></td>
								<td><c:out value="${lesClients.codePostale}" /></td>
								<td><c:out value="${lesClients.ville}" /></td>
								<td><c:out value="${lesClients.idConseiller}" /></td>

							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<form method="POST" action="update">
				<p>
					<label>n° de client : </label> <input class="form-control" type="text" id="client"
						name="clientU">

					<button type="submit" class="btn btn-primary">Mettre à
						jour</button>

				</p>

			</form>

			<form method="POST" action="comptes">
				<p>
					<label for="client" class="col-4 col-form-label">n° de
						client : </label> <input class="form-control" type="text" id="client"
						name="clientC">

					<button type="submit" class="btn btn-primary">Comptes</button>
				</p>

			</form>
			<form method="POST" action="virement">
				<p>
					

					<button type="submit" class="btn btn-primary">Virement</button>
				</p>

			</form>
			<!-- affichage de la liste des clients -->
			<!-- écriture de la liste dans la session -->



			<nav>
				<a href="index.jsp">Retour</a>
			</nav>
		</div>
		<div class="bas">
			<p>
				Créé par <img src="images/GTM.png" alt="logo GT'M" height="30px">
			</p>
		</div>
	</div>
</body>
</html>