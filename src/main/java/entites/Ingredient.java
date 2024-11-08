package entites;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "INGREDIENT")
public class Ingredient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@Column(name ="NOM")
    private String nom;
    //@Column(name ="PERCENT")
    private Double percent;

    /**
     * constructeur vide pour jpa
     */
    public Ingredient() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ingredient{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", percent=").append(percent);
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

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }
}
