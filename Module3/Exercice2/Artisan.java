package exo2;

public class Artisan {
	
	private String nom;
	private String prenom;
	private String metier;
	private int tarifHoraire;
	
	public Artisan(String nom, String prenom, String metier, int tarifHoraire) {
		this.nom = nom;
		this.prenom = prenom;
		this.metier = metier;
		this.tarifHoraire = tarifHoraire;
	}
	
	// Calcul et retourne le cout d'un artisan en fonction d'un nombre d'heures travaillées
	public int calculerTarif(int nbHeures) {
		
		return nbHeures * this.tarifHoraire;
		
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

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public int getTarifHoraire() {
		return tarifHoraire;
	}

	public void setTarifHoraire(int tarifHoraire) {
		this.tarifHoraire = tarifHoraire;
	}

	

}