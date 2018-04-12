package service;

import java.util.List;

import dao.ClientDao;
import dao.CompteDao;
import domaine.Client;
import domaine.Compte;

public class CompteService {

	// LECTURE DE TOUS LECTURE DE TOUS LES COMPTE
	public List<Compte> getAllService(int idCompte) {
		CompteDao refdao = new CompteDao();
		List<Compte> liste = refdao.getAll(idCompte);
		return liste;
	}

	// METHODE POUR UPDATE
	public Compte modificationService(Compte refCompte) {
		CompteDao refdao = new CompteDao();
		Compte refCompte2 = refdao.modificationCompte(refCompte);
		return refCompte2;
	}

	// METHODE pour LIRE
	public Compte lectureService(int idCompte) {
		CompteDao refdao = new CompteDao();
		Compte refCompte = refdao.lectureCompte(idCompte);
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
