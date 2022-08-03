package fr.caveavin;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Sommelier sommelier = new Sommelier("Durand","Michel",33); // Nom, pr�nom, anciennet�
		
		Vin vin1 = new Vin("Domaine de Puchol",new GregorianCalendar(2016,9,1),"rouge", 100, 10); // Nom, mill�sime, couleur, niveau de la bouteille, stock
		Vin vin2 = new Vin("Ch�teau Cos d'Estournel",new GregorianCalendar(2018,5,13),"rouge", 100, 8);
		Vin vin3 = new Vin("Ch�teau Pichon Baron",new GregorianCalendar(2015,7,22),"blanc", 100, 12);
		
		Client client = new Client("Dupont","Romain",4); // nom, pr�nom, taille de la famille
		
		// on met les vins dans un tableau
		Vin[] tableauVin = {vin1, vin2, vin3};
		
		// on fait �tat des stocks
		System.out.println("-----------------");
		System.out.println("Etat des stocks des vins");
		System.out.println("-----------------");
		
		// on boucle dans le tableau de vins
		for(Vin vin : tableauVin) {
			
			// afficher ici <nom du vin> : <stock du vin> bouteilles
			
		}
		
		// demande � l'utilisateur ce qu'il souhaite consommer
		System.out.println("-----------------");
		System.out.println("Bonjour "+sommelier.getNom()+", quel vin souhaitez-vous s�lectionner ?");
		System.out.println("-----------------");
		
		int index = 1;
		// on boucle dans le tableau de vins
		for(Vin vin : tableauVin) {
			
			// afficher : 
			// 1 : <nom du vin>
			// 2 : <nom du vin>
			// etc pour chaque vin dans le tableau
			
		}
		
		Scanner scanner = new Scanner(System.in);
		int reponse = scanner.nextInt();
		
		// r�cup�ration de la r�ponse du sommelier pour le vin
		if(reponse == 1) {
			
			sommelier.setVinSelectionne(vin1);
			
		}else if(reponse == 2) {
			
			sommelier.setVinSelectionne(vin2);
			
		}else if(reponse == 3){
			
			sommelier.setVinSelectionne(vin3);
			
		}
		
		Viande met1 = new Viande("Magret de canard","perigord", "rouge", 14); // nom, provenance, couleur, stock
		Viande met2 = new Viande("Poulet aux amandes","poitou", "blanc", 15);
		Viande met3 = new Viande("Gigot d'agneau","bourgogne", "rouge", 9);
		
		System.out.println("-----------------");
		System.out.println("Quel met associer au vin choisi ?");
		System.out.println("-----------------");
		
		// on met les viandes dans un tableau
		index = 1;
		// on boucle dans le tableau de viandes 
		
		// afficher : 
		// 1 : <nom de la viande>
		// 2 : <nom de la viande>
		// etc pour chaque viande dans le tableau
		
		
		
		// r�cup�ration de la r�ponse du sommelier pour le met
		if(reponse == 1) {
			
			sommelier.getVinSelectionne().setViandeSelectionnee(met1);
			
		}else if(reponse == 2) {
			
			sommelier.getVinSelectionne().setViandeSelectionnee(met2);
			
		}else if(reponse == 3){
			
			sommelier.getVinSelectionne().setViandeSelectionnee(met3);
			
		}
		
		// Afficher : Vous avez s�lectionn� le vin <nom du vin selectionn�> et le met <nom du met s�lectionn�>
		
		// on baisse les stocks
		sommelier.baisserStock(); // baissera de 1 le stock du vin s�lectionn� ainsi que celui de la viande selectionn�e (si vous bloquez trop, mettez la fonction en commentaire et passer � la suite)
		
		// les clients passent � table
		Vin.presentation(); // affichera : Nos vins sont servis � temp�rature ambiante
		Viande.presentation(); // affichera : Nos viandes assaisonn�es avec amour
		
		int nbGorgees = 0;
		
		// les convives commencent � boire
		
		
		// tant que le niveau de la bouteille du vin s�lectionn� par le sommelier est sup�rieur � 0
			
			// les clients boivent et baissent toujours la bouteille de 5 gorg�es * la taille de la famille
			sommelier.getVinSelectionne().setNiveauBouteille(sommelier.getVinSelectionne().getNiveauBouteille() - 5*client.getTailleFamille());
			
		
		// Le sommelier repropose du vin
		System.out.println("Le sommelier chuchotte : ils ont bu "+nbGorgees+" gorg�es");
		
		String reponse2 = "";
		while(reponse2 != "Oui" && reponse2 != "Non") {
			System.out.println("-----------------");
			System.out.println("Souhaitez vous une nouvelle bouteille ?");
			System.out.println("Oui ou Non ?");
			System.out.println("-----------------");
			
			
			
		}
		
		if(reponse2 == "Non") {
			System.out.println("Bonne soir�e et merci pour tout !");
			System.exit(0);
		}
		
		// on remet le niveau de la bouteille s�lectionn�e � 100
		
		System.out.println("----- Le reste de la soir�e se d�roulera sans encombres -----");
		System.out.println(".");
		System.out.println("..");
		System.out.println("...");
		System.out.println("....");
		System.out.println(".....");
		
		System.out.println("----- Le lendemain, on fait �tat des stocks de vin -----");
		
		// afficher ici l'�tat des stocks de vin; la bouteille choisi par le sommelier la veille doit avoir diminu� de 1
		
		
	}

}