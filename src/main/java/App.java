import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("bdd2");
        EntityManager entityManager = managerFactory.createEntityManager();
        entityManager.close();
        managerFactory.close();
    }
    //utilisation du dao théorique pour la création en bdd
    //public static void main(String[] args) {
    //EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("bdd2");
    //EntityManager entityManager = managerFactory.createEntityManager();
    //Exemple d'utilisation pour insérer un produit
    //ProduitDaoImpl produitDao = new ProduitDaoImpl(entityManager);
    //Produit produit = new Produit();
    //produit.setNom("Chocolat");
    //produit.setEnergie(500.0);
    //produitDao.create(produit);
    //entityManager.close();
    //managerFactory.close();
    //}


}
