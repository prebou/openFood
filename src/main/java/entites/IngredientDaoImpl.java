package entites;

import entites.Ingredient;
import jakarta.persistence.EntityManager;

public class IngredientDaoImpl extends dao.impl.GenericDaoImpl<Ingredient> {
    public IngredientDaoImpl(EntityManager entityManager) {
        super(entityManager, Ingredient.class);
    }

}