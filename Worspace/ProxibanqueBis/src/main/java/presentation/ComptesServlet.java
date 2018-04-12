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
@WebServlet("/comptes")
public class ComptesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ComptesServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		int idClient = Integer.parseInt(request.getParameter("clientC")) ;
		ClientService refClientService = new ClientService();
		Client refClient = refClientService.lectureService(idClient);
		HttpSession refSession = request.getSession();
		refSession.setAttribute("clientC", refClient);
		
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("Comptes.jsp");
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
