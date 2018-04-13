package domaine;

public class Compte {
	
	private int idCompte;
	private double soldes;
	private String typeCompte;
	private int idClient;
	
	// constructeur
	
	public Compte(int idCompte, double soldes, String typeCompte, int idClient) {
		super();
		this.idCompte = idCompte;
		this.soldes = soldes;
		this.typeCompte = typeCompte;
		this.idClient = idClient;
	}

	public Compte() {
		super();
	}

	
	// getteur et setteur
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

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

}
