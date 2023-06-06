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

    @ManyToOne
    @JoinColumn(name="id_market",referencedColumnName = "id_market",nullable = false)
    private SuperMarketEntity market;

    @ManyToOne
    @JoinColumn(name="id_picture",referencedColumnName = "id_picture",nullable = false)
    private PictureEntity picture;

}
