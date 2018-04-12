package domaine;

public class CompteCourant extends Compte {

	

	private double decouvertAutorisé;

	public CompteCourant(int idCompte, double soldes, double decouvertAutorisé) {
		super(idCompte, soldes);
		this.decouvertAutorisé = decouvertAutorisé;
	}

	public CompteCourant(int idCompte, double soldes) {
		super(idCompte, soldes);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getDecouvertAutorisé() {
		return decouvertAutorisé;
	}

	public void setDecouvertAutorisé(double decouvertAutorisé) {
		this.decouvertAutorisé = decouvertAutorisé;
	}

}
