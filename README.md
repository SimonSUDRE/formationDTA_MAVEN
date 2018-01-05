# MAVEN CHEAT SHEET

Link : https://maven.apache.org/

Download : http://maven.apache.org/download.cgi

Find Maven dependency : http://search.maven.org/, https://mvnrepository.com/
##
**-X** pour activer le mode debug.

**-e** pour consulter la trace Java complète de l’erreur.
##
**mvn compile** 

La librairie est nécessaire dans le processus de compilation. La libraire est incluse dansle CLASSPATH lors de la compilation et lors de l’exécution. Compile le code source du projet dans le dossier de construction du JAR.
##

**mvn provided** 

Similaire à compile à l’exception que la librairie est disponible dans le conteneur de déploiement de l’application. La librairie n’est pas incluse dans le CLASSPATH lors de l’exécution.
##

**mvn runtime**

La librairie n’est pas nécessaire lors de la compilation des sources mais uniquement lors de l’exécution du projet.
##

**mvn test** 

La librairie est incluse dans le CLASSPATH pour la compilation et l’exécution des tests. Exécute les tests unitaires.
##

**mvn test-compile** 

Compile les classes de tests.
##

**mvn process-resources** 

Copie les fichiers, hors code source, dans le répertoire de construction finale en les filtrant si nécessaire.
##

**mvn process-test-resources** 

Copie les fichiers de test, hors code source, dans le répertoire de construction finale en les filtrant si nécessaire.
##

**mvn system**

Permet au projet de dépendre d’une librairie qui ne se trouve pas dans un référentiel mais qui est disponible sur le serveur dans lequel se trouve le projet. Il fonctionne exactement comme provided.
##

**mvn import**

Utilisé uniquement pour définir une dépendance vers un POM de type pom. Il permet d’inclure dans un POM la gestion des dépendances d’un autre POM.
##

**mvn optional**

La librairie est ajouté dans le MANIFEST mais pas dans le répertoire lib du WAR.
##

**mvn deploy** 

Déploie l’archive JAR dans le référentiel distant.
##

**mvn clean** 

Efface le repertoire target.
##

**mvn install**

Copie l’archive JAR dans le référentiel local.
##

**mvn package**

Crée l’archive JAR à partir du dossier contenant les sources compilées et les fichiers de ressources filtrés.
##