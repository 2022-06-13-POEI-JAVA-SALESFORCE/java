package module8;

public class Main {

	public static void main(String[] args) {
		
		new Voiture(80,"La foudre");
		new Voiture(250,"La flèche");
		new Moto(290,"Le bolide");
		new Moto(150,"Le rapide");
		new Voiture(200,"La fusée");
		
		// Récupération du véhicule le plus rapide
		Vehicule plusRapide = Vehicule.getPlusRapide(Vehicule.getVehicules());
		System.out.println("Le plus rapide est : " + plusRapide.getNom());
		
		// Récupération de la voiture la plus rapide
		Voiture voiturePlusRapide = Vehicule.getPlusRapide(Voiture.getVoitures());
		System.out.println("La voiture la plus rapide est : " + voiturePlusRapide.getNom());
	}

}
