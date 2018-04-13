package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domaine.Client;

/**
 * @author HEDI I., BATAULT F.
 *
 */
/**
 * La classe clientDao permet d'avoir une interaction entre la base de donne et  la couche Dao du client
 */
public class ClientDao {

	/**
	 * @param idConseiller
	 * @return
	 * Methode qui permet de recuperer tous la liste des comptes rattacher � un client de la base de donne
	 */
	public List<Client> getAll(int idConseiller) {
		List<Client> liste = new ArrayList<Client>();

		// driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// connexion � la base
		try {
			Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root",
					"");

			// cr�ation requ�te
			Statement refStatement = refConnection.createStatement();

			// executer requ�te
			String refRequete = "SELECT  * FROM client WHERE idConseiller='" + idConseiller + "'";
			ResultSet rs = refStatement.executeQuery(refRequete);

			// cr�ation d'un objet � partir du r�sultat requ�te

			// cr�ation d'une set de r�f�rences

			while (rs.next()) {
				int idClient = rs.getInt("IdClient");
				int idConseiller2 = rs.getInt("IdConseiller");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String email = rs.getString("email");
				String adresse = rs.getString("adresse");
				String codePostale = rs.getString("codePostale");
				String ville = rs.getString("ville");

				Client refClient = new Client(idClient, idConseiller2, nom, prenom, email, adresse, codePostale, ville);
				liste.add(refClient);

			}
			return liste;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CATCH !");
			return null;
		}
	}

	// m�thode UPDATE
	/**
	 * @param client
	 * @return
	 * Methode qui permet de modifier les informations d'un client dans la base de donne
	 */
	public Client modificationClient(Client client) {

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

			// cr�ation requ�te
			Statement refStatement = refConnection.createStatement();

			// executer requ�te

			String refRequete = "UPDATE client SET idClient=" + ", 'nom='" + client.getNom() + "', prenom='"
					+ client.getPrenom() + "', email=" + client.getEmail() + "', adresse=" + client.getAdresse()
					+ "', codePostale=" + client.getCodePostale() + "', ville=" + client.getVille() + ",IdConseiller="
					+ client.getIdConseiller() + " WHERE idClient=" + client.getIdClient();
			int i = refStatement.executeUpdate(refRequete);

			// modification de l'objet � partir du r�sultat requ�te
			String refRequete2 = "SELECT  * FROM client WHERE IdClient =" + client.getIdClient();
			ResultSet rs = refStatement.executeQuery(refRequete2);
			rs.next();
			client.setIdClient(rs.getInt("IdClient"));
			client.setNom(rs.getString("nom"));
			client.setPrenom(rs.getString("prenom"));
			client.setEmail(rs.getString("email"));
			client.setAdresse(rs.getString("adresse"));
			client.setCodePostale(rs.getString("codePostale"));
			client.setVille(rs.getString("ville"));
			client.setIdConseiller(rs.getInt("IdConseiller"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return client;
	}

	// suppression Client
	/**
	 * @param client
	 * @return
	 * Methode qui permet de supprimer un client de la base de donne
	 */
	public boolean suppressionClient(Client client) {

		// driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// connexion � la base
		try {
			Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root",
					"");

			// cr�ation requ�te
			Statement refStatement = refConnection.createStatement();

			// executer requ�te
			String refRequete = "DELETE FROM client WHERE idClient=" + client.getIdClient();
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

	// m�thode CREATE
	/**
	 * @param client
	 * @return
	 * Methode qui permet d'ajouter un client dans la base de donner
	 */
	public boolean creationClient(Client client) {

		// driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// connexion � la base
		try {
			Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root", "");

			// cr�ation requ�te 1
			Statement refStatement = refConnection.createStatement();

			// executer requ�te 1
			String refRequete = "INSERT INTO client(IdClient, nom, prenom, age, IdConseiller) VALUES ("
					+ client.getIdClient() + ",'" + client.getNom() + "','" + client.getPrenom() + "','"
					+ client.getEmail() + "','" + client.getAdresse() + "','" + client.getCodePostale() + "',,'"
					+ client.getVille() + "'" + client.getIdConseiller() + ")";
			int i = refStatement.executeUpdate(refRequete);

			// pr�sentation r�sultats requ�te 1
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	// m�thode GET: lecture client
		/**
		 * @param idClient
		 * @return
		 * Methode qui permet de recuperer les information d'un clientvenant de la base de donn�
		 */
		public Client lectureClient(int idClient) {
		Client client = new Client();

			// driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// connexion � la base 
			try {
				Connection refConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root", "");

				// cr�ation requ�te
				Statement refStatement = refConnection.createStatement();

				// executer requ�te
				String refRequete = "SELECT  * FROM client WHERE IdClient ='"  + idClient + "'";
				ResultSet rs = refStatement.executeQuery(refRequete);

				// cr�ation d'un objet � partir du r�sultat requ�te
				rs.next();
				client.setIdClient(rs.getInt("IdClient"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setEmail(rs.getString("email"));
				client.setAdresse(rs.getString("adresse"));
				client.setCodePostale(rs.getString("codePostale"));
				client.setVille(rs.getString("ville"));
				client.setIdConseiller(rs.getInt("IdConseiller"));
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			return client;
		}
}
