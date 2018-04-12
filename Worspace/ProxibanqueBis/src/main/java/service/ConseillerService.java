package service;

import dao.ConseillerDao;
import domaine.Conseiller;

public class ConseillerService {
		
		
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
		
		public Conseiller lecture(String login) {
			ConseillerDao infoConseiller = new ConseillerDao();
			Conseiller conseillerRetour= infoConseiller.lecture(login);
			return conseillerRetour;
		}
}
