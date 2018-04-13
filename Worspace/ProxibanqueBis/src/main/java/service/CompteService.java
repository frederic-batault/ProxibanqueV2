package service;

import java.util.List;

import dao.ClientDao;
import dao.CompteDao;
import domaine.Client;
import domaine.ClientCompte;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
/**
 * @author HEDI I., BATAULT F.
 *
 */
/**
 * Classe qui permet de faire le lien entre la dao et la couche presentation
 */
public class CompteService {

	// LECTURE DE TOUS LECTURE DE TOUS LES COMPTE
	/**
	 * @param idConseiller
	 * @return
	 * Methode qui permet de recupere le liste des client rattacher à un conseiller
	 */
	public List<ClientCompte> getAllService(int idConseiller) {
		CompteDao refdao = new CompteDao();
		List<ClientCompte> liste = refdao.getAll(idConseiller);
		return liste;
	}

	// METHODE POUR UPDATE
	/**
	 * @param refCompte
	 * @return
	 * methode qui permet la modification d'un client et qui renvoie les nouvelle info
	 */
	public Compte modificationService(Compte refCompte) {
		CompteDao refdao = new CompteDao();
		Compte refCompte2 = refdao.modificationCompte(refCompte);
		return refCompte2;
	}

	// METHODE pour LIRE compte Courant
	/**
	 * @param idClient
	 * @return
	 * methode qui permet de recupere les informations d'un compte courant r'attacher à un client
	 */
	
	public CompteCourant lectureCourant(int idClient) {
		CompteDao refdao = new CompteDao();
		CompteCourant refCompte = refdao.lectureCompteCourant(idClient);
		return refCompte;
	}
	// METHODE pour LIRE compte Courant
		/**
		 * @param idClient
		 * @return
		 * methode qui permet de recupere les informations d'un compte epargne r'attacher à un client
		 */
		public CompteEpargne lectureEpargne(int idClient) {
			CompteDao refdao = new CompteDao();
			CompteEpargne refCompte = refdao.lectureCompteEpargne(idClient);
			return refCompte;
		}

	// METHODE POUR DELETE
		
		/**
		 * @param refCompte
		 * @return
		 * methode qui permet la suppression d'un compte
		 */
		public boolean suppressionService(Compte refCompte) {
		CompteDao refdao = new CompteDao();
		boolean temoin = refdao.suppressionCompte(refCompte);
		return temoin;
	}

	 // méthode pour CREATE
	/**
	 * @param refCompte
	 * @return
	 * methode qui permet de creer un compte 
	 */
	public Compte creationService(Compte refCompte) {
	 CompteDao refdao = new CompteDao();
	 refdao.creationCompte(refCompte);
	 return refCompte;
	
	 }

}
