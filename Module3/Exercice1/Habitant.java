package exo1;

public class Habitant {
	
	private String nom;
	private String prenom;
	private int numeroRue;
	private String adresse;
	
	public Habitant(String nom, String prenom, int numeroRue, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroRue = numeroRue;
		this.adresse = adresse;
	}

	public void presentation() {
		
		System.out.println("Salut c'est moi "+this.prenom+" "+this.nom+", j'habite au "+this.numeroRue+" "+this.adresse+".");
		
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

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}