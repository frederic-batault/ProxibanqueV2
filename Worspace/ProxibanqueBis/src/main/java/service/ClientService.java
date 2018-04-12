package service;

import java.util.List;

import dao.ClientDao;
import domaine.Client;

public class ClientService {
	public List<Client> getAllService(int idConseiller) {
		ClientDao refdao = new ClientDao();
		List<Client> liste = refdao.getAll(idConseiller);
		return liste;
	}
	
	// METHODE POUR UPDATE
		public Client modificationService(Client refClient) {
			ClientDao refdao = new ClientDao();
			Client refClient2 = refdao.modificationClient(refClient);
			return refClient2;
		}

		// METHODE POUR DELETE
		public boolean supressionService(Client refClient) {
			ClientDao refdao = new ClientDao();
			boolean temoin = refdao.suppressionClient(refClient);
			return temoin;
		}
		// méthode pour CREATE
		public Client creationService(Client refClient) {
			ClientDao refdao = new ClientDao();
			refdao.creationClient(refClient);
			return refClient;

		}
		// METHODE pour LIRE
		public Client lectureService(int idClient) {
			ClientDao refdao = new ClientDao();
			Client refClient = refdao.lectureClient(idClient);
			return refClient;
}
}
