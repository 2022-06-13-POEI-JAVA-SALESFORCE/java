package module8;

import java.util.ArrayList;

public class Voiture extends Vehicule{
	
	private static ArrayList<Voiture> voitures = new ArrayList<>();

	public Voiture(int vitesse, String nom) {
		super(vitesse, nom);
		voitures.add(this);
	}

	public static ArrayList<Voiture> getVoitures() {
		return voitures;
	}

	public static void setVoitures(ArrayList<Voiture> voitures) {
		Voiture.voitures = voitures;
	}

}
