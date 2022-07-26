package module1;

import java.util.Scanner;

public class Fonctions {

	public static void main(String[] args) {
		
		String prenom = "Alan";
		direBonjour(prenom);
		
		// je demande la température à l'user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quel température fait-il ?");
		int temperature = scanner.nextInt();
		
		// je passe la température à ma fonction
		int degres = calculerTemparature(temperature);
		System.out.println(degres);
		
	}
	
	// Cette fonction salue l'utilisateur
	public static void direBonjour(String prenom) {
		
		System.out.println("Salut c'est moi " + prenom);
		
	}
	
	// Cette fonction renvoi la température du jour
	public static int calculerTemparature(int temperature) {
		
		int age = 30;
		if(age >= 30) {
			temperature = temperature + 10;
		}
		return temperature;
		
	}

}
