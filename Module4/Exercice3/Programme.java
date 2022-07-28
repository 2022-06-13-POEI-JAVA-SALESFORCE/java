package exo3;

public class Programme {

	public static void main(String[] args) {
		
		// partie 1
		
		Cinema megaCgr = new Cinema("Méga CGR","La Rochelle");
		Film film1 = new Film("Le chant du loup","réel",120);
		Film film2 = new Film("Manon des sources","français",90);
		
		System.out.println("Bienvenue au "+megaCgr.getNom()+" de la ville " + megaCgr.getVille());
		
		System.out.println("Je suis un film du genre "+film1.getGenre()+" et je dure " + film1.getDuree());
		System.out.println("Je suis un film du genre "+film2.getGenre()+" et je dure " + film2.getDuree());
		
		// partie 2
		
		// association de cinema et film
		megaCgr.setFilmPrincipal(film2);
		
		System.out.println(megaCgr.getFilmPrincipal().getNom());
		
		// l'association est unidirectionnelle
		// Cinema voit Film et Film ne voit pas Cinema
		
		// partie 3
		
		PopCorn popBox = new PopCorn("sucré",8);
		megaCgr.setPopCorn(popBox);
		
		System.out.println("Le cinéma propose des popcorns au prix de : " + megaCgr.getPopCorn().getPrix() + " euros");
		
		
	}

}
