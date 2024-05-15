package Exercice1;

public abstract class Personne{

	protected String nom;
	protected String prenom;
	protected int id;

public Personne(String nom, String prenom, int id ) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
}

	public String getNom(String nom) {
		return this.nom;
	}

	public String getPrenom(String prenom) {
		return this.prenom;
	}

	public int getId(int id) {
		return this.id;
	}

	public String setNom(String nom) {
		return this.nom = nom;
	}

	public String setprenom(String prenom) {
		return this.prenom = prenom;
	}

	public int setid(int id) {
		return this.id = id;
	}

	public void afficherDetails() {
		System.out.println("Le nom de la personne est " + this.nom);
		System.out.println("Le prenom de la personne est " + this.prenom);
		System.out.println("L'id de la personne est " + this.id);
	}

}
