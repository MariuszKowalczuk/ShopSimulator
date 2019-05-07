package pl.mk.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Mariusz Kowalczuk
 */
@AllArgsConstructor
@NoArgsConstructor
public class PostitionNoDB {
    private Product product;
    private Integer quantity;

    @Override
    public String toString() {
        return "PostitionNoDB{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}

