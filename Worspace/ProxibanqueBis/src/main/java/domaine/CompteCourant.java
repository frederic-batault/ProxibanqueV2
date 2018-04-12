package domaine;

public class CompteCourant extends Compte {

	private double decouvertAutorise;

	// constructeur
	public CompteCourant(int idCompte, double soldes, String typeCompte, double decouvertAutorise) {
		super(idCompte, soldes, typeCompte);
		this.decouvertAutorise = decouvertAutorise;
	}

	public CompteCourant(int idCompte, double soldes, String typeCompte) {
		super(idCompte, soldes, typeCompte);
	}

	// setteur et getteur

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

}
