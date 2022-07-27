package module3;

public class Terrain {
	private int coutConstruction;
	private int niveauConstruction;

	private static int nbMaisonsDispo;
	
	private int nbMaison;
	
	public Terrain(int coutConstruction) {
		this.coutConstruction = coutConstruction;
	}
	
	public int getCoutConstruction() {
		return coutConstruction;
	}
	public void setCoutConstruction(int coutConstruction) {
		this.coutConstruction = coutConstruction;
	}
	public int getNiveauConstruction() {
		return niveauConstruction;
	}
	public void setNiveauConstruction(int niveauConstruction) {
		this.niveauConstruction = niveauConstruction;
	}
	public static int getNbMaisonsDispo() {
		return nbMaisonsDispo;
	}
	public static void setNbMaisonsDispo(int nbMaisonsDispo) {
		Terrain.nbMaisonsDispo = nbMaisonsDispo;
	}

	public int getNbMaison() {
		return nbMaison;
	}

	public void setNbMaison(int nbMaison) {
		this.nbMaison = nbMaison;
	}
}
