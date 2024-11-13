package entites;

import jakarta.persistence.*;


@Entity
@Cacheable
public class Aliment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String categorie;
    private String ingredients;

    public Aliment() {
    }
    // Getters et setters
}

