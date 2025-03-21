# Mathématiques pour l'Informatique

## Trigonométrie

### Introduction

La trigonométrie est une branche essentielle des mathématiques qui s'intéresse aux relations entre les angles et les longueurs dans les triangles, notamment les triangles rectangles. Elle constitue une base solide pour de nombreux domaines scientifiques et techniques, comme la physique, la géométrie, l'ingénierie, et bien sûr, l'informatique.

Même si à première vue la trigonométrie peut sembler éloignée du monde de l'informatique, elle intervient plus souvent qu'on ne le croit : que ce soit dans le traitement d’images, la modélisation 3D, les jeux vidéo, les algorithmes de navigation ou encore l’analyse de signaux. Avoir une bonne compréhension de ses principes fondamentaux est donc un véritable atout.

Ce chapitre est conçu comme un **rappel des concepts clés de la trigonométrie**, destiné à vous fournir l’essentiel pour comprendre et réutiliser ces notions dans un contexte informatique. L’objectif n’est pas d’explorer en profondeur toutes les démonstrations mathématiques, mais plutôt de vous donner une boîte à outils claire et efficace.

---

### Sujets abordés

1. **Fonctions trigonométriques** :
   
   - Définition : sinus, cosinus, tangente, cotangente, sécante, cosécante.
   - Propriétés générales et symétries.
   - Périodicité et variations.

2. **Identités trigonométriques** :
   
   - Identités fondamentales (par exemple : $sin²(x) + cos²(x) = 1$).
   - Formules d’addition, de duplication, de moitié.
   - Relations entre les fonctions.

3. **Cercle trigonométrique** :
   
   - Définition et repérage sur le cercle unité.
   - Visualisation des fonctions trigonométriques.
   - Angles orientés et radian.

4. **Applications géométriques et informatiques** :
   
   - Résolution de triangles.
   - Calculs de distances et d’angles.
   - Applications concrètes en géométrie analytique, graphiques 2D/3D, animations et plus encore.

---

### Introduction aux fonctions trigonométriques

Les fonctions trigonométriques sont des fonctions mathématiques fondamentales qui décrivent les relations entre les angles et les longueurs dans les triangles, en particulier dans les triangles rectangles. Ces fonctions permettent également de modéliser des phénomènes cycliques, comme les ondes, ce qui les rend très utiles dans de nombreux domaines scientifiques.

Dans la suite de ce chapitre, nous verrons comment les définir, les interpréter graphiquement et les utiliser pour résoudre des problèmes concrets.

### 1. Définition : sinus, cosinus, tangente, cotangente, sécante, cosécante

Les fonctions trigonométriques de base sont définies à partir des relations entre les côtés d’un **triangle rectangle**. On considère un angle aigu \( $\theta$ \) dans un triangle rectangle, et on note :

- **Hypoténuse** : côté opposé à l’angle droit (le plus long).
- **Côté opposé** : côté en face de l’angle ( $\theta$ )  .
- **Côté adjacent** : côté qui touche l’angle \( $\theta$ \), mais qui n’est pas l’hypoténuse.

On définit alors six fonctions trigonométriques fondamentales :

| Fonction       | Définition (triangle rectangle)                  | Formule                                                          |
|:--------------:|:------------------------------------------------ |:---------------------------------------------------------------- |
| **Sinus**      | Rapport entre le côté opposé et l'hypoténuse     | \( $\sin(\theta) = \frac{\text{opposé}}{\text{hypoténuse}}$ \)   |
| **Cosinus**    | Rapport entre le côté adjacent et l'hypoténuse   | \( $\cos(\theta) = \frac{\text{adjacent}}{\text{hypoténuse}}$ \) |
| **Tangente**   | Rapport entre le côté opposé et le côté adjacent | \( $\tan(\theta) = \frac{\text{opposé}}{\text{adjacent}}$ \)     |
| **Cotangente** | Rapport entre le côté adjacent et le côté opposé | \( $\cot(\theta) = \frac{\text{adjacent}}{\text{opposé}}$ \)     |
| **Sécante**    | Inverse du cosinus                               | \( $\sec(\theta) = \frac{1}{\cos(\theta)} $\)                    |
| **Cosécante**  | Inverse du sinus                                 | \( $\csc(\theta) = \frac{1}{\sin(\theta)}$ \)                    |

#### 1.1. Astuce pour s’en souvenir :

