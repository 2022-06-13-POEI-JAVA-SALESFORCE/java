package module1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoExceptions {

	public static void main(String[] args) {
		
		int somme = 150;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quel est le diviseur ?");
		
		int diviseur = 0;
		try {
			
			diviseur = scanner.nextInt();
			
		}catch(InputMismatchException e) {
			
			System.err.println("Veuillez choisir un entier");
			System.exit(0);
			
		}
		
		scanner.close();
		
		try {
			
			System.out.println(somme / diviseur);
			
		}catch(ArithmeticException e) {
			
			System.err.println("Pas de division par 0 !");
			System.exit(0);
			
		}

	}

}
