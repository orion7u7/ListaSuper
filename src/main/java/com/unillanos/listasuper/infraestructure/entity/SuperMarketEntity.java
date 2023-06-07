package com.unillanos.listasuper.infraestructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "supermarket")
public class SuperMarketEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_market")
    private int id;

    @Column(name = "name_market")
    private String name;

    @Column(name = "description_market")
    private String description;

    @Column(name = "schedule_market")
    private String schedule;

    @OneToOne
    @JoinColumn(name="id_picture",referencedColumnName = "id_picture",nullable = false)
    private PictureEntity picture;

    @Column(name = "phone_market")
    private String phone;

    @Column(name = "url_facebook")
    private String facebook;

    @Column(name = "url_instagram")
    private String instagram;

    @Column(name = "url_webpage")
    private String webpage;


}
