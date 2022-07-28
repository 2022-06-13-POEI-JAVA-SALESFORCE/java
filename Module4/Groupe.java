package module4;

public class Groupe {
	
	private int nbProp;
	private String couleur;
	private Propriete[] proprietes = new Propriete[4];
	
	public Groupe(int nbProp, String couleur) {
		super();
		this.nbProp = nbProp;
		this.couleur = couleur;
	}
	public int getNbProp() {
		return nbProp;
	}
	public void setNbProp(int nbProp) {
		this.nbProp = nbProp;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Propriete[] getProprietes() {
		return proprietes;
	}
	public void setProprietes(Propriete[] proprietes) {
		this.proprietes = proprietes;
	}

}