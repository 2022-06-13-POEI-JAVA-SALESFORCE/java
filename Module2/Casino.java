package tp2;

public class Casino {

	public static void main(String[] args) {
		
		Joueur joueur1 = new Joueur("Alan");
		Joueur joueur2 = new Joueur("Bob");
		
		// tant que les joueurs ont assez de jetons ...
		while(joueur1.getNbJetons() >= 10 && joueur2.getNbJetons() >= 10){
			
			// que la bataille commence !
			String resultat = joueur1.bataille(joueur2);
			
			// on check le résultat obtenu par le joueur 1
			if(resultat.equals("victoire")) {
				
				// en cas de victoire du J1, le joueur 2 perd 10 jetons
				System.out.println("Le joueur 1 gagne !");
				joueur2.setNbJetons(joueur2.getNbJetons() - 10);
				
			}else {
				
				// en cas de défaite du J1, il perd 10 jetons
				System.out.println("Le joueur 2 gagne !");
				joueur1.setNbJetons(joueur1.getNbJetons() - 10);
			}
			
		}
		
		// affiche le joueur qui a le plus de jetons
		if(joueur1.getNbJetons() > joueur2.getNbJetons()) {
			
			System.out.println(joueur1.getPrenom() + " gagne la partie avec "+joueur1.getNbJetons()+" jetons restants");
			
		}else {
			
			System.out.println(joueur2.getPrenom() + " gagne la partie avec "+joueur2.getNbJetons()+" jetons restants");
			
		}

	}

}
