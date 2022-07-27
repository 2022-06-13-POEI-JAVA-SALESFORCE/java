package fr.eni.ecole.module3;

import java.util.Scanner;

public class TestRestaurant {
	
	public static void main(String[] args) {
		
		Restaurant restaurant1 = new Restaurant("La cuillere d'argent", 30, "gastronomique");
		Restaurant restaurant2 = new Restaurant("Speed Pizza", 2, "fast food");
		
		Plat plat1 = new Plat("Pizza norvégienne", 11);
		Plat plat2 = new Plat("Raviole de langoustine et sa bisque parfumée à l'estragon", 30);
		
		// association de plat aux restaurants
		restaurant1.setPlatPrincipal(plat2);
		restaurant2.setPlatPrincipal(plat1);
		
		Client client = new Client("Michael","Scott",4);
		
		// On demande son choix de resto au client
		// A toi de compléter cette partie (regarde la suite pour voir les choix attendus)
		?????
		
		// selon le choix de restaurant...
		switch (choixRestaurant){
			
			case 1:
				System.out.println("Bienvenue chez " + ?????); // ici, on veut le nom du restaurant
				boolean dispo = restaurant1.checkDisponibilite(client);
				
				// si mon booleen est vrai, c'est que le resto peut accueillir le client
				if(dispo) {
					System.out.println("Nous pouvons accueillir la famille " + ????? + " !"); // ici, on veut le nom famille du client
					client.setRestaurantChoisi(restaurant1);
				}else {
					System.out.println("Malheureusement, nous sommes complet ce soir..");
					System.exit(0);
				}
				
				break;
				
			case 2:
				System.out.println("Bienvenue chez " + ?????); // ici, on veut le nom du restaurant
				boolean dispo2 = restaurant2.checkDisponibilite(client);
				
				// si mon booleen est vrai, c'est que le resto peut accueillir le client
				if(dispo2) {
					System.out.println("Nous pouvons accueillir la famille " + ????? + " !"); // ici, on veut le nom famille du client
					client.setRestaurantChoisi(restaurant2);
				}else {
					System.out.println("Malheureusement, nous sommes complet ce soir..");
					System.exit(0);
				}
				
				break;
				
			default:
				System.err.println("Veuillez saisir 1 ou 2");
				break;
		}
		
		// terminer le programme pour que le restaurant choisi par le client affiche son plat principal
		?????
		
	}

}
