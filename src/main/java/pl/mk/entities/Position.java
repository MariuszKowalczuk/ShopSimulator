package pl.mk.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Mariusz Kowalczuk
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Entity
@Table(name = "position", schema = "shop")
public class Position implements Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "Quantity")
    private Integer quantity;

    @OneToOne
    @JoinColumn(name = "ProductID")
    private Product product;


}
