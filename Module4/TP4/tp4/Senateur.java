package tp4;

public class Senateur {
	
	private String prenom;
	private String nom;
	private int nbSesterces;
	
	public Senateur(String prenom, String nom, int nbSesterces) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.nbSesterces = nbSesterces;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbSesterces() {
		return nbSesterces;
	}

	public void setNbSesterces(int nbSesterces) {
		this.nbSesterces = nbSesterces;
	}

}
