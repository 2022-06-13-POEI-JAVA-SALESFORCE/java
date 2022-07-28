package exo3;

public class Cinema {
	
	private String nom;
	private String ville;
	private Film filmPrincipal;
	private PopCorn popCorn;
	
	public Cinema(String nom, String ville) {
		super();
		this.nom = nom;
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Film getFilmPrincipal() {
		return filmPrincipal;
	}

	public void setFilmPrincipal(Film filmPrincipal) {
		this.filmPrincipal = filmPrincipal;
	}

	public PopCorn getPopCorn() {
		return popCorn;
	}

	public void setPopCorn(PopCorn popCorn) {
		this.popCorn = popCorn;
	}

}