package exo3;

public class Film {
	
	private String nom;
	private String genre;
	private int duree;
	
	public Film(String nom, String genre, int duree) {
		super();
		this.nom = nom;
		this.genre = genre;
		this.duree = duree;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

}