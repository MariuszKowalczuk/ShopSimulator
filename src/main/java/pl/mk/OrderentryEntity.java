package pl.mk;

import javax.persistence.*;

/**
 * @author Mariusz Kowalczuk
 */
@Entity
@Table(name = "orderentry", schema = "shop", catalog = "")
public class OrderentryEntity {
    private int id;
    private int quantity;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderentryEntity that = (OrderentryEntity) o;

        if (id != that.id) return false;
        if (quantity != that.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + quantity;
        return result;
    }
}
