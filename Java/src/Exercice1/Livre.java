package Exercice1;

public class Livre {
	String titre;
	String auteur;
	String isbn;
	Boolean disponible;

	public Livre(String titre, String auteur, String isbn, Boolean disponible) {

		this.titre = titre;
		this.auteur = auteur;
		this.isbn = isbn;
		this.disponible = disponible;

	}

	public String getTitre(String titre) {

		return this.titre;
	}

	public String getAuteur(String auteur) {
		return this.auteur;
	}

	public String getIsbn(String isbn) {
		return this.isbn;

	}

	public Boolean getDisponible(Boolean disponible) {
		return this.disponible = disponible;
	}

	public String setTitre(String titre) {
		return this.titre = titre;
	}

	public String setAuteur(String auteur) {
		return this.auteur = auteur;
	}

	public String setIsbn(String isbn) {
		return this.isbn = isbn;

	}

	public Boolean setDisponible(Boolean disponible) {
		return this.disponible = disponible;
	}

	public void afficherDetails() {

		System.out.println("Le titre est" + this.titre);
		System.out.println("L'auteur est" + this.auteur);
		System.out.println("isbn est " + this.isbn);
		System.out.println("Le livre est " + this.disponible);

	}

}
