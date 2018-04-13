package service;

import dao.ConseillerDao;
import domaine.Conseiller;

/**
 * @author HEDI I., BATAULT F.
 *
 */
/**
 * Cette classe contient les methode utilise pour le conseiller
 */
public class ConseillerService {
		
		
		/**
		 * @param login
		 * @param password1
		 * @return
		 * methode qui permet de verifier l'identification du conseiller
		 */
		public boolean authentification (String login, String password1) {
		ConseillerDao infoConseiller = new ConseillerDao();
		Conseiller conseiller = infoConseiller.lecture(login);
		String password2=conseiller.getPassword();
		
		if( password1.equals(password2)) {
			return true;

}
		else {
			return false;
		}
	}
		
		/**
		 * @param login
		 * @return
		 * Methode qui permet de recupere le login de la base de donne
		 */
		public Conseiller lecture(String login) {
			ConseillerDao infoConseiller = new ConseillerDao();
			Conseiller conseillerRetour= infoConseiller.lecture(login);
			return conseillerRetour;
		}
}
