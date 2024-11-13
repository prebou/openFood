package entites;

import jakarta.persistence.*;


@Entity
@Cacheable  //active le cache pour l'entité Aliment
public class Aliment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom; //stocker le nom de l'aliment
    private String categorie; //stocker la catégorie de l'aliment
    private String ingredients; //stocker les ingrédients de l'aliment

    public Aliment() {
    }

}