Une astuce mnémotechnique souvent utilisée est **SOH-CAH-TOA** :

- **S**inus = **O**pposé / **H**ypoténuse  
- **C**osinus = **A**djacent / **H**ypoténuse  
- **T**angente = **O**pposé / **A**djacent

#### 1.2. Exemple simple :

Prenons un triangle rectangle où l'angle \( $\theta$ \) vaut 30°, l’hypoténuse mesure 2 unités, et le côté opposé mesure 1 unité.

- \( $\sin(30°) = \frac{1}{2}$ \)
- \( $\cos(30°) = \frac{\sqrt{3}}{2}$ \)
- \( $\tan(30°) = \frac{1}{\sqrt{3}}$ \)

Ces valeurs sont souvent à connaître par cœur pour les angles remarquables (30°, 45°, 60°), car elles reviennent fréquemment en pratique.

---

Ces définitions posent les bases des fonctions trigonométriques. Dans les sections suivantes, nous verrons comment elles se comportent, leurs propriétés, et comment les visualiser à l’aide du cercle trigonométrique.

---

### 2. Propriétés générales et symétries

Les fonctions trigonométriques possèdent plusieurs propriétés importantes, liées à leur comportement périodique, leur symétrie, ainsi que leurs signes dans les différents quadrants du cercle trigonométrique. Comprendre ces propriétés permet de manipuler plus facilement les expressions trigonométriques et de résoudre des équations.

#### 2.1. Périodicité

- **Sinus** et **cosinus** sont des fonctions **périodiques de période \(2\pi\)** :  
  \( $\sin(x + 2\pi) = \sin(x)$ \), \( $\cos(x + 2\pi) = \cos(x)$ \)
- **Tangente** et **cotangente** ont une période de \( $\pi$ \) :  
  \( $\tan(x + \pi) = \tan(x)$ \), \( $\cot(x + \pi) = \cot(x)$ \)

Cela signifie que leurs courbes se répètent indéfiniment à intervalles réguliers.

#### 2.2. Symétries (parité des fonctions)

Certaines fonctions trigonométriques sont **paires** (symétriques par rapport à l’axe vertical), d’autres sont **impaires** (symétriques par rapport à l’origine) :

| Fonction         | Symétrie                          | Propriété                   |
| ---------------- | --------------------------------- | --------------------------- |
| \( $\sin(-x)$ \) | Impaire – Symétrie centrale       | \( $\sin(-x) = -\sin(x)$ \) |
| \( $\cos(-x)$ \) | Paire – Symétrie axiale verticale | \( $\cos(-x) = \cos(x)$ \)  |
| \( $\tan(-x)$ \) | Impaire                           | \( $\tan(-x) = -\tan(x)$ \) |
| \( $\cot(-x)$ \) | Impaire                           | \( $\cot(-x) = -\cot(x)$ \) |

#### 2.3. Signe des fonctions selon le quadrant

Le **cercle trigonométrique** est divisé en quatre **quadrants**, chacun influant sur le **signe** des fonctions trigonométriques :

| Quadrant | Angle \( x \)                     | Signe de \( $\sin(x)$ \) | Signe de \( $\cos(x)$ \) | Signe de \( $\tan(x)$ \) |
| -------- | --------------------------------- | ------------------------ | ------------------------ | ------------------------ |
| I        | \( $0 < x < \frac{\pi}{2}$ \)     | +                        | +                        | +                        |
| II       | \( $\frac{\pi}{2} < x < \pi$ \)   | +                        | –                        | –                        |
| III      | \( $\pi < x < \frac{3\pi}{2}$ \)  | –                        | –                        | +                        |
| IV       | \( $\frac{3\pi}{2} < x < 2\pi$ \) | –                        | +                        | –                        |

Une astuce mnémotechnique : **"All Students Take Calculus"**  
(Quadrant I : All (+), II : Sinus (+), III : Tangente (+), IV : Cosinus (+))

---

Ces propriétés sont essentielles pour manipuler les fonctions trigonométriques dans les équations, comprendre leurs courbes, et anticiper leurs comportements en fonction de l’angle.

---

### 3. Périodicité et variations

Les fonctions trigonométriques ont un comportement **cyclique** : elles répètent leurs valeurs à intervalles réguliers. Ce comportement est appelé **périodicité**, et il est fondamental pour modéliser des phénomènes récurrents comme les ondes, les rotations ou les mouvements circulaires.

