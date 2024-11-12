package entites;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "QUANTITE")
public class Quantite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="POID")
    private double poid;
    @Column(name ="PIECE")
    private int piece;

    @ManyToOne
    @JoinColumn(name = "ID")
    private Ingredient ingredient;
    /**
     * constructeur vide pour jpa
     */
    public Quantite() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quantite{");
        sb.append("id=").append(id);
        sb.append(", poid=").append(poid);
        sb.append(", piece=").append(piece);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }
}
