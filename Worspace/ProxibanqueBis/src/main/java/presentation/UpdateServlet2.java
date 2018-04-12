package presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domaine.Client;
import domaine.Conseiller;
import service.ClientService;
import service.ConseillerService;

/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/modifier")
public class UpdateServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet2() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1-récupération des informations modifiées

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String codePostal = request.getParameter("code");
		String ville = request.getParameter("ville");
		String email = request.getParameter("mail");

		// 2-récupération des anciennes valeurs
		HttpSession refSession = request.getSession();
		Client ancienClient = (Client) refSession.getAttribute();
		String ancienNom = ancienClient.getNom();
		String ancienPrenom = ancienClient.getPrenom();
		String ancienAdresse = ancienClient.getAdresse();
		String ancienCodePostal = ancienClient.getCodePostale();
		String ancienVille = ancienClient.getVille();
		String ancienEmail = ancienClient.getEmail();
		int ancienIdClient = ancienClient.getIdClient();
		int ancienIdConseiller = ancienClient.getIdConseiller();

		// 3-test si le champ veut être modifié : si oui-> nouvelle valeur = valeur
		// entrée, ni non ->
		// nouvelle valeur = ancienne valeur
		if (nom.equals("")) {
			String nouveauNom = ancienNom;
		} else {
			String nouveauNom = nom;
		}
		if (prenom.equals("")) {
			String nouveauPrenom = ancienPrenom;
		} else {
			String nouveauPrenom = prenom;
		}
		if (adresse.equals("")) {
			String nouveauAdresse = ancienAdresse;
		} else {
			String nouveauAdresse = adresse;
		}
		if (codePostal.equals("")) {
			String nouveauCodePostal = ancienCodePostal;
		} else {
			String nouveauCodePostal = codePostal;
		}
		if (ville.equals("")) {
			String nouveauVille = ancienVille;
		} else {
			String nouveauVille = ville;
		}
		if (email.equals("")) {
			String nouveauEmail = ancienEmail;
		} else {
			String nouveauEmail = email;
		}
		int nouveauIdClient = ancienIdClient;
		int nouveauIdConseiller = ancienIdConseiller;

		// 4-construction d'un ouvel objet avec les nouvelles valeurs
		Client nouveauClient = new Client(nouveauIdClient, nouveauIdConseiller, nouveauNom, nouveauPrenom,
				nouveauAdresse, nouveauCodePostal, nouveauVille, nouveauEmail);
		
		// 5-appel de la méthode service 
		ClientService refClientService = new ClientService();
		Client clientEnBase = refClientService.updateService(nouveauClient);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