#### 3.1 Périodicité des fonctions

- Les fonctions $\sin(x)$ et $\cos(x)$ sont **périodiques de période** $2\pi$ :
  
  - $\sin(x + 2\pi) = \sin(x)$  
  - $\cos(x + 2\pi) = \cos(x)$

- Les fonctions $\tan(x)$ et $\cot(x)$ sont **périodiques de période** $\pi$ :
  
  - $\tan(x + \pi) = \tan(x)$  
  - $\cot(x + \pi) = \cot(x)$

Cela signifie que les graphes de ces fonctions se **répètent indéfiniment**.

---

#### 3.2 Variations et comportement global

Les fonctions trigonométriques présentent des comportements réguliers sur des intervalles types. Voici leurs principales caractéristiques :

##### Fonction **sinus** :

- **Intervalle d’étude** : $[0, 2\pi]$
- **Valeurs** : $\sin(x) \in [-1, 1]$
- **Croissante** sur $[0, \frac{\pi}{2}]$, puis **décroissante** jusqu’à $\frac{3\pi}{2}$, puis **croissante** à nouveau
- Fonction **impaire** : $\sin(-x) = -\sin(x)$

##### Fonction **cosinus** :

- **Intervalle d’étude** : $[0, 2\pi]$
- **Valeurs** : $\cos(x) \in [-1, 1]$
- **Décroissante** sur $[0, \pi]$, puis **croissante** sur $[\pi, 2\pi]$
- Fonction **paire** : $\cos(-x) = \cos(x)$

##### Fonction **tangente** :

