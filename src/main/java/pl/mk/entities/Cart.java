package pl.mk.entities;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mariusz Kowalczuk
 */
@Getter
public class Cart {
    private List<Product> positions = new ArrayList<>();

    public void addItem(Product product, Integer quantity) {
        for (int i = 0; i < quantity; i++) {
            positions.add(product);
        }

    }
}





