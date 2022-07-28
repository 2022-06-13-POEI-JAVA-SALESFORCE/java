package exo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manutention {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Combien d'heures souhaitez-vous que votre artisan vienne sur place ?");
		
		int nbHeures = 0;
		
		// je sécurise le scanner
		try {
			
			nbHeures = scanner.nextInt();
			
		}catch(InputMismatchException e) {
			
			System.err.println("Veuillez saisir un entier");
			System.exit(0);
			
		}
		scanner.close();
		
		Artisan michel = new Artisan("Rebiere","Michel","menusier",50);
		
		// je calcule le cout de l'artisan
		int prix = michel.calculerTarif(nbHeures);
		System.out.println("Le prix de l'artisan est de : " + prix + " euros");

	}

}
