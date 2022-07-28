package tp3;

import java.util.Scanner;

public class TestRestaurantFinal {
	
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
		System.out.println("Dans quel restaurant souhaitez vous diner ce soir ?");
		System.out.println("--------------------------------------------");
		System.out.println("1 - La cuillere d'argent");
		System.out.println("2 - Speed Pizza");
		
		Scanner scanner = new Scanner(System.in);
		int choixRestaurant = scanner.nextInt();
		scanner.close();
		
		// selon le choix de restaurant...
		switch (choixRestaurant){
			
			case 1:
				System.out.println("Bienvenue chez " + restaurant1.getNom());
				boolean dispo = restaurant1.checkDisponibilite(client);
				
				// si mon booleen est vrai, c'est que le resto peut accueillir le client
				if(dispo) {
					System.out.println("Nous pouvons accueillir la famille " + client.getNom() + " !");
					client.setRestaurantChoisi(restaurant1);
				}else {
					System.out.println("Malheureusement, nous sommes complet ce soir..");
				}
				
				break;
				
			case 2:
				System.out.println("Bienvenue chez " + restaurant2.getNom());
				boolean dispo2 = restaurant2.checkDisponibilite(client);
				
				// si mon booleen est vrai, c'est que le resto peut accueillir le client
				if(dispo2) {
					System.out.println("Nous pouvons accueillir la famille " + client.getNom() + " !");
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
		client.getRestaurantChoisi().afficherPlat();
		
	}

}
