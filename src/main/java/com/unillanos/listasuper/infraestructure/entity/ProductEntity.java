package com.unillanos.listasuper.infraestructure.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "product")
public class ProductEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int id;

    @Column(name = "name_product")
    private String name;

    @Column(name = "description_product")
    private String description;

    @Column(name = "type_product")
    private String type;

    @Column(name = "name_market")
    private String market_name;

    @Column(name = "picture_product")
    private String picture;

    @Column(name = "price_product")
    private int price;

}
