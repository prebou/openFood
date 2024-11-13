package entites;

import jakarta.persistence.EntityManager;

public class ProduitDaoImpl extends DAO.impl.GenericDaoImpl<Produit> {
    public ProduitDaoImpl(EntityManager entityManager) {
        super(entityManager, Produit.class);
    }

}
