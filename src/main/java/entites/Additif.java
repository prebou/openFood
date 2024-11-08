package entites;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "ADDITIF")
public class Additif implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name ="NOM")
    private String nom;
    /**
     * constructeur vide pour jpa
     */
    public Additif() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Additif{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
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
}
