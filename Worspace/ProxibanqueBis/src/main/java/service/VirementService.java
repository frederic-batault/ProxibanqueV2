package service;

import dao.CompteDao;
import domaine.Compte;
import domaine.CompteCourant;

/**
 * @author HEDI I., BATAULT F.
 *
 */
/**
 * Classe qui permet d'effectuer le virement bancaire
 */
public class VirementService extends Compte{ 

	void virement (int idCompte1, int idCompte2, double somme ) {
		
		Compte compte1= new Compte();
		CompteDao refdao1 = new CompteDao();
		refdao1.lectureCompte(idCompte1);
		compte1.setSoldes(compte1.getSoldes()-somme);
		refdao1.modificationCompte(compte1);
		
		Compte compte2= new Compte();
		CompteDao refdao2 = new CompteDao();
		refdao2.lectureCompte(idCompte2);
		compte2.setSoldes(compte2.getSoldes()+somme);		
		refdao2.modificationCompte(compte2);	
		
	}
}
