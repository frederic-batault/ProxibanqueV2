package domaine;

public class CompteEpargne extends Compte {

	private double TauxRemuneration;

	// Constructeur

	public CompteEpargne(int idCompte, double soldes, String typeCompte, double tauxRemuneration) {
		super(idCompte, soldes, typeCompte);
		TauxRemuneration = tauxRemuneration;
	}

	public CompteEpargne(int idCompte, double soldes, String typeCompte) {
		super(idCompte, soldes, typeCompte);
	}

	// getteur et setteur

	public double getTauxRemuneration() {
		return TauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		TauxRemuneration = tauxRemuneration;
	}

}
