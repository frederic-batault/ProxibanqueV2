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
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Conseiller;
import service.ClientService;
import service.CompteService;
import service.ConseillerService;

/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/actionCourant")
public class CourantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CourantServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1-récupération des informations

		String somme = request.getParameter("somme");
		String credit = request.getParameter("creditCourant");
		String debit = request.getParameter("debitCourant");

		HttpSession refSession = request.getSession();
		CompteCourant refCompteCourant = (CompteCourant) refSession.getAttribute("Courant");
		CompteEpargne refCompteEpargne = (CompteEpargne) refSession.getAttribute("Epargne");

		// 2-appel de la méthode service
		CompteService refCompteService = new CompteService();
		if (credit.equals("true")) {
			boolean retour = refCompteService.credit(refCompteCourant, somme);
		} else {
			boolean retour = refCompteService.debit(refCompteCourant, somme);
		}
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
