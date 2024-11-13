## Description
=
### Bonjour et bienvenue sur le projet openfoodFactory
> Le projet c'est diviser en 3 partie la modelisation de la base de donées en merise et uml (premier jour **Parameswaran** et **Julia** pour des raison de santé **Maxime** n'as pas pus participé a cette etape)

1. la création des entitées et la création de la couche **Julia**

2. le trie de la liste en base de donée (donnée polluer de base) **Parameswaran** 

3. la gestion du cache **Maxime**


- #### nous allons voir ci dessous l'etape de création des entitée et la couche DAO:
j'ai etablie les entitée sur le modele de base de donnée que nous avions etablie nous etions partie sur un modele de donnée en etoile avec le produit bien que a l'origine nous avion etablie une entité quantité elle c'est averer inutile par la suite 
pourl'utilisation du mapping la génération ce fait a partir de la class app la public static void main(String[] args) permet de créer les entitées.
j'ai ensuite créer une couche dao pour Créer une interface générique qui permet de géré le crud en passant par une classe abstraite .
a l'heure ou ce message est ecrit toutes les fonctionnalité ne sont pas encore implenter l'appli n'est donc pas tester dans sa globalité.

- #### nous allons voir ci dessous l'etape de trie de la bdd:
J'ai développé une classe nommée 'Decompose' pour nettoyer un fichier CSV. J'ai stocké les lignes uniques de ce fichier dans une liste, en évitant les doublons pour chaque colonne. Lors de l'extraction des données de la colonne 'Énergie', j'ai identifié des erreurs de saisie : certaines lettres, comme le 'l', étaient remplacées par un caractère pipe '|'. J'ai donc procédé à la correction manuelle du fichier CSV avant de poursuivre le traitement.

- #### nous allons voir ci dessous l'etape de cache:
