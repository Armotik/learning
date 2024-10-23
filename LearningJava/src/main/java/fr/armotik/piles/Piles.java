package fr.armotik.piles;

import java.util.ArrayList;
import java.util.List;

public class Piles {

    private List<String> pile; // On initialise une liste

    /**
     * Constructeur de la classe Piles
     */
    public Piles() {

        this.pile = new ArrayList<String>(); // On initialise la liste étant un ArrayList de String
    }


    /**
     * Récupère la pile
     */
    public List<String> getPile() {
        return pile;
    }

    /**
     * Définit la pile
     * @param pile la pile à définir
     */
    public void setPile(List<String> pile) {
        this.pile = pile;
    }

    /**
     * Ajoute un element à la pile
     * @param pile le fichier à ajouter
     */
    public void addPile(String pile) {

        // Dans une pile, le premier élément ajouté est le dernier élément sorti
        // On ajoute donc le fichier à la fin de la liste avec la méthode add de la classe List (ici ArrayList)
        // La méthode add ajoute l'élément à la fin de la liste
        this.pile.add(pile);
    }

    /**
     * Retire un élément de la pile
     * @return l'élément retiré
     */
    public String removePile() {

        // Dans une pile, le premier élément ajouté est le dernier élément sorti
        // On retire le dernier élément de la liste avec la méthode remove de la classe List (ici ArrayList)
        // La méthode remove retire l'élément à l'index donné
        // Ici, on retire l'élément à l'index de la taille de la liste - 1 (car les index commencent à 0)
        return this.pile.remove(this.pile.size() - 1);
    }

    /**
     * Affiche la pile
     */
    public void afficherPile() {

        // On parcourt la liste avec une boucle for
        // On commence à l'index de la taille de la liste - 1 (car les index commencent à 0)
        // On s'arrête à l'index 0
        // On décrémente l'index à chaque tour de boucle
        for (int i = this.pile.size() - 1; i >= 0; i--) {
            // On affiche l'élément à l'index i de la liste
            System.out.println(this.pile.get(i));
        }
    }
}
