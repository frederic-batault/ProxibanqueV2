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
		public Client updateService(Client refClient) {
			ClientDao refdao = new ClientDao();
			Client refClient2 = refdao.ModificationClient(refClient);
			return refClient2;
		}

		// METHODE POUR DELETE
		public boolean deleteService(Client refClient) {
			ClientDao refdao = new ClientDao();
			boolean temoin = refdao.SuppressionClient(refClient);
			return temoin;
		}
		// méthode pour CREATE
		public Client createService(Client refClient) {
			ClientDao refdao = new ClientDao();
			refdao.createClient(refClient);
			return refClient;

		}
		// METHODE pour LIRE
		public Client lectureService(int idClient) {
			ClientDao refdao = new ClientDao();
			Client refClient = refdao.lectureClient(idClient);
			return refClient;
}
}
