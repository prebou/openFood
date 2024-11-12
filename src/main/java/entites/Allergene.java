package entites;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ALLERGENE")
public class Allergene implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="COMPOSITION")
    private String composition;
    //lien any to many allergene produit
    @ManyToMany(mappedBy = "allergenes")
    private Set<Produit> produits = new HashSet<>();
    /**
     * constructeur vide pour jpa
     */
    public Allergene() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Allergene{");
        sb.append("id=").append(id);
        sb.append(", composition='").append(composition).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }
}
