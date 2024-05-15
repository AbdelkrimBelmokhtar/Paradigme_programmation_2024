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

	public String gettitre(String titre) {

		return this.titre;
	}

	public String getauteur(String auteur) {
		return this.auteur;
	}

	public String getisbn(String isbn) {
		return this.isbn;

	}

	public Boolean getdisponible(Boolean disponible) {
		return this.disponible = disponible;
	}

	public String settitre(String titre) {
		return this.titre = titre;
	}

	public String setauteur(String auteur) {
		return this.auteur = auteur;
	}

	public String setisbn(String isbn) {
		return this.isbn = isbn;

	}

	public Boolean setdisponible(Boolean disponible) {
		return this.disponible = disponible;
	}

	public void afficherDetails() {

		System.out.println("Le titre est" + this.titre);
		System.out.println("L'auteur est" + this.auteur);
		System.out.println("isbn est " + this.isbn);
		System.out.println("Le livre est " + this.disponible);

	}

}
