package entites;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PRODUIT")
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="IDNUTRITIONEL")
    private int idNutritionel;
    @Column(name ="NOM")
    private String nom;
    @Column(name ="ENERGIE")
    /**
     * lien one to many pour le lien produit to category
     */
    @OneToMany(mappedBy = "produit")
    private Set<Categorie> categories;
    /*
    *lien one to many a marque
     */
    @OneToMany(mappedBy = "produit")
    private Set<Marque> marque;
    /**
     * lien
     */
    @OneToMany(mappedBy = "produit")
    private Set<ScoreNutitionnel> scoreNutitionnels;

    private double energie;

    @ManyToMany
    @JoinTable(
            name = "produit_additif",
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "additif_id")
    )

    private Set<Additif> additifs = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name = "produit_allergene",
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "allergene_id")
    )
    private Set<Allergene> allergenes = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "produit_ingredient",
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private Set<Ingredient> ingredients = new HashSet<>();
    /**
     * constructeur vide pour jpa
     */
    public Produit() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produit{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", energie=").append(energie);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getEnergie() {
        return energie;
    }

    public void setEnergie(double energie) {
        this.energie = energie;
    }
}
