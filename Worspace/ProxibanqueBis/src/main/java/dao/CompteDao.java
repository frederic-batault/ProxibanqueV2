package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domaine.Compte;

public class CompteDao {

	public List<Compte> getAll(int idClient) {
		List<Compte> liste = new ArrayList<Compte>();

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

			// executer requ�te (LIKE)
			String refRequete = "SELECT  * FROM compte WHERE idClient='" + idClient + "'";
			ResultSet rs = refStatement.executeQuery(refRequete);

			// cr�ation d'un objet � partir du r�sultat requ�te

			// cr�ation d'une set de r�f�rences

			while (rs.next()) {
				int idClient2 = rs.getInt("IdClient");
				double solde = rs.getDouble("solde");
				String typeCompte = rs.getString("typeCompte");

				Compte refCompte = new Compte(idClient2, solde, typeCompte);
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

	// m�thode UPDATE
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

			// cr�ation requ�te
			Statement refStatement = refConnection.createStatement();

			// executer requ�te UPDATE `compte` SET `solde`=750 WHERE `idCompte`=1;

			String refRequete = "UPDATE compte SET solde='" + compte.getSoldes() + " WHERE idClient="
					+ compte.getIdCompte();
			int i = refStatement.executeUpdate(refRequete);

			// modification de l'objet � partir du r�sultat requ�te
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
	public boolean suppressionCompte(Compte compte) {

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

	// m�thode CREATE
	public boolean creationCompte(Compte compte) {

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

			// cr�ation requ�te 1
			Statement refStatement = refConnection.createStatement();

			// executer requ�te 1
			String refRequete = "INSERT INTO compte(IdCompte, soldes, typeCompte, decouvertAutorise, tauxRemuneration, idClient) VALUES ("
					+ compte.getIdCompte() + ",'" + compte.getSoldes() + "','" + compte.getTypeCompte() + "','"
					+ compte.getdecouvertAutorise() + "','" + compte.getTauxRemuneration() + "'" + compte.getIdClient()
					+ ")";
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
	public Compte lectureCompte(int idCompte) {
		Compte compte = new Compte();

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
			String refRequete = "SELECT  * FROM compte WHERE IdCompte ='" + idCompte + "'";
			ResultSet rs = refStatement.executeQuery(refRequete);

			// cr�ation d'un objet � partir du r�sultat requ�te
			rs.next();
			compte.setIdCompte(rs.getInt("IdComte"));
			compte.setSoldes(rs.getDouble("soldes"));
			compte.setDecouvertAutorise(rs.getDouble("prenom"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return compte;
	}

}
