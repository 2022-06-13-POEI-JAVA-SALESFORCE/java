package tp3;

public class Restaurant {
	
	private String nom;
	private int nbTable;
	private String style;
	private Plat platPrincipal;
	
	public Restaurant(String nom, int nbTable, String style) {
		
		this.setNom(nom);
		this.setNbTable(nbTable);
		this.setStyle(style);
		
	}
	
	// check si le resto a assez de tables pour le client et renvoi un booleen (true ou false)
	public Boolean checkDisponibilite(Client client) {
		
		// si on trouve assez de place, on renvoie "true"
		if(this.nbTable > client.getNbPersonnes()) {
			
			return true;
			
		}
		
		// sinon, on renvoie "false"
		return false;
		
	}
	
	// Affiche le nom du plat principal
	public void afficherPlat() {
		System.out.println("Ce soir, nous servons notre " + this.getPlatPrincipal().getNom() + " !");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbTable() {
		return nbTable;
	}

	public void setNbTable(int nbTable) {
		this.nbTable = nbTable;
	}

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public Plat getPlatPrincipal() {
		return platPrincipal;
	}

	public void setPlatPrincipal(Plat platPrincipal) {
		this.platPrincipal = platPrincipal;
	}

}
