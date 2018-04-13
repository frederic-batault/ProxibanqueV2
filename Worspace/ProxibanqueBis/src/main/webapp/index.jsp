<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
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
<title>ProxibanqueV2:Accueil</title>
</head>
<body>
	<div class="container-fluid">
		<div class="haut">
			<div class="row">
				<div class="col-md-2">
					<img src="images/logoSI.svg" alt="logo SI" height="100px"
						width="100px">
				</div>
				<div class="col-md-8">
					<div class="mx-auto">
						<h1>Proxibanque v2</h1>
					</div>
				</div>
				<div class="col-md-2">
					<img src="images/logoBanque.svg" alt="logo Proxibanque"
						height="100px" width="100px">
				</div>
			</div>
		</div>
	</div>
	<div class="milieu">
		<div class="row">
			<div class="col-md-12">
				<div class="mx-auto">
					<form method="POST" action="conseillerservlet">
						<div class="form-group">
							<label for="login">Sélectionner votre identifiant</label> <select
								class="form-control" id="login" name="login">
								<option>douglas.mbiandou</option>
								<option>frederic.pean</option>
								<option>nassur.mhoumad</option>
								<option>lotfi.azzouz</option>
							</select>
						</div>
						<div class="form-group">
							<label for="inputpassword">Entrez votre mot de passe</label> <input
								type="password" class="form-control" id="inputpassword"
								placeholder="Mot de passe" name="password">
						</div>
						<button type="submit" class="btn btn-primary">Entrer</button>
					</form>
				</div>
			</div>
			<div class="bas">
				<div class="row">
					<div class="col-md-12">
						<div class="mx-auto">
							<p>
								développé par <img src="images/GTM.png" alt="logo Proxibanque"
									height="30px">
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>