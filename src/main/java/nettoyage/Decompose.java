package nettoyage;

import entites.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Classe qui permet de faire le nettoyage du fichier csv
 * */
public class Decompose {

    private Categorie categories;
    private Marque marques;
    private Ingredient ingredients;

    private Allergene allergene;
    private Additif additifs;
    private Produit produit;
    private ScoreNutitionnel scoreNutritionnel;
    private ProduitDaoImpl produitDao;
    private MarqueDaoImpl marqueDao;
    private IngredientDaoImpl ingredientDao;
    private CategorieDaoImpl categorieDao;
    private AllergeneDaoImpl allergeneDao;
    private AdditifDaoImpl additifDao;
    private ScoreNutitionnelDaoImpl scoreNutritionnelDao;

//    {
//        produit = new Produit();
//        allergene = new Allergene();
//        marques = new Marque();
//        categories = new Categorie();
//        ingredients = new Ingredient();
//        scoreNutritionnel = new ScoreNutritionnel();
//        additifs = new Additif();
//    }

    public Decompose() {
        String fichier = "open-food-facts.csv";
        Path cheminFichier = Paths.get("src/main/resources/csv/" + fichier);
        List<String> lignes;

        try {
            lignes = Files.readAllLines(cheminFichier, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("bdd2");
        EntityManager entityManager = managerFactory.createEntityManager();

        //Exemple d'utilisation pour insérer un produit
        produitDao = new ProduitDaoImpl(entityManager);
        produit = new Produit();

        allergeneDao = new AllergeneDaoImpl(entityManager);
        allergene = new Allergene();

        marqueDao = new MarqueDaoImpl(entityManager);
        marques = new Marque();

        categorieDao = new CategorieDaoImpl(entityManager);
        categories = new Categorie();

        ingredientDao = new IngredientDaoImpl(entityManager);
        ingredients = new Ingredient();

        scoreNutritionnelDao = new ScoreNutitionnelDaoImpl(entityManager);
        scoreNutritionnel = new ScoreNutitionnel();

        additifDao = new AdditifDaoImpl(entityManager);
        additifs = new Additif();


        for (int i = 0; i < lignes.size(); i++) {

            String ligne = lignes.get(i);
            ligne.replaceAll("_","");
            String[] elements = ligne.split("\\|");

            String catego = elements[0];
            String marque = elements[1];
            String nom = elements[2];
            String nutritionGrade = elements[3];
            String ingredient = elements[4];
            String energie = elements[5];

            if (i > 0 && !energie.isEmpty()){
                produit.setNom(nom);
                marques.setNomMarque(marque);
                categories.setNomCategorie(catego);

                if (Pattern.matches("\\d+(\\.\\d+)?", energie)) {
                    double energieDouble = Double.parseDouble(energie);
                    produit.setEnergie(energieDouble);
                    //produitDao.create(produit);
                    //System.out.println(energieDouble);
                } else {
                    //System.out.println("Error: '" + energie + "' is not a valid number." + i);
                }

                ingredient = ingredient.replaceAll("[_\\[\\]?*\\-]","");
                ingredients.setNom(ingredient);

                //scoreNutritionnel.setScore(nutritionGrade);
                //Query querysScore = entityManager.createQuery("INSERT INTO ScoreNutritionnel (SCORE) SELECT :nutritionGrade WHERE NOT EXISTS (SELECT 1 FROM ScoreNutritionnel s WHERE s.score = :nutritionGrade)");
                //querysScore.setParameter("nutritionGrade", nutritionGrade);

                if (elements.length == 29){
                    String allergen = elements[28];
                    allergene.setComposition(allergen);

                }

                if (elements.length == 30){
                    String additif = elements[29];
                    additifs.setNom(additif);
                }

            }

        }


        //marqueDao.create(marques);
        //allergeneDao.create(allergene);
        //additifDao.create(additifs);
        //categorieDao.create(categories);
        //ingredientDao.create(ingredients);
        //scoreNutritionnelDao.create(scoreNutritionnel);
        entityManager.close();
        managerFactory.close();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Decompose{");
        sb.append("categories=").append(categories);
        sb.append(", marques=").append(marques);
        sb.append(", ingredients=").append(ingredients);
        sb.append(", allergene=").append(allergene);
        sb.append(", additifs=").append(additifs);
        sb.append(", produit=").append(produit);
        sb.append(", scoreNutritionnel=").append(scoreNutritionnel);
        sb.append('}');
        return sb.toString();
    }
}
