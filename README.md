# Affichage sur écran LCD

## Utilisation

Le programme prend en argument un nombre, et affiche le résultat encodé sur la sortie standard.
J'ai supposé que l'écran a une largeur de 10, et affiche le résultat le plus à droite possible de l'écran.

## Tests

La plupart des classes sont testés unitairement. La classe ControllerLCD n'a pas de tests automatiques, car il faudrait écrire des tests black-box (faire un script passant différent arguments au programme, et vérifiant que la sortie est bien celle attendue).
Pour des raisons de temps, je n'ai pas fait ce script là.
Cependant cette classe fait appel aux méthodes d'autres classes qui sont testées unitairement.

## Choix d'architecture

Pour réaliser le projet, les choix que j'ai fait cherchent à forcer une utilisation correcte du logiciel pour éviter les bugs. Par exemple, les caractères que l'on peut encoder (les 10 chiffres, ainsi que les symbole du code (pipe, underscore , espace), sont stockés dans des enum. 

Cela permet de déclencher une erreur à l'exécution si on utilise le programme de manière incorrecte, et d'éviter ainsi des bugs sur les paramètres.
De la même manière, dans la classe LCDScreen, j'ai trois créé trois fonctions pour afficher les 3 lignes des grids, pour éviter de chercher à afficher une ligne inexistante par erreur.

J'ai créé un controlleur d'écran (ScreenController) qui dirige l'écran : il prend une chaîne, et l'affiche en caractères encodés sur l'écran.

Pour pouvoir utiliser différents types d'écran, j'ai choisi de faire une classe abstraite Screen, avec une méthode abstraite pour récupérer sa largeur (= le nombre de caractères qu'il peut afficher), ainsi que des méthodes, set, get et print. Cela permet au ScreenController d'être indépendant du type d'écran utilisé.

Ainsi pour utiliser un autre type d'écran avec une autre largeur, on peut créer une nouvelle classe étendant cette classe avec des nouveaux paramètres, et utiliser le même contrôleur.
