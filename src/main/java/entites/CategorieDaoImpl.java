package entites;

import jakarta.persistence.EntityManager;

public class CategorieDaoImpl extends DAO.impl.GenericDaoImpl<Categorie> {
    public CategorieDaoImpl(EntityManager entityManager) {

        super(entityManager, Categorie.class);
    }

}