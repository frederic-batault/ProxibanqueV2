package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConnexionServlet
 */
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@WebServlet("connexion")

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnexionServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1-récupération du login et du password entrés sur la page index
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		// 2-Utilisation des informations
		// instanciation d ela classe service
		ConseillerService refConseillerService = new ConseillerService();
		// appel de la méthode d'authentification
		boolean autorisation = refConseillerService.authentification(login, password);

		RequestDispatcher dispatcher;

		if (autorisation == true) {
			// appel de la méthode lecture et récupération des propriétés
			Conseiller refConseiller = refConseillerService.lecture(login);

			// mise en session du conseiller
			HttpSession refSession = request.getSession();
			refSession.setAttribute("conseiller", refConseiller);

			getServletContext().getRequestDispatcher("Conseiller.jsp").forward(request, response);
		} else {
			getServletContext().getRequestDispatcher("EchecConnexion.jsp").forward(request, response);
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
