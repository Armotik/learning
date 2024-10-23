package fr.armotik.heritage;

public class Personne {

    protected String nom; // protected: accessible par les classes filles (Professeur et Etudiant de ce cas)
    protected String prenom;
    protected int age;

    /**
     * Constructeur de la classe Personne
     * @param nom le nom de la personne
     * @param prenom le prenom de la personne
     * @param age l'age de la personne
     */
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    /**
     * Affiche les informations de la personne (nom, prenom, age)
     * Cette méthode est redéfinie dans les classes filles (Professeur et Etudiant)
     * pour afficher les informations spécifiques à chaque classe
     */
    public void afficher() {
        System.out.println("Nom: " + nom + ", Prenom: " + prenom + ", Age: " + age);
    }
}
