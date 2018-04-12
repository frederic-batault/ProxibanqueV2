package domaine;

public class CompteEpargne extends Compte{
	
	private double TauxRemuneration;

	
	// Constructeur
	public CompteEpargne(int idCompte, double soldes, double tauxRemuneration) {
		super(idCompte, soldes);
		TauxRemuneration = tauxRemuneration;
	}
	

	public CompteEpargne(int idCompte, double soldes) {
		super(idCompte, soldes);
	}


	// getteur et setteur
	public double getTauxRemuneration() {
		return TauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		TauxRemuneration = tauxRemuneration;
	}
	
}
