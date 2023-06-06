package com.unillanos.listasuper.infraestructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "presentation")
public class PresentationEtntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_presentation")
    private int id;

    @Column(name = "name_presentation")
    private String name;

    @Column(name = "description_presentation")
    private String description;

    @ManyToOne
    @JoinColumn(name="id_product",referencedColumnName = "id_product",nullable = false)
    private ProductEntity product;
}
