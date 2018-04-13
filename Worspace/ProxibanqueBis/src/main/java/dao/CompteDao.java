package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domaine.Client;
import domaine.ClientCompte;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;

/**
 * @author HEDI I., BATAULT F.
 *
 */
/**
 * La classe compteDao permet d'avoir une interaction entre la base de donne et  la couche Dao des comptes
 */
public class CompteDao {

	/**
	 * @param idConseiller
	 * @return
	 * Methode qui permet de lister tous les compte rattacher à un conseiller
	 */
	public List<ClientCompte> getAll(int idConseiller) {
		List<ClientCompte> liste = new ArrayList<ClientCompte>();

		// driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// connexion à la base
		try {
			Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root",
					"");

			// création requête
			Statement refStatement = refConnection.createStatement();

			// executer requête (LIKE)
			String refRequete = "SELECT * FROM compte WHERE idConseiller='" + idConseiller + "'";
			ResultSet rs = refStatement.executeQuery(refRequete);

			// création d'un objet à partir du résultat requête

			// création d'une set de références

			while (rs.next()) {
				int idCompte = rs.getInt("idCompte");
				int idClient2 = rs.getInt("idClient");
				double solde = rs.getDouble("solde");
				String typeCompte = rs.getString("typeCompte");
				ClientDao refClientDao = new ClientDao();
				Client refClient= refClientDao.lectureClient(idClient2);
				String nom =refClient.getNom();
				String prenom = refClient.getPrenom();
				
				ClientCompte refCompte = new ClientCompte (idCompte, solde, typeCompte, idClient2, nom, prenom);
				liste.add(refCompte);

			}
			return liste;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CATCH !");
			return null;
		}
	}

	// méthode UPDATE
	/**
	 * @param compte
	 * @return
	 * Methode qui permet de faire la modification d'un compte
	 */
	public Compte modificationCompte(Compte compte) {

		// driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root",
					"");

			// création requête
			Statement refStatement = refConnection.createStatement();

			// executer requête UPDATE `compte` SET `solde`=750 WHERE `idCompte`=1;

			String refRequete = "UPDATE compte SET solde='" + compte.getSoldes() + " WHERE idClient="
					+ compte.getIdCompte();
			int i = refStatement.executeUpdate(refRequete);

			// modification de l'objet à partir du résultat requête
			String refRequete2 = "SELECT  * FROM compte WHERE IdCompte =" + compte.getIdCompte();
			ResultSet rs = refStatement.executeQuery(refRequete2);
			rs.next();
			compte.setIdCompte(rs.getInt("IdCompte"));
			compte.setSoldes(rs.getDouble("soldes"));
			compte.setIdClient(rs.getInt("idClient"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return compte;
	}

	// suppression Client
	/**
	 * @param compte
	 * @return
	 * methode qui permet de supprimer un compte
	 */
	public boolean suppressionCompte(Compte compte) {

		// driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// connexion à la base
		try {
			Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root",
					"");

			// création requête
			Statement refStatement = refConnection.createStatement();

			// executer requête
			String refRequete = "DELETE FROM compte WHERE idCompte=" + compte.getIdCompte();
			int i = refStatement.executeUpdate(refRequete);

			if (i >= 1) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	// méthode CREATE
	/**
	 * @param compte
	 * @return
	 * Methode qui permet de creer un compte 
	 */
	public boolean creationCompte(Compte compte) {

		// driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// connexion à la base
		try {
			Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root",
					"");

			// création requête 1
			Statement refStatement = refConnection.createStatement();

			// executer requête 1
			String refRequete = "INSERT INTO compte(IdCompte, soldes, typeCompte, decouvertAutorise, tauxRemuneration, idClient) VALUES ("
					+ compte.getIdCompte() + ",'" + compte.getSoldes() + "','" + compte.getTypeCompte() + "',"
					+ compte.getIdClient() + ")";
			int i = refStatement.executeUpdate(refRequete);

			// présentation résultats requête 1
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	// méthode GET: lecture compte courant client

	/**
	 * @param idClient
	 * @return
	 * Methode qui permet de lire les information d'un compte courant d'un client
	 */
	public CompteCourant lectureCompteCourant(int idClient) {
		CompteCourant compte = new CompteCourant();

		// driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// connexion à la base
		try {
			Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root",
					"");

			// création requête
			Statement refStatement = refConnection.createStatement();

			// executer requête
			String refRequete = "SELECT  * FROM compte WHERE IdClient ='" + idClient + "'AND typeCompte='"
					+ "' compteCourant'";
			ResultSet rs = refStatement.executeQuery(refRequete);

			// création d'un objet à partir du résultat requête
			rs.next();
			compte.setIdCompte(rs.getInt("IdCompte"));
			compte.setSoldes(rs.getDouble("soldes"));
			compte.setTypeCompte(rs.getString("typeCompte"));
			compte.setIdClient(rs.getInt("idClient"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return compte;
	}
	// méthode GET: lecture compte courant client

	/**
	 * @param idClient
	 * @return
	 * Methode qui permet de lire les information d'un compte epargne d'un client 
	 */
	public CompteEpargne lectureCompteEpargne(int idClient) {
		CompteEpargne compte = new CompteEpargne();

		// driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// connexion à la base
		try {
			Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root",
					"");

			// création requête
			Statement refStatement = refConnection.createStatement();

			// executer requête
			String refRequete = "SELECT  * FROM compte WHERE IdClient ='" + idClient + "'AND typeCompte='"
					+ "' compteEpargne'";
			ResultSet rs = refStatement.executeQuery(refRequete);

			// création d'un objet à partir du résultat requête
			rs.next();
			compte.setIdCompte(rs.getInt("IdCompte"));
			compte.setSoldes(rs.getDouble("soldes"));
			compte.setTypeCompte(rs.getString("typeCompte"));
			compte.setIdClient(rs.getInt("idClient"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return compte;
	}
	// méthode GET: lecture compte  client

		/**
		 * @param idCompte
		 * @return
		 * Methode qui permet de lires les information d'un compte choisie
		 */
		public Compte lectureCompte(int idCompte) {
			Compte compte = new Compte();

			// driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// connexion à la base
			try {
				Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root",
						"");

				// création requête
				Statement refStatement = refConnection.createStatement();

				// executer requête
				String refRequete = "SELECT  * FROM compte WHERE IdCompte ='" + idCompte + "'";
				ResultSet rs = refStatement.executeQuery(refRequete);

				// création d'un objet à partir du résultat requête
				rs.next();
				compte.setIdCompte(rs.getInt("IdCompte"));
				compte.setSoldes(rs.getDouble("soldes"));
				compte.setTypeCompte(rs.getString("typeCompte"));
				compte.setIdClient(rs.getInt("idClient"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			return compte;
		}
}
