package com.unillanos.listasuper.infraestructure.entity;

import jakarta.persistence.*;
import jdk.jfr.Unsigned;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "location")
public class LocationEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_location")
    private int id;

    @Column(name = "url_location")
    private String url;

    @ManyToOne
    @JoinColumn(name="id_market",referencedColumnName = "id_market",nullable = false)
    private SuperMarketEntity market;
}
