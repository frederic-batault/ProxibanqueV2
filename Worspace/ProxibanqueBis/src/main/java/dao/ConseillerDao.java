package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domaine.Conseiller;

public class ConseillerDao {

	public Conseiller lecture (String log) {
		// ETAPE1: chargement du driver

		System.out.println("Chargement du Driver");
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Etape 2 : connexion DB

			Connection maConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proxibanque", "root", "");

			// Etape 3: preparation de la requete
			Statement stm = maConnection.createStatement();
			String s = "SELECT * FROM Conseiller WHERE login  =" + log;

			// execution d'une selection
			ResultSet rs = stm.executeQuery(s);
			
			// Etape 5 : lecture des donn�es lecture d'une selection
						
			rs.next();
			int idConseiller = rs.getInt("idConseiller");
			String nom =rs.getString("nom");
			String prenom =rs.getString("prenom");
			String login =rs.getString("login");
			String password =rs.getString("password");		
			Conseiller conseillerReturn = new Conseiller(idConseiller, nom, prenom, login, password);
			return conseillerReturn; 

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			return null;
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
		

	}

}