package domaine;

public class CompteCourant extends Compte {

	private double decouvertAutorisé;

	// constructeur
	public CompteCourant(int idCompte, double soldes, double decouvertAutorisé) {
		super(idCompte, soldes);
		this.decouvertAutorisé = decouvertAutorisé;
	}

	public CompteCourant(int idCompte, double soldes) {
		super(idCompte, soldes);
		// TODO Auto-generated constructor stub
	}

	// setteur et getteur
	public double getDecouvertAutorisé() {
		return decouvertAutorisé;
	}

	public void setDecouvertAutorisé(double decouvertAutorisé) {
		this.decouvertAutorisé = decouvertAutorisé;
	}

}
