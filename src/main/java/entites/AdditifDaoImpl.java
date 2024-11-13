package entites;

import jakarta.persistence.EntityManager;

public class AdditifDaoImpl extends DAO.impl.GenericDaoImpl<Additif> {
    public AdditifDaoImpl(EntityManager entityManager) {
        super(entityManager, Additif.class);
    }

}