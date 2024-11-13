package entites;

import jakarta.persistence.EntityManager;

public class IngredientDaoImpl extends DAO.impl.GenericDaoImpl<Ingredient> {
    public IngredientDaoImpl(EntityManager entityManager) {
        super(entityManager, Ingredient.class);
    }

}