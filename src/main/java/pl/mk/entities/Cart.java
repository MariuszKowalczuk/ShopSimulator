package pl.mk.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Mariusz Kowalczuk
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@javax.persistence.Entity
@Table(name = "cart", schema = "shop")
public class Cart implements Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer Id;
}



