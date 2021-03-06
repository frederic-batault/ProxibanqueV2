<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="domaine.Client"%>
<%@ page import="domaine.ClientCompte"%>
<%@ page import="domaine.CompteEpargne"%>
<%@ page import="domaine.CompteCourant"%>
<%@ page import="domaine.Compte"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<!-- Meta (dont la partie pour Bootstrap)-->
<meta charset="utf-8"></meta>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- liens CSS pour Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<!-- lien CSS maison -->
<link rel="stylesheet" href="css/cssMaison.css"></link>
<!-- liens JS pour Bootstrap -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<!-- Titre de la page -->
<title>ProxibanqueV2: Virement</title>
</head>
<body>
	<%
		Client refClient = (Client) session.getAttribute("clientVirement");
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
			<h1>Virement</h1>
		</div>
		<p>Comptes disponibles pour un virement</p>

		<div class="row text-center">
			<table class="table  table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nom du client</th>
						<th>Prenom du client</th>
						<th>solde</th>

					</tr>
				</thead>
				<tbody>

					<c:forEach items="${listeClients}" var="lesComptes">

						<tr>
							<td><c:out value="${lesComptes.idCompte}" /></td>
							<td><c:out value="${lesComptes.nom}" /></td>
							<td><c:out value="${lesComptes.prenom}" /></td>
							<td><c:out value="${lesComptes.soldes}" /></td>


						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<div class="row">
			<div class="col-lg-6"></div>
			<form method="POST" action="virement2">
				<p>
					<label>n� du compte � d�biter : </label> <input
						class="form-control" type="text" id="compte1" name="idCompteDebit">
				</p>
				<p>
					<label>n� du compte � d�biter : </label> <input
						class="form-control" type="text" id="compte2"
						name="idCompteCredit">
				</p>
				<p>
					<label>Somme � virer : </label> <input class="form-control"
						type="text" id="somme" name="somme">
				</p>

				<button type="submit" class="btn btn-primary">R�aliser le
					virement</button>

			</form>
		</div>
	</div>
	<nav>
		<a href="index.jsp">Retour � l'accueil</a>
	</nav>
	<nav>
		<a href="Conseiller.jsp">Retour � votre liste de clients</a>
	</nav>

	<div class="bas">
		<p>
			Cr�� par <img src="images/GTM.png" alt="logo GT'M" height="30px">
		</p>
	</div>
	</div>
</body>
</html>