<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<!-- Meta (dont la partie pour Bootstrap)-->
<meta charset="utf-8"></meta>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no"></meta>
<!-- liens CSS pour Bootstrap -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous"></link>
<!-- lien CSS maison -->
<link rel="stylesheet" href="css/cssMaison.css"></link>
<!-- liens JS pour Bootstrap -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
	integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
	integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
	crossorigin="anonymous"></script>
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
	<form method="POST" action="conseillerservlet">
		<button type="submit">Entrer</button>
	</form>

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