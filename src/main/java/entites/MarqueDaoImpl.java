package entites;

import entites.Marque;
import jakarta.persistence.EntityManager;

public class MarqueDaoImpl extends dao.impl.GenericDaoImpl<Marque> {
    public MarqueDaoImpl(EntityManager entityManager) {
        super(entityManager, Marque.class);
    }


}

