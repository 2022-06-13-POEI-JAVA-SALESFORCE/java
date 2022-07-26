package module2;

import java.util.Random;

public class Joueur {
	
	private int nbJetons = 100;
	private String prenom;
	
	public Joueur(String prenom) {
		
		this.setPrenom(prenom);
		
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNbJetons() {
		return nbJetons;
	}

	public void setNbJetons(int nbJetons) {
		this.nbJetons = nbJetons;
	}
	
	// lance une bataille contre un autre joueur
	public String bataille(Joueur joueur) {
		
		// effectue un tirage au sort pour les deux joueurs
		Random rand = new Random();
	    int joueur1Tirage = rand.nextInt(500);
	    int joueur2Tirage = rand.nextInt(500);
	    
	    // annonce du résultat
		if(joueur1Tirage >= joueur2Tirage) {
			return "victoire";
		}else {
			return "defaite";
		}
	    
	}

}
