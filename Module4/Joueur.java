package module4;

public class Joueur {

	private String nom;
	private int argent = 500;
	
	public Joueur(String nom) {
		
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}
	
}