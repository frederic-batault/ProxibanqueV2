package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domaine.Conseiller;
import service.ConseillerService;


/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/conseillerservlet")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		
		// 2-Utilisation des informations instanciation d ela classe service
		ConseillerService refConseillerService = new ConseillerService();
		
		// appel de la méthode d'authentification
		//boolean autorisation = refConseillerService.authentification(login, password);
		boolean autorisation;	
		
		autorisation= refConseillerService.authentification(login, password);
	
		
		if (autorisation == true) {
			Conseiller refConseiller = refConseillerService.lecture(login);
			HttpSession refSession = request.getSession();
			refSession.setAttribute("conseiller", refConseiller);
			RequestDispatcher dispatcher;			
			
			dispatcher=request.getRequestDispatcher("Conseiller.jsp");
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher=request.getRequestDispatcher("EchecConnexion.jsp");
			dispatcher.forward(request, response);
			
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
