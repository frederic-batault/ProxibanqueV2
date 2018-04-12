<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<<<<<<< HEAD
<%@ page import="domaine.Conseiller"%>
=======
<%@ page import="java.util.Date"%>
>>>>>>> 60281080e3e5d97d051226a5cbc5bb30500b8de1
<!DOCTYPE html>
<html lang="fr">
<head>
<!-- Meta -->
<meta charset="utf-8"></meta>
<!-- lien CSS maison -->
<link rel="stylesheet" href="css/cssMaison2.css">

<!-- Titre de la page -->
<title>ProxibanqueV2:Echec connexion</title>
</head>
<body>
<<<<<<< HEAD
	<%
		Conseiller refConseiller = (Conseiller) session.getAttribute("conseiller");
	%>
=======
>>>>>>> 60281080e3e5d97d051226a5cbc5bb30500b8de1
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
<<<<<<< HEAD
			<h1>
				Espace conseiller de
				<%=refConseiller.getPrenom()%>
				<%=refConseiller.getNom()%></h1>


			<p>Sélectionner un client, puis une des actions suivantes</p>
			<form>
				<div class="form-group row">
					<label for="client" class="col-2 col-form-label">Client : </label>
					<div class="col-8">
						<input class="form-control" type="text" id="client" name="client">
					</div>
					<div class="col-2">
						<button type="submit" class="btn btn-primary">Valider</button>
					</div>
				</div>

			</form>

			<a class="btn btn-primary" href="Edition.jsp" role="button">Mettre
				à jour</a> <a class="btn btn-primary" href="Comptes.jsp" role="button">Afficher
				comptes</a> <a class="btn btn-primary" href="Virement.jsp" role="button">Virement</a>
=======
>>>>>>> 60281080e3e5d97d051226a5cbc5bb30500b8de1

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