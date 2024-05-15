package Exercice1;

public class Employe extends Personne {
	public String poste;
	public double salaire;

	public Employe(String nom, String prenom, int id, String poste, double salaire) {
		super(nom, prenom, id);

	}

	public String getPoste(String poste) {
		return this.poste;
	}

	public double getSalaire(String salaire) {
		return this.salaire;
	}

	public String setPoste(String poste) {
		return this.poste = poste;
	}

	public double setSalaire(double salaire) {
		return this.salaire = salaire;
	}

	public void afficherDetails() {
		System.out.println("Le nom de la personne est " + this.nom);
		System.out.println("Le prenom de la personne est " + this.prenom);
		System.out.println("L'id de la personne est " + this.id);
		System.out.println("Le poste de l'employer est " + this.poste);
		System.out.println("Le salaire de l'employer est " + this.salaire);

	}

}
