package Exercice1;

public class Membre extends Personne {

	public String dateAdhesion;
	public String statut;

	public Membre(String nom, String prenom, int id, String dateAdhesion, String statut) {
		super(nom, prenom, id);
	}

public void afficherDetails() {
		System.out.println("Le nom du membre est " + this.nom);
		System.out.println("Le prenom du membre est " + this.prenom);
		System.out.println("L'id de la personne est " + this.id);
		System.out.println("La date de l'adhésion du membre est " + this.dateAdhesion);
		System.out.println("Le statut du membre est " + this.statut);
}
}
