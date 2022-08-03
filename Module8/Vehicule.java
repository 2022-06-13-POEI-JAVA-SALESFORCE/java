package module8;

import java.util.ArrayList;

public class Vehicule {
	
	private int vitesse;
	private String nom;
	private static ArrayList<Vehicule> vehicules = new ArrayList<>();
	
	public Vehicule(int vitesse, String nom) {
		super();
		this.vitesse = vitesse;
		this.nom = nom;
		vehicules.add(this);
	}
	
	// Retourne le véhicule le plus rapide
	public static <C extends Vehicule> C getPlusRapide(ArrayList<C> vehicules) {
		
	    C plusRapide = null;
	    int vitesse = 0;
	    for (C vehicule : vehicules) {
	      if(vehicule.getVitesse() >= vitesse){
	        vitesse = vehicule.getVitesse();
	        plusRapide = vehicule;
	      }
	    }
	    return plusRapide;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static ArrayList<Vehicule> getVehicules() {
		return vehicules;
	}

	public static void setVehicules(ArrayList<Vehicule> vehicules) {
		Vehicule.vehicules = vehicules;
	}

}
