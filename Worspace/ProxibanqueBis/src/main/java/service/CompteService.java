package service;

import java.util.List;

import dao.CompteDao;
import domaine.Compte;

public class CompteService {
	
	public class ClientService {
		public List<Compte> getAllService(int idCompte) {
			CompteDao refdao = new CompteDao();
			List<Compte> liste = refdao.getAll(idCompte);
			return liste;
		}
		
		// METHODE POUR UPDATE
			public Compte updateService(Compte refCompte) {
				CompteDao refdao = new CcompteDao();
				Compte refCompte2 = refdao.ModificationCompte(refCompte);
				return refCompte2;
			}

			// METHODE POUR DELETE
			public boolean deleteService(Compte refCompte) {
				CompteDao refdao = new CompteDao();
				boolean temoin = refdao.SuppressionCompte(refCompte);
				return temoin;
			}
			// méthode pour CREATE
			public Compte createService(Compte refCompte) {
				CompteDao refdao = new CompteDao();
				refdao.createCompte(refCompte);
				return refCompte;

			}
	

}
