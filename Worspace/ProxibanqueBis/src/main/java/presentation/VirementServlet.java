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
import domaine.Conseiller;
import service.ClientService;
import service.CompteService;
@WebServlet("/virement")
/**
 * Servlet implementation class ComptesServlet
 */
public class VirementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VirementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ClientService refClientService = new ClientService();
//		Client refClient = refClientService.lectureService(idClient);
		HttpSession refSession = request.getSession();
//		refSession.setAttribute("clientVirement", refClient);
		Conseiller refConseiller = (Conseiller) refSession.getAttribute("conseiller");
		int idConseiller = refConseiller.getIdConseiller();


		
		ClientCompte refClientCompte = new ClientCompte();
		CompteService refCompteService = new CompteService();
		List<ClientCompte> refListe = refCompteService.getAllService(idConseiller);
		System.out.println("LISSSSSSSSSSSSSSSSSSSSSTE : " +refListe);
		refSession.setAttribute("listeClients", refListe);
		
		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher("Virement.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
