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
    /**
     * constructeur vide pour jpa
     */
    public Quantite() {
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
