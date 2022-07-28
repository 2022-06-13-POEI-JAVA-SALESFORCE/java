package tp3;

public class Client {

	private String nom;
	private String prenom;
	private int nbPersonnes;
	private Restaurant restaurantChoisi;
	
	public Client(String nom, String prenom, int nbPersonnes) {
		
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setNbPersonnes(nbPersonnes);
		
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

	public int getNbPersonnes() {
		return nbPersonnes;
	}

	public void setNbPersonnes(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}

	public Restaurant getRestaurantChoisi() {
		return restaurantChoisi;
	}

	public void setRestaurantChoisi(Restaurant restaurantChoisi) {
		this.restaurantChoisi = restaurantChoisi;
	}
	
	
}
