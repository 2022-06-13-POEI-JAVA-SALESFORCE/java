package tp3;

public class Plat {
	
	private String nom;
	private int prix;
	
	public Plat(String nom, int prix) {
		
		this.setNom(nom);
		this.setPrix(prix);
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

}