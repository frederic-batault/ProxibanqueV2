package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domaine.Client;

public class ClientDao {
	
	public List<Client> getAll(int idConseiller) {
		List<Client> liste = new ArrayList<Client>();

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
			String refRequete = "SELECT  * FROM client WHERE idConseiller='" + idConseiller + "'";
			ResultSet rs = refStatement.executeQuery(refRequete);

			// création d'un objet à partir du résultat requête

			// création d'une set de références

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

}
