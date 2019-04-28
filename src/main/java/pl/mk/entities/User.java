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
@Table(name = "user", schema = "shop")
public class User implements Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "Login")
    private String login;
    @Basic
    @Column(name = "Password")
    private String password;
    @Basic
    @Column(name = "ShippingAdress")
    private String shippingAdress;


}
