package entites;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "PRODUIT")
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name ="NOM")
    private String nom;
    @Column(name ="ENERGIE")
    private double energie;
    /**
     * constructeur vide pour jpa
     */
    public Produit() {
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