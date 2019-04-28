package pl.mk.hibernate;

import pl.mk.entities.User;

/**
 * @author Mariusz Kowalczuk
 */
public class UserHibernateRepository extends AbstractHibernateRepository<User> {
    public UserHibernateRepository() {
        super(User.class);
    }
}
