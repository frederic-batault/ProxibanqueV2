package domaine;

public class Client {
	
	private int idClient;
	private int idConseiller;
	private String nom;
	private String prenom;
	private String email;
	private String adresse; 
	private String codePostale;
	private String ville;
	
	// constructeur
	
	public Client(int idClient, int idConseiller, String nom, String prenom, String email, String adresse,
			String codePostale, String ville) {
		super();
		this.idClient = idClient;
		this.idConseiller = idConseiller;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.codePostale = codePostale;
		this.ville = ville;
	}
	
	
	public Client(int idClient, String nom, String prenom, String email, String adresse, String codePostale,
			String ville) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.codePostale = codePostale;
		this.ville = ville;
	}


	public Client() {
		super();
	}
	// getters/ setters
	
	

	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public int getIdConseiller() {
		return idConseiller;
	}
	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
	
	
	
}
