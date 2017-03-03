"# 4A_2017_Letter_Game_Caron_Cohen-Solal" 

Compilation et lancement du projet :

1) Se placer à la racine du projet

2) S'assurer que les variables d'environnement (JAVA_HOME, MAVEN_HOME et PATH) sont bien configurées.
JAVA_HOME correspond au répertoire d'installation du JDK.
MAVEN_HOME correspond au répertoire d'installation de Maven.
PATH = %JAVA_HOME%\bin;%MAVEN_HOME%\bin;%PATH%

3) Compiler le programme avec la commande :  
mvn compile

4) Lancer le programme avec la commande :        
mvn -q exec:java
  
