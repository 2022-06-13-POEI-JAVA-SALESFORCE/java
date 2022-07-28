package module4;

public class Propriete {

	private int prixAchat;
	private String nom;
	private String couleur;
	private Joueur proprietaire;
	private Groupe groupe;
	
	public Propriete(int prixAchat, String nom, String couleur) {
		this.prixAchat = prixAchat;
		this.nom = nom;
		this.couleur = couleur;
	}

	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Joueur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
}