# Développement Java

## Sujets abordés

### 1. Bases de Java
- **Classes et Objets** : Comprendre la création de classes et d'objets, les attributs et méthodes.
- **Encapsulation** : Utilisation de modificateurs d'accès (public, private, protected) pour protéger les données.
- **Constructeurs** : Comment définir et utiliser des constructeurs pour initialiser des objets.

### 2. Héritage
- **Définition** : L'héritage permet de créer une nouvelle classe à partir d'une classe existante, en réutilisant son code.
- **Exemple** : 
    - Classe `Personne` (classe de base) avec les attributs `nom` et `âge`.
    - Classe `Etudiant` et `Professeur` qui héritent de `Personne` et ajoutent des attributs spécifiques.
  
    ```java
    public class Personne {
        protected String nom;
        protected int age;

        public Personne(String nom, int age) {
            this.nom = nom;
            this.age = age;
        }

        public void sePresenter() {
            System.out.println("Bonjour, je m'appelle " + nom + " et j'ai " + age + " ans.");
        }
    }

    public class Etudiant extends Personne {
        private String universite;

        public Etudiant(String nom, int age, String universite) {
            super(nom, age);
            this.universite = universite;
        }

        @Override
        public void sePresenter() {
            super.sePresenter();
            System.out.println("Je suis étudiant à " + universite + ".");
        }
    }
    ```

### 3. Polymorphisme
- **Définition** : Le polymorphisme permet d'utiliser un même nom de méthode avec des comportements différents selon la classe de l'objet.
- **Exemple** :
    - La méthode `sePresenter()` redéfinie dans les classes `Etudiant` et `Professeur`.
  
### 4. Structures de Données
#### Files
- **Concept** : Une file (queue) est une structure de données de type FIFO (First In First Out).
- Dans la pratique, une file est souvent utilisée pour stocker des éléments à traiter dans l'ordre où ils ont été ajoutés.

#### Piles
- **Concept** : Une pile (stack) est une structure de données de type LIFO (Last In First Out).
- Dans la pratique, une pile est souvent utilisée pour stocker des éléments à traiter dans l'ordre inverse de leur ajout.


## Comment utiliser ce répertoire ?
- **Exécuter les exemples** : Vous pouvez copier ces exemples dans votre IDE Java et les exécuter pour voir comment fonctionnent l'héritage, le polymorphisme, ainsi que les structures de données telles que les files et les piles.
- **Révision** : Ce répertoire contient les concepts fondamentaux pour bien comprendre les bases du développement Java.

---

### Ressources supplémentaires :
- [Documentation officielle de Java](https://docs.oracle.com/en/java/)

---

Auteur : Anthony Mudet / Armotik  
Licence 3 Informatique  
La Rochelle Université  
2024-2025  