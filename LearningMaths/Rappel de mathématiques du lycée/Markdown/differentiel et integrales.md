# Mathématiques pour l'Informatique

## Calcul différentiel et intégral

### Introduction

Le calcul différentiel et intégral est une branche fondamentale des mathématiques qui étudie les variations et les accumulations. Il permet de comprendre comment une grandeur évolue (via les dérivées), et comment l’on peut mesurer une quantité totale à partir d’une densité ou d’un taux (via les intégrales).

En informatique, ces notions apparaissent dans de nombreux domaines : traitement d’images, simulations physiques, intelligence artificielle, analyse de courbes, optimisation, ou encore modélisation continue dans les jeux vidéo et les algorithmes. Ce chapitre propose une révision structurée des concepts essentiels abordés au lycée, tout en les recontextualisant dans une perspective utile aux études supérieures.

---

### Plan du chapitre

1. **Notion de fonction et continuité**
2. **Dérivation**
   - Définition de la dérivée
   - Interprétations géométrique et physique
   - Règles de dérivation
   - Étude des variations d’une fonction
3. **Intégration**
   - Définition de l’intégrale définie
   - Interprétations géométrique et physique
   - Calculs d’intégrales simples
   - Lien entre intégrale et aire
4. **Théorèmes fondamentaux**
   - Théorème de Rolle
   - Théorème des accroissements finis
   - Théorème fondamental de l’analyse
5. **Applications en informatique**
   - Modélisation de courbes
   - Calculs de surfaces, volumes ou vitesses
   - Résolution de problèmes d’optimisation

---

## 1. Fonction et continuité

Une **fonction** associe à chaque élément d’un ensemble un unique élément d’un autre ensemble. En calcul, on travaille souvent avec des fonctions $f : \mathbb{R} \to \mathbb{R}$, représentées graphiquement dans un plan cartésien.

On dit qu’une fonction $f$ est **continue** en un point $a$ si :

$$
\lim_{x \to a} f(x) = f(a)
$$

Une fonction continue ne présente **pas de saut, de trou ou de discontinuité** dans son tracé. C’est une condition essentielle pour pouvoir dériver ou intégrer une fonction.

---

## 2. Dérivation

### 2.1 Définition de la dérivée

La dérivée d’une fonction $f$ en un point $a$ mesure le **taux de variation instantané** de $f$ au point $a$. Elle est définie comme la limite suivante, si elle existe :

$$
f'(a) = \lim_{h \to 0} \frac{f(a + h) - f(a)}{h}
$$

Cela correspond à la **pente de la tangente** à la courbe de $f$ au point $(a, f(a))$.

---

### 2.2 Interprétations

- **Géométrique** : $f'(a)$ est la pente de la droite tangente à la courbe.
- **Physique** : Si $f(t)$ représente une position, alors $f'(t)$ représente la vitesse instantanée.

---

### 2.3 Règles de dérivation usuelles

| Fonction         | Dérivée               |
| ---------------- | --------------------- |
| $f(x) = c$       | $f'(x) = 0$           |
| $f(x) = x^n$     | $f'(x) = nx^{n-1}$    |
| $f(x) = \sin(x)$ | $f'(x) = \cos(x)$     |
| $f(x) = \cos(x)$ | $f'(x) = -\sin(x)$    |
| $f(x) = e^x$     | $f'(x) = e^x$         |
| $f(x) = \ln(x)$  | $f'(x) = \frac{1}{x}$ |

**Règles de calcul** :

- $(u + v)' = u' + v'$
- $(uv)' = u'v + uv'$
- $\left( \frac{u}{v} \right)' = \frac{u'v - uv'}{v^2}$
- $(f \circ g)'(x) = f'(g(x)) \cdot g'(x)$ (dérivée d’une composée)

---

### 2.4 Étude des variations

La dérivée est utilisée pour :

- Déterminer les **intervalles de croissance ou décroissance**.
- Identifier les **extrema** (maximums, minimums locaux).
- Étudier la **convexité** (via la dérivée seconde).

---

## 3. Intégration

### 3.1 Définition

L’intégrale définie d’une fonction $f$ sur l’intervalle $[a, b]$ correspond à l’**aire algébrique** entre la courbe de $f$ et l’axe des abscisses, entre $x = a$ et $x = b$ :

$$
\int_a^b f(x)\, dx
$$

Cette intégrale représente une **somme continue** de valeurs infinitésimales.

---

### 3.2 Interprétations

- **Géométrique** : Aire sous la courbe.
- **Physique** : Si $f(t)$ est une vitesse, alors $\int_a^b f(t)\, dt$ donne la distance parcourue entre $t = a$ et $t = b$.

---

### 3.3 Calculs d’intégrales simples

| Fonction              | Intégrale                                  |
| --------------------- | ------------------------------------------ |
| $\int x^n dx$         | $\frac{x^{n+1}}{n+1} + C$ (si $n \neq -1$) |
| $\int \frac{1}{x} dx$ | $\ln$                                      |
| $\int e^x dx$         | $e^x + C$                                  |
| $\int \sin(x) dx$     | $- \cos(x) + C$                            |
| $\int \cos(x) dx$     | $\sin(x) + C$                              |

$C$ est la constante d’intégration (intégrale indéfinie).

---

## 4. Théorèmes fondamentaux

### 4.1 Théorème de Rolle

Si $f$ est continue sur $[a, b]$, dérivable sur $]a, b[$, et $f(a) = f(b)$, alors il existe $c \in ]a, b[$ tel que $f'(c) = 0$.

### 4.2 Théorème des accroissements finis

Si $f$ est continue sur $[a, b]$ et dérivable sur $]a, b[$, alors :

$$
\exists c \in ]a, b[ \text{ tel que } f'(c) = \frac{f(b) - f(a)}{b - a}
$$

### 4.3 Théorème fondamental de l’analyse

Si $f$ est continue sur $[a, b]$, alors la fonction :

$$
F(x) = \int_a^x f(t)\, dt
$$

est dérivable et $F'(x) = f(x)$. Autrement dit, **la dérivée d’une intégrale donne la fonction initiale**.

---

## 5. Applications en informatique

### 5.1 Analyse de courbes et de trajectoires

- Calculs de **vitesses**, **accélérations** dans les jeux vidéo et les simulations physiques.
- Suivi de trajectoires d’objets via les dérivées successives.

### 5.2 Optimisation

- Recherche de maximums/minimums locaux (ex : minimiser une fonction coût, maximiser une efficacité).
- Utilisation dans des algorithmes d’**apprentissage automatique** (descente de gradient).

### 5.3 Traitement du signal

- Les intégrales sont utilisées pour **lisser des signaux**, **calculer des moyennes mobiles**, ou modéliser des phénomènes continus.
- Les dérivées permettent de détecter des **changements rapides** (comme les contours dans une image).

### 5.4 Informatique graphique

- Calcul d’aires et de volumes.
- Création de courbes lisses (splines, Bézier).
- Simulation de mouvements physiques réalistes.

---

## Conclusion

Le calcul différentiel et intégral fournit des outils puissants pour analyser et modéliser les phénomènes dynamiques et continus. En informatique, il apparaît dans des applications aussi diverses que la simulation, l’apprentissage automatique, la visualisation, ou le traitement de données physiques. Une bonne maîtrise de ces notions ouvre la porte à des raisonnements mathématiques rigoureux, utiles dans de nombreux algorithmes avancés.
