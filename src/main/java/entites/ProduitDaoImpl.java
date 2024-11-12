package dao.impl;

import entites.Produit;
import jakarta.persistence.EntityManager;

public class ProduitDaoImpl extends dao.impl.GenericDaoImpl<Produit> {
    public ProduitDaoImpl(EntityManager entityManager) {
        super(entityManager, Produit.class);
    }

}
