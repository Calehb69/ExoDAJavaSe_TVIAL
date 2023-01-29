Examen JAVA SE 

-	SDK à installer sur IntelliJ pour que les imports fonctionnent.

-	Pas d’imports multiples pour ne pas causer de soucis en important tout Java et privilégier les imports manuels indépendants.

-	Joueur passé en final car ne va plus bouger par la suite. 

-	Boolean b retiré car n’a aucune utilité pour les classes Fou et Tour ainsi que pour le constructeur de Pièce, ils sont en doublon.

-	Dans Joueurs, ligne 82 le break est inutile ainsi que dans Echiquier.

-	Dans Fou, les « else, break » n’ont aucune raison d’être.

-	Je créée des package pour simplifier mon code et le rendre plus propre ; je vérifie par la même les méthodes.

-	Dans Echiquier changement des noms du switch case de l’anglais vers le français pour une meilleure lisibilité et propreté du code. 

-	Nettoyage des ArrayList<>.

-	Ajout de la personnalisation des joueurs au lancement du programme.

-	Correction de la disparition des pièces lors de leurs mouvements.
