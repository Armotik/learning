package fr.armotik.heritage;

public class Professeur extends Personne {

    private String matiere; // matière enseignée par le professeur (private: accessible uniquement par la classe Professeur)
    private String diplome;

    /**
     * Constructeur de la classe Professeur
     * @param nom le nom du professeur
     * @param prenom le prenom du professeur
     * @param age l'age du professeur
     * @param matiere la matière enseignée par le professeur
     * @param diplome le diplôme du professeur
     */
    public Professeur(String nom, String prenom, int age, String matiere, String diplome) {
        super(nom, prenom, age);
        this.matiere = matiere;
        this.diplome = diplome;
    }

    /**
     * Affiche les informations du professeur (nom, prenom, age, matière, diplôme)
     * Cette méthode est redéfinie dans la classe Professeur pour afficher les informations spécifiques au professeur
     * @override -> redéfinition de la méthode afficher() de la classe Personne
     * super.afficher() -> appel de la méthode afficher() de la classe Personne
     */
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Je suis professeur en " + matiere + " et j'ai un diplôme de " + diplome);
    }
}
