package tp1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// R�cup�ration du choix de l'utilisateur
		System.out.println("Veuillez entrer Pierre, Feuille ou Ciseau");
		Scanner scanner = new Scanner(System.in);
		String choixUser = scanner.nextLine();
		scanner.close();

		// Contr�le que le choix de l'user soit Pierre, Feuille ou Ciseau
		if (!choixUser.equals("Pierre") && !choixUser.equals("Feuille") && !choixUser.equals("Ciseau")) {

			System.err.println("Votre choix doit �tre Pierre, Feuille ou Ciseau");
			System.exit(0);

		}

		// R�cup�ration du choix de l'ordinateur
		String[] possibilitesOrdi = { "Pierre", "Feuille", "Ciseau" };
		String choixOrdi = getRandom(possibilitesOrdi);

		// Affichage du match en cours
		System.out.println(choixUser + " VS " + choixOrdi);
		
		/*Version 1
		// Cas Pierre
		if (choixUser.equals("Pierre")) {

			if (choixOrdi.equals("Pierre")) {

				System.out.println("Egalit�");

			} else if (choixOrdi.equals("Feuille")) {

				System.out.println("Perdu");

			} else {

				System.out.println("Gagn�");

			}

		}

		// Cas Feuille
		if (choixUser.equals("Feuille")) {

			if (choixOrdi.equals("Pierre")) {

				System.out.println("Gagn�");

			} else if (choixOrdi.equals("Feuille")) {

				System.out.println("Egalit�");

			} else {

				System.out.println("Perdu");

			}

		}

		// Cas Ciseau
		if (choixUser.equals("Ciseau")) {

			if (choixOrdi.equals("Pierre")) {

				System.out.println("Perdu");

			} else if (choixOrdi.equals("Feuille")) {

				System.out.println("Gagn�");

			} else {

				System.out.println("Egalit�");

			}

		}*/
		
		
		// Version 2
		
		if(
			(choixUser.equals("Pierre") && choixOrdi.equals("Ciseau")) ||
			(choixUser.equals("Ciseau") && choixOrdi.equals("Feuille")) ||
			(choixUser.equals("Feuille") && choixOrdi.equals("Pierre"))
		){
			
			System.out.println("Gagn� !");
			
		}else if(choixUser.equals(choixOrdi)) {
			
			System.out.println("Egalit�");
			
		}else {
			
			System.out.println("Perdu");
			
		}
		

	}

	// Fonction permettant de choisir au hasard un �l�ment dans un tableau
	public static String getRandom(String[] array) {
		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}

}
