package service;

import java.util.List;

import dao.ClientDao;
import domaine.Client;

/**
 * @author HEDI I., BATAULT F.
 *
 */
/**
 * Classe qui permet de faire le lien entre la dao et la couche presentation
 */
public class ClientService {
	
	/**
	 * @param idConseiller
	 * @return
	 * methode qui liste tous les client rattacher à un conseiller client
	 */
	public List<Client> getAllService(int idConseiller) {
		ClientDao refdao = new ClientDao();
		List<Client> liste = refdao.getAll(idConseiller);
		return liste;
	}
	
	// METHODE POUR UPDATE
		/**
		 * @param refClient
		 * @return
		 * Methode qui permet  de modification les information du client
		 */
		public Client modificationService(Client refClient) {
			ClientDao refdao = new ClientDao();
			Client refClient2 = refdao.modificationClient(refClient);
			return refClient2;
		}

		// METHODE POUR DELETE
		/**
		 * @param refClient
		 * @return
		 * methode qui permet de suprimmer un client
		 */
		public boolean supressionService(Client refClient) {
			ClientDao refdao = new ClientDao();
			boolean temoin = refdao.suppressionClient(refClient);
			return temoin;
		}
		// méthode pour CREATE
		/**
		 * @param refClient
		 * @return
		 * Methode qui permet de creer un client
		 */
		public Client creationService(Client refClient) {
			ClientDao refdao = new ClientDao();
			refdao.creationClient(refClient);
			return refClient;

		}
		// METHODE pour LIRE
		/**
		 * @param idClient
		 * @return
		 * Methode qui permet de lire les information du client
		 */
		public Client lectureService(int idClient) {
			ClientDao refdao = new ClientDao();
			Client refClient = refdao.lectureClient(idClient);
			return refClient;
}
}
