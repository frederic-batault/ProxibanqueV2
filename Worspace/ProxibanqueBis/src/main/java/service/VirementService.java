package service;

import dao.CompteDao;
import domaine.Compte;
import domaine.CompteCourant;

public class VirementService extends Compte{
		 

	public void lectureService1(int idCompte) {
		CompteDao refdao = new CompteDao();
		Compte refCompte = refdao.lectureCompte(idCompte);
	}

	public boolean crediter(double somme) {
		// Credite le compte du montant choisi
		Compte compte=new Compte();
		compte= refCompte.get;
		
		
		return false;
	}

	public boolean debiter(double montant) {

		if (montant > 0) {
			boolean operationAutorise;
			operationAutorise = (montant <= this.solde + decouvertAutorise);

			if (operationAutorise) {
				this.setSolde(this.getSolde() - montant);
				return true;
			}
		}
		return false;

}
