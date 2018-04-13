package service;

import java.util.List;

import dao.ClientDao;
import dao.CompteDao;
import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;

public class CompteService {

	// LECTURE DE TOUS LECTURE DE TOUS LES COMPTE
	public List<Compte> getAllService(int idClient) {
		CompteDao refdao = new CompteDao();
		List<Compte> liste = refdao.getAll(idClient);
		return liste;
	}

	// METHODE POUR UPDATE
	public Compte modificationService(Compte refCompte) {
		CompteDao refdao = new CompteDao();
		Compte refCompte2 = refdao.modificationCompte(refCompte);
		return refCompte2;
	}

	// METHODE pour LIRE compte Courant
	public CompteCourant lectureCourant(int idClient) {
		CompteDao refdao = new CompteDao();
		CompteCourant refCompte = refdao.lectureCompteCourant(idClient);
		return refCompte;
	}
	// METHODE pour LIRE compte Courant
		public CompteEpargne lectureEpargne(int idClient) {
			CompteDao refdao = new CompteDao();
			CompteEpargne refCompte = refdao.lectureCompteEpargne(idClient);
			return refCompte;
		}

	// METHODE POUR DELETE
	public boolean suppressionService(Compte refCompte) {
		CompteDao refdao = new CompteDao();
		boolean temoin = refdao.suppressionCompte(refCompte);
		return temoin;
	}

	 // méthode pour CREATE
	 public Compte creationService(Compte refCompte) {
	 CompteDao refdao = new CompteDao();
	 refdao.creationCompte(refCompte);
	 return refCompte;
	
	 }

}
