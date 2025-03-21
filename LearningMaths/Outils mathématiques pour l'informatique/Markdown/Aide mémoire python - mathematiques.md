# Aide-Mémoire : Trigonométrie en Python

## Introduction

La trigonométrie est essentielle pour manipuler les angles et les rapports entre les côtés d’un triangle. En Python, les bibliothèques `NumPy` et `SymPy` permettent d'effectuer des calculs trigonométriques aussi bien **numériques** (avec `NumPy`) que **symboliques** (avec `SymPy`).

---

## Importation des bibliothèques

Avant d’utiliser les fonctions trigonométriques en Python, il faut importer les bibliothèques nécessaires :

```python
import numpy as np   # Calcul numérique
import sympy as sp   # Calcul symbolique
sp.init_printing()   # Affichage mathématique propre
```

---

## 1. Trigonométrie

| Fonction mathématique             | Formule                                                        | Fonction Python                            |
|:--------------------------------- | -------------------------------------------------------------- | ------------------------------------------ |
| Sinus                             | $ \sin(x) $                                                    | `np.sin(x)`, `sp.sin(x)`                   |
| Cosinus                           | $ \cos(x) $                                                    | `np.cos(x)`, `sp.cos(x)`                   |
| Tangente                          | $ \tan(x) = \frac{\sin(x)}{\cos(x)} $	n                        | `np.tan(x)`, `sp.tan(x)`                   |
| Cotangente                        | $ \cot(x) = \frac{1}{\tan(x)} $                                | `1/np.tan(x)`, `sp.cot(x)`                 |
| Sécante                           | $ \sec(x) = \frac{1}{\cos(x)} $                                | `1/np.cos(x)`, `sp.sec(x)`                 |
| Cosécante                         | $ \csc(x) = \frac{1}{\sin(x)} $                                | `1/np.sin(x)`, `sp.csc(x)`                 |
| Identité de Pythagore             | $ \sin^2(x) + \cos^2(x) = 1 $                                  | `sp.simplify(sp.sin(x)**2 + sp.cos(x)**2)` |
| Formule d’addition du sinus       | $ \sin(a + b) = \sin(a)\cos(b) + \cos(a)\sin(b) $              | `sp.expand_trig(sp.sin(a+b))`              |
| Formule d’addition du cosinus     | $ \cos(a + b) = \cos(a)\cos(b) - \sin(a)\sin(b) $              | `sp.expand_trig(sp.cos(a+b))`              |
| Formule d’addition de la tangente | $ \tan(a + b) = \frac{\tan(a) + \tan(b)}{1 - \tan(a)\tan(b)} $ | `sp.expand_trig(sp.tan(a+b))`              |
| Conversion degrés ↔ radians       | $ x_{\text{rad}} = x_{\text{deg}} \times \frac{\pi}{180} $     | `np.deg2rad(x), np.rad2deg(x)`             |

----

## 2. Calcul Différentiel

| Fonction mathématique  | Formule                                               | Fonction Python         |
| ---------------------- | ----------------------------------------------------- | ----------------------- |
| Dérivée d’une fonction | $ f'(x) = \lim_{h \to 0} \frac{f(x+h) - f(x)}{h} $    | `sp.diff(f, x)`         |
| Dérivée de $ x^n $     | $ \frac{d}{dx} x^n = n x^{n-1} $                      | `sp.diff(x**n, x)`      |
| Dérivée de $ e^x $     | $ \frac{d}{dx} e^x = e^x $                            | `sp.diff(sp.exp(x), x)` |
| Dérivée de $ \ln(x) $  | $ \frac{d}{dx} \ln(x) = \frac{1}{x} $                 | `sp.diff(sp.ln(x), x)`  |
| Dérivée de $ \sin(x) $ | $ \frac{d}{dx} \sin(x) = \cos(x) $                    | `sp.diff(sp.sin(x), x)` |
| Dérivée de $ \cos(x) $ | $ \frac{d}{dx} \cos(x) = -\sin(x) $                   | `sp.diff(sp.cos(x), x)` |
| Dérivée de $ \tan(x) $ | $ \frac{d}{dx} \tan(x) = \sec^2(x) $                  | `sp.diff(sp.tan(x), x)` |
| Dérivée d’un produit   | $ (uv)' = u'v + uv' $                                 | `sp.diff(u*v, x)`       |
| Dérivée d’un quotient  | $ \left(\frac{u}{v}\right)' = \frac{u'v - uv'}{v^2} $ | `sp.diff(u/v, x)`       |
| Dérivée d’une composée | $ (f \circ g)'(x) = f'(g(x)) \cdot g'(x) $            | `sp.diff(f(g(x)), x)`   |

---

## 3. **Calcul Intégral**

| Fonction mathématique        | Formule                                                     | Fonction Python              |
| ---------------------------- | ----------------------------------------------------------- | ---------------------------- |
| Intégrale définie            | $ \int_a^b f(x)dx $                                         | `integrate.quad(f, a, b)`    |
| Intégrale indéfinie          | $ \int f(x)dx = F(x) + C $                                  | `sp.integrate(f, x)`         |
| Intégrale de $ x^n $         | $ \int x^n dx = \frac{x^{n+1}}{n+1} + C \quad (n \neq -1) $ | `sp.integrate(x**n, x)`      |
| Intégrale de $ e^x $         | $ \int e^x dx = e^x + C $                                   | `sp.integrate(sp.exp(x), x)` |
| Intégrale de $ \frac{1}{x} $ | $ \int \frac{1}{x} dx = \ln$                                | x                            |
| Intégrale de $ \sin(x) $     | $ \int \sin(x) dx = -\cos(x) + C $                          | `sp.integrate(sp.sin(x), x)` |
| Intégrale de $ \cos(x) $     | $ \int \cos(x) dx = \sin(x) + C $                           | sp.integrate(sp.cos(x), x)   |
| Intégrale de $ \tan(x) $     | $ \int \tan(x) dx = \ln$                                    | $\sec(x)$                    |
