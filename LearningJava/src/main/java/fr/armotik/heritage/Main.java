package fr.armotik.heritage;

public class Main {
    public static void main(String[] args) {

        Personne personne = new Personne("Dupont", "Jean", 30);
        personne.afficher();

        Professeur professeur = new Professeur("Durand", "Paul", 40, "Mathématiques", "Agrégation");
        professeur.afficher();

        Etudiant etudiant = new Etudiant("Martin", "Marie", 20, 123456, "Informatique");
        etudiant.afficher();
    }
}