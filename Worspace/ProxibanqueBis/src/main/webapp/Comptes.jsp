<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="domaine.Client"%>
<%@ page import="domaine.CompteEpargne"%>
<%@ page import="domaine.CompteCourant"%>
<%@ page import="domaine.Compte"%>
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
<title>ProxibanqueV2: Comptes du client</title>
</head>
<body>
	<%
		Client refClient = (Client) session.getAttribute("clientCompte");
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
			<h1>
				Comptes du client<%=refClient.getPrenom()%>
				<%=refClient.getNom()%></h1>
				<% HttpSession refSession = request.getSession();
				CompteCourant refCompteCourant=(CompteCourant)refSession.getAttribute("Courant");
				
				CompteEpargne refCompteEpargne=(CompteEpargne)refSession.getAttribute("Epargne");%>
		
		</div>
		<div class="row">
			<div class="col-lg-6">

				<h2>Compte courant</h2>
				<h3>
					Solde:
					<%=refCompteCourant.getSoldes()%>
					euros
				</h3>

				<form method="POST" action="actionCourant">
					<h1>D�bit/Cr�dit</h1>
					<label for="somme" class="col-2 col-form-label">Somme</label> <input
						class="form-control" type="text" id="nom" name="somme">

					<div class="form-check">
						<input class="form-check-input" type="radio" name="creditCourant"
							id="Radios1" value="option1" checked> <label
							class="form-check-label" for="Radios1"> Credit </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="debitCourant"
							id="Radios2" value="option2"> <label
							class="form-check-label" for="Radios2"> D�biter </label>
					</div>
					<button type="submit" class="btn btn-primary">Appliquer</button>


				</form>
			</div>
			<div class="col-lg-6">
				<h2>Compte �pargne</h2>
				<h3>
					Solde:
					<%=refCompteEpargne.getSoldes()%>
					euros
				</h3>

				<form method="POST" action="actionEpargne">
					<h1>D�bit/Cr�dit</h1>
					<label for="somme" class="col-2 col-form-label">Somme</label> <input
						class="form-control" type="text" id="nom" name="somme">

					<div class="form-check">
						<input class="form-check-input" type="radio" name="creditEpargne"
							id="Radios1" value="option1" checked> <label
							class="form-check-label" for="Radios1"> Credit </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="debitEpargne"
							id="Radios2" value="option2"> <label
							class="form-check-label" for="Radios2"> D�biter </label>
					</div>
					<button type="submit" class="btn btn-primary">Appliquer</button>


				</form>
			</div>
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