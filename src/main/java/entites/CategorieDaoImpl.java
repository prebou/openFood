package entites;

import entites.Categorie;
import jakarta.persistence.EntityManager;

public class CategorieDaoImpl extends dao.impl.GenericDaoImpl<Categorie> {
    public CategorieDaoImpl(EntityManager entityManager) {
        super(entityManager, Categorie.class);
    }

}