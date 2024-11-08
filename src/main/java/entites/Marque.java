package entites;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "MARQUE")
public class Marque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@Column(name ="NOM")
    private String nomMarque;
    //@Column(name ="DATEAPPARITION")
    private String dateApparition;
    /**
     * constructeur vide pour jpa
     */
    public Marque() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Marque{");
        sb.append("id=").append(id);
        sb.append(", nomMarque='").append(nomMarque).append('\'');
        sb.append(", dateApparition='").append(dateApparition).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomMarque() {
        return nomMarque;
    }

    public void setNomMarque(String nomMarque) {
        this.nomMarque = nomMarque;
    }

    public String getDateApparition() {
        return dateApparition;
    }

    public void setDateApparition(String dateApparition) {
        this.dateApparition = dateApparition;
    }
}
