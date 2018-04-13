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
import domaine.ClientCompte;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import service.ClientService;
import service.CompteService;
@WebServlet("/comptes")
/**
 * Servlet implementation class ComptesServlet
 */
public class ComptesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComptesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idClient = Integer.parseInt(request.getParameter("clientC"));
		ClientService refClientService = new ClientService();
		Client refClient = refClientService.lectureService(idClient);
		HttpSession refSession = request.getSession();
		refSession.setAttribute("clientCompte", refClient);

		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("Comptes.jsp");
		dispatcher.forward(request, response);

		CompteService refCompteService = new CompteService();
		List<ClientCompte> refListe = refCompteService.getAllService(idClient);
		CompteCourant refCompteCourant = refCompteService.lectureCourant(idClient);
		CompteEpargne refCompteEpargne = refCompteService.lectureEpargne(idClient);
		refSession.setAttribute("Courant", refCompteCourant);
		refSession.setAttribute("Epargne", refCompteEpargne);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
