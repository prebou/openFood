package nettoyage;

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

    ArrayList<String> categories;
    ArrayList<String> marques;
    ArrayList<String> ingredients;
    ArrayList<String> allergenes;
    ArrayList<String> additifs;
    ArrayList<String> produits;
    ArrayList<String> nutritionGrades;
    ArrayList<Double> energies;


    {
        categories = new ArrayList<>();
        marques = new ArrayList<>();
        ingredients = new ArrayList<>();
        allergenes = new ArrayList<>();
        additifs = new ArrayList<>();
        produits = new ArrayList<>();
        nutritionGrades = new ArrayList<>();
        energies = new ArrayList<>();
    }

    public Decompose() {
        String fichier = "open-food-facts.csv";
        Path cheminFichier = Paths.get("src/main/resources/csv/" + fichier);
        List<String> lignes;

        try {
            lignes = Files.readAllLines(cheminFichier, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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
                if (Pattern.matches("\\d+(\\.\\d+)?", energie)) {
                    double energieDouble = Double.parseDouble(energie);
                    energies.add(energieDouble);
                    //System.out.println(energieDouble);
                } else {
                    //System.out.println("Error: '" + energie + "' is not a valid number." + i);
                }

            }

            produits.add(nom);

            if (elements.length == 29){
                String allergene = elements[28];
                if (!allergenes.contains(allergene)){
                    allergenes.add(allergene);
                    //System.out.println("allergene : " + allergene);
                }
            }

            if (elements.length == 30){
                String additif = elements[29];
                if (!additifs.contains(additif)){
                    additifs.add(additif);
                    //System.out.println("additifs : " + additif);
                }
            }

            if (!nutritionGrades.contains(nutritionGrade)){
                nutritionGrades.add(nutritionGrade);
                //System.out.println("grade : " + nutritionGrade);
            }

            if (!categories.contains(catego)) {
                categories.add(catego);
                //System.out.println("categorie : " + catego);
            }
            if (!marques.contains(marque)){
                marques.add(marque);
                //System.out.println("marque : " + marque);
            }
            if (!ingredients.contains(ingredient)){
                //ingredient = ingredient.replaceAll("-","");
                //ingredient = ingredient.replaceAll("_","");
                ingredient = ingredient.replaceAll("[_\\[\\]?*\\-]","");
                //System.out.println("Ingredients : " + ingredient);

                ingredients.add(ingredient);

            }


        }

        //System.out.println(lignes.size()+" "+categories.size());

        //System.out.println(nutritionGrades.size() + " " + produits.size());

    }

    public Decompose(ArrayList<String> categories, ArrayList<String> marques, ArrayList<String> ingredients, ArrayList<String> allergenes, ArrayList<String> additifs, ArrayList<String> produits, ArrayList<String> nutritionGrades, ArrayList<Double> energies) {
        this.categories = categories;
        this.marques = marques;
        this.ingredients = ingredients;
        this.allergenes = allergenes;
        this.additifs = additifs;
        this.produits = produits;
        this.nutritionGrades = nutritionGrades;
        this.energies = energies;
    }

    /**
     * Getter
     *
     * @return categories
     */
    public ArrayList<String> getCategories() {
        return categories;
    }

    /**
     * Setter
     *
     * @param categories
     */
    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    /**
     * Getter
     *
     * @return marques
     */
    public ArrayList<String> getMarques() {
        return marques;
    }

    /**
     * Setter
     *
     * @param marques
     */
    public void setMarques(ArrayList<String> marques) {
        this.marques = marques;
    }

    /**
     * Getter
     *
     * @return ingredients
     */
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    /**
     * Setter
     *
     * @param ingredients
     */
    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * Getter
     *
     * @return allergenes
     */
    public ArrayList<String> getAllergenes() {
        return allergenes;
    }

    /**
     * Setter
     *
     * @param allergenes
     */
    public void setAllergenes(ArrayList<String> allergenes) {
        this.allergenes = allergenes;
    }

    /**
     * Getter
     *
     * @return additifs
     */
    public ArrayList<String> getAdditifs() {
        return additifs;
    }

    /**
     * Setter
     *
     * @param additifs
     */
    public void setAdditifs(ArrayList<String> additifs) {
        this.additifs = additifs;
    }

    /**
     * Getter
     *
     * @return produits
     */
    public ArrayList<String> getProduits() {
        return produits;
    }

    /**
     * Setter
     *
     * @param produits
     */
    public void setProduits(ArrayList<String> produits) {
        this.produits = produits;
    }

    /**
     * Getter
     *
     * @return nutritionGrades
     */
    public ArrayList<String> getNutritionGrades() {
        return nutritionGrades;
    }

    /**
     * Setter
     *
     * @param nutritionGrades
     */
    public void setNutritionGrades(ArrayList<String> nutritionGrades) {
        this.nutritionGrades = nutritionGrades;
    }

    /**
     * Getter
     *
     * @return energies
     */
    public ArrayList<Double> getEnergies() {
        return energies;
    }

    /**
     * Setter
     *
     * @param energies
     */
    public void setEnergies(ArrayList<Double> energies) {
        this.energies = energies;
    }

}
