package tp4;

public class Arene {

	public static void main(String[] args) {
		
		// Partie 1
		Gladiateur maximus = new Gladiateur("L'exil�","belluaires");
		Gladiateur lupus = new Gladiateur("Le loup","hoplomaques");
		Gladiateur tritton = new Gladiateur("L'�tripeur de boyaux","mirmillons");
		
		Arme glaive = new Arme("Glaive",3);
		Arme filet = new Arme("Filet",1);
		Arme trident = new Arme("Trident",5);
		
		System.out.println("------- TOUTOUUUUUUUUM -------");
		
		// les gladiateurs se pr�sentent
		maximus.presentation();
		lupus.presentation();
		tritton.presentation();
		
		// chacun s'�quipe d'une arme
		maximus.setArme(trident);
		lupus.setArme(filet);
		tritton.setArme(glaive);
		
		// Annonce � la foule
		maximus.presentationEquipement();
		lupus.presentationEquipement();
		tritton.presentationEquipement();
		
		System.out.println("------- OOOOHHHH-------");
		
		// Partie 2
		Gladiateur.presentationNbMorts();
		
		Senateur antiste = new Senateur("Maurice","Antiste",450);
		Senateur auguste = new Senateur("Sylla","Auguste",370);
		Senateur caligula = new Senateur("Marc","Caligula",1145);
		
		// Mort d'un gladiateur
		System.out.println("OHH OUUII, "+maximus.getNom()+" EST TOMB� !!");
		Gladiateur.setNbMorts(Gladiateur.getNbMorts() + 1);
		
		System.out.println("----- SENATEURS, CHOISISSEZ VOTRE HEROS -----");
		
		// Cr�ation de tableaux de s�nateurs
		Senateur[] groupe1 = {antiste,caligula};
		Senateur[] groupe2 = {auguste};
		
		lupus.setSenateurs(groupe2);
		tritton.setSenateurs(groupe1);
		
		// affichage du soutient des s�nateurs
		lupus.soutienSenateur();
		tritton.soutienSenateur();
		
		Gladiateur.setNbMorts(Gladiateur.getNbMorts() + 1);
		
		Gladiateur.presentationNbMorts();
		
		// Bonus 1
		lupus.presentationGain();
		tritton.presentationGain();
		
		// Bonus 2
		Gladiateur[] gladiateurs = {lupus,tritton};
		Gladiateur lePlusRiche = Gladiateur.getPlusRiche(gladiateurs);
		
		System.out.println("Le gladiateur le plus riche est " + lePlusRiche.getNom());
	}

}
