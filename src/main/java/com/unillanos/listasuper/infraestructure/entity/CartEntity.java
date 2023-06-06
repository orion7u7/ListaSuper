package com.unillanos.listasuper.infraestructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "cart")
public class CartEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cart")
    private int id;

    @ManyToOne
    @JoinColumn(name="id_user",referencedColumnName = "id_user",nullable = false)
    private UserEntity User;
}
