package Tests;

import junit.framework.TestCase;
import dao.ConseillerDao;
import domaine.Conseiller;
import org.hamcrest.core.IsEqual;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

public class ConseillerDaoTest extends TestCase {
	ConseillerDao refConseillerDao = new ConseillerDao();
	
	// @BeforeClass
	public ConseillerDao instanciation() throws Exception {
		
		return refConseillerDao;
	}

	@Test
	public void lectureConseillerTestVrai() {
		String log = "douglas.mbiandou";
		Conseiller refConseiller = refConseillerDao.lecture(log);
		String prenom = refConseiller.getPrenom();
		assertEquals(prenom,"Douglas");
	}



}
