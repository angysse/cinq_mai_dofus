# Application sur le jeu Dofus 

Elève : Angelo Lebbolo 

 # Présentation : 
 
 Nous avions pour objectif le developpement d’une application mobile de manière individuelle, qui a due ensuite être mise sur GitHub. Nous avons pu grâce à ce projet, découvrir en quoi consiste Github.  
Cette application mobile a été codée en Java, via le logiciel Android Studio. Nous devions réaliser une application pourvue d’une liste d’éléments,  faisant un appel WebService à une API Rest. Il était également demandé que chaque élément de la liste soit cliquable de maniére à afficher les détails des éléments. Un stockage des données était également demandé de manière à pouvoir accéder aux éléments sans connexion internet. 

Mon application porte sur le MMORPG  Dofus, et plus principalement sur les différentes armes présentent en jeu. J'ai également fait une activité musique, et une autre "mini-jeu". 

## Prérequis : 
- Android Studio 

# Consignes respectées : 

-	Architecture MVC
-	Liste d’éléments 
-	Ecran avec le détail d’un élément
-	Appel à une API Rest 
-	Stockage de données en cache 
-	Affichage d’une RecyclerView 

# Fonctions supplémentaires : 

-	Passage d’un extrait d’une des musiques  de référence du jeu
-	Mini-jeu permettant de « découper » l’un des monstres du jeu
-	Notification Push avec vibration via Firebase
-	Design épuré et structuré 

# Librairies utilisées : 
- Gson 
- Glide

# Fonctionnalités : 

- Ecran d'acceuil : 3 clicks possible (Arme = liste d'arme // Mini-je = Mini-Jeu // Musique)

<img src="https://github.com/angysse/cinq_mai_dofus/blob/master/acceuil.jpeg" width="200" height="400" />

- Ecran Arme : Affiche la liste des armes (+600 armes )

<img src="https://github.com/angysse/cinq_mai_dofus/blob/master/Liste.PNG" width="200" height="400" />

- Ecran aprés avoir cliqué sur différentes armes : 
Affiche les différentes informations sur une arme (Son nom, sa photo, le niveau que le joueur doit avoir pour  l’équiper, le type d’arme : épée / arc / pelle…, la description de l’arme) 

<img src="https://github.com/angysse/cinq_mai_dofus/blob/master/ep%C3%A9e.jpeg" width="200" height="400" /> <img src="https://github.com/angysse/cinq_mai_dofus/blob/master/dague.jpeg" width="200" height="400" />

<img src="https://github.com/angysse/cinq_mai_dofus/blob/master/dague2.jpeg" width="200" height="400" /> <img src="https://github.com/angysse/cinq_mai_dofus/blob/master/Marteau%20(1).jpeg" width="200" height="400" />


- Ecran Mini-jeux : Jeux relativement simple mais  relativement long, il suffit de cliquer sur la hache pour incrémenter le compteur du nombre de bouftout tués (aucune limite ). 

<img src="https://github.com/angysse/cinq_mai_dofus/blob/master/jeux_0.PNG" width="200" height="400" /> <img src="https://github.com/angysse/cinq_mai_dofus/blob/master/jeux_53.PNG" width="200" height="400" />


- Ecran Musique : Possibilité d’observer l’etat d’avancement de la musique, de mettre pause, et de  se deplacer à n’importe quelle moment de la musique. 

<img src="https://github.com/angysse/cinq_mai_dofus/blob/master/Lancer_le_son.PNG" width="250" height="400" /> <img src="https://github.com/angysse/cinq_mai_dofus/blob/master/pause_son.PNG" width="250" height="400" />


# Affichage des notifications : 
- Il est possible d’envoyer des notifications à l’aide de firebase. L'utilisateur reçoit une notification accompagnée d'une vibration. Il lui est possible de cliquer sur la notification qui ouvre une page internet sur le site de Dofus. 

<img src="https://github.com/angysse/cinq_mai_dofus/blob/master/notif.jpg" width="250" height="400" />

<img src="https://github.com/angysse/cinq_mai_dofus/blob/master/Firebase.PNG" width="600" height="400" />




