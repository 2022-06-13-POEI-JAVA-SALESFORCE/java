package exo3;

public class Programme {

	public static void main(String[] args) {
		
		Cinema megaCgr = new Cinema("Méga CGR","La Rochelle");
		Film film1 = new Film("Le chant du loup","réel",120);
		Film film2 = new Film("Manon des sources","français",90);
		
		System.out.println("Bienvenue au "+megaCgr.getNom()+" de la ville " + megaCgr.getVille());
		
		System.out.println("Je suis un film du genre "+film1.getGenre()+" et je dure " + film1.getDuree());
		System.out.println("Je suis un film du genre "+film2.getGenre()+" et je dure " + film2.getDuree());
		
	}

}
