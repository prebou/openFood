package entites;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "SCORENUTRITIONEL")
public class ScoreNutitionnel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="SCORE")
    private String score;
    /**
     * lien many to one score nutritionel
     */
    /*@OneToMany(mappedBy = "ScoreNutritionnel")
    private Set<Produit> produits;*/


     //on as inverser le sens des lien celui la fonctionne mais amuvais sens
//    @ManyToOne
//    @JoinColumn(name = "produit_id", nullable = false)
//    private Produit produit;

    @OneToMany(mappedBy = "scoreNutitionnel", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Produit> produits = new HashSet<>();

    /**
     * constructeur vide pour JPA
     */
    public ScoreNutitionnel() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ScoreNutitionnel{");
        sb.append("id=").append(id);
        sb.append(", score='").append(score).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
