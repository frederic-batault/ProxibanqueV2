package domaine;

public class ClientCompte  {
	
	private int idClient;
	private String nom;
	private String prenom;
	private int idCompte;
	private double soldes;
	private String typeCompte;
	
	public ClientCompte(int idClient, double soldes, String prenom, int idCompte, String nom, String typeCompte) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.idCompte = idCompte;
		this.soldes = soldes;
		this.typeCompte = typeCompte;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public double getSoldes() {
		return soldes;
	}

	public void setSoldes(double soldes) {
		this.soldes = soldes;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

}
