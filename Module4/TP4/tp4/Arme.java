package tp4;

public class Arme {
	
	private String nom;
	private int poids;
	
	public Arme(String nom, int poids) {
		super();
		this.nom = nom;
		this.poids = poids;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}

}
