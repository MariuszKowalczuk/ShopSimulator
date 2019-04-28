package pl.mk.hibernate;

import pl.mk.entities.Product;

/**
 * @author Mariusz Kowalczuk
 */
public class ProductHibernateRepository extends AbstractHibernateRepository<Product> {
    public ProductHibernateRepository() {
        super(Product.class);
    }
}

