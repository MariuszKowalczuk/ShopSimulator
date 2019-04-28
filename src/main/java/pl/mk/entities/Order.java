package pl.mk.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * @author Mariusz Kowalczuk
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order", schema = "shop")
public class Order implements pl.mk.entities.Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;


}
