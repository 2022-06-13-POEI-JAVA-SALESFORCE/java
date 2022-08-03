package tpDeLogique;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Quel est votre prénom ? ");
		Scanner scan = new Scanner(System.in);
		String prenom = scan.nextLine();

		System.out.println("Ok " + prenom + " vous souhaitez que je choisisse un nombre entre 1 et combien ?");
		int nbJoueur = 0;

		try {
			nbJoueur = scan.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Veuillez renseigner un entier");
		}

		int nbAleatoire = new Random().nextInt(nbJoueur) + 1;

		int choixUser = 0;
		int compteur = 0;
		while (nbAleatoire != choixUser) {

			System.out.println("Tentez votre chance quel est mon nombre ?");
			choixUser = scan.nextInt();
			compteur += 1;
			if (choixUser > nbAleatoire) {

				System.out.println("C'est moins");
				
			}else if (choixUser < nbAleatoire){

				System.out.println("C'est plus");
				
			}else {

				System.out.println("bravo, mon nombre était : " + choixUser +" vous l'avez trouvé en " + compteur +" tentatives.");
				
			}
		}

		System.out.println(nbAleatoire);
	}

}