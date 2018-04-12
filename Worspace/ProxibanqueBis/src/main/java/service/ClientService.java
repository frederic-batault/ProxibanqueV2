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

}
