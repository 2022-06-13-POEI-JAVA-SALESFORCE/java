package tp4;

public class Gladiateur {
	
	private String nom;
	private String style;
	private Arme arme;
	private static int nbMorts = 0;
	private Senateur[] senateurs;
	
	public Gladiateur(String nom, String style) {
		super();
		this.nom = nom;
		this.style = style;
	}
	
	// Présentation d'un gladiateur
	public void presentation() {
		
		System.out.println("Avé JavaDevelopper, "+this.nom+" pour vous servir jusqu'à la mort");
		
	}
	
	// Affiche l'arme équipée par un gladiateur
	public void presentationEquipement() {
		
		System.out.println("Le gladiateur "+this.style+" a choisi l'arme " + this.arme.getNom());
		
	}
	
	// Affiche le nombre de mort
	public static void presentationNbMorts() {
		
		// Version ternaire
		System.out.println("L'arène décompte un total de " + Gladiateur.nbMorts + " mort" + (Gladiateur.nbMorts > 1 ? "s": "") + " aujourd'hui" );
		
		// version 1
		/*switch(Gladiateur.nbMorts){
			
			case 0, 1 :
				System.out.print(" mort");
				break;
			default:
				System.out.print(" morts");
				break;
		
		}
		
		System.out.println(" aujourd'hui");*/
		
		
		
	}
	
	// renvoie le nombre de sesterces d'un gladiateur
	public int calculerBourse() {
		
		int bourse = 0;
		for(Senateur senateur : this.senateurs) {
			
			bourse = bourse + senateur.getNbSesterces();
			
		}
		
		return bourse;
		
	}
	
	// Affiche les gains d'un gladiateur
	public void presentationGain() {
		
		int bourse = this.calculerBourse();
		System.out.println("Le gladiateur "+this.nom+" a gagné "+bourse+" sesterces");
		
	}
	
	// Renvoi le gladiateur le plus riche
	public static Gladiateur getPlusRiche(Gladiateur[] gladiateurs) {
		
		int bourseMax = 0;
		Gladiateur lePlusRiche = null;
		// pour chaque gladiateur
		for(Gladiateur gladiateur : gladiateurs) {
			
			// si la bourse du gladiateur est la plus remplie
			if(gladiateur.calculerBourse() > bourseMax) {
				
				bourseMax = gladiateur.calculerBourse();
				lePlusRiche = gladiateur;
			}
			
		}
		
		return lePlusRiche;
		
	}
	
	// Affiche le soutien du ou des sénateurs
	public void soutienSenateur() {
		
		System.out.println("Le gladiateur "+this.nom+" termine le combat avec le soutien de : ");
		
		for(Senateur senateur : this.senateurs) {
			
			System.out.println(senateur.getNom() + " " + senateur.getPrenom());
			
		}
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}

	public static int getNbMorts() {
		return nbMorts;
	}

	public static void setNbMorts(int nbMorts) {
		Gladiateur.nbMorts = nbMorts;
	}

	public Senateur[] getSenateurs() {
		return senateurs;
	}

	public void setSenateurs(Senateur[] senateurs) {
		this.senateurs = senateurs;
	}

}
