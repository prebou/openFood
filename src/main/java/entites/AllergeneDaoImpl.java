package entites;

import jakarta.persistence.EntityManager;

public class AllergeneDaoImpl extends DAO.impl.GenericDaoImpl<Allergene> {
    public AllergeneDaoImpl(EntityManager entityManager) {
        super(entityManager, Allergene.class);
    }

}
