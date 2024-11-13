package entites;

import jakarta.persistence.EntityManager;

public class MarqueDaoImpl extends DAO.impl.GenericDaoImpl<Marque> {
    public MarqueDaoImpl(EntityManager entityManager) {
        super(entityManager, Marque.class);
    }


}

