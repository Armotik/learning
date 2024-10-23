package fr.armotik.files;

import java.util.ArrayList;
import java.util.List;

public class Files {

    private List<String> file; // On initialise une liste

    /**
     * Constructeur de la classe Files
     */
    public Files() {

        this.file = new ArrayList<String>(); // On initialise la liste étant un ArrayList de String
    }


    /**
     * Récupère la file
     */
    public List<String> getFiles() {
        return file;
    }

    /**
     * Définit la file
     * @param files la file à définir
     */
    public void setFiles(List<String> files) {
        this.file = files;
    }

    /**
     * Ajoute un element à la file
     * @param file le fichier à ajouter
     */
    public void addFile(String file) {

        // Dans une file, le premier élément ajouté est le premier élément sorti
        // On ajoute donc le fichier à la fin de la liste avec la méthode add de la classe List (ici ArrayList)
        // La méthode add ajoute l'élément à la fin de la liste
        this.file.add(file);
    }

    /**
     * Retire un élément de la file
     * @return l'élément retiré
     */
    public String removeFile() {

        // Dans une file, le premier élément ajouté est le premier élément sorti
        // On retire le premier élément (index 0) de la liste avec la méthode remove de la classe List (ici ArrayList)
        // La méthode remove retire l'élément à l'index donné
        return this.file.remove(0);
    }

    /**
     * Affiche la file
     */
    public void afficher() {

        // On parcourt la liste avec une boucle for
        // On récupère chaque élément de la liste avec la méthode get de la classe List (ici ArrayList)
        // La méthode get récupère l'élément à l'index donné
        // On affiche chaque élément avec la méthode println de la classe System.out
        for (int i = 0; i < this.file.size(); i++) {
            System.out.println(this.file.get(i));
        }
    }
}