- **Intervalle d’étude** : $\left] -\frac{\pi}{2}, \frac{\pi}{2} \right[$
- **Valeurs** : $\tan(x) \in \mathbb{R}$ (avec des asymptotes verticales en $x = \pm\frac{\pi}{2}$)
- Fonction **strictement croissante**
- Période : $\pi$
- Fonction **impaire** : $\tan(-x) = -\tan(x)$

---

#### 3.3 Résumé graphique

| Fonction  | Période | Domaine                                                                         | Valeurs possibles | Comportement           |
| --------- | ------- | ------------------------------------------------------------------------------- | ----------------- | ---------------------- |
| $\sin(x)$ | $2\pi$  | $\mathbb{R}$                                                                    | $[-1, 1]$         | Ondulatoire            |
| $\cos(x)$ | $2\pi$  | $\mathbb{R}$                                                                    | $[-1, 1]$         | Ondulatoire            |
| $\tan(x)$ | $\pi$   | $\mathbb{R} \setminus \left\{ \frac{\pi}{2} + k\pi,\ k \in \mathbb{Z} \right\}$ | $\mathbb{R}$      | Croissante, divergente |

---

Ces propriétés sont précieuses pour anticiper les comportements des fonctions dans les équations, les représentations graphiques, ou les simulations, notamment en informatique graphique, traitement du signal ou calculs liés à la physique.

---

### 4. Identités trigonométriques

Les identités trigonométriques sont des égalités toujours vraies reliant les fonctions trigonométriques entre elles. Elles sont essentielles pour simplifier des expressions, résoudre des équations, ou transformer des formules dans des algorithmes mathématiques, en physique, ou même en informatique graphique.

---

#### 4.1. Identités fondamentales

Ce sont les bases à connaître absolument :

- **Identité de Pythagore** :
   $\sin^2(x) + \cos^2(x) = 1 $

- En divisant par $\cos^2(x)$ :
  $\tan^2(x) + 1 = \sec^2(x) $

- En divisant par $\sin^2(x)$ :
  $1 + \cot^2(x) = \csc^2(x) $

---

#### 4.2. Formules d’addition et de soustraction

Ces formules permettent de calculer la trigonométrie d’une somme ou différence d’angles :

- $\sin(a \pm b) = \sin(a)\cos(b) \pm \cos(a)\sin(b)$  
- $\cos(a \pm b) = \cos(a)\cos(b) \mp \sin(a)\sin(b)$  
- $\tan(a \pm b) = \dfrac{\tan(a) \pm \tan(b)}{1 \mp \tan(a)\tan(b)}$

---

#### 4.3. Formules de duplication

Elles permettent de calculer la fonction trigonométrique du double d’un angle :

- $\sin(2x) = 2\sin(x)\cos(x)$  
- $\cos(2x) = \cos^2(x) - \sin^2(x) = 2\cos^2(x) - 1 = 1 - 2\sin^2(x)$  
- $\tan(2x) = \dfrac{2\tan(x)}{1 - \tan^2(x)}$

---

#### 4.4. Formules de moitié

Souvent utilisées pour intégrer ou simplifier des expressions :

- $\sin^2(x) = \dfrac{1 - \cos(2x)}{2}$  
- $\cos^2(x) = \dfrac{1 + \cos(2x)}{2}$

---

#### 4.5. Relations entre fonctions

- $\tan(x) = \dfrac{\sin(x)}{\cos(x)}$  
- $\cot(x) = \dfrac{\cos(x)}{\sin(x)}$  
- $\sec(x) = \dfrac{1}{\cos(x)}$  
- $\csc(x) = \dfrac{1}{\sin(x)}$

---

Ces identités sont des outils puissants qu'on utilise dans de nombreux domaines, notamment pour optimiser des calculs, résoudre des équations ou encore analyser des signaux. En informatique, elles sont présentes par exemple dans les moteurs de rendu 3D, les animations, ou les algorithmes de traitement d’image.

---

### 5. Cercle trigonométrique

Le **cercle trigonométrique** est un outil fondamental pour visualiser et comprendre les fonctions trigonométriques. Il permet d’étendre leur définition aux **angles quelconques** (positifs ou négatifs), bien au-delà des seuls triangles rectangles.

---

#### 5.1. Définition

Le cercle trigonométrique est un cercle de rayon $1$ centré à l’origine du repère cartésien $(0, 0)$ dans le plan.

- Un **angle** $\theta$ est mesuré à partir de l’axe des abscisses (axe $x$), dans le **sens anti-horaire** (trigonométrique).
- La **valeur en radians** d’un angle est utilisée par défaut :
  - $0$ rad correspond au point $(1, 0)$
  - $\frac{\pi}{2}$ rad à $(0, 1)$
  - $\pi$ rad à $(-1, 0)$
  - $\frac{3\pi}{2}$ rad à $(0, -1)$
  - $2\pi$ rad revient à $(1, 0)$

---

#### 5.2. Coordonnées d’un point sur le cercle

À un angle $\theta$, on associe un point $M$ sur le cercle de coordonnées :

$$
M(\theta) = (\cos(\theta), \sin(\theta))
$$

Cela signifie que :

- La **projection horizontale** du point $M$ donne $\cos(\theta)$.
- La **projection verticale** du point $M$ donne $\sin(\theta)$.

Ce lien permet de **visualiser** directement les valeurs de $\sin$ et $\cos$ sur un cercle.

---

#### 5.3. Utilisation pour les fonctions trigonométriques

Grâce au cercle trigonométrique, on peut :

- Étendre la définition de $\sin(x)$, $\cos(x)$ et $\tan(x)$ à **tous les réels** $x \in \mathbb{R}$.
- Déduire les **signes des fonctions** dans chaque quadrant.
- Retrouver des **identités trigonométriques** en observant les symétries :
  - $\sin(-x) = -\sin(x)$ (symétrie par rapport à l’axe des abscisses)
  - $\cos(-x) = \cos(x)$ (symétrie par rapport à l’axe des ordonnées)

---

#### 5.4. Tangente sur le cercle

La tangente peut être interprétée géométriquement à l’aide d’une droite verticale tracée au point $(1, 0)$. La valeur de $\tan(\theta)$ correspond à l’intersection entre cette droite et la prolongation du rayon formant l’angle $\theta$.

Cela permet de mieux comprendre pourquoi la tangente **diverge** (tend vers l’infini) lorsque l’angle se rapproche de $\frac{\pi}{2}$ ou $-\frac{\pi}{2}$, où le rayon devient **vertical**.

---

Le cercle trigonométrique est donc un outil visuel et conceptuel central pour comprendre les relations trigonométriques, les symétries, la périodicité et le comportement des fonctions sur l’ensemble des réels.

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Unit_circle_angles_color.svg/400px-Unit_circle_angles_color.svg.png" title="" alt="" data-align="center">

*[Cercle trigonométrique — Wikipédia](https://fr.wikipedia.org/wiki/Cercle_trigonom%C3%A9trique)*

---

### 6. Applications en géométrie et en informatique

La trigonométrie n’est pas seulement un outil théorique : elle est omniprésente dans des domaines concrets comme la **géométrie**, la **modélisation**, la **programmation graphique**, ou encore la **robotique**. Voici un tour d’horizon des principales applications.

---

#### 6.1. Résolution de triangles

En géométrie, la trigonométrie est utilisée pour **déterminer les longueurs** ou les **angles manquants** dans un triangle, en particulier lorsqu’on ne peut pas utiliser le théorème de Pythagore directement.

##### Loi des sinus :

Dans un triangle quelconque $ABC$ :

$$
\frac{a}{\sin(A)} = \frac{b}{\sin(B)} = \frac{c}{\sin(C)}
$$

Cette formule est utile lorsqu’on connaît deux angles et un côté (AAS ou ASA), ou deux côtés et un angle non compris (SSA).

##### Loi des cosinus :

Toujours dans un triangle $ABC$ :

$$
c^2 = a^2 + b^2 - 2ab\cos(C)
$$

Elle généralise le théorème de Pythagore pour les triangles non rectangles, et permet de calculer un côté à partir de deux autres côtés et de l’angle entre eux.

---

#### 6.2. Calcul de distances

La trigonométrie est souvent utilisée pour calculer la **distance entre deux points** dans un plan ou dans l’espace, notamment lorsque l’on connaît des **angles** ou des **orientations**.

Exemple : Si un objet est repéré à une distance $d$ et à un angle $\theta$ par rapport à l’axe horizontal, alors ses coordonnées cartésiennes sont :

$$
x = d \cdot \cos(\theta), \quad y = d \cdot \sin(\theta)
$$

C’est la base du **repérage polaire**, utilisé dans les systèmes de navigation, la topographie, et les jeux vidéo.

---

#### 6.3. Applications en géométrie analytique

En géométrie analytique, les fonctions trigonométriques sont utilisées pour :

- Définir des **rotations** autour d’un point.
- Tracer des **cercles, ellipses et spirales**.
- Travailler avec des vecteurs (produit scalaire, orientation…).

Exemple : une rotation d’un point $(x, y)$ autour de l’origine d’un angle $\theta$ s’écrit :

$$
x' = x \cdot \cos(\theta) - y \cdot \sin(\theta) \\
y' = x \cdot \sin(\theta) + y \cdot \cos(\theta)
$$

Cette formule est **fondamentale** en animation 2D et 3D, ainsi qu’en traitement d’image.

---

#### 6.4. Informatique graphique et jeux vidéo

Dans ce domaine, la trigonométrie est un pilier des **moteurs de rendu** :

- Calcul de **trajectoires** (projectiles, déplacements circulaires).
- Gestion de **caméras** (angle de vue, rotation).
- Représentation et manipulation d’objets en 2D/3D.
- Génération de formes périodiques (ondes, oscillations…).

Par exemple, pour animer un objet qui suit une trajectoire circulaire de rayon $r$ autour du point $(x_0, y_0)$ avec un angle $\theta$ évoluant dans le temps $t$ :

$$
x(t) = x_0 + r \cdot \cos(\theta(t)) \\
y(t) = y_0 + r \cdot \sin(\theta(t))
$$

---

#### 6.5. Robotique et simulations

En robotique, les bras articulés, les capteurs de distance ou les mouvements sont modélisés grâce à la trigonométrie :

- Calcul des **positions d’articulations** (cinématique directe et inverse).
- Orientation des capteurs.
- Évitement d’obstacles et navigation autonome.

---

#### 6.6. Résumé

| Domaine                | Utilisation de la trigonométrie                          |
| ---------------------- | -------------------------------------------------------- |
| Géométrie              | Résolution de triangles, distances, angles               |
| Informatique graphique | Modélisation 2D/3D, rendu d’objets, trajectoires         |
| Robotique              | Positionnement, orientation, mouvement des articulations |
| Physique               | Analyse de mouvements périodiques, ondes, vibrations     |
| Navigation             | GPS, radars, positionnement angulaire                    |

---

La trigonométrie est donc une **passerelle entre les mathématiques et le monde réel**, permettant de modéliser, simuler, visualiser et interagir avec des objets et des phénomènes complexes de manière efficace et précise. Elle est incontournable pour tout informaticien qui s’intéresse à la simulation, la visualisation, l’ingénierie ou l’intelligence artificielle physique.
