package domaine;

public class CompteCourant extends Compte {

	private double decouvertAutorise;

	// constructeur
	public CompteCourant(int idCompte, double soldes, double decouvertAutorise) {
		super(idCompte, soldes);
		this.decouvertAutorise = decouvertAutorise;
	}

	public CompteCourant(int idCompte, double soldes) {
		super(idCompte, soldes);
		// TODO Auto-generated constructor stub
	}

	// setteur et getteur
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

}
