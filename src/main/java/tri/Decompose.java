package tri;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Decompose {
    public static void main(String[] args) {


        //private String categorie;
        ArrayList<String> categorie = new ArrayList<>();


        String fichier = "open-food-facts.csv";
        Path cheminFichier = Paths.get("E:/documents/parameswaran/diginamic/Projets/OpenFoodFact/openFood/src/main/resources/csv/" + fichier);
        List<String> lignes;

        try {
            lignes = Files.readAllLines(cheminFichier, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < lignes.size(); i++) {
            String ligne = lignes.get(i);
            String[] elements = ligne.split("\\|");
            String catego = elements[0];
            String marque = elements[1];
            String nom = elements[2];
            String nutritionGrade = elements[3];
            //System.out.println(marque);
            if (!categorie.contains(catego)) {
                categorie.add(catego);
                System.out.println(catego);
            }


        }

        System.out.println(lignes.size()+" "+categorie.size());


    }
}
