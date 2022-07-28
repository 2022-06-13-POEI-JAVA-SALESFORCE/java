package module4;

public class Monopoly {

	public static void main(String[] args) {
		
		// cr�er 2 joueurs et 2 propri�t�s (lecourbe (rose) et foch (verte)
		Joueur joueur1 = new Joueur("Alan");
		Joueur joueur2 = new Joueur("Mathieu");
		
		Propriete lecourbe = new Propriete(50,"Lecourbe","rose");
		Propriete belleville = new Propriete(50,"Belleville","rose");
		Propriete foch = new Propriete(150,"Foch","verte");
		
		// associer un joueur � une propri�t� (et pas une propri�t� � un joueur comme on vient de le faire)
		foch.setProprietaire(joueur2);
		
		System.out.println("Le proprio de foch est : "+ foch.getProprietaire().getNom());
		
		foch.setProprietaire(joueur1);
		
		System.out.println("Le proprio de foch est : "+ foch.getProprietaire().getNom());
		
		Groupe groupe1 = new Groupe(0,"rose");
		
		// Faites en sorte qu'une propri�t� ait un groupe associ�
		lecourbe.setGroupe(groupe1);
		
		// Associez les propri�t�s lecourbe et belleville au groupe1
		Propriete[] propGr1 = {lecourbe, belleville};
		groupe1.setProprietes(propGr1);
		
		System.out.println("Les propri�t�s du groupe 1 sont : ");
		
		// affichez le nom et le prix de chaque propri�t� du groupe 1
		// Belleville - 50 euros
		// Lecourbe - 50 euros
		
		for(Propriete prop : groupe1.getProprietes()) {
			
			System.out.println(prop.getNom() + " - " + prop.getPrixAchat() + " euros");
			
		}
		
	}

}
