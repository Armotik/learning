package fr.armotik.heritage;

public class Etudiant extends Personne {

    private int numeroEtudiant; // numéro étudiant de l'étudiant (private: accessible uniquement par la classe Etudiant)
    private String formation;

    /**
     * Constructeur de la classe Etudiant
     * @param nom le nom de l'étudiant
     * @param prenom le prenom de l'étudiant
     * @param age l'age de l'étudiant
     * @param numeroEtudiant le numéro étudiant de l'étudiant
     * @param formation la formation de l'étudiant
     */
    public Etudiant(String nom, String prenom, int age, int numeroEtudiant, String formation) {
        super(nom, prenom, age);
        this.numeroEtudiant = numeroEtudiant;
        this.formation = formation;
    }

    /**
     * Affiche les informations de l'étudiant (nom, prenom, age, numéro étudiant, formation)
     * Cette méthode est redéfinie dans la classe Etudiant pour afficher les informations spécifiques à l'étudiant
     * @override -> redéfinition de la méthode afficher() de la classe Personne
     * super.afficher() -> appel de la méthode afficher() de la classe Personne
     */
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Je suis étudiant en " + formation + " et mon numéro étudiant est " + numeroEtudiant);
    }
}
