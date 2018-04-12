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
import service.ConseillerService;

/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/conseillerservlet")
public class ConseillerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConseillerServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1 récupération de l'ID du conseiller connecté
		int idConseiller = 1;

		// 2-Utilisation des informations instanciation de la classe service
		ConseillerService refConseillerService = new ConseillerService();

		// appel de la méthode

		List<Client> refListe = refConseillerService.getAll(idConseiller);

		// affiche la page du conseiller (avec la liste de ses clients)
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("Conseiller.jsp");
		dispatcher.forward(request, response);

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
