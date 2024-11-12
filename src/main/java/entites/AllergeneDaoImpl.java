package dao.impl;

import entites.Allergene;
import jakarta.persistence.EntityManager;

public class AllergeneDaoImpl extends dao.impl.GenericDaoImpl<Allergene> {
    public AllergeneDaoImpl(EntityManager entityManager) {
        super(entityManager, Allergene.class);
    }

}
