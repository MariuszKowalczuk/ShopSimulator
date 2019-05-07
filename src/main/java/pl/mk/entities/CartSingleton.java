package pl.mk.entities;

import lombok.Getter;
import pl.mk.hibernate.ProductHibernateRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mariusz Kowalczuk
 */
@Getter
public class CartSingleton {
    private static CartSingleton instance;
    private List<PostitionNoDB> positions = new ArrayList<>();
    private ProductHibernateRepository phr = new ProductHibernateRepository();

    private CartSingleton() {
    }

    private static Object lock = new Object();

    public static CartSingleton getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new CartSingleton();
                }
            }

        }
        return instance;
    }

    public void addItem(Integer productID, Integer quantity) {
        Product byId = phr.findById(productID);

        System.out.println(byId);

        positions.add(new PostitionNoDB(phr.findById(productID), quantity));
    }


}
