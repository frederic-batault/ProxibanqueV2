package domaine;

public class Compte {
	
	private int idCompte;
	private double soldes;
	private String typeCompte;
	
	// constructeur
	
	public Compte(int idCompte, double soldes, String typeCompte) {
		super();
		this.idCompte = idCompte;
		this.soldes = soldes;
		this.typeCompte = typeCompte;
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

}
