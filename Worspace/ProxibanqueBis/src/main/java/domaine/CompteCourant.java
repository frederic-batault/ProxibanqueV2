package domaine;

public class CompteCourant extends Compte {

	

	private double decouvertAutoris�;

	public CompteCourant(int idCompte, double soldes, double decouvertAutoris�) {
		super(idCompte, soldes);
		this.decouvertAutoris� = decouvertAutoris�;
	}

	public CompteCourant(int idCompte, double soldes) {
		super(idCompte, soldes);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getDecouvertAutoris�() {
		return decouvertAutoris�;
	}

	public void setDecouvertAutoris�(double decouvertAutoris�) {
		this.decouvertAutoris� = decouvertAutoris�;
	}

}
