package dao.impl;

import entites.ScoreNutitionnel;
import jakarta.persistence.EntityManager;

public class ScoreNutitionnelDaoImpl extends dao.impl.GenericDaoImpl<ScoreNutitionnel> {
    public ScoreNutitionnelDaoImpl(EntityManager entityManager) {
        super(entityManager, ScoreNutitionnel.class);
    }

}