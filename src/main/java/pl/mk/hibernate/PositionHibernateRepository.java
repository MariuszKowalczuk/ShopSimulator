package pl.mk.hibernate;

import pl.mk.entities.Position;

/**
 * @author Mariusz Kowalczuk
 */
public class PositionHibernateRepository extends AbstractHibernateRepository<Position> {
    public PositionHibernateRepository() {
        super(Position.class);
    }
}
