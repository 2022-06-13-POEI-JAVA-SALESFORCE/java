package module1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExoException {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quel est ton age ?");
		
		int age = 0;
		
		try {
			age = scanner.nextInt();
			
		}catch(InputMismatchException e) {
			System.err.println("Veuillez saisir un entier");
			System.exit(0);
		}
		
		System.out.println("Tu as " + age + " ans");
		
		scanner.close();

	}

}
