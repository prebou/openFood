package entites;

import jakarta.persistence.EntityManager;

public class ScoreNutitionnelDaoImpl extends DAO.impl.GenericDaoImpl<ScoreNutitionnel> {
    public ScoreNutitionnelDaoImpl(EntityManager entityManager) {
        super(entityManager, ScoreNutitionnel.class);
    }

}