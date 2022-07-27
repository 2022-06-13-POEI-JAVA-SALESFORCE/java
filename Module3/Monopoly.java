package module3;

public class Monopoly {

	public static void main(String[] args) {
		
		Terrain pigalle = new Terrain(150);
		pigalle.setNiveauConstruction(1);
		pigalle.setNbMaison(1);
		
		Terrain ruePaix = new Terrain(150);
		ruePaix.setNbMaison(3);
		
		Terrain.setNbMaisonsDispo(50);
		
		System.out.println("Dans le plateau, il y a : " + Terrain.getNbMaisonsDispo() + " maisons");

	}

}
