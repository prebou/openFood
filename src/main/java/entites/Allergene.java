package entites;
import jakarta.persistence.*;
import java.io.Serializable;
//@Entity
//@Table(name = "ALLERGENE")
public class Allergene implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="COMPOSITION")
    private String composition;

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
