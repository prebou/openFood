Bonjour et bienvenue sur le projet openfoodFactory

    Le projet c'est diviser en 3 partie la modelisation de la base de donées en merise et uml (premier jour Parameswaran et Julia pour des raison de santé Maxime n'as pas pus participé a cette etape)

    la création des entitées et la création de la couche Julia

    le trie de la liste en base de donée (donnée polluer de base) Parameswaran

    la gestion du cache Maxime

    nous allons voir ci dessous l'etape de création des entitée et la couche DAO:

j'ai etablie les entitée sur le modele de base de donnée que nous avions etablie nous etions partie sur un modele de donnée en etoile avec le produit bien que a l'origine nous avion etablie une entité quantité elle c'est averer inutile par la suite pourl'utilisation du mapping la génération ce fait a partir de la class app la public static void main(String[] args) permet de créer les entitées. j'ai ensuite créer une couche DAO pour Créer une interface générique qui permet de géré le crud en passant par une classe abstraite . a l'heure ou ce message est ecrit toutes les fonctionnalité ne sont pas encore implenter l'appli n'est donc pas tester dans sa globalité.

    nous allons voir ci dessous l'etape de trie de la bdd:

J'ai développé une classe nommée 'Decompose' pour nettoyer un fichier CSV. J'ai stocké les lignes uniques de ce fichier dans une liste, en évitant les doublons pour chaque colonne. Lors de l'extraction des données de la colonne 'Énergie', j'ai identifié des erreurs de saisie : certaines lettres, comme le 'l', étaient remplacées par un caractère pipe '|'. J'ai donc procédé à la correction manuelle du fichier CSV avant de poursuivre le traitement.

    nous allons voir ci dessous l'etape de cache:

L'étape de cache se décompense en plusieurs étapes :

    Ajouter Ehcache comme dépendance dans le fichier pom.xml
    Configurer le fichier persistance.xml
    Configurer Ehcache avec un fichier XML --> ehcache.xml
    Créer et initialiser Ehcache dans l'application (Suppression de la définition de schéma dans le fichier XML d'Ehcache. Ehcache fonctionne souvent sans avoir besoin de valider un schéma à chaque lancement. Si le fichier ehcache.xml ne comporte pas de définition de schéma, Ehcache pourra tout de même lire et appliquer la configuration correctement.)
    Optimiser les performances des lectures répétés des aliments (classe aliments)
