package entites;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "CATEGORIE")
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="NOMCATEG")
    private String nomCategorie;
    /**
     * constructeur vide pour jpa
     */
    public Categorie() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Categorie{");
        sb.append("id=").append(id);
        sb.append(", nomCategorie='").append(nomCategorie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
}
