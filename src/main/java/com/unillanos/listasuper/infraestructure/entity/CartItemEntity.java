package com.unillanos.listasuper.infraestructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "cart_item")
public class CartItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cart_item")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_cart", referencedColumnName = "id_cart", nullable = false)
    private CartEntity cart;

    @ManyToOne
    @JoinColumn(name = "id_product", referencedColumnName = "id_product", nullable = false)
    private ProductEntity product;

    @Column(name = "qty")
    private int qty;
}
