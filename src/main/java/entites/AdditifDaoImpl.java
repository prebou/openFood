package dao.impl;

import entites.Additif;
import jakarta.persistence.EntityManager;

public class AdditifDaoImpl extends dao.impl.GenericDaoImpl<Additif> {
    public AdditifDaoImpl(EntityManager entityManager) {
        super(entityManager, Additif.class);
    }

}