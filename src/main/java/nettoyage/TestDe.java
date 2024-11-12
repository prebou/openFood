package nettoyage;

import java.util.ArrayList;

public class TestDe {
    public static void main(String[] args) {
        Decompose decompose = new Decompose();
        ArrayList<String> listCategories = decompose.getCategories();
        ArrayList<String> listMarques = decompose.getMarques();
        ArrayList<Double> listEnergies = decompose.getEnergies();
        ArrayList<String> listProduits = decompose.getProduits();

        for (String e : listProduits){
            System.out.println(e);
        }

//        for (double e : listEnergies){
//            System.out.println(e);
//        }


//        for (String element : listMarques){
//            System.out.println(element);
//        }

//        for (String element:listCategories){
//            System.out.println(element);
//        }


    }
}
