package Tests;

import junit.framework.TestCase;
import dao.ClientDao;
import dao.ConseillerDao;
import domaine.Client;
import domaine.Conseiller;
import org.hamcrest.core.IsEqual;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

public class ClientDaoTest extends TestCase {
	ClientDao refClientDao = new ClientDao();
	Client refClient = new Client(1, 1, "Nom", "Prénom", "email", "adresse", "CP", "Ville");

	// @BeforeClass
	public ClientDao instanciation() throws Exception {

		return refClientDao;
	}
// teste le retour "true" de la méthode de création de client
	@Test
	public void lectureClientTestVrai() {

		assertTrue(refClientDao.creationClient(refClient));
	}
	
	// teste le retour "false" de la méthode de suppression de client dans le cas d'un client n'existant pas
	@Test
	public void suppressionClientTestFaux() {

		assertFalse(refClientDao.suppressionClient(refClient));
	}

}
