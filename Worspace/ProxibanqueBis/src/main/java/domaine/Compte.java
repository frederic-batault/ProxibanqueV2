package domaine;

public class Compte {
	
	private int idCompte;
	private double soldes;
	
	public Compte(int idCompte, double soldes) {
		super();
		this.idCompte = idCompte;
		this.soldes = soldes;
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
	
	
}
