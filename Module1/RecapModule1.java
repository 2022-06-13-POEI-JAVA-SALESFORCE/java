package module1;

import java.util.Scanner;

public class RecapModule1 {

	public static final double TVA = 20.0 / 100;

	public static void main(String[] args) {

		double prixHT = 17.85;
		System.out.println("Prix de l'article TTC : " + prixHT * (1 + TVA));

		// tableaux
		int[] valeurs = { 45, 12, 22, 66, 99, 85 };
		valeurs[3] = 1792;
		System.out.println(valeurs[0]);
		System.out.println(valeurs[5]);

		// scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quel est votre prénom ?");
		String prenom = scanner.nextLine();
		scanner.close();

		// afficher la phrase : Mon prénom est <prenom saisi>
		System.out.println("Mon prénom est " + prenom);

		// expression de la condition
		if (prenom.equals("Alan")) {

			// si la condition est respectée
			System.out.println("Eh beh bravo !");

		} else {

			// sinon, si la condition n'est pas respectée
			System.out.println("Personne n'est parfait !");

		}

		// si la longueur du prénom est égale à 0
		if (prenom.isEmpty()) {

			System.err.println("Le prénom saisi est vide");

		} else {

			System.out.println("Votre prénom fait " + prenom.length() + " caractères");

		}

		// Le switch est un menu. Il se lit "selon ...."
		String meteo = "froid";

		switch (meteo) {

			case "chaud":
				System.out.println("Sortez les maillots");
				break;
			case "froid":
				System.out.println("Sortez les bonnets");
				break;
			default:
				System.out.println("Aucune idée du temps qu'il fera");
				break;

		}

		// les boucles

		// boucle for
		int[] annees = {1968, 1984, 1975, 2020, 2004 };

		for (int i = 0; i < annees.length; i++) {

			System.out.println(annees[i]);

		}

		// boucle foreach
		System.out.println("---------------------");
		for (int annee : annees) {
			System.out.println(annee);
		}
		
		// while se lit "tant que ..."
		int i = 1;
		while(i <= 10) {
			
			System.out.println("Compteur : " + i);
			i++;
			
		}
		
		// do...while se lit "faire ... tant que ..."
		
		int age = 10;
		do {
			
			System.out.println("J'ai "+age+" ans");
			age = age + 2;
			
			
		}while(age < 30);
		
		System.out.println("Je sors");	
		
		
		
	}

}